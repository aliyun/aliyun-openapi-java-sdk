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
public class ListFeatureConsistencyCheckJobFeatureReportsRequest extends RoaAcsRequest<ListFeatureConsistencyCheckJobFeatureReportsResponse> {
	   

	private String logRequestId;

	private String logUserId;

	private String logItemId;

	private String instanceId;

	private String featureConsistencyCheckJobId;
	public ListFeatureConsistencyCheckJobFeatureReportsRequest() {
		super("PaiRecService", "2022-12-13", "ListFeatureConsistencyCheckJobFeatureReports");
		setUriPattern("/api/v1/featureconsistencycheck/jobs/[FeatureConsistencyCheckJobId]/featurereports");
		setMethod(MethodType.GET);
	}

	public String getLogRequestId() {
		return this.logRequestId;
	}

	public void setLogRequestId(String logRequestId) {
		this.logRequestId = logRequestId;
		if(logRequestId != null){
			putQueryParameter("LogRequestId", logRequestId);
		}
	}

	public String getLogUserId() {
		return this.logUserId;
	}

	public void setLogUserId(String logUserId) {
		this.logUserId = logUserId;
		if(logUserId != null){
			putQueryParameter("LogUserId", logUserId);
		}
	}

	public String getLogItemId() {
		return this.logItemId;
	}

	public void setLogItemId(String logItemId) {
		this.logItemId = logItemId;
		if(logItemId != null){
			putQueryParameter("LogItemId", logItemId);
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
	public Class<ListFeatureConsistencyCheckJobFeatureReportsResponse> getResponseClass() {
		return ListFeatureConsistencyCheckJobFeatureReportsResponse.class;
	}

}
