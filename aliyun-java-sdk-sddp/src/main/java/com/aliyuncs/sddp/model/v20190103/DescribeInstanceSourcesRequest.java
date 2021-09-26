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
public class DescribeInstanceSourcesRequest extends RpcAcsRequest<DescribeInstanceSourcesResponse> {
	   

	private Long productId;

	private Integer pageSize;

	private String lang;

	private String serviceRegionId;

	private String engineType;

	private Integer currentPage;

	private Boolean authed;

	private String instanceId;

	private String dbName;
	public DescribeInstanceSourcesRequest() {
		super("Sddp", "2019-01-03", "DescribeInstanceSources");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId.toString());
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

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
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

	public Boolean getAuthed() {
		return this.authed;
	}

	public void setAuthed(Boolean authed) {
		this.authed = authed;
		if(authed != null){
			putQueryParameter("Authed", authed.toString());
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

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	@Override
	public Class<DescribeInstanceSourcesResponse> getResponseClass() {
		return DescribeInstanceSourcesResponse.class;
	}

}
