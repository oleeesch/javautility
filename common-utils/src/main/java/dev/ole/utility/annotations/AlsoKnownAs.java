package dev.ole.utility.annotations;

import javax.annotation.Nonnull;
import java.lang.annotation.*;

/**
 * Used to declare alternate names which are used in used or similar libraries.

 * @since 1.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface AlsoKnownAs {

    @Nonnull
    String[] value();

}