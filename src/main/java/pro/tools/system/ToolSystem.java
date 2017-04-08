package pro.tools.system;

/**
 * 系统相关工具
 *
 * @author sd
 */
public class ToolSystem {

    public static boolean isWindows() {
        return System.getProperties().get("os.name").toString().toLowerCase().contains("windows");
    }

}