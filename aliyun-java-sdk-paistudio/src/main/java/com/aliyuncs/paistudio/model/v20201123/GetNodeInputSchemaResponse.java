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

package com.aliyuncs.paistudio.model.v20201123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paistudio.transform.v20201123.GetNodeInputSchemaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeInputSchemaResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<String> colNames;

		private List<String> colTypes;

		public List<String> getColNames() {
			return this.colNames;
		}

		public void setColNames(List<String> colNames) {
			this.colNames = colNames;
		}

		public List<String> getColTypes() {
			return this.colTypes;
		}

		public void setColTypes(List<String> colTypes) {
			this.colTypes = colTypes;
		}
	}

	@Override
	public GetNodeInputSchemaResponse getInstance(UnmarshallerContext context) {
		return	GetNodeInputSchemaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
