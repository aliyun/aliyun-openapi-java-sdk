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
public class TerminateFeatureConsistencyCheckJobRequest extends RoaAcsRequest<TerminateFeatureConsistencyCheckJobResponse> {
	   

	private String body;

	private String featureConsistencyCheckJobId;
	public TerminateFeatureConsistencyCheckJobRequest() {
		super("PaiRecService", "2022-12-13", "TerminateFeatureConsistencyCheckJob");
		setUriPattern("/api/v1/featureconsistencycheck/jobs/[FeatureConsistencyCheckJobId]/action/terminate");
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

	public String getFeatureConsistencyCheckJobId() {
		return this.featureConsistencyCheckJobId;
	}

	public void setFeatureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
		this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
		if(featureConsistencyCheckJobId != null){
			putPathParameter("FeatureConsistencyCheckJobId", featureConsistencyCheckJobId);
		}
	}

	@Override
	public Class<TerminateFeatureConsistencyCheckJobResponse> getResponseClass() {
		return TerminateFeatureConsistencyCheckJobResponse.class;
	}

}
