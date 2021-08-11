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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelServiceListRequest extends RpcAcsRequest<DescribeModelServiceListResponse> {
	   

	private String modelServiceName;

	private Integer pageNum;

	private Boolean includeDeleted;

	private Integer pageSize;

	private String algorithmCode;
	public DescribeModelServiceListRequest() {
		super("Vcs", "2020-05-15", "DescribeModelServiceList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModelServiceName() {
		return this.modelServiceName;
	}

	public void setModelServiceName(String modelServiceName) {
		this.modelServiceName = modelServiceName;
		if(modelServiceName != null){
			putBodyParameter("ModelServiceName", modelServiceName);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public Boolean getIncludeDeleted() {
		return this.includeDeleted;
	}

	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
		if(includeDeleted != null){
			putBodyParameter("IncludeDeleted", includeDeleted.toString());
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

	public String getAlgorithmCode() {
		return this.algorithmCode;
	}

	public void setAlgorithmCode(String algorithmCode) {
		this.algorithmCode = algorithmCode;
		if(algorithmCode != null){
			putBodyParameter("AlgorithmCode", algorithmCode);
		}
	}

	@Override
	public Class<DescribeModelServiceListResponse> getResponseClass() {
		return DescribeModelServiceListResponse.class;
	}

}
