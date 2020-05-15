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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPodsRequest extends RpcAcsRequest<ListPodsResponse> {
	   

	private List<Integer> statusLists;

	private Long deployOrderId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Integer> resultLists;
	public ListPodsRequest() {
		super("retailcloud", "2018-03-13", "ListPods", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Integer> getStatusLists() {
		return this.statusLists;
	}

	public void setStatusLists(List<Integer> statusLists) {
		this.statusLists = statusLists;	
		if (statusLists != null) {
			for (int i = 0; i < statusLists.size(); i++) {
				putBodyParameter("StatusList." + (i + 1) , statusLists.get(i));
			}
		}	
	}

	public Long getDeployOrderId() {
		return this.deployOrderId;
	}

	public void setDeployOrderId(Long deployOrderId) {
		this.deployOrderId = deployOrderId;
		if(deployOrderId != null){
			putQueryParameter("DeployOrderId", deployOrderId.toString());
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<Integer> getResultLists() {
		return this.resultLists;
	}

	public void setResultLists(List<Integer> resultLists) {
		this.resultLists = resultLists;	
		if (resultLists != null) {
			for (int i = 0; i < resultLists.size(); i++) {
				putBodyParameter("ResultList." + (i + 1) , resultLists.get(i));
			}
		}	
	}

	@Override
	public Class<ListPodsResponse> getResponseClass() {
		return ListPodsResponse.class;
	}

}
