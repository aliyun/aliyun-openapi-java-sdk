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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryHotlineNumberRequest extends RpcAcsRequest<QueryHotlineNumberResponse> {
	   

	private String instanceId;

	private String hotlineNumber;

	private Long departmentId;

	@SerializedName("groupIds")
	private List<Long> groupIds;

	private Integer pageSize;

	private Integer currentPage;
	public QueryHotlineNumberRequest() {
		super("aiccs", "2019-10-15", "QueryHotlineNumber");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getHotlineNumber() {
		return this.hotlineNumber;
	}

	public void setHotlineNumber(String hotlineNumber) {
		this.hotlineNumber = hotlineNumber;
		if(hotlineNumber != null){
			putQueryParameter("HotlineNumber", hotlineNumber);
		}
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
		if(departmentId != null){
			putQueryParameter("DepartmentId", departmentId.toString());
		}
	}

	public List<Long> getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(List<Long> groupIds) {
		this.groupIds = groupIds;	
		if (groupIds != null) {
			putQueryParameter("GroupIds" , new Gson().toJson(groupIds));
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<QueryHotlineNumberResponse> getResponseClass() {
		return QueryHotlineNumberResponse.class;
	}

}
