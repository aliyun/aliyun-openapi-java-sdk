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

package com.aliyuncs.ltl.model.v20190510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ltl.transform.v20190510.ListDependentDataModelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDependentDataModelsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<DataModelInfo> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataModelInfo> getData() {
		return this.data;
	}

	public void setData(List<DataModelInfo> data) {
		this.data = data;
	}

	public static class DataModelInfo {

		private String dataModelCode;

		private String dataModelName;

		public String getDataModelCode() {
			return this.dataModelCode;
		}

		public void setDataModelCode(String dataModelCode) {
			this.dataModelCode = dataModelCode;
		}

		public String getDataModelName() {
			return this.dataModelName;
		}

		public void setDataModelName(String dataModelName) {
			this.dataModelName = dataModelName;
		}
	}

	@Override
	public ListDependentDataModelsResponse getInstance(UnmarshallerContext context) {
		return	ListDependentDataModelsResponseUnmarshaller.unmarshall(this, context);
	}
}
