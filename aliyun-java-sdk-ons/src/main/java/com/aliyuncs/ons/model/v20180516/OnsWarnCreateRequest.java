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

package com.aliyuncs.ons.model.v20180516;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsWarnCreateRequest extends RpcAcsRequest<OnsWarnCreateResponse> {
	
	public OnsWarnCreateRequest() {
		super("Ons", "2018-05-16", "OnsWarnCreate");
	}

	private Long preventCache;

	private String onsRegionId;

	private String onsPlatform;

	private String blockTime;

	private String level;

	private String consumerId;

	private String delayTime;

	private String topic;

	private String threshold;

	private String alertTime;

	private String contacts;

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

	public String getOnsPlatform() {
		return this.onsPlatform;
	}

	public void setOnsPlatform(String onsPlatform) {
		this.onsPlatform = onsPlatform;
		if(onsPlatform != null){
			putQueryParameter("OnsPlatform", onsPlatform);
		}
	}

	public String getBlockTime() {
		return this.blockTime;
	}

	public void setBlockTime(String blockTime) {
		this.blockTime = blockTime;
		if(blockTime != null){
			putQueryParameter("BlockTime", blockTime);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public String getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
		if(consumerId != null){
			putQueryParameter("ConsumerId", consumerId);
		}
	}

	public String getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
		if(delayTime != null){
			putQueryParameter("DelayTime", delayTime);
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

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold);
		}
	}

	public String getAlertTime() {
		return this.alertTime;
	}

	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
		if(alertTime != null){
			putQueryParameter("AlertTime", alertTime);
		}
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
		if(contacts != null){
			putQueryParameter("Contacts", contacts);
		}
	}

	@Override
	public Class<OnsWarnCreateResponse> getResponseClass() {
		return OnsWarnCreateResponse.class;
	}

}
