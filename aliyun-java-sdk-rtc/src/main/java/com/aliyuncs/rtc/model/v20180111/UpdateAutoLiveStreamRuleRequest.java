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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAutoLiveStreamRuleRequest extends RpcAcsRequest<UpdateAutoLiveStreamRuleResponse> {
	   

	private String ruleName;

	private List<String> channelIdPrefixess;

	private String playDomain;

	private Long ownerId;

	private String appId;

	private String callBack;

	private Integer mediaEncode;

	private Integer ruleId;

	private List<String> channelIdss;
	public UpdateAutoLiveStreamRuleRequest() {
		super("rtc", "2018-01-11", "UpdateAutoLiveStreamRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public List<String> getChannelIdPrefixess() {
		return this.channelIdPrefixess;
	}

	public void setChannelIdPrefixess(List<String> channelIdPrefixess) {
		this.channelIdPrefixess = channelIdPrefixess;	
		if (channelIdPrefixess != null) {
			for (int i = 0; i < channelIdPrefixess.size(); i++) {
				putQueryParameter("ChannelIdPrefixes." + (i + 1) , channelIdPrefixess.get(i));
			}
		}	
	}

	public String getPlayDomain() {
		return this.playDomain;
	}

	public void setPlayDomain(String playDomain) {
		this.playDomain = playDomain;
		if(playDomain != null){
			putQueryParameter("PlayDomain", playDomain);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getCallBack() {
		return this.callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
		if(callBack != null){
			putQueryParameter("CallBack", callBack);
		}
	}

	public Integer getMediaEncode() {
		return this.mediaEncode;
	}

	public void setMediaEncode(Integer mediaEncode) {
		this.mediaEncode = mediaEncode;
		if(mediaEncode != null){
			putQueryParameter("MediaEncode", mediaEncode.toString());
		}
	}

	public Integer getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	public List<String> getChannelIdss() {
		return this.channelIdss;
	}

	public void setChannelIdss(List<String> channelIdss) {
		this.channelIdss = channelIdss;	
		if (channelIdss != null) {
			for (int i = 0; i < channelIdss.size(); i++) {
				putQueryParameter("ChannelIds." + (i + 1) , channelIdss.get(i));
			}
		}	
	}

	@Override
	public Class<UpdateAutoLiveStreamRuleResponse> getResponseClass() {
		return UpdateAutoLiveStreamRuleResponse.class;
	}

}
