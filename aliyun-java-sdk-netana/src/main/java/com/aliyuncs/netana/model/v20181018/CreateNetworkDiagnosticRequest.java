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

package com.aliyuncs.netana.model.v20181018;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkDiagnosticRequest extends RpcAcsRequest<CreateNetworkDiagnosticResponse> {
	
	public CreateNetworkDiagnosticRequest() {
		super("Netana", "2018-10-18", "CreateNetworkDiagnostic", "Netana");
	}

	private Long resourceOwnerId;

	private String requestParams;

	private String instanceId;

	private String resourceOwnerAccount;

	private String userRequestId;

	private String type;

	private String requestApiName;

	private String errorCode;

	private String productType;

	private String responseParams;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRequestParams() {
		return this.requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
		if(requestParams != null){
			putQueryParameter("RequestParams", requestParams);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getUserRequestId() {
		return this.userRequestId;
	}

	public void setUserRequestId(String userRequestId) {
		this.userRequestId = userRequestId;
		if(userRequestId != null){
			putQueryParameter("UserRequestId", userRequestId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getRequestApiName() {
		return this.requestApiName;
	}

	public void setRequestApiName(String requestApiName) {
		this.requestApiName = requestApiName;
		if(requestApiName != null){
			putQueryParameter("RequestApiName", requestApiName);
		}
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getResponseParams() {
		return this.responseParams;
	}

	public void setResponseParams(String responseParams) {
		this.responseParams = responseParams;
		if(responseParams != null){
			putQueryParameter("ResponseParams", responseParams);
		}
	}

	@Override
	public Class<CreateNetworkDiagnosticResponse> getResponseClass() {
		return CreateNetworkDiagnosticResponse.class;
	}

}
