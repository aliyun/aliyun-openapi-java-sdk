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

package com.aliyuncs.bpstudio.model.v20210931;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.GetApplicationVariablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationVariablesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private List<Items> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Items> getData() {
		return this.data;
	}

	public void setData(List<Items> data) {
		this.data = data;
	}

	public static class Items {

		private String instanceId;

		private List<Variables> variableList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<Variables> getVariableList() {
			return this.variableList;
		}

		public void setVariableList(List<Variables> variableList) {
			this.variableList = variableList;
		}

		public static class Variables {

			private String variable;

			private String value;

			public String getVariable() {
				return this.variable;
			}

			public void setVariable(String variable) {
				this.variable = variable;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetApplicationVariablesResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationVariablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
