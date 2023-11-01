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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListCustomizeRuleTestResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomizeRuleTestResultResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ResponseDataItem> responseData;

		private PageInfo pageInfo;

		public List<ResponseDataItem> getResponseData() {
			return this.responseData;
		}

		public void setResponseData(List<ResponseDataItem> responseData) {
			this.responseData = responseData;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class ResponseDataItem {

			private String uuid;

			private String mainUserId;

			private String subUserId;

			private String logType;

			private String logSource;

			private String alertSrcProd;

			private String alertSrcProdModule;

			private String attCk;

			private String alertDesc;

			private String onlineStatus;

			private String eventName;

			private String level;

			private String eventType;

			private String alertDetail;

			private String logTime;

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getMainUserId() {
				return this.mainUserId;
			}

			public void setMainUserId(String mainUserId) {
				this.mainUserId = mainUserId;
			}

			public String getSubUserId() {
				return this.subUserId;
			}

			public void setSubUserId(String subUserId) {
				this.subUserId = subUserId;
			}

			public String getLogType() {
				return this.logType;
			}

			public void setLogType(String logType) {
				this.logType = logType;
			}

			public String getLogSource() {
				return this.logSource;
			}

			public void setLogSource(String logSource) {
				this.logSource = logSource;
			}

			public String getAlertSrcProd() {
				return this.alertSrcProd;
			}

			public void setAlertSrcProd(String alertSrcProd) {
				this.alertSrcProd = alertSrcProd;
			}

			public String getAlertSrcProdModule() {
				return this.alertSrcProdModule;
			}

			public void setAlertSrcProdModule(String alertSrcProdModule) {
				this.alertSrcProdModule = alertSrcProdModule;
			}

			public String getAttCk() {
				return this.attCk;
			}

			public void setAttCk(String attCk) {
				this.attCk = attCk;
			}

			public String getAlertDesc() {
				return this.alertDesc;
			}

			public void setAlertDesc(String alertDesc) {
				this.alertDesc = alertDesc;
			}

			public String getOnlineStatus() {
				return this.onlineStatus;
			}

			public void setOnlineStatus(String onlineStatus) {
				this.onlineStatus = onlineStatus;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}

			public String getAlertDetail() {
				return this.alertDetail;
			}

			public void setAlertDetail(String alertDetail) {
				this.alertDetail = alertDetail;
			}

			public String getLogTime() {
				return this.logTime;
			}

			public void setLogTime(String logTime) {
				this.logTime = logTime;
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public ListCustomizeRuleTestResultResponse getInstance(UnmarshallerContext context) {
		return	ListCustomizeRuleTestResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
