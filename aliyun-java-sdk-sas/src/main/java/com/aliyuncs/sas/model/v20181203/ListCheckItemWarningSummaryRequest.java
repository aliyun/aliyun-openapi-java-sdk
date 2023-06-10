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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCheckItemWarningSummaryRequest extends RpcAcsRequest<ListCheckItemWarningSummaryResponse> {
	   

	private String riskType;

	private String containerFieldName;

	private String checkType;

	private String containerFieldValue;

	private Integer pageSize;

	private String lang;

	private Integer checkWarningStatus;

	private Long groupId;

	private Integer currentPage;

	private String checkItemFuzzy;

	private String checkLevel;
	public ListCheckItemWarningSummaryRequest() {
		super("Sas", "2018-12-03", "ListCheckItemWarningSummary", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
		if(riskType != null){
			putQueryParameter("RiskType", riskType);
		}
	}

	public String getContainerFieldName() {
		return this.containerFieldName;
	}

	public void setContainerFieldName(String containerFieldName) {
		this.containerFieldName = containerFieldName;
		if(containerFieldName != null){
			putQueryParameter("ContainerFieldName", containerFieldName);
		}
	}

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
		if(checkType != null){
			putQueryParameter("CheckType", checkType);
		}
	}

	public String getContainerFieldValue() {
		return this.containerFieldValue;
	}

	public void setContainerFieldValue(String containerFieldValue) {
		this.containerFieldValue = containerFieldValue;
		if(containerFieldValue != null){
			putQueryParameter("ContainerFieldValue", containerFieldValue);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Integer getCheckWarningStatus() {
		return this.checkWarningStatus;
	}

	public void setCheckWarningStatus(Integer checkWarningStatus) {
		this.checkWarningStatus = checkWarningStatus;
		if(checkWarningStatus != null){
			putQueryParameter("CheckWarningStatus", checkWarningStatus.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getCheckItemFuzzy() {
		return this.checkItemFuzzy;
	}

	public void setCheckItemFuzzy(String checkItemFuzzy) {
		this.checkItemFuzzy = checkItemFuzzy;
		if(checkItemFuzzy != null){
			putQueryParameter("CheckItemFuzzy", checkItemFuzzy);
		}
	}

	public String getCheckLevel() {
		return this.checkLevel;
	}

	public void setCheckLevel(String checkLevel) {
		this.checkLevel = checkLevel;
		if(checkLevel != null){
			putQueryParameter("CheckLevel", checkLevel);
		}
	}

	@Override
	public Class<ListCheckItemWarningSummaryResponse> getResponseClass() {
		return ListCheckItemWarningSummaryResponse.class;
	}

}
