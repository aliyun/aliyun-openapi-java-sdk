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
public class SendLiveMessageGroupRequest extends RpcAcsRequest<SendLiveMessageGroupResponse> {
	   

	private String senderMetaInfo;

	private String body;

	private Long staticsIncrease;

	private Boolean noCache;

	private Long msgType;

	private Boolean noStorage;

	private String groupId;

	private Long weight;

	private String dataCenter;

	private String msgTid;

	private String senderId;

	private String appId;
	public SendLiveMessageGroupRequest() {
		super("live", "2016-11-01", "SendLiveMessageGroup", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSenderMetaInfo() {
		return this.senderMetaInfo;
	}

	public void setSenderMetaInfo(String senderMetaInfo) {
		this.senderMetaInfo = senderMetaInfo;
		if(senderMetaInfo != null){
			putQueryParameter("SenderMetaInfo", senderMetaInfo);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putQueryParameter("Body", body);
		}
	}

	public Long getStaticsIncrease() {
		return this.staticsIncrease;
	}

	public void setStaticsIncrease(Long staticsIncrease) {
		this.staticsIncrease = staticsIncrease;
		if(staticsIncrease != null){
			putQueryParameter("StaticsIncrease", staticsIncrease.toString());
		}
	}

	public Boolean getNoCache() {
		return this.noCache;
	}

	public void setNoCache(Boolean noCache) {
		this.noCache = noCache;
		if(noCache != null){
			putQueryParameter("NoCache", noCache.toString());
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

	public Boolean getNoStorage() {
		return this.noStorage;
	}

	public void setNoStorage(Boolean noStorage) {
		this.noStorage = noStorage;
		if(noStorage != null){
			putQueryParameter("NoStorage", noStorage.toString());
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

	public Long getWeight() {
		return this.weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
		if(weight != null){
			putQueryParameter("Weight", weight.toString());
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

	public String getMsgTid() {
		return this.msgTid;
	}

	public void setMsgTid(String msgTid) {
		this.msgTid = msgTid;
		if(msgTid != null){
			putQueryParameter("MsgTid", msgTid);
		}
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
		if(senderId != null){
			putQueryParameter("SenderId", senderId);
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
	public Class<SendLiveMessageGroupResponse> getResponseClass() {
		return SendLiveMessageGroupResponse.class;
	}

}
