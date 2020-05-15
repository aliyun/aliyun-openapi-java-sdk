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
public class ListDeployOrdersRequest extends RpcAcsRequest<ListDeployOrdersResponse> {
	   

	private String startTimeGreaterThanOrEqualTo;

	private List<Integer> statusLists;

	private Long envId;

	private String endTimeGreaterThan;

	private Integer pageNumber;

	private String pauseType;

	private List<Integer> resultLists;

	private String startTimeGreaterThan;

	private String startTimeLessThan;

	private String startTimeLessThanOrEqualTo;

	private Long appId;

	private String envType;

	private Integer pageSize;

	private String endTimeGreaterThanOrEqualTo;

	private String endTimeLessThan;

	private String endTimeLessThanOrEqualTo;

	private String partitionType;

	private String deployCategory;

	private String deployType;

	private Integer status;
	public ListDeployOrdersRequest() {
		super("retailcloud", "2018-03-13", "ListDeployOrders", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartTimeGreaterThanOrEqualTo() {
		return this.startTimeGreaterThanOrEqualTo;
	}

	public void setStartTimeGreaterThanOrEqualTo(String startTimeGreaterThanOrEqualTo) {
		this.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
		if(startTimeGreaterThanOrEqualTo != null){
			putQueryParameter("StartTimeGreaterThanOrEqualTo", startTimeGreaterThanOrEqualTo);
		}
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

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getEndTimeGreaterThan() {
		return this.endTimeGreaterThan;
	}

	public void setEndTimeGreaterThan(String endTimeGreaterThan) {
		this.endTimeGreaterThan = endTimeGreaterThan;
		if(endTimeGreaterThan != null){
			putQueryParameter("EndTimeGreaterThan", endTimeGreaterThan);
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

	public String getPauseType() {
		return this.pauseType;
	}

	public void setPauseType(String pauseType) {
		this.pauseType = pauseType;
		if(pauseType != null){
			putQueryParameter("PauseType", pauseType);
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

	public String getStartTimeGreaterThan() {
		return this.startTimeGreaterThan;
	}

	public void setStartTimeGreaterThan(String startTimeGreaterThan) {
		this.startTimeGreaterThan = startTimeGreaterThan;
		if(startTimeGreaterThan != null){
			putQueryParameter("StartTimeGreaterThan", startTimeGreaterThan);
		}
	}

	public String getStartTimeLessThan() {
		return this.startTimeLessThan;
	}

	public void setStartTimeLessThan(String startTimeLessThan) {
		this.startTimeLessThan = startTimeLessThan;
		if(startTimeLessThan != null){
			putQueryParameter("StartTimeLessThan", startTimeLessThan);
		}
	}

	public String getStartTimeLessThanOrEqualTo() {
		return this.startTimeLessThanOrEqualTo;
	}

	public void setStartTimeLessThanOrEqualTo(String startTimeLessThanOrEqualTo) {
		this.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
		if(startTimeLessThanOrEqualTo != null){
			putQueryParameter("StartTimeLessThanOrEqualTo", startTimeLessThanOrEqualTo);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getEnvType() {
		return this.envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType);
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

	public String getEndTimeGreaterThanOrEqualTo() {
		return this.endTimeGreaterThanOrEqualTo;
	}

	public void setEndTimeGreaterThanOrEqualTo(String endTimeGreaterThanOrEqualTo) {
		this.endTimeGreaterThanOrEqualTo = endTimeGreaterThanOrEqualTo;
		if(endTimeGreaterThanOrEqualTo != null){
			putQueryParameter("EndTimeGreaterThanOrEqualTo", endTimeGreaterThanOrEqualTo);
		}
	}

	public String getEndTimeLessThan() {
		return this.endTimeLessThan;
	}

	public void setEndTimeLessThan(String endTimeLessThan) {
		this.endTimeLessThan = endTimeLessThan;
		if(endTimeLessThan != null){
			putQueryParameter("EndTimeLessThan", endTimeLessThan);
		}
	}

	public String getEndTimeLessThanOrEqualTo() {
		return this.endTimeLessThanOrEqualTo;
	}

	public void setEndTimeLessThanOrEqualTo(String endTimeLessThanOrEqualTo) {
		this.endTimeLessThanOrEqualTo = endTimeLessThanOrEqualTo;
		if(endTimeLessThanOrEqualTo != null){
			putQueryParameter("EndTimeLessThanOrEqualTo", endTimeLessThanOrEqualTo);
		}
	}

	public String getPartitionType() {
		return this.partitionType;
	}

	public void setPartitionType(String partitionType) {
		this.partitionType = partitionType;
		if(partitionType != null){
			putQueryParameter("PartitionType", partitionType);
		}
	}

	public String getDeployCategory() {
		return this.deployCategory;
	}

	public void setDeployCategory(String deployCategory) {
		this.deployCategory = deployCategory;
		if(deployCategory != null){
			putQueryParameter("DeployCategory", deployCategory);
		}
	}

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ListDeployOrdersResponse> getResponseClass() {
		return ListDeployOrdersResponse.class;
	}

}
