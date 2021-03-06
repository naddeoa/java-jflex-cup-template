package org.naddeo.elm.parser.type;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author naddeo
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class IntegerValue extends Value<Integer> {

    @NonNull private final Integer value;

    @Override
    public Integer getValue()
    {
        return value;
    }

    @Override
    public ValueType getType()
    {
        return ValueType.INTEGER;
    }

    @Override
    public String getDisplay()
    {
        return value.toString();
    }
}
