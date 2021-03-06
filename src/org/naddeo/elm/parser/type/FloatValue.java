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
public class FloatValue extends Value<Double> {

    @NonNull private final Double value;

    @Override
    public Double getValue()
    {
        return value;
    }

    @Override
    public ValueType getType()
    {
        return ValueType.FLOAT;
    }

    @Override
    public String getDisplay()
    {
        return value.toString();
    }
}
