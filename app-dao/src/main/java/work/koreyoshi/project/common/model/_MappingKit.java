package work.koreyoshi.project.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("sys_account", "id", Account.class);
		// Composite Primary Key order: account_id,role_id
		arp.addMapping("sys_account_role", "account_id,role_id", AccountRole.class);
		arp.addMapping("sys_permission", "id", Permission.class);
		arp.addMapping("sys_role", "id", Role.class);
		// Composite Primary Key order: permission_id,role_id
		arp.addMapping("sys_role_permission", "permission_id,role_id", RolePermission.class);
		arp.addMapping("sys_token", "user_id", Token.class);
		arp.addMapping("tb_file_storage", "id", FileStorage.class);
		arp.addMapping("tb_videos", "id", Videos.class);
	}
}

