package com.ibmi.mortgage.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FormuleAssuranceEnum {

    DC_PTIA_IPT_ITT90_PE("DC/PTIA/IPT-ITT90/PE"),
    DC_PTIA_IPT_ITT90("DC/PTIA/IPT-ITT90"),
    DC_PTIA_IPT_ITT30("DC/PTIA/IPT-ITT30"),
    DC_PTIA("DC/PTIA"),
    DC("DC"),
    NA("N/A");

    private String libelleFormule;

}
