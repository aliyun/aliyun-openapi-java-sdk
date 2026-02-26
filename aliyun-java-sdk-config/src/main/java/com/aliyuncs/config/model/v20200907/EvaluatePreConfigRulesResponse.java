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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.EvaluatePreConfigRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluatePreConfigRulesResponse extends AcsResponse {

	private String requestId;

	private List<ResourceEvaluation> resourceEvaluations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceEvaluation> getResourceEvaluations() {
		return this.resourceEvaluations;
	}

	public void setResourceEvaluations(List<ResourceEvaluation> resourceEvaluations) {
		this.resourceEvaluations = resourceEvaluations;
	}

	public static class ResourceEvaluation {

		private String resourceLogicalId;

		private String resourceType;

		private List<Rule> rules;

		public String getResourceLogicalId() {
			return this.resourceLogicalId;
		}

		public void setResourceLogicalId(String resourceLogicalId) {
			this.resourceLogicalId = resourceLogicalId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public static class Rule {

			private String identifier;

			private String complianceType;

			private String annotation;

			private String helpUrl;

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getComplianceType() {
				return this.complianceType;
			}

			public void setComplianceType(String complianceType) {
				this.complianceType = complianceType;
			}

			public String getAnnotation() {
				return this.annotation;
			}

			public void setAnnotation(String annotation) {
				this.annotation = annotation;
			}

			public String getHelpUrl() {
				return this.helpUrl;
			}

			public void setHelpUrl(String helpUrl) {
				this.helpUrl = helpUrl;
			}
		}
	}

	@Override
	public EvaluatePreConfigRulesResponse getInstance(UnmarshallerContext context) {
		return	EvaluatePreConfigRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
