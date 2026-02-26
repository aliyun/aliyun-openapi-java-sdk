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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GenerateTemplatePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateTemplatePolicyResponse extends AcsResponse {

	private String requestId;

	private Policy policy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Policy getPolicy() {
		return this.policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public static class Policy {

		private String version;

		private List<StatementItem> statement;

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<StatementItem> getStatement() {
			return this.statement;
		}

		public void setStatement(List<StatementItem> statement) {
			this.statement = statement;
		}

		public static class StatementItem {

			private String effect;

			private String resource;

			private Map<Object,Object> condition;

			private List<String> action;

			public String getEffect() {
				return this.effect;
			}

			public void setEffect(String effect) {
				this.effect = effect;
			}

			public String getResource() {
				return this.resource;
			}

			public void setResource(String resource) {
				this.resource = resource;
			}

			public Map<Object,Object> getCondition() {
				return this.condition;
			}

			public void setCondition(Map<Object,Object> condition) {
				this.condition = condition;
			}

			public List<String> getAction() {
				return this.action;
			}

			public void setAction(List<String> action) {
				this.action = action;
			}
		}
	}

	@Override
	public GenerateTemplatePolicyResponse getInstance(UnmarshallerContext context) {
		return	GenerateTemplatePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
