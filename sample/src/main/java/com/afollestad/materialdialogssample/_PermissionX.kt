package com.afollestad.materialdialogssample

import android.os.Build
import androidx.fragment.app.FragmentActivity
import com.permissionx.guolindev.PermissionX

/**
 * @author  张磊  on  2024/11/15 at 15:17
 * Email: 913305160@qq.com
 */


fun FragmentActivity.runWithStoragePermissions(vararg permissions: String, onAllGranted: () -> Unit) {
	val permissionList = permissions.toMutableList()
	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
		permissionList.replaceAll {
			if (it == android.Manifest.permission.WRITE_EXTERNAL_STORAGE) {
				android.Manifest.permission.MANAGE_EXTERNAL_STORAGE
			} else {
				it
			}
		}
	}

	reqPermissions(*permissionList.toTypedArray(), onAllGranted = onAllGranted)
}


fun FragmentActivity.reqPermissions(
	vararg permissions: String,
	needExplainRequestReason: Boolean = false,
	onAllGranted: () -> Unit
) {
	PermissionX.init(this)
		.permissions(*permissions)
		.apply {
			this.explainReasonBeforeRequest = needExplainRequestReason
		}
		.onExplainRequestReason { scope, deniedList ->
			// 用户请求权限之前触发，用于解释获取权限原因，必须调用 explainReasonBeforeRequest() 才会触发
			val message = "本应用需要您同意以下权限才可正常使用"
			scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
		}
		.onForwardToSettings { scope, deniedList ->
			// 用户拒绝权限后再次请求触发
			scope.showForwardToSettingsDialog(deniedList, "您需要在设置中手动允许以下必要的权限", "确定", "取消")
		}
		.request { allGranted, grantedList, deniedList ->
			if (allGranted) {
				onAllGranted()
			} else {
			}
		}
}