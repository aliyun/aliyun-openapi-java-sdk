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

package com.aliyuncs.ons.model.v20180628;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsConsumerResetOffsetRequest extends RpcAcsRequest<OnsConsumerResetOffsetResponse> {
	
	public OnsConsumerResetOffsetRequest() {
		super("Ons", "2018-06-28", "OnsConsumerResetOffset");
	}

	private Long preventCache;

	private String onsRegionId;

	private String instanceId;

	private String groupId;

	private String topic;

	private Long resetTimestamp;

	private Integer type;

	public Long getPreventCache() {
		return this.preventCache;
	}

	public void setPreventCache(Long preventCache) {
		this.preventCache = preventCache;
		if(preventCache != null){
			putQueryParameter("PreventCache", preventCache.toString());
		}
	}

	public String getOnsRegionId() {
		return this.onsRegionId;
	}

	public void setOnsRegionId(String onsRegionId) {
		this.onsRegionId = onsRegionId;
		if(onsRegionId != null){
			putQueryParameter("OnsRegionId", onsRegionId);
		}
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public Long getResetTimestamp() {
		return this.resetTimestamp;
	}

	public void setResetTimestamp(Long resetTimestamp) {
		this.resetTimestamp = resetTimestamp;
		if(resetTimestamp != null){
			putQueryParameter("ResetTimestamp", resetTimestamp.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	@Override
	public Class<OnsConsumerResetOffsetResponse> getResponseClass() {
		return OnsConsumerResetOffsetResponse.class;
	}

}
