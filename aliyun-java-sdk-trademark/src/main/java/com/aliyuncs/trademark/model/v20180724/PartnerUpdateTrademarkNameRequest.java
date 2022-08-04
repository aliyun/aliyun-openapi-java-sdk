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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PartnerUpdateTrademarkNameRequest extends RpcAcsRequest<PartnerUpdateTrademarkNameResponse> {
	   

	private String tmName;

	private String aliyunKp;

	private Long callerParentId;

	private Long eventSceneType;

	private String intentionBizId;

	private Integer type;

	private String callerType;

	private String tmComment;

	private String tmIcon;

	private String bizId;

	private String bid;
	public PartnerUpdateTrademarkNameRequest() {
		super("Trademark", "2018-07-24", "PartnerUpdateTrademarkName");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putBodyParameter("TmName", tmName);
		}
	}

	public String getAliyunKp() {
		return this.aliyunKp;
	}

	public void setAliyunKp(String aliyunKp) {
		this.aliyunKp = aliyunKp;
		if(aliyunKp != null){
			putQueryParameter("AliyunKp", aliyunKp);
		}
	}

	public Long getCallerParentId() {
		return this.callerParentId;
	}

	public void setCallerParentId(Long callerParentId) {
		this.callerParentId = callerParentId;
		if(callerParentId != null){
			putQueryParameter("CallerParentId", callerParentId.toString());
		}
	}

	public Long getEventSceneType() {
		return this.eventSceneType;
	}

	public void setEventSceneType(Long eventSceneType) {
		this.eventSceneType = eventSceneType;
		if(eventSceneType != null){
			putBodyParameter("EventSceneType", eventSceneType.toString());
		}
	}

	public String getIntentionBizId() {
		return this.intentionBizId;
	}

	public void setIntentionBizId(String intentionBizId) {
		this.intentionBizId = intentionBizId;
		if(intentionBizId != null){
			putBodyParameter("IntentionBizId", intentionBizId);
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

	public String getCallerType() {
		return this.callerType;
	}

	public void setCallerType(String callerType) {
		this.callerType = callerType;
		if(callerType != null){
			putQueryParameter("CallerType", callerType);
		}
	}

	public String getTmComment() {
		return this.tmComment;
	}

	public void setTmComment(String tmComment) {
		this.tmComment = tmComment;
		if(tmComment != null){
			putBodyParameter("TmComment", tmComment);
		}
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
		if(tmIcon != null){
			putBodyParameter("TmIcon", tmIcon);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<PartnerUpdateTrademarkNameResponse> getResponseClass() {
		return PartnerUpdateTrademarkNameResponse.class;
	}

}
