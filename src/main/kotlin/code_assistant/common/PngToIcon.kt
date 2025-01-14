package code_assistant.common

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Messages

/**
 * 使用 sh/pngToicns 工具 转换图片
 */
class PngToIcon : DumbAwareAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val project = event.getData(PlatformDataKeys.PROJECT)
        try {
          Runtime.getRuntime().exec("open -a Terminal")
        } catch (e: Exception) {
            Messages.showErrorDialog(project, e.stackTraceToString(), "打开插件失败")
        }
    }

}