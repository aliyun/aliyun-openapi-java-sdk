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
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeAlertsWithEntityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertsWithEntityResponse extends AcsResponse {

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

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			private Long mainUserId;

			private String incidentUuid;

			private String alertUuid;

			private String logTime;

			private String alertSrcProd;

			private String alertTitle;

			private String alertTitleEn;

			private String alertType;

			private String alertTypeEn;

			private String alertTypeCode;

			private String alertName;

			private String alertNameEn;

			private String alertNameCode;

			private String alertLevel;

			private String assetList;

			private String occurTime;

			private String startTime;

			private String endTime;

			private String alertSrcProdModule;

			private String alertDesc;

			private String alertDescEn;

			private String alertDescCode;

			private String alertDetail;

			private String logUuid;

			private String attCk;

			private Long subUserId;

			private String cloudCode;

			private String isDefend;

			private List<AlertInfoListItem> alertInfoList;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public Long getMainUserId() {
				return this.mainUserId;
			}

			public void setMainUserId(Long mainUserId) {
				this.mainUserId = mainUserId;
			}

			public String getIncidentUuid() {
				return this.incidentUuid;
			}

			public void setIncidentUuid(String incidentUuid) {
				this.incidentUuid = incidentUuid;
			}

			public String getAlertUuid() {
				return this.alertUuid;
			}

			public void setAlertUuid(String alertUuid) {
				this.alertUuid = alertUuid;
			}

			public String getLogTime() {
				return this.logTime;
			}

			public void setLogTime(String logTime) {
				this.logTime = logTime;
			}

			public String getAlertSrcProd() {
				return this.alertSrcProd;
			}

			public void setAlertSrcProd(String alertSrcProd) {
				this.alertSrcProd = alertSrcProd;
			}

			public String getAlertTitle() {
				return this.alertTitle;
			}

			public void setAlertTitle(String alertTitle) {
				this.alertTitle = alertTitle;
			}

			public String getAlertTitleEn() {
				return this.alertTitleEn;
			}

			public void setAlertTitleEn(String alertTitleEn) {
				this.alertTitleEn = alertTitleEn;
			}

			public String getAlertType() {
				return this.alertType;
			}

			public void setAlertType(String alertType) {
				this.alertType = alertType;
			}

			public String getAlertTypeEn() {
				return this.alertTypeEn;
			}

			public void setAlertTypeEn(String alertTypeEn) {
				this.alertTypeEn = alertTypeEn;
			}

			public String getAlertTypeCode() {
				return this.alertTypeCode;
			}

			public void setAlertTypeCode(String alertTypeCode) {
				this.alertTypeCode = alertTypeCode;
			}

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}

			public String getAlertNameEn() {
				return this.alertNameEn;
			}

			public void setAlertNameEn(String alertNameEn) {
				this.alertNameEn = alertNameEn;
			}

			public String getAlertNameCode() {
				return this.alertNameCode;
			}

			public void setAlertNameCode(String alertNameCode) {
				this.alertNameCode = alertNameCode;
			}

			public String getAlertLevel() {
				return this.alertLevel;
			}

			public void setAlertLevel(String alertLevel) {
				this.alertLevel = alertLevel;
			}

			public String getAssetList() {
				return this.assetList;
			}

			public void setAssetList(String assetList) {
				this.assetList = assetList;
			}

			public String getOccurTime() {
				return this.occurTime;
			}

			public void setOccurTime(String occurTime) {
				this.occurTime = occurTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getAlertSrcProdModule() {
				return this.alertSrcProdModule;
			}

			public void setAlertSrcProdModule(String alertSrcProdModule) {
				this.alertSrcProdModule = alertSrcProdModule;
			}

			public String getAlertDesc() {
				return this.alertDesc;
			}

			public void setAlertDesc(String alertDesc) {
				this.alertDesc = alertDesc;
			}

			public String getAlertDescEn() {
				return this.alertDescEn;
			}

			public void setAlertDescEn(String alertDescEn) {
				this.alertDescEn = alertDescEn;
			}

			public String getAlertDescCode() {
				return this.alertDescCode;
			}

			public void setAlertDescCode(String alertDescCode) {
				this.alertDescCode = alertDescCode;
			}

			public String getAlertDetail() {
				return this.alertDetail;
			}

			public void setAlertDetail(String alertDetail) {
				this.alertDetail = alertDetail;
			}

			public String getLogUuid() {
				return this.logUuid;
			}

			public void setLogUuid(String logUuid) {
				this.logUuid = logUuid;
			}

			public String getAttCk() {
				return this.attCk;
			}

			public void setAttCk(String attCk) {
				this.attCk = attCk;
			}

			public Long getSubUserId() {
				return this.subUserId;
			}

			public void setSubUserId(Long subUserId) {
				this.subUserId = subUserId;
			}

			public String getCloudCode() {
				return this.cloudCode;
			}

			public void setCloudCode(String cloudCode) {
				this.cloudCode = cloudCode;
			}

			public String getIsDefend() {
				return this.isDefend;
			}

			public void setIsDefend(String isDefend) {
				this.isDefend = isDefend;
			}

			public List<AlertInfoListItem> getAlertInfoList() {
				return this.alertInfoList;
			}

			public void setAlertInfoList(List<AlertInfoListItem> alertInfoList) {
				this.alertInfoList = alertInfoList;
			}

			public static class AlertInfoListItem {

				private String key;

				private String keyName;

				private String values;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getKeyName() {
					return this.keyName;
				}

				public void setKeyName(String keyName) {
					this.keyName = keyName;
				}

				public String getValues() {
					return this.values;
				}

				public void setValues(String values) {
					this.values = values;
				}
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
	public DescribeAlertsWithEntityResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertsWithEntityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
