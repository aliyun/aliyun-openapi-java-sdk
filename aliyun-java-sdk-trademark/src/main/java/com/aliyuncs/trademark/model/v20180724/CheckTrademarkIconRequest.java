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
public class CheckTrademarkIconRequest extends RpcAcsRequest<CheckTrademarkIconResponse> {
	   

	private Integer eventSceneType;

	private String trademarkIconOssKey;
	public CheckTrademarkIconRequest() {
		super("Trademark", "2018-07-24", "CheckTrademarkIcon");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getEventSceneType() {
		return this.eventSceneType;
	}

	public void setEventSceneType(Integer eventSceneType) {
		this.eventSceneType = eventSceneType;
		if(eventSceneType != null){
			putQueryParameter("EventSceneType", eventSceneType.toString());
		}
	}

	public String getTrademarkIconOssKey() {
		return this.trademarkIconOssKey;
	}

	public void setTrademarkIconOssKey(String trademarkIconOssKey) {
		this.trademarkIconOssKey = trademarkIconOssKey;
		if(trademarkIconOssKey != null){
			putQueryParameter("TrademarkIconOssKey", trademarkIconOssKey);
		}
	}

	@Override
	public Class<CheckTrademarkIconResponse> getResponseClass() {
		return CheckTrademarkIconResponse.class;
	}

}
