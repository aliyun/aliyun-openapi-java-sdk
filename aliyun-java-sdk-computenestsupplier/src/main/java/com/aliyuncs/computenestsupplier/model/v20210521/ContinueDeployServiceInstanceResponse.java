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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ContinueDeployServiceInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ContinueDeployServiceInstanceResponse extends AcsResponse {

	private String requestId;

	private String serviceInstanceId;

	private DryRunResult dryRunResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
	}

	public DryRunResult getDryRunResult() {
		return this.dryRunResult;
	}

	public void setDryRunResult(DryRunResult dryRunResult) {
		this.dryRunResult = dryRunResult;
	}

	public static class DryRunResult {

		private List<String> parametersNotAllowedToBeModified;

		private List<String> parametersConditionallyAllowedToBeModified;

		private List<String> parametersAllowedToBeModified;

		public List<String> getParametersNotAllowedToBeModified() {
			return this.parametersNotAllowedToBeModified;
		}

		public void setParametersNotAllowedToBeModified(List<String> parametersNotAllowedToBeModified) {
			this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
		}

		public List<String> getParametersConditionallyAllowedToBeModified() {
			return this.parametersConditionallyAllowedToBeModified;
		}

		public void setParametersConditionallyAllowedToBeModified(List<String> parametersConditionallyAllowedToBeModified) {
			this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
		}

		public List<String> getParametersAllowedToBeModified() {
			return this.parametersAllowedToBeModified;
		}

		public void setParametersAllowedToBeModified(List<String> parametersAllowedToBeModified) {
			this.parametersAllowedToBeModified = parametersAllowedToBeModified;
		}
	}

	@Override
	public ContinueDeployServiceInstanceResponse getInstance(UnmarshallerContext context) {
		return	ContinueDeployServiceInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
