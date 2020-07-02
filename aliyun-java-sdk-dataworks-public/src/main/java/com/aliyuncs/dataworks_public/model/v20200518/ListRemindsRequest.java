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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListRemindsRequest extends RpcAcsRequest<ListRemindsResponse> {
	   

	private String searchText;

	private String founder;

	private String remindTypes;

	private Integer pageNumber;

	private String alertTarget;

	private Integer pageSize;

	private Long nodeId;
	public ListRemindsRequest() {
		super("dataworks-public", "2020-05-18", "ListReminds", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchText() {
		return this.searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
		if(searchText != null){
			putBodyParameter("SearchText", searchText);
		}
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
		if(founder != null){
			putBodyParameter("Founder", founder);
		}
	}

	public String getRemindTypes() {
		return this.remindTypes;
	}

	public void setRemindTypes(String remindTypes) {
		this.remindTypes = remindTypes;
		if(remindTypes != null){
			putBodyParameter("RemindTypes", remindTypes);
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

	public String getAlertTarget() {
		return this.alertTarget;
	}

	public void setAlertTarget(String alertTarget) {
		this.alertTarget = alertTarget;
		if(alertTarget != null){
			putBodyParameter("AlertTarget", alertTarget);
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

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	@Override
	public Class<ListRemindsResponse> getResponseClass() {
		return ListRemindsResponse.class;
	}

}
