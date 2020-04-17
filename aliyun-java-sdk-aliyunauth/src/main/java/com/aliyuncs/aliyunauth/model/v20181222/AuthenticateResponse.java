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

package com.aliyuncs.aliyunauth.model.v20181222;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyunauth.transform.v20181222.AuthenticateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AuthenticateResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private String instanceId;

		private String productCode;

		private Boolean authorized;

		private String recordVid;

		private String operateCode;

		private List<QueryAuthRSDTO> userInputList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Boolean getAuthorized() {
			return this.authorized;
		}

		public void setAuthorized(Boolean authorized) {
			this.authorized = authorized;
		}

		public String getRecordVid() {
			return this.recordVid;
		}

		public void setRecordVid(String recordVid) {
			this.recordVid = recordVid;
		}

		public String getOperateCode() {
			return this.operateCode;
		}

		public void setOperateCode(String operateCode) {
			this.operateCode = operateCode;
		}

		public List<QueryAuthRSDTO> getUserInputList() {
			return this.userInputList;
		}

		public void setUserInputList(List<QueryAuthRSDTO> userInputList) {
			this.userInputList = userInputList;
		}

		public static class QueryAuthRSDTO {

			private String fieldName;

			private String fieldVid;

			private String expandContent;

			private String content;

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getFieldVid() {
				return this.fieldVid;
			}

			public void setFieldVid(String fieldVid) {
				this.fieldVid = fieldVid;
			}

			public String getExpandContent() {
				return this.expandContent;
			}

			public void setExpandContent(String expandContent) {
				this.expandContent = expandContent;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public AuthenticateResponse getInstance(UnmarshallerContext context) {
		return	AuthenticateResponseUnmarshaller.unmarshall(this, context);
	}
}
