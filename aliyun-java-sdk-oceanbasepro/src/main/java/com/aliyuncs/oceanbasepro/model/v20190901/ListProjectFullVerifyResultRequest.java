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
public class ListProjectFullVerifyResultRequest extends RpcAcsRequest<ListProjectFullVerifyResultResponse> {
	   

	@SerializedName("destSchemas")
	private List<String> destSchemas;

	private Integer pageNumber;

	private Integer pageSize;

	@SerializedName("sourceSchemas")
	private List<String> sourceSchemas;

	private String projectId;

	private String status;
	public ListProjectFullVerifyResultRequest() {
		super("OceanBasePro", "2019-09-01", "ListProjectFullVerifyResult", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDestSchemas() {
		return this.destSchemas;
	}

	public void setDestSchemas(List<String> destSchemas) {
		this.destSchemas = destSchemas;	
		if (destSchemas != null) {
			putBodyParameter("DestSchemas" , new Gson().toJson(destSchemas));
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getSourceSchemas() {
		return this.sourceSchemas;
	}

	public void setSourceSchemas(List<String> sourceSchemas) {
		this.sourceSchemas = sourceSchemas;	
		if (sourceSchemas != null) {
			putBodyParameter("SourceSchemas" , new Gson().toJson(sourceSchemas));
		}	
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListProjectFullVerifyResultResponse> getResponseClass() {
		return ListProjectFullVerifyResultResponse.class;
	}

}
