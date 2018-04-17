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

package com.aliyuncs.ons.model.v20170918;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsMqttQueryMsgTransTrendRequest extends RpcAcsRequest<OnsMqttQueryMsgTransTrendResponse> {
	
	public OnsMqttQueryMsgTransTrendRequest() {
		super("Ons", "2017-09-18", "OnsMqttQueryMsgTransTrend");
	}

	private Long preventCache;

	private String onsRegionId;

	private String onsPlatform;

	private Integer qos;

	private String transType;

	private Long endTime;

	private Long beginTime;

	private String tpsType;

	private String parentTopic;

	private String msgType;

	private String subTopic;

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

	public Integer getQos() {
		return this.qos;
	}

	public void setQos(Integer qos) {
		this.qos = qos;
		if(qos != null){
			putQueryParameter("Qos", qos.toString());
		}
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
		if(transType != null){
			putQueryParameter("TransType", transType);
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

	public String getTpsType() {
		return this.tpsType;
	}

	public void setTpsType(String tpsType) {
		this.tpsType = tpsType;
		if(tpsType != null){
			putQueryParameter("TpsType", tpsType);
		}
	}

	public String getParentTopic() {
		return this.parentTopic;
	}

	public void setParentTopic(String parentTopic) {
		this.parentTopic = parentTopic;
		if(parentTopic != null){
			putQueryParameter("ParentTopic", parentTopic);
		}
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
		if(msgType != null){
			putQueryParameter("MsgType", msgType);
		}
	}

	public String getSubTopic() {
		return this.subTopic;
	}

	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
		if(subTopic != null){
			putQueryParameter("SubTopic", subTopic);
		}
	}

	@Override
	public Class<OnsMqttQueryMsgTransTrendResponse> getResponseClass() {
		return OnsMqttQueryMsgTransTrendResponse.class;
	}

}
