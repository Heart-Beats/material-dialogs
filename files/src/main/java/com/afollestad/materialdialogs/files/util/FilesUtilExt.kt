/**
 * Designed and developed by Aidan Follestad (@afollestad)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("SpellCheckingInspection")

package com.afollestad.materialdialogs.files.util

import android.Manifest.permission
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Environment
import androidx.core.content.ContextCompat
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.files.FileFilter
import com.afollestad.materialdialogs.files.R
import java.io.File

internal fun File.hasParent(
  context: Context,
  writeable: Boolean,
  filter: FileFilter
) = betterParent(context, writeable, filter) != null

/**
 * 是否为外部存储根路径
 */
internal fun File.isExternalStorage(context: Context) =
	absolutePath == Environment.getExternalStorageDirectory().absolutePath

internal fun File.isRoot() = absolutePath == "/"

internal fun File.betterParent(
  context: Context,
  writeable: Boolean,
  filter: FileFilter
): File? {
	return if (isExternalStorage(context)) null else parentFile
}

internal fun File.jumpOverEmulated(context: Context): File {
  val externalFileDir = context.getExternalFilesDir()
  externalFileDir?.parentFile?.let { externalParentFile ->
    if (absolutePath == externalParentFile.absolutePath) {
      return externalFileDir
    }
  }
  return this
}

internal fun File.friendlyName(context: Context) = when {
	isExternalStorage(context) -> context.getString(R.string.external_storage)
	isRoot() -> context.getString(R.string.root)
  else -> name
}

internal fun Context.hasPermission(permission: String): Boolean {
  return ContextCompat.checkSelfPermission(this, permission) ==
      PackageManager.PERMISSION_GRANTED
}

internal fun MaterialDialog.hasReadStoragePermission(): Boolean {
  return windowContext.hasPermission(permission.READ_EXTERNAL_STORAGE)
}

internal fun MaterialDialog.hasWriteStoragePermission(): Boolean {
	return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
		// 应用有完整存储访问权限
		windowContext.hasPermission(permission.WRITE_EXTERNAL_STORAGE) || Environment.isExternalStorageManager()
	} else {
		windowContext.hasPermission(permission.WRITE_EXTERNAL_STORAGE)
	}
}
