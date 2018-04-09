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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeServiceHealthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceHealthResponse extends AcsResponse {

	private String requestId;

	private String name;

	private List<ComponentHealthResult> componentHealthResultList;

	private HealthResult healthResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ComponentHealthResult> getComponentHealthResultList() {
		return this.componentHealthResultList;
	}

	public void setComponentHealthResultList(List<ComponentHealthResult> componentHealthResultList) {
		this.componentHealthResultList = componentHealthResultList;
	}

	public HealthResult getHealthResult() {
		return this.healthResult;
	}

	public void setHealthResult(HealthResult healthResult) {
		this.healthResult = healthResult;
	}

	public static class ComponentHealthResult {

		private String key;

		private Integer passNumber;

		private Integer errorNumber;

		private Integer warningNumber;

		private Integer unKnownNumber;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Integer getPassNumber() {
			return this.passNumber;
		}

		public void setPassNumber(Integer passNumber) {
			this.passNumber = passNumber;
		}

		public Integer getErrorNumber() {
			return this.errorNumber;
		}

		public void setErrorNumber(Integer errorNumber) {
			this.errorNumber = errorNumber;
		}

		public Integer getWarningNumber() {
			return this.warningNumber;
		}

		public void setWarningNumber(Integer warningNumber) {
			this.warningNumber = warningNumber;
		}

		public Integer getUnKnownNumber() {
			return this.unKnownNumber;
		}

		public void setUnKnownNumber(Integer unKnownNumber) {
			this.unKnownNumber = unKnownNumber;
		}
	}

	public static class HealthResult {

		private String key;

		private Integer passNumber;

		private Integer errorNumber;

		private Integer warningNumber;

		private Integer unKnownNumber;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Integer getPassNumber() {
			return this.passNumber;
		}

		public void setPassNumber(Integer passNumber) {
			this.passNumber = passNumber;
		}

		public Integer getErrorNumber() {
			return this.errorNumber;
		}

		public void setErrorNumber(Integer errorNumber) {
			this.errorNumber = errorNumber;
		}

		public Integer getWarningNumber() {
			return this.warningNumber;
		}

		public void setWarningNumber(Integer warningNumber) {
			this.warningNumber = warningNumber;
		}

		public Integer getUnKnownNumber() {
			return this.unKnownNumber;
		}

		public void setUnKnownNumber(Integer unKnownNumber) {
			this.unKnownNumber = unKnownNumber;
		}
	}

	@Override
	public DescribeServiceHealthResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceHealthResponseUnmarshaller.unmarshall(this, context);
	}
}
