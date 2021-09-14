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

package com.aliyuncs.emas_dmp.model.v20210402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_dmp.transform.v20210402.ListTargetAudienceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTargetAudienceResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalPages;

		private Integer totalElements;

		private List<Crowds> taList;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getTotalElements() {
			return this.totalElements;
		}

		public void setTotalElements(Integer totalElements) {
			this.totalElements = totalElements;
		}

		public List<Crowds> getTaList() {
			return this.taList;
		}

		public void setTaList(List<Crowds> taList) {
			this.taList = taList;
		}

		public static class Crowds {

			private String taId;

			private String name;

			private String createdTime;

			private Long totalNumber;

			private String source;

			private String taBaseType;

			private String taType;

			private String tenantId;

			private String tenantName;

			private String accountId;

			private String accountName;

			private String status;

			private Integer uploadFileNum;

			private String pushStatus;

			private String pushTime;

			private String errorMessage;

			private String createCondition;

			private String businessScenario;

			private List<String> pushedBand;

			public String getTaId() {
				return this.taId;
			}

			public void setTaId(String taId) {
				this.taId = taId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public Long getTotalNumber() {
				return this.totalNumber;
			}

			public void setTotalNumber(Long totalNumber) {
				this.totalNumber = totalNumber;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getTaBaseType() {
				return this.taBaseType;
			}

			public void setTaBaseType(String taBaseType) {
				this.taBaseType = taBaseType;
			}

			public String getTaType() {
				return this.taType;
			}

			public void setTaType(String taType) {
				this.taType = taType;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public String getAccountId() {
				return this.accountId;
			}

			public void setAccountId(String accountId) {
				this.accountId = accountId;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getUploadFileNum() {
				return this.uploadFileNum;
			}

			public void setUploadFileNum(Integer uploadFileNum) {
				this.uploadFileNum = uploadFileNum;
			}

			public String getPushStatus() {
				return this.pushStatus;
			}

			public void setPushStatus(String pushStatus) {
				this.pushStatus = pushStatus;
			}

			public String getPushTime() {
				return this.pushTime;
			}

			public void setPushTime(String pushTime) {
				this.pushTime = pushTime;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getCreateCondition() {
				return this.createCondition;
			}

			public void setCreateCondition(String createCondition) {
				this.createCondition = createCondition;
			}

			public String getBusinessScenario() {
				return this.businessScenario;
			}

			public void setBusinessScenario(String businessScenario) {
				this.businessScenario = businessScenario;
			}

			public List<String> getPushedBand() {
				return this.pushedBand;
			}

			public void setPushedBand(List<String> pushedBand) {
				this.pushedBand = pushedBand;
			}
		}
	}

	@Override
	public ListTargetAudienceResponse getInstance(UnmarshallerContext context) {
		return	ListTargetAudienceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
