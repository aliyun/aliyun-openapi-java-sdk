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
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeCloudSiemAssetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudSiemAssetsResponse extends AcsResponse {

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

			private Long aliuid;

			private Long subUserId;

			private String incidentUuid;

			private String alertUuid;

			private String assetName;

			private String assetType;

			private String assetId;

			private String cloudCode;

			private List<AssetInfoItem> assetInfo;

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

			public Long getAliuid() {
				return this.aliuid;
			}

			public void setAliuid(Long aliuid) {
				this.aliuid = aliuid;
			}

			public Long getSubUserId() {
				return this.subUserId;
			}

			public void setSubUserId(Long subUserId) {
				this.subUserId = subUserId;
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

			public String getAssetName() {
				return this.assetName;
			}

			public void setAssetName(String assetName) {
				this.assetName = assetName;
			}

			public String getAssetType() {
				return this.assetType;
			}

			public void setAssetType(String assetType) {
				this.assetType = assetType;
			}

			public String getAssetId() {
				return this.assetId;
			}

			public void setAssetId(String assetId) {
				this.assetId = assetId;
			}

			public String getCloudCode() {
				return this.cloudCode;
			}

			public void setCloudCode(String cloudCode) {
				this.cloudCode = cloudCode;
			}

			public List<AssetInfoItem> getAssetInfo() {
				return this.assetInfo;
			}

			public void setAssetInfo(List<AssetInfoItem> assetInfo) {
				this.assetInfo = assetInfo;
			}

			public static class AssetInfoItem {

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
	public DescribeCloudSiemAssetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudSiemAssetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
