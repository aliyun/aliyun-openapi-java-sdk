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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetTemplateRecommendParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateRecommendParametersResponse extends AcsResponse {

	private String requestId;

	private List<RecommendParameterValue> recommendParameterValues;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecommendParameterValue> getRecommendParameterValues() {
		return this.recommendParameterValues;
	}

	public void setRecommendParameterValues(List<RecommendParameterValue> recommendParameterValues) {
		this.recommendParameterValues = recommendParameterValues;
	}

	public static class RecommendParameterValue {

		private String parameterKey;

		private String recommendValue;

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}

		public String getRecommendValue() {
			return this.recommendValue;
		}

		public void setRecommendValue(String recommendValue) {
			this.recommendValue = recommendValue;
		}
	}

	@Override
	public GetTemplateRecommendParametersResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateRecommendParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
