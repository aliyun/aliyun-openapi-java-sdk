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

package com.aliyuncs.airec.model.v20181012;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.CreateDiversifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDiversifyResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String name;

		private String gmtCreate;

		private String gmtModified;

		private Parameter parameter;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Parameter getParameter() {
			return this.parameter;
		}

		public void setParameter(Parameter parameter) {
			this.parameter = parameter;
		}

		public static class Parameter {

			private Integer categoryIndex;

			private Integer window;

			public Integer getCategoryIndex() {
				return this.categoryIndex;
			}

			public void setCategoryIndex(Integer categoryIndex) {
				this.categoryIndex = categoryIndex;
			}

			public Integer getWindow() {
				return this.window;
			}

			public void setWindow(Integer window) {
				this.window = window;
			}
		}
	}

	@Override
	public CreateDiversifyResponse getInstance(UnmarshallerContext context) {
		return	CreateDiversifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
