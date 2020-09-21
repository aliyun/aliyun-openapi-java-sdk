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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListPhysicalConnectionFeaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhysicalConnectionFeaturesResponse extends AcsResponse {

	private String requestId;

	private List<PhysicalConnectionFeature> physicalConnectionFeatures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PhysicalConnectionFeature> getPhysicalConnectionFeatures() {
		return this.physicalConnectionFeatures;
	}

	public void setPhysicalConnectionFeatures(List<PhysicalConnectionFeature> physicalConnectionFeatures) {
		this.physicalConnectionFeatures = physicalConnectionFeatures;
	}

	public static class PhysicalConnectionFeature {

		private String featureKey;

		private String featureValue;

		public String getFeatureKey() {
			return this.featureKey;
		}

		public void setFeatureKey(String featureKey) {
			this.featureKey = featureKey;
		}

		public String getFeatureValue() {
			return this.featureValue;
		}

		public void setFeatureValue(String featureValue) {
			this.featureValue = featureValue;
		}
	}

	@Override
	public ListPhysicalConnectionFeaturesResponse getInstance(UnmarshallerContext context) {
		return	ListPhysicalConnectionFeaturesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
