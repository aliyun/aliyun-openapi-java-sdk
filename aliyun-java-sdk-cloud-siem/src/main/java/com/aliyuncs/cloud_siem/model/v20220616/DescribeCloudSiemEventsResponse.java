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
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeCloudSiemEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudSiemEventsResponse extends AcsResponse {

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

			private String gmtCreate;

			private String gmtModified;

			private Long aliuid;

			private Integer alertNum;

			private Integer assetNum;

			private String incidentUuid;

			private String incidentName;

			private String incidentNameEn;

			private String description;

			private String descriptionEn;

			private String threatLevel;

			private Float threatScore;

			private String extContent;

			private Integer status;

			private String referAccount;

			private String remark;

			private List<String> dataSources;

			private List<String> attCkLabels;

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

			public Long getAliuid() {
				return this.aliuid;
			}

			public void setAliuid(Long aliuid) {
				this.aliuid = aliuid;
			}

			public Integer getAlertNum() {
				return this.alertNum;
			}

			public void setAlertNum(Integer alertNum) {
				this.alertNum = alertNum;
			}

			public Integer getAssetNum() {
				return this.assetNum;
			}

			public void setAssetNum(Integer assetNum) {
				this.assetNum = assetNum;
			}

			public String getIncidentUuid() {
				return this.incidentUuid;
			}

			public void setIncidentUuid(String incidentUuid) {
				this.incidentUuid = incidentUuid;
			}

			public String getIncidentName() {
				return this.incidentName;
			}

			public void setIncidentName(String incidentName) {
				this.incidentName = incidentName;
			}

			public String getIncidentNameEn() {
				return this.incidentNameEn;
			}

			public void setIncidentNameEn(String incidentNameEn) {
				this.incidentNameEn = incidentNameEn;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDescriptionEn() {
				return this.descriptionEn;
			}

			public void setDescriptionEn(String descriptionEn) {
				this.descriptionEn = descriptionEn;
			}

			public String getThreatLevel() {
				return this.threatLevel;
			}

			public void setThreatLevel(String threatLevel) {
				this.threatLevel = threatLevel;
			}

			public Float getThreatScore() {
				return this.threatScore;
			}

			public void setThreatScore(Float threatScore) {
				this.threatScore = threatScore;
			}

			public String getExtContent() {
				return this.extContent;
			}

			public void setExtContent(String extContent) {
				this.extContent = extContent;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getReferAccount() {
				return this.referAccount;
			}

			public void setReferAccount(String referAccount) {
				this.referAccount = referAccount;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public List<String> getDataSources() {
				return this.dataSources;
			}

			public void setDataSources(List<String> dataSources) {
				this.dataSources = dataSources;
			}

			public List<String> getAttCkLabels() {
				return this.attCkLabels;
			}

			public void setAttCkLabels(List<String> attCkLabels) {
				this.attCkLabels = attCkLabels;
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
	public DescribeCloudSiemEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudSiemEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
