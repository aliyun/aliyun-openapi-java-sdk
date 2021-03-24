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

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupedInstancesRequest extends RpcAcsRequest<DescribeGroupedInstancesResponse> {
	   

	private String criteria;

	private String groupField;

	private Boolean noPage;

	private Integer pageSize;

	private String lang;

	private String fieldValue;

	private Integer currentPage;

	private String machineTypes;
	public DescribeGroupedInstancesRequest() {
		super("Sas", "2018-12-03", "DescribeGroupedInstances", "sas");
		setMethod(MethodType.POST);
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
		if(criteria != null){
			putQueryParameter("Criteria", criteria);
		}
	}

	public String getGroupField() {
		return this.groupField;
	}

	public void setGroupField(String groupField) {
		this.groupField = groupField;
		if(groupField != null){
			putQueryParameter("GroupField", groupField);
		}
	}

	public Boolean getNoPage() {
		return this.noPage;
	}

	public void setNoPage(Boolean noPage) {
		this.noPage = noPage;
		if(noPage != null){
			putQueryParameter("NoPage", noPage.toString());
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

	public String getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
		if(fieldValue != null){
			putQueryParameter("FieldValue", fieldValue);
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

	public String getMachineTypes() {
		return this.machineTypes;
	}

	public void setMachineTypes(String machineTypes) {
		this.machineTypes = machineTypes;
		if(machineTypes != null){
			putQueryParameter("MachineTypes", machineTypes);
		}
	}

	@Override
	public Class<DescribeGroupedInstancesResponse> getResponseClass() {
		return DescribeGroupedInstancesResponse.class;
	}

}
