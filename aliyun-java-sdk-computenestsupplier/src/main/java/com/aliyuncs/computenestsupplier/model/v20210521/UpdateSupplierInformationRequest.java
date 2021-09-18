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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateSupplierInformationRequest extends RpcAcsRequest<UpdateSupplierInformationResponse> {
	   

	private Boolean operationMfaPresent;

	private DeliverySettings deliverySettings;

	private String operationIp;
	public UpdateSupplierInformationRequest() {
		super("ComputeNestSupplier", "2021-05-21", "UpdateSupplierInformation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getOperationMfaPresent() {
		return this.operationMfaPresent;
	}

	public void setOperationMfaPresent(Boolean operationMfaPresent) {
		this.operationMfaPresent = operationMfaPresent;
		if(operationMfaPresent != null){
			putQueryParameter("OperationMfaPresent", operationMfaPresent.toString());
		}
	}

	public DeliverySettings getDeliverySettings() {
		return this.deliverySettings;
	}

	public void setDeliverySettings(DeliverySettings deliverySettings) {
		this.deliverySettings = deliverySettings;	
		if (deliverySettings != null) {
			
				putQueryParameter("DeliverySettings.OssBucketName" , deliverySettings.getOssBucketName());
				putQueryParameter("DeliverySettings.OssExpirationDays" , deliverySettings.getOssExpirationDays());
				putQueryParameter("DeliverySettings.OssPath" , deliverySettings.getOssPath());
				putQueryParameter("DeliverySettings.OssEnabled" , deliverySettings.getOssEnabled());
		}	
	}

	public String getOperationIp() {
		return this.operationIp;
	}

	public void setOperationIp(String operationIp) {
		this.operationIp = operationIp;
		if(operationIp != null){
			putQueryParameter("OperationIp", operationIp);
		}
	}

	public static class DeliverySettings {

		private String ossBucketName;

		private Long ossExpirationDays;

		private String ossPath;

		private Boolean ossEnabled;

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public Long getOssExpirationDays() {
			return this.ossExpirationDays;
		}

		public void setOssExpirationDays(Long ossExpirationDays) {
			this.ossExpirationDays = ossExpirationDays;
		}

		public String getOssPath() {
			return this.ossPath;
		}

		public void setOssPath(String ossPath) {
			this.ossPath = ossPath;
		}

		public Boolean getOssEnabled() {
			return this.ossEnabled;
		}

		public void setOssEnabled(Boolean ossEnabled) {
			this.ossEnabled = ossEnabled;
		}
	}

	@Override
	public Class<UpdateSupplierInformationResponse> getResponseClass() {
		return UpdateSupplierInformationResponse.class;
	}

}
