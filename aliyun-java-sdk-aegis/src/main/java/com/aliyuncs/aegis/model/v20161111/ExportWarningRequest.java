/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ExportWarningRequest extends RpcAcsRequest<ExportWarningResponse> {
	
	public ExportWarningRequest() {
		super("aegis", "2016-11-11", "ExportWarning", "vipaegis");
	}

	private String statusList;

	private String riskLevels;

	private String exportType;

	private String dealed;

	private String typeNames;

	private Integer isSummaryExport;

	private String riskName;

	private String riskIds;

	private String sourceIp;

	private Long strategyId;

	private String lang;

	private String typeName;

	private String subTypeNames;

	private String uuids;

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
		if(statusList != null){
			putQueryParameter("StatusList", statusList);
		}
	}

	public String getRiskLevels() {
		return this.riskLevels;
	}

	public void setRiskLevels(String riskLevels) {
		this.riskLevels = riskLevels;
		if(riskLevels != null){
			putQueryParameter("RiskLevels", riskLevels);
		}
	}

	public String getExportType() {
		return this.exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
		if(exportType != null){
			putQueryParameter("ExportType", exportType);
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public String getTypeNames() {
		return this.typeNames;
	}

	public void setTypeNames(String typeNames) {
		this.typeNames = typeNames;
		if(typeNames != null){
			putQueryParameter("TypeNames", typeNames);
		}
	}

	public Integer getIsSummaryExport() {
		return this.isSummaryExport;
	}

	public void setIsSummaryExport(Integer isSummaryExport) {
		this.isSummaryExport = isSummaryExport;
		if(isSummaryExport != null){
			putQueryParameter("IsSummaryExport", isSummaryExport.toString());
		}
	}

	public String getRiskName() {
		return this.riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
		if(riskName != null){
			putQueryParameter("RiskName", riskName);
		}
	}

	public String getRiskIds() {
		return this.riskIds;
	}

	public void setRiskIds(String riskIds) {
		this.riskIds = riskIds;
		if(riskIds != null){
			putQueryParameter("RiskIds", riskIds);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(Long strategyId) {
		this.strategyId = strategyId;
		if(strategyId != null){
			putQueryParameter("StrategyId", strategyId.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
		if(typeName != null){
			putQueryParameter("TypeName", typeName);
		}
	}

	public String getSubTypeNames() {
		return this.subTypeNames;
	}

	public void setSubTypeNames(String subTypeNames) {
		this.subTypeNames = subTypeNames;
		if(subTypeNames != null){
			putQueryParameter("SubTypeNames", subTypeNames);
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	@Override
	public Class<ExportWarningResponse> getResponseClass() {
		return ExportWarningResponse.class;
	}

}
