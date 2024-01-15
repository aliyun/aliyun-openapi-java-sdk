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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckDuplicateClassificationRequest extends RpcAcsRequest<CheckDuplicateClassificationResponse> {
	   

	private Integer eventSceneType;

	private String classification;

	private String trademarkName;
	public CheckDuplicateClassificationRequest() {
		super("Trademark", "2019-09-02", "CheckDuplicateClassification");
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

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putQueryParameter("Classification", classification);
		}
	}

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
		if(trademarkName != null){
			putQueryParameter("TrademarkName", trademarkName);
		}
	}

	@Override
	public Class<CheckDuplicateClassificationResponse> getResponseClass() {
		return CheckDuplicateClassificationResponse.class;
	}

}
