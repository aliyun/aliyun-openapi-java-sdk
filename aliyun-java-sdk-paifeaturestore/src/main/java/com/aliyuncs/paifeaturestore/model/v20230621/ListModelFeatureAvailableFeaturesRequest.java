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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListModelFeatureAvailableFeaturesRequest extends RoaAcsRequest<ListModelFeatureAvailableFeaturesResponse> {
	   

	private String modelFeatureId;

	private String featureName;

	private String instanceId;
	public ListModelFeatureAvailableFeaturesRequest() {
		super("PaiFeatureStore", "2023-06-21", "ListModelFeatureAvailableFeatures");
		setUriPattern("/api/v1/instances/[InstanceId]/modelfeatures/[ModelFeatureId]/availablefeatures");
		setMethod(MethodType.GET);
	}

	public String getModelFeatureId() {
		return this.modelFeatureId;
	}

	public void setModelFeatureId(String modelFeatureId) {
		this.modelFeatureId = modelFeatureId;
		if(modelFeatureId != null){
			putPathParameter("ModelFeatureId", modelFeatureId);
		}
	}

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
		if(featureName != null){
			putQueryParameter("FeatureName", featureName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<ListModelFeatureAvailableFeaturesResponse> getResponseClass() {
		return ListModelFeatureAvailableFeaturesResponse.class;
	}

}
