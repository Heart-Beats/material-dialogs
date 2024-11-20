# [Material Dialogs](./README.md) | [材料对话框](./README_zh.md)

#### [查看版本发布和更新日志](https://github.com/afollestad/material-dialogs/releases)

[![Android CI](https://github.com/afollestad/material-dialogs/workflows/Android%20CI/badge.svg)](https://github.com/afollestad/material-dialogs/actions?query=workflow%3A%22Android+CI%22)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0a4acc30a9ce440087f7688735359bb8)](https://www.codacy.com/app/drummeraidan_50/material-dialogs?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=afollestad/material-dialogs&amp;utm_campaign=Badge_Grade)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

---

![Showcase](https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/showcase4.png)

# 模块

核心模块是使用本库所必需的基础模块。其他模块是对核心模块的扩展。
请注意，自 Material Dialogs 2.x.x 版本起，本库仅支持 Kotlin。最新的 Java 版本是`0.9.6.0`，可在[此处]()找到。请注意，0.9.6.0 版本已不受支持，不会对该版本进行错误修复和改进。

## 核心模块

[ ![Core](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/core?label=core&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/core)

#### [核心模块教程和示例](documentation/CORE.md)

`core`模块包含了开始使用本库所需的一切内容。它包含了所有核心功能和常规使用功能。

<img src="https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/basic_with_buttons.png" width="250px" />

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:core:3.3.1'
}
```

## 输入模块

[ ![Input](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/input?label=input&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/input)

#### [输入模块教程和示例](documentation/INPUT.md)

`input`模块包含对核心模块的扩展，例如文本输入对话框。

<img src="https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/input.png" width="250px" />

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:input:3.3.1'
}
```

## 文件模块

[ ![Files](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/files?label=files&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/files)

#### [文件模块教程和示例](documentation/FILES.md)

`files`模块包含对核心模块的扩展，例如文件和文件夹选择器。

<img src="https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/file_chooser.png" width="250px" />

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:files:3.3.1'
}
```

## 颜色模块

[ ![Color](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/color?label=color&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/color)

#### [颜色模块教程和示例](documentation/COLOR.md)

`color`模块包含对核心模块的扩展，例如颜色选择器。

<img src="https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/color_chooser.png" width="250px" />

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:color:3.3.1'
}
```

## 日期时间模块

[ ![DateTime](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/datetime?label=datetime&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/datetime)

#### [日期时间模块教程和示例](documentation/DATETIME.md)

`datetime`模块包含用于创建日期、时间和日期时间选择器对话框的扩展功能。

<img src="https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/datetimepicker.png" width="500px" />

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:datetime:3.3.1'
}
```

## 底部表单模块

[ ![Bottom Sheets](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/bottomsheets?label=bottomsheets&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/bottomsheets)

#### [底部表单模块教程和示例](documentation/BOTTOMSHEETS.md)

`bottomsheets`模块包含将模态对话框转换为底部表单的扩展功能，以及其他功能，例如显示项目网格。也一定要查看此模块的示例项目！

<img src="https://raw.githubusercontent.com/afollestad/material-dialogs/main/art/bottomsheet_customview.png" width="250px" />

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:bottomsheets:3.3.1'
}
```

## 生命周期模块

[ ![Lifecycle](https://img.shields.io/maven-central/v/io.github.heart-beats.material-dialogs/lifecycle?label=lifecycle&style=for-the-badge) ](https://repo1.maven.org/maven2/io/github/heart-beats/material-dialogs/lifecycle)

#### [生命周期模块教程和示例](documentation/LIFECYCLE.md)

`lifecycle`模块包含使对话框与 AndroidX 生命周期协同工作的扩展功能。

```gradle
dependencies {
  ...
  implementation 'io.github.heart-beats.material-dialogs:lifecycle:3.3.1'
}
```
