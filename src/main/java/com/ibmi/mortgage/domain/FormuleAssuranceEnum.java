package com.ibmi.mortgage.domain;

public enum FormuleAssuranceEnum {

    DC_PTIA_IPT_ITT90_PE("DC/PTIA/IPT-ITT90/PE"),
    DC_PTIA_IPT_ITT90("DC/PTIA/IPT-ITT90"),
    DC_PTIA_IPT_ITT30("DC/PTIA/IPT-ITT30"),
    DC_PTIA("DC/PTIA"),
    DC("DC");

    private String libelleFormule;

    public String getLibelleFormule() {
        return libelleFormule;
    }

    FormuleAssuranceEnum(String libelleFormule) {
        this.libelleFormule = libelleFormule;
    }

    public void setLibelleFormule(String libelleFormule) {
        this.libelleFormule = libelleFormule;
    }

}
