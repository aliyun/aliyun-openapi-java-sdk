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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataObjectsRequest extends RpcAcsRequest<DescribeDataObjectsResponse> {
	   

	private Long fileType;

	private String riskLevels;

	private String queryName;

	private Long domainId;

	private String parentCategoryIds;

	private String productIds;

	private Integer pageSize;

	private String lang;

	private String serviceRegionId;

	private String modelTagIds;

	private Integer currentPage;

	private Long templateId;

	private String instanceId;

	private String modelIds;
	public DescribeDataObjectsRequest() {
		super("Sddp", "2019-01-03", "DescribeDataObjects", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFileType() {
		return this.fileType;
	}

	public void setFileType(Long fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putQueryParameter("FileType", fileType.toString());
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

	public String getQueryName() {
		return this.queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
		if(queryName != null){
			putQueryParameter("QueryName", queryName);
		}
	}

	public Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(Long domainId) {
		this.domainId = domainId;
		if(domainId != null){
			putQueryParameter("DomainId", domainId.toString());
		}
	}

	public String getParentCategoryIds() {
		return this.parentCategoryIds;
	}

	public void setParentCategoryIds(String parentCategoryIds) {
		this.parentCategoryIds = parentCategoryIds;
		if(parentCategoryIds != null){
			putQueryParameter("ParentCategoryIds", parentCategoryIds);
		}
	}

	public String getProductIds() {
		return this.productIds;
	}

	public void setProductIds(String productIds) {
		this.productIds = productIds;
		if(productIds != null){
			putQueryParameter("ProductIds", productIds);
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

	public String getServiceRegionId() {
		return this.serviceRegionId;
	}

	public void setServiceRegionId(String serviceRegionId) {
		this.serviceRegionId = serviceRegionId;
		if(serviceRegionId != null){
			putQueryParameter("ServiceRegionId", serviceRegionId);
		}
	}

	public String getModelTagIds() {
		return this.modelTagIds;
	}

	public void setModelTagIds(String modelTagIds) {
		this.modelTagIds = modelTagIds;
		if(modelTagIds != null){
			putQueryParameter("ModelTagIds", modelTagIds);
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

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getModelIds() {
		return this.modelIds;
	}

	public void setModelIds(String modelIds) {
		this.modelIds = modelIds;
		if(modelIds != null){
			putQueryParameter("ModelIds", modelIds);
		}
	}

	@Override
	public Class<DescribeDataObjectsResponse> getResponseClass() {
		return DescribeDataObjectsResponse.class;
	}

}
