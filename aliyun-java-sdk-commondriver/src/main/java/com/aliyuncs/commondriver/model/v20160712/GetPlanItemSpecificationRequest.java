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

package com.aliyuncs.commondriver.model.v20160712;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPlanItemSpecificationRequest extends RpcAcsRequest<GetPlanItemSpecificationResponse> {
	   

	private String accessKey;

	private String secretKey;

	private String fromApp;

	private String clientToken;

	private String payerId;

	private String planItemId;

	private String buyerId;

	private String childId;

	private String userId;
	public GetPlanItemSpecificationRequest() {
		super("Commondriver", "2016-07-12", "GetPlanItemSpecification");
		setMethod(MethodType.POST);
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putQueryParameter("AccessKey", accessKey);
		}
	}

	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		if(secretKey != null){
			putQueryParameter("SecretKey", secretKey);
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putQueryParameter("FromApp", fromApp);
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

	public String getPayerId() {
		return this.payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
		if(payerId != null){
			putQueryParameter("PayerId", payerId);
		}
	}

	public String getPlanItemId() {
		return this.planItemId;
	}

	public void setPlanItemId(String planItemId) {
		this.planItemId = planItemId;
		if(planItemId != null){
			putQueryParameter("PlanItemId", planItemId);
		}
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
		if(buyerId != null){
			putQueryParameter("BuyerId", buyerId);
		}
	}

	public String getChildId() {
		return this.childId;
	}

	public void setChildId(String childId) {
		this.childId = childId;
		if(childId != null){
			putQueryParameter("ChildId", childId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<GetPlanItemSpecificationResponse> getResponseClass() {
		return GetPlanItemSpecificationResponse.class;
	}

}
