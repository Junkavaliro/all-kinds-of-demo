package work.koreyoshi.config;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import org.springframework.stereotype.Component;
import work.koreyoshi.base.service.IActiveRecordInit;

/**
 * @author zhoujx
 */
@Component
public class WebMappingKit implements IActiveRecordInit {
    @Override
    public void addMapping(ActiveRecordPlugin arp) {
    }
}
