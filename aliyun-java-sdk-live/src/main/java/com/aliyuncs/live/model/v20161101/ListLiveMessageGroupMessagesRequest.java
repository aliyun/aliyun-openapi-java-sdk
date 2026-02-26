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
public class ListLiveMessageGroupMessagesRequest extends RpcAcsRequest<ListLiveMessageGroupMessagesResponse> {
	   

	private Integer sortType;

	private Long nextPageToken;

	private Integer pageSize;

	private Long msgType;

	private String groupId;

	private Long endTime;

	private Long beginTime;

	private String dataCenter;

	private String appId;
	public ListLiveMessageGroupMessagesRequest() {
		super("live", "2016-11-01", "ListLiveMessageGroupMessages", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public Long getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(Long nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken.toString());
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

	public Long getMsgType() {
		return this.msgType;
	}

	public void setMsgType(Long msgType) {
		this.msgType = msgType;
		if(msgType != null){
			putQueryParameter("MsgType", msgType.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<ListLiveMessageGroupMessagesResponse> getResponseClass() {
		return ListLiveMessageGroupMessagesResponse.class;
	}

}
