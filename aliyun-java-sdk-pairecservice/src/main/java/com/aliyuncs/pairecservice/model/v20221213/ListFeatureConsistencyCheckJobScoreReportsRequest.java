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
public class ListFeatureConsistencyCheckJobScoreReportsRequest extends RoaAcsRequest<ListFeatureConsistencyCheckJobScoreReportsResponse> {
	   

	private String excludeRequestIds;

	private String instanceId;

	private String featureConsistencyCheckJobId;
	public ListFeatureConsistencyCheckJobScoreReportsRequest() {
		super("PaiRecService", "2022-12-13", "ListFeatureConsistencyCheckJobScoreReports");
		setUriPattern("/api/v1/featureconsistencycheck/jobs/[FeatureConsistencyCheckJobId]/scorereports");
		setMethod(MethodType.GET);
	}

	public String getExcludeRequestIds() {
		return this.excludeRequestIds;
	}

	public void setExcludeRequestIds(String excludeRequestIds) {
		this.excludeRequestIds = excludeRequestIds;
		if(excludeRequestIds != null){
			putQueryParameter("ExcludeRequestIds", excludeRequestIds);
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
	public Class<ListFeatureConsistencyCheckJobScoreReportsResponse> getResponseClass() {
		return ListFeatureConsistencyCheckJobScoreReportsResponse.class;
	}

}
