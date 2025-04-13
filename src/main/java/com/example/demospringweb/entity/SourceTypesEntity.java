package com.example.demospringweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "source_types")
public class SourceTypesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "source_id")
    private int sourceId;

    @Column(name = "source_type_code")
    private String sourceTypeCode;

    @Column(name = "source_type_description")
    private String sourceTypeDescription;

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceTypeCode() {
		return sourceTypeCode;
	}

	public void setSourceTypeCode(String sourceTypeCode) {
		this.sourceTypeCode = sourceTypeCode;
	}

	public String getSourceTypeDescription() {
		return sourceTypeDescription;
	}

	public void setSourceTypeDescription(String sourceTypeDescription) {
		this.sourceTypeDescription = sourceTypeDescription;
	}

    
}
