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

package com.aliyuncs.aicontent.model.v20240611;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class Personalizedtxt2imgQueryModelTrainStatusRequest extends RoaAcsRequest<Personalizedtxt2imgQueryModelTrainStatusResponse> {
	   

	private String modelId;
	public Personalizedtxt2imgQueryModelTrainStatusRequest() {
		super("AiContent", "20240611", "Personalizedtxt2imgQueryModelTrainStatus");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v1/personalizedtxt2img/queryModelTrainStatus");
		setMethod(MethodType.GET);
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("modelId", modelId);
		}
	}

	@Override
	public Class<Personalizedtxt2imgQueryModelTrainStatusResponse> getResponseClass() {
		return Personalizedtxt2imgQueryModelTrainStatusResponse.class;
	}

}
