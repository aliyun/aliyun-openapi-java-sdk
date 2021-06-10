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

package com.aliyuncs.ltl.model.v20190510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ltl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDataWithSignatureRequest extends RpcAcsRequest<SetDataWithSignatureResponse> {
	   

	private String iotSignature;

	private String iotAuthType;

	private String iotIdSource;

	private String apiVersion;

	private String productKey;

	private String iotId;

	private String iotDataDigest;

	private String iotIdServiceProvider;

	private String value;

	private String key;
	public SetDataWithSignatureRequest() {
		super("ltl", "2019-05-10", "SetDataWithSignature");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotSignature() {
		return this.iotSignature;
	}

	public void setIotSignature(String iotSignature) {
		this.iotSignature = iotSignature;
		if(iotSignature != null){
			putQueryParameter("IotSignature", iotSignature);
		}
	}

	public String getIotAuthType() {
		return this.iotAuthType;
	}

	public void setIotAuthType(String iotAuthType) {
		this.iotAuthType = iotAuthType;
		if(iotAuthType != null){
			putQueryParameter("IotAuthType", iotAuthType);
		}
	}

	public String getIotIdSource() {
		return this.iotIdSource;
	}

	public void setIotIdSource(String iotIdSource) {
		this.iotIdSource = iotIdSource;
		if(iotIdSource != null){
			putQueryParameter("IotIdSource", iotIdSource);
		}
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		if(apiVersion != null){
			putQueryParameter("ApiVersion", apiVersion);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getIotDataDigest() {
		return this.iotDataDigest;
	}

	public void setIotDataDigest(String iotDataDigest) {
		this.iotDataDigest = iotDataDigest;
		if(iotDataDigest != null){
			putQueryParameter("IotDataDigest", iotDataDigest);
		}
	}

	public String getIotIdServiceProvider() {
		return this.iotIdServiceProvider;
	}

	public void setIotIdServiceProvider(String iotIdServiceProvider) {
		this.iotIdServiceProvider = iotIdServiceProvider;
		if(iotIdServiceProvider != null){
			putQueryParameter("IotIdServiceProvider", iotIdServiceProvider);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	@Override
	public Class<SetDataWithSignatureResponse> getResponseClass() {
		return SetDataWithSignatureResponse.class;
	}

}
