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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListWorkerInstancesRequest extends RpcAcsRequest<ListWorkerInstancesResponse> {
	   

	private Boolean onlyBindable;

	private Integer pageNumber;

	@SerializedName("specs")
	private List<String> specs;

	private String instanceName;

	private Integer pageSize;

	private String sourceType;

	private String destType;
	public ListWorkerInstancesRequest() {
		super("OceanBasePro", "2019-09-01", "ListWorkerInstances", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getOnlyBindable() {
		return this.onlyBindable;
	}

	public void setOnlyBindable(Boolean onlyBindable) {
		this.onlyBindable = onlyBindable;
		if(onlyBindable != null){
			putBodyParameter("OnlyBindable", onlyBindable.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getSpecs() {
		return this.specs;
	}

	public void setSpecs(List<String> specs) {
		this.specs = specs;	
		if (specs != null) {
			putBodyParameter("Specs" , new Gson().toJson(specs));
		}	
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putBodyParameter("SourceType", sourceType);
		}
	}

	public String getDestType() {
		return this.destType;
	}

	public void setDestType(String destType) {
		this.destType = destType;
		if(destType != null){
			putBodyParameter("DestType", destType);
		}
	}

	@Override
	public Class<ListWorkerInstancesResponse> getResponseClass() {
		return ListWorkerInstancesResponse.class;
	}

}
