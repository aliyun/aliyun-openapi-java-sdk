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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryUnionPromotionRequest extends RpcAcsRequest<QueryUnionPromotionResponse> {
	   

	private String unionBizType;

	private String userNick;

	private String sign;

	private Long alipayOpenId;

	private Long userId;

	private String channelId;
	public QueryUnionPromotionRequest() {
		super("UniMkt", "2018-12-12", "QueryUnionPromotion", "uniMkt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUnionBizType() {
		return this.unionBizType;
	}

	public void setUnionBizType(String unionBizType) {
		this.unionBizType = unionBizType;
		if(unionBizType != null){
			putQueryParameter("UnionBizType", unionBizType);
		}
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
		if(userNick != null){
			putQueryParameter("UserNick", userNick);
		}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public Long getAlipayOpenId() {
		return this.alipayOpenId;
	}

	public void setAlipayOpenId(Long alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
		if(alipayOpenId != null){
			putQueryParameter("AlipayOpenId", alipayOpenId.toString());
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<QueryUnionPromotionResponse> getResponseClass() {
		return QueryUnionPromotionResponse.class;
	}

}
