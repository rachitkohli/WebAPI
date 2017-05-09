/**
 * This file was generated by the JPA Modeler
 */
package org.ohdsi.webapi.study;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Chris Knoll <cknoll@ohdsi.org>
 */
@Entity
@Table(name = "STUDY_SOURCE")
public class StudySource {

	@Id
	private Integer id;

	@Column(name = "SOURCE_NAME", columnDefinition = "VARCHAR(100)")
	@Basic
	private String name;

	@Column(name = "SOURCE_KEY", columnDefinition = "VARCHAR(50)")
	@Basic
	private String key;

	@Column(name = "GROUP_KEY", columnDefinition = "VARCHAR(50)")
	@Basic
	private String groupKey;

	@Column(name = "VERSION_ID", columnDefinition = "INTEGER")
	@Basic
	private String versionId;

	@Column(name = "VERSION_NAME", columnDefinition = "VARCHAR(50)")
	@Basic
	private String versionName;

	@Column(name = "SOURCE_CONNECTION", columnDefinition = "VARCHAR(500)")
	@Basic
	private String sourceConnection;

	@Column(name = "SOURCE_DIALECT", columnDefinition = "VARCHAR(50)")
	@Basic
	private String sourceDialect;

	@Column(name = "RESULTS_SCHEMA", columnDefinition = "VARCHAR(100)")
	@Basic
	private String resultsSchema;

	@Column(name = "CDM_SCHEMA", columnDefinition = "VARCHAR(100)")
	@Basic
	private String cdmSchema;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getGroupKey() {
		return this.groupKey;
	}

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getSourceConnection() {
		return this.sourceConnection;
	}

	public void setSourceConnection(String sourceConnection) {
		this.sourceConnection = sourceConnection;
	}

	public String getSourceDialect() {
		return this.sourceDialect;
	}

	public void setSourceDialect(String sourceDialect) {
		this.sourceDialect = sourceDialect;
	}

	public String getResultsSchema() {
		return this.resultsSchema;
	}

	public void setResultsSchema(String resultsSchema) {
		this.resultsSchema = resultsSchema;
	}

	public String getCdmSchema() {
		return this.cdmSchema;
	}

	public void setCdmSchema(String cdmSchema) {
		this.cdmSchema = cdmSchema;
	}

}
