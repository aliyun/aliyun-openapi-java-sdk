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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetServiceSettingsRequest extends RpcAcsRequest<SetServiceSettingsResponse> {
	   

	private Boolean deliverySlsEnabled;

	private String deliveryOssKeyPrefix;

	private Boolean deliveryOssEnabled;

	private String deliverySlsProjectName;

	private String deliveryOssBucketName;
	public SetServiceSettingsRequest() {
		super("oos", "2019-06-01", "SetServiceSettings");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDeliverySlsEnabled() {
		return this.deliverySlsEnabled;
	}

	public void setDeliverySlsEnabled(Boolean deliverySlsEnabled) {
		this.deliverySlsEnabled = deliverySlsEnabled;
		if(deliverySlsEnabled != null){
			putQueryParameter("DeliverySlsEnabled", deliverySlsEnabled.toString());
		}
	}

	public String getDeliveryOssKeyPrefix() {
		return this.deliveryOssKeyPrefix;
	}

	public void setDeliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
		this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
		if(deliveryOssKeyPrefix != null){
			putQueryParameter("DeliveryOssKeyPrefix", deliveryOssKeyPrefix);
		}
	}

	public Boolean getDeliveryOssEnabled() {
		return this.deliveryOssEnabled;
	}

	public void setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
		this.deliveryOssEnabled = deliveryOssEnabled;
		if(deliveryOssEnabled != null){
			putQueryParameter("DeliveryOssEnabled", deliveryOssEnabled.toString());
		}
	}

	public String getDeliverySlsProjectName() {
		return this.deliverySlsProjectName;
	}

	public void setDeliverySlsProjectName(String deliverySlsProjectName) {
		this.deliverySlsProjectName = deliverySlsProjectName;
		if(deliverySlsProjectName != null){
			putQueryParameter("DeliverySlsProjectName", deliverySlsProjectName);
		}
	}

	public String getDeliveryOssBucketName() {
		return this.deliveryOssBucketName;
	}

	public void setDeliveryOssBucketName(String deliveryOssBucketName) {
		this.deliveryOssBucketName = deliveryOssBucketName;
		if(deliveryOssBucketName != null){
			putQueryParameter("DeliveryOssBucketName", deliveryOssBucketName);
		}
	}

	@Override
	public Class<SetServiceSettingsResponse> getResponseClass() {
		return SetServiceSettingsResponse.class;
	}

}
