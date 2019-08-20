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

package com.aliyuncs.appmallsservice.model.v20180224;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.appmallsservice.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmIssueOrderRequest extends RpcAcsRequest<TaobaoFilmIssueOrderResponse> {
	
	public TaobaoFilmIssueOrderRequest() {
		super("AppMallsService", "2018-02-24", "TaobaoFilmIssueOrder");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String lockSeatApplyKey;

	private String extUserId;

	private String extOrderId;

	private Long totalPrice;

	private String paramsJson;

	public String getLockSeatApplyKey() {
		return this.lockSeatApplyKey;
	}

	public void setLockSeatApplyKey(String lockSeatApplyKey) {
		this.lockSeatApplyKey = lockSeatApplyKey;
		if(lockSeatApplyKey != null){
			putQueryParameter("LockSeatApplyKey", lockSeatApplyKey);
		}
	}

	public String getExtUserId() {
		return this.extUserId;
	}

	public void setExtUserId(String extUserId) {
		this.extUserId = extUserId;
		if(extUserId != null){
			putQueryParameter("ExtUserId", extUserId);
		}
	}

	public String getExtOrderId() {
		return this.extOrderId;
	}

	public void setExtOrderId(String extOrderId) {
		this.extOrderId = extOrderId;
		if(extOrderId != null){
			putQueryParameter("ExtOrderId", extOrderId);
		}
	}

	public Long getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
		if(totalPrice != null){
			putQueryParameter("TotalPrice", totalPrice.toString());
		}
	}

	public String getParamsJson() {
		return this.paramsJson;
	}

	public void setParamsJson(String paramsJson) {
		this.paramsJson = paramsJson;
		if(paramsJson != null){
			putQueryParameter("ParamsJson", paramsJson);
		}
	}

	@Override
	public Class<TaobaoFilmIssueOrderResponse> getResponseClass() {
		return TaobaoFilmIssueOrderResponse.class;
	}

}
