package com.hxr.deepspringlearn.anno;

import com.hxr.deepspringlearn.config.optional.CameraConfig;
import com.hxr.deepspringlearn.config.optional.GamePlayerConfig;
import com.hxr.deepspringlearn.config.optional.TradingConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * been called at
 * ConfigurationClassParser这个类的processImports方法
 *
 */
public class PhoneAnoImportSelector implements ImportSelector {

    private static Logger logger = LoggerFactory.getLogger(PhoneAnoImportSelector.class);

    @Override
    public String[] selectImports(AnnotationMetadata icmd) {

        List<String> importList = new ArrayList<>();

        if (icmd.hasAnnotation(Camera.class.getName())) {
            logger.debug("contains {} annotation", Camera.class.getSimpleName());
            importList.add(CameraConfig.class.getName());
        }
        if (icmd.hasAnnotation(Trading.class.getName())) {
            logger.debug("contains {} annotation", Trading.class.getSimpleName());
            importList.add(TradingConfig.class.getName());
        }
        if (icmd.hasAnnotation(GamePlayer.class.getName())) {
            logger.debug("contains {} annotation", GamePlayer.class.getSimpleName());
            importList.add(GamePlayerConfig.class.getName());
        }

        return importList.toArray(new String[importList.size()]);
    }
}
