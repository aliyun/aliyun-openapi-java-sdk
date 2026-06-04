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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.QueryInspirationAccountDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInspirationAccountDetailsResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Integer totalItemNum;

		private Integer currentPageNum;

		private Integer pageSize;

		private Integer totalPageNum;

		private Boolean prePage;

		private Boolean nextPage;

		private Boolean resultLimit;

		private List<DataItem> data;

		private Next next;

		public Integer getTotalItemNum() {
			return this.totalItemNum;
		}

		public void setTotalItemNum(Integer totalItemNum) {
			this.totalItemNum = totalItemNum;
		}

		public Integer getCurrentPageNum() {
			return this.currentPageNum;
		}

		public void setCurrentPageNum(Integer currentPageNum) {
			this.currentPageNum = currentPageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPageNum() {
			return this.totalPageNum;
		}

		public void setTotalPageNum(Integer totalPageNum) {
			this.totalPageNum = totalPageNum;
		}

		public Boolean getPrePage() {
			return this.prePage;
		}

		public void setPrePage(Boolean prePage) {
			this.prePage = prePage;
		}

		public Boolean getNextPage() {
			return this.nextPage;
		}

		public void setNextPage(Boolean nextPage) {
			this.nextPage = nextPage;
		}

		public Boolean getResultLimit() {
			return this.resultLimit;
		}

		public void setResultLimit(Boolean resultLimit) {
			this.resultLimit = resultLimit;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public Next getNext() {
			return this.next;
		}

		public void setNext(Next next) {
			this.next = next;
		}

		public static class DataItem {

			private String acquisitionTime;

			private String sourceType;

			private String sourceTypeName;

			private Long initQuota;

			private Long balance;

			private String endDate;

			private Boolean expired;

			private String status;

			public String getAcquisitionTime() {
				return this.acquisitionTime;
			}

			public void setAcquisitionTime(String acquisitionTime) {
				this.acquisitionTime = acquisitionTime;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getSourceTypeName() {
				return this.sourceTypeName;
			}

			public void setSourceTypeName(String sourceTypeName) {
				this.sourceTypeName = sourceTypeName;
			}

			public Long getInitQuota() {
				return this.initQuota;
			}

			public void setInitQuota(Long initQuota) {
				this.initQuota = initQuota;
			}

			public Long getBalance() {
				return this.balance;
			}

			public void setBalance(Long balance) {
				this.balance = balance;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public Boolean getExpired() {
				return this.expired;
			}

			public void setExpired(Boolean expired) {
				this.expired = expired;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class Next {

			private String acquisitionTime;

			private String sourceType;

			private String sourceTypeName;

			private Long initQuota;

			private Long balance;

			private String endDate;

			private Boolean expired;

			public String getAcquisitionTime() {
				return this.acquisitionTime;
			}

			public void setAcquisitionTime(String acquisitionTime) {
				this.acquisitionTime = acquisitionTime;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getSourceTypeName() {
				return this.sourceTypeName;
			}

			public void setSourceTypeName(String sourceTypeName) {
				this.sourceTypeName = sourceTypeName;
			}

			public Long getInitQuota() {
				return this.initQuota;
			}

			public void setInitQuota(Long initQuota) {
				this.initQuota = initQuota;
			}

			public Long getBalance() {
				return this.balance;
			}

			public void setBalance(Long balance) {
				this.balance = balance;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public Boolean getExpired() {
				return this.expired;
			}

			public void setExpired(Boolean expired) {
				this.expired = expired;
			}
		}
	}

	@Override
	public QueryInspirationAccountDetailsResponse getInstance(UnmarshallerContext context) {
		return	QueryInspirationAccountDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
