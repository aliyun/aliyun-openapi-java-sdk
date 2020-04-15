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

package com.aliyuncs.nlp_automl.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunPreTrainServiceRequest extends RpcAcsRequest<RunPreTrainServiceResponse> {
	   

	private String predictContent;

	private String serviceVersion;

	private String serviceName;
	public RunPreTrainServiceRequest() {
		super("nlp-automl", "2019-11-11", "RunPreTrainService", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPredictContent() {
		return this.predictContent;
	}

	public void setPredictContent(String predictContent) {
		this.predictContent = predictContent;
		if(predictContent != null){
			putBodyParameter("PredictContent", predictContent);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putBodyParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putBodyParameter("ServiceName", serviceName);
		}
	}

	@Override
	public Class<RunPreTrainServiceResponse> getResponseClass() {
		return RunPreTrainServiceResponse.class;
	}

}
