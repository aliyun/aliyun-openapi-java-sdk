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

package com.aliyuncs.airec.model.v20181012;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDataMessageStatisticsRequest extends RoaAcsRequest<QueryDataMessageStatisticsResponse> {
	   

	private String traceId;

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
		super("Airec", "2018-10-12", "QueryDataMessageStatistics", "airec");
		setUriPattern("/openapi/instances/[InstanceId]/tables/[Table]/data-message-statistics");
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
			putQueryParameter("TraceId", traceId);
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

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
		if(itemType != null){
			putQueryParameter("ItemType", itemType);
		}
	}

	public String getCmdType() {
		return this.cmdType;
	}

	public void setCmdType(String cmdType) {
		this.cmdType = cmdType;
		if(cmdType != null){
			putQueryParameter("CmdType", cmdType);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public String getBhvType() {
		return this.bhvType;
	}

	public void setBhvType(String bhvType) {
		this.bhvType = bhvType;
		if(bhvType != null){
			putQueryParameter("BhvType", bhvType);
		}
	}

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
		if(table != null){
			putPathParameter("Table", table);
		}
	}

	@Override
	public Class<QueryDataMessageStatisticsResponse> getResponseClass() {
		return QueryDataMessageStatisticsResponse.class;
	}

}
