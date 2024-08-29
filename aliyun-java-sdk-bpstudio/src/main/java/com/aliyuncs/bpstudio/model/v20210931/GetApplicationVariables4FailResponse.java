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
import com.aliyuncs.bpstudio.transform.v20210931.GetApplicationVariables4FailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationVariables4FailResponse extends AcsResponse {

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

		private String region;

		private String attribute;

		private String variable;

		private String placeHolder;

		private String value;

		private String defaultValue;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

		public String getVariable() {
			return this.variable;
		}

		public void setVariable(String variable) {
			this.variable = variable;
		}

		public String getPlaceHolder() {
			return this.placeHolder;
		}

		public void setPlaceHolder(String placeHolder) {
			this.placeHolder = placeHolder;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}
	}

	@Override
	public GetApplicationVariables4FailResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationVariables4FailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
