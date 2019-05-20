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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetAgentDataRequest extends RpcAcsRequest<GetAgentDataResponse> {
	
	public GetAgentDataRequest() {
		super("CloudCallCenter", "2017-07-05", "GetAgentData", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String startDay;

	private String endDay;

	private Integer pageSize;

	private String userId;

	private Integer pageNumber;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getStartDay() {
		return this.startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
		if(startDay != null){
			putQueryParameter("StartDay", startDay);
		}
	}

	public String getEndDay() {
		return this.endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
		if(endDay != null){
			putQueryParameter("EndDay", endDay);
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	@Override
	public Class<GetAgentDataResponse> getResponseClass() {
		return GetAgentDataResponse.class;
	}

}
