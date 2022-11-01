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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersResponse extends AcsResponse {

	private String requestId;

	private List<Data> parameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Data> parameters) {
		this.parameters = parameters;
	}

	public static class Data {

		private String description;

		private String valueType;

		private String currentValue;

		private Boolean needReboot;

		private String name;

		private String defaultValue;

		private List<String> rejectedValue;

		private List<String> acceptableValue;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getValueType() {
			return this.valueType;
		}

		public void setValueType(String valueType) {
			this.valueType = valueType;
		}

		public String getCurrentValue() {
			return this.currentValue;
		}

		public void setCurrentValue(String currentValue) {
			this.currentValue = currentValue;
		}

		public Boolean getNeedReboot() {
			return this.needReboot;
		}

		public void setNeedReboot(Boolean needReboot) {
			this.needReboot = needReboot;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public List<String> getRejectedValue() {
			return this.rejectedValue;
		}

		public void setRejectedValue(List<String> rejectedValue) {
			this.rejectedValue = rejectedValue;
		}

		public List<String> getAcceptableValue() {
			return this.acceptableValue;
		}

		public void setAcceptableValue(List<String> acceptableValue) {
			this.acceptableValue = acceptableValue;
		}
	}

	@Override
	public DescribeParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
