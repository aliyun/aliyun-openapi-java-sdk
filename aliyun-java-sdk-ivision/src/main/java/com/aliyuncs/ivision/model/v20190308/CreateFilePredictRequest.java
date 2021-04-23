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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivision.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFilePredictRequest extends RpcAcsRequest<CreateFilePredictResponse> {
	   

	private String outputOss;

	private String clientToken;

	private String pushConfig;

	private String resourceUrl;

	private String decryptConfig;

	private String algorithmCode;

	private String outputRegion;
	public CreateFilePredictRequest() {
		super("ivision", "2019-03-08", "CreateFilePredict");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutputOss() {
		return this.outputOss;
	}

	public void setOutputOss(String outputOss) {
		this.outputOss = outputOss;
		if(outputOss != null){
			putBodyParameter("OutputOss", outputOss);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getPushConfig() {
		return this.pushConfig;
	}

	public void setPushConfig(String pushConfig) {
		this.pushConfig = pushConfig;
		if(pushConfig != null){
			putBodyParameter("PushConfig", pushConfig);
		}
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
		if(resourceUrl != null){
			putBodyParameter("ResourceUrl", resourceUrl);
		}
	}

	public String getDecryptConfig() {
		return this.decryptConfig;
	}

	public void setDecryptConfig(String decryptConfig) {
		this.decryptConfig = decryptConfig;
		if(decryptConfig != null){
			putBodyParameter("DecryptConfig", decryptConfig);
		}
	}

	public String getAlgorithmCode() {
		return this.algorithmCode;
	}

	public void setAlgorithmCode(String algorithmCode) {
		this.algorithmCode = algorithmCode;
		if(algorithmCode != null){
			putBodyParameter("AlgorithmCode", algorithmCode);
		}
	}

	public String getOutputRegion() {
		return this.outputRegion;
	}

	public void setOutputRegion(String outputRegion) {
		this.outputRegion = outputRegion;
		if(outputRegion != null){
			putBodyParameter("OutputRegion", outputRegion);
		}
	}

	@Override
	public Class<CreateFilePredictResponse> getResponseClass() {
		return CreateFilePredictResponse.class;
	}

}
