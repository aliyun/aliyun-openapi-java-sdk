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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OfflineExperimentRequest extends RoaAcsRequest<OfflineExperimentResponse> {
	   

	private String body;

	private String experimentId;
	public OfflineExperimentRequest() {
		super("PaiRecService", "2022-12-13", "OfflineExperiment");
		setUriPattern("/api/v1/experiments/[ExperimentId]/action/offline");
		setMethod(MethodType.POST);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
		if(experimentId != null){
			putPathParameter("ExperimentId", experimentId);
		}
	}

	@Override
	public Class<OfflineExperimentResponse> getResponseClass() {
		return OfflineExperimentResponse.class;
	}

}
