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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.BatchqueryODPOperationAuditResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchqueryODPOperationAuditResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private List<ContentItem> content;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String aliyunMasterId;

			private String envMode;

			private String envTenant;

			private String gmtCreate;

			private String gmtModified;

			private String invokeType;

			private String openApiName;

			private String operationDescription;

			private String operationType;

			private String params;

			private String productInstanceId;

			private String requestId;

			private String resultCode;

			private String resultMsg;

			private String userId;

			private String userName;

			private String userType;

			public String getAliyunMasterId() {
				return this.aliyunMasterId;
			}

			public void setAliyunMasterId(String aliyunMasterId) {
				this.aliyunMasterId = aliyunMasterId;
			}

			public String getEnvMode() {
				return this.envMode;
			}

			public void setEnvMode(String envMode) {
				this.envMode = envMode;
			}

			public String getEnvTenant() {
				return this.envTenant;
			}

			public void setEnvTenant(String envTenant) {
				this.envTenant = envTenant;
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

			public String getInvokeType() {
				return this.invokeType;
			}

			public void setInvokeType(String invokeType) {
				this.invokeType = invokeType;
			}

			public String getOpenApiName() {
				return this.openApiName;
			}

			public void setOpenApiName(String openApiName) {
				this.openApiName = openApiName;
			}

			public String getOperationDescription() {
				return this.operationDescription;
			}

			public void setOperationDescription(String operationDescription) {
				this.operationDescription = operationDescription;
			}

			public String getOperationType() {
				return this.operationType;
			}

			public void setOperationType(String operationType) {
				this.operationType = operationType;
			}

			public String getParams() {
				return this.params;
			}

			public void setParams(String params) {
				this.params = params;
			}

			public String getProductInstanceId() {
				return this.productInstanceId;
			}

			public void setProductInstanceId(String productInstanceId) {
				this.productInstanceId = productInstanceId;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public String getResultCode() {
				return this.resultCode;
			}

			public void setResultCode(String resultCode) {
				this.resultCode = resultCode;
			}

			public String getResultMsg() {
				return this.resultMsg;
			}

			public void setResultMsg(String resultMsg) {
				this.resultMsg = resultMsg;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}
		}
	}

	@Override
	public BatchqueryODPOperationAuditResponse getInstance(UnmarshallerContext context) {
		return	BatchqueryODPOperationAuditResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
