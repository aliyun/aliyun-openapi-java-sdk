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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GrantPromotionToUserRequest extends RpcAcsRequest<GrantPromotionToUserResponse> {
	   

	private Long expireSeconds;

	private String idempotentId;

	private String grantMode;

	private String body;

	private String promotionId;

	private String thirdPartyUserId;

	private String bizId;

	private String grantWay;

	private String securityCode;
	public GrantPromotionToUserRequest() {
		super("linkedmall", "2018-01-16", "GrantPromotionToUser", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getExpireSeconds() {
		return this.expireSeconds;
	}

	public void setExpireSeconds(Long expireSeconds) {
		this.expireSeconds = expireSeconds;
		if(expireSeconds != null){
			putQueryParameter("ExpireSeconds", expireSeconds.toString());
		}
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}

	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
		if(idempotentId != null){
			putQueryParameter("IdempotentId", idempotentId);
		}
	}

	public String getGrantMode() {
		return this.grantMode;
	}

	public void setGrantMode(String grantMode) {
		this.grantMode = grantMode;
		if(grantMode != null){
			putQueryParameter("GrantMode", grantMode);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putQueryParameter("PromotionId", promotionId);
		}
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getGrantWay() {
		return this.grantWay;
	}

	public void setGrantWay(String grantWay) {
		this.grantWay = grantWay;
		if(grantWay != null){
			putQueryParameter("GrantWay", grantWay);
		}
	}

	public String getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
		if(securityCode != null){
			putQueryParameter("SecurityCode", securityCode);
		}
	}

	@Override
	public Class<GrantPromotionToUserResponse> getResponseClass() {
		return GrantPromotionToUserResponse.class;
	}

}
