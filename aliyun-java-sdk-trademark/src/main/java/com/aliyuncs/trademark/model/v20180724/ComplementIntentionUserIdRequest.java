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
public class ComplementIntentionUserIdRequest extends RpcAcsRequest<ComplementIntentionUserIdResponse> {
	   

	private String aliyunKp;

	private Long callerParentId;

	private Integer type;

	private String callerType;

	private String complementUserId;

	private String bizId;

	private String bid;
	public ComplementIntentionUserIdRequest() {
		super("Trademark", "2018-07-24", "ComplementIntentionUserId");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getComplementUserId() {
		return this.complementUserId;
	}

	public void setComplementUserId(String complementUserId) {
		this.complementUserId = complementUserId;
		if(complementUserId != null){
			putBodyParameter("ComplementUserId", complementUserId);
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
	public Class<ComplementIntentionUserIdResponse> getResponseClass() {
		return ComplementIntentionUserIdResponse.class;
	}

}
