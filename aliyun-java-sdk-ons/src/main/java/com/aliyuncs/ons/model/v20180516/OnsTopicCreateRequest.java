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
public class OnsTopicCreateRequest extends RpcAcsRequest<OnsTopicCreateResponse> {
	
	public OnsTopicCreateRequest() {
		super("Ons", "2018-05-16", "OnsTopicCreate", "2018-05-16");
	}

	private Long preventCache;

	private String cluster;

	private Integer queueNum;

	private String onsRegionId;

	private String onsPlatform;

	private String appName;

	private Long qps;

	private String topic;

	private String remark;

	private String appkey;

	private Boolean order;

	private Integer status;

	public Long getPreventCache() {
		return this.preventCache;
	}

	public void setPreventCache(Long preventCache) {
		this.preventCache = preventCache;
		if(preventCache != null){
			putQueryParameter("PreventCache", preventCache.toString());
		}
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public Integer getQueueNum() {
		return this.queueNum;
	}

	public void setQueueNum(Integer queueNum) {
		this.queueNum = queueNum;
		if(queueNum != null){
			putQueryParameter("QueueNum", queueNum.toString());
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Long getQps() {
		return this.qps;
	}

	public void setQps(Long qps) {
		this.qps = qps;
		if(qps != null){
			putQueryParameter("Qps", qps.toString());
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
		if(appkey != null){
			putQueryParameter("Appkey", appkey);
		}
	}

	public Boolean getOrder() {
		return this.order;
	}

	public void setOrder(Boolean order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order.toString());
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
	public Class<OnsTopicCreateResponse> getResponseClass() {
		return OnsTopicCreateResponse.class;
	}

}
