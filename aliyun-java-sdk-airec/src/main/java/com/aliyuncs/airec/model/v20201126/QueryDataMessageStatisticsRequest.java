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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDataMessageStatisticsRequest extends RoaAcsRequest<QueryDataMessageStatisticsResponse> {
	   

	private String traceId;

	private String messageSource;

	private Long endTime;

	private String userType;

	private Long startTime;

	private String userId;

	private String itemId;

	private String instanceId;

	private String itemType;

	private String cmdType;

	private String sceneId;

	private String bhvType;

	private String table;
	public QueryDataMessageStatisticsRequest() {
		super("Airec", "2020-11-26", "QueryDataMessageStatistics", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/tables/[table]/data-message-statistics");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
		if(traceId != null){
			putQueryParameter("traceId", traceId);
		}
	}

	public String getMessageSource() {
		return this.messageSource;
	}

	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
		if(messageSource != null){
			putQueryParameter("messageSource", messageSource);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("userType", userType);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("userId", userId);
		}
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("itemId", itemId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
		if(itemType != null){
			putQueryParameter("itemType", itemType);
		}
	}

	public String getCmdType() {
		return this.cmdType;
	}

	public void setCmdType(String cmdType) {
		this.cmdType = cmdType;
		if(cmdType != null){
			putQueryParameter("cmdType", cmdType);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("sceneId", sceneId);
		}
	}

	public String getBhvType() {
		return this.bhvType;
	}

	public void setBhvType(String bhvType) {
		this.bhvType = bhvType;
		if(bhvType != null){
			putQueryParameter("bhvType", bhvType);
		}
	}

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
		if(table != null){
			putPathParameter("table", table);
		}
	}

	@Override
	public Class<QueryDataMessageStatisticsResponse> getResponseClass() {
		return QueryDataMessageStatisticsResponse.class;
	}

}
