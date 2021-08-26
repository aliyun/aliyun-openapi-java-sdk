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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateScaleStrategyRequest extends RpcAcsRequest<CreateScaleStrategyResponse> {
	   

	private String scaleStrategyName;

	private Integer maxAvailableDesktopsCount;

	private String clientToken;

	private Integer scaleStep;

	private Integer minAvailableDesktopsCount;

	private String scaleStrategyType;

	private Integer minDesktopsCount;

	private String payType;

	private Integer maxDesktopsCount;
	public CreateScaleStrategyRequest() {
		super("ecd", "2020-09-30", "CreateScaleStrategy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScaleStrategyName() {
		return this.scaleStrategyName;
	}

	public void setScaleStrategyName(String scaleStrategyName) {
		this.scaleStrategyName = scaleStrategyName;
		if(scaleStrategyName != null){
			putQueryParameter("ScaleStrategyName", scaleStrategyName);
		}
	}

	public Integer getMaxAvailableDesktopsCount() {
		return this.maxAvailableDesktopsCount;
	}

	public void setMaxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
		this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
		if(maxAvailableDesktopsCount != null){
			putQueryParameter("MaxAvailableDesktopsCount", maxAvailableDesktopsCount.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getScaleStep() {
		return this.scaleStep;
	}

	public void setScaleStep(Integer scaleStep) {
		this.scaleStep = scaleStep;
		if(scaleStep != null){
			putQueryParameter("ScaleStep", scaleStep.toString());
		}
	}

	public Integer getMinAvailableDesktopsCount() {
		return this.minAvailableDesktopsCount;
	}

	public void setMinAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
		this.minAvailableDesktopsCount = minAvailableDesktopsCount;
		if(minAvailableDesktopsCount != null){
			putQueryParameter("MinAvailableDesktopsCount", minAvailableDesktopsCount.toString());
		}
	}

	public String getScaleStrategyType() {
		return this.scaleStrategyType;
	}

	public void setScaleStrategyType(String scaleStrategyType) {
		this.scaleStrategyType = scaleStrategyType;
		if(scaleStrategyType != null){
			putQueryParameter("ScaleStrategyType", scaleStrategyType);
		}
	}

	public Integer getMinDesktopsCount() {
		return this.minDesktopsCount;
	}

	public void setMinDesktopsCount(Integer minDesktopsCount) {
		this.minDesktopsCount = minDesktopsCount;
		if(minDesktopsCount != null){
			putQueryParameter("MinDesktopsCount", minDesktopsCount.toString());
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public Integer getMaxDesktopsCount() {
		return this.maxDesktopsCount;
	}

	public void setMaxDesktopsCount(Integer maxDesktopsCount) {
		this.maxDesktopsCount = maxDesktopsCount;
		if(maxDesktopsCount != null){
			putQueryParameter("MaxDesktopsCount", maxDesktopsCount.toString());
		}
	}

	@Override
	public Class<CreateScaleStrategyResponse> getResponseClass() {
		return CreateScaleStrategyResponse.class;
	}

}
