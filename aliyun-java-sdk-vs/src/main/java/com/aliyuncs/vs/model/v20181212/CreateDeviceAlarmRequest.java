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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceAlarmRequest extends RpcAcsRequest<CreateDeviceAlarmResponse> {
	   

	private Long startTime;

	private Integer alarm;

	private String id;

	private Integer objectType;

	private Long endTime;

	private Long ownerId;

	private Integer subAlarm;

	private Long expire;

	private Integer channelId;
	public CreateDeviceAlarmRequest() {
		super("vs", "2018-12-12", "CreateDeviceAlarm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getAlarm() {
		return this.alarm;
	}

	public void setAlarm(Integer alarm) {
		this.alarm = alarm;
		if(alarm != null){
			putQueryParameter("Alarm", alarm.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Integer getObjectType() {
		return this.objectType;
	}

	public void setObjectType(Integer objectType) {
		this.objectType = objectType;
		if(objectType != null){
			putQueryParameter("ObjectType", objectType.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getSubAlarm() {
		return this.subAlarm;
	}

	public void setSubAlarm(Integer subAlarm) {
		this.subAlarm = subAlarm;
		if(subAlarm != null){
			putQueryParameter("SubAlarm", subAlarm.toString());
		}
	}

	public Long getExpire() {
		return this.expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
		if(expire != null){
			putQueryParameter("Expire", expire.toString());
		}
	}

	public Integer getChannelId() {
		return this.channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId.toString());
		}
	}

	@Override
	public Class<CreateDeviceAlarmResponse> getResponseClass() {
		return CreateDeviceAlarmResponse.class;
	}

}
