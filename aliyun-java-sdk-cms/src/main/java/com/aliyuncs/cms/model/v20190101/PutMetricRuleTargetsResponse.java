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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.PutMetricRuleTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PutMetricRuleTargetsResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private FailData failData;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FailData getFailData() {
		return this.failData;
	}

	public void setFailData(FailData failData) {
		this.failData = failData;
	}

	public static class FailData {

		private List<Target> targets;

		public List<Target> getTargets() {
			return this.targets;
		}

		public void setTargets(List<Target> targets) {
			this.targets = targets;
		}

		public static class Target {

			private String id;

			private String arn;

			private String level;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getArn() {
				return this.arn;
			}

			public void setArn(String arn) {
				this.arn = arn;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}
		}
	}

	@Override
	public PutMetricRuleTargetsResponse getInstance(UnmarshallerContext context) {
		return	PutMetricRuleTargetsResponseUnmarshaller.unmarshall(this, context);
	}
}
