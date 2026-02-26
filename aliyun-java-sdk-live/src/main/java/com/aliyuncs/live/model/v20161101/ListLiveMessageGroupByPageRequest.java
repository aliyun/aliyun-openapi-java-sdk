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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLiveMessageGroupByPageRequest extends RpcAcsRequest<ListLiveMessageGroupByPageResponse> {
	   

	private Integer sortType;

	private Integer groupStatus;

	private String dataCenter;

	private Integer pageNumber;

	private String appId;

	private Integer pageSize;
	public ListLiveMessageGroupByPageRequest() {
		super("live", "2016-11-01", "ListLiveMessageGroupByPage", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSortType() {
		return this.sortType;
	}

	public void setSortType(Integer sortType) {
		this.sortType = sortType;
		if(sortType != null){
			putQueryParameter("SortType", sortType.toString());
		}
	}

	public Integer getGroupStatus() {
		return this.groupStatus;
	}

	public void setGroupStatus(Integer groupStatus) {
		this.groupStatus = groupStatus;
		if(groupStatus != null){
			putQueryParameter("GroupStatus", groupStatus.toString());
		}
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putQueryParameter("DataCenter", dataCenter);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	@Override
	public Class<ListLiveMessageGroupByPageResponse> getResponseClass() {
		return ListLiveMessageGroupByPageResponse.class;
	}

}
