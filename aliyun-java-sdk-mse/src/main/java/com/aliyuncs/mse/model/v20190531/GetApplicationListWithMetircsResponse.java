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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetApplicationListWithMetircsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationListWithMetircsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<ApplicationList> result;

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<ApplicationList> getResult() {
			return this.result;
		}

		public void setResult(List<ApplicationList> result) {
			this.result = result;
		}

		public static class ApplicationList {

			private String regionId;

			private String namespace;

			private String appName;

			private String appId;

			private Long status;

			private String extraInfo;

			private String licenseKey;

			private String userId;

			private Integer instancesNumber;

			private String source;

			private String language;

			private Long tagCount;

			private Integer appType;

			private List<CurMetricsItem> curMetrics;

			private List<String> tags;

			private CurMetricsFm curMetricsFm;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getExtraInfo() {
				return this.extraInfo;
			}

			public void setExtraInfo(String extraInfo) {
				this.extraInfo = extraInfo;
			}

			public String getLicenseKey() {
				return this.licenseKey;
			}

			public void setLicenseKey(String licenseKey) {
				this.licenseKey = licenseKey;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Integer getInstancesNumber() {
				return this.instancesNumber;
			}

			public void setInstancesNumber(Integer instancesNumber) {
				this.instancesNumber = instancesNumber;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public Long getTagCount() {
				return this.tagCount;
			}

			public void setTagCount(Long tagCount) {
				this.tagCount = tagCount;
			}

			public Integer getAppType() {
				return this.appType;
			}

			public void setAppType(Integer appType) {
				this.appType = appType;
			}

			public List<CurMetricsItem> getCurMetrics() {
				return this.curMetrics;
			}

			public void setCurMetrics(List<CurMetricsItem> curMetrics) {
				this.curMetrics = curMetrics;
			}

			public List<String> getTags() {
				return this.tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}

			public CurMetricsFm getCurMetricsFm() {
				return this.curMetricsFm;
			}

			public void setCurMetricsFm(CurMetricsFm curMetricsFm) {
				this.curMetricsFm = curMetricsFm;
			}

			public static class CurMetricsItem {

				private Long timestamp;

				private Double qps;

				private Double expQps;

				private Double rt;

				private Double passQps;

				private Double blockQps;

				private Double thread;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public Double getQps() {
					return this.qps;
				}

				public void setQps(Double qps) {
					this.qps = qps;
				}

				public Double getExpQps() {
					return this.expQps;
				}

				public void setExpQps(Double expQps) {
					this.expQps = expQps;
				}

				public Double getRt() {
					return this.rt;
				}

				public void setRt(Double rt) {
					this.rt = rt;
				}

				public Double getPassQps() {
					return this.passQps;
				}

				public void setPassQps(Double passQps) {
					this.passQps = passQps;
				}

				public Double getBlockQps() {
					return this.blockQps;
				}

				public void setBlockQps(Double blockQps) {
					this.blockQps = blockQps;
				}

				public Double getThread() {
					return this.thread;
				}

				public void setThread(Double thread) {
					this.thread = thread;
				}
			}

			public static class CurMetricsFm {

				private Long timestamp;

				private Double qps;

				private Double expQps;

				private Double rt;

				private Double passQps;

				private Double blockQps;

				private Double thread;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public Double getQps() {
					return this.qps;
				}

				public void setQps(Double qps) {
					this.qps = qps;
				}

				public Double getExpQps() {
					return this.expQps;
				}

				public void setExpQps(Double expQps) {
					this.expQps = expQps;
				}

				public Double getRt() {
					return this.rt;
				}

				public void setRt(Double rt) {
					this.rt = rt;
				}

				public Double getPassQps() {
					return this.passQps;
				}

				public void setPassQps(Double passQps) {
					this.passQps = passQps;
				}

				public Double getBlockQps() {
					return this.blockQps;
				}

				public void setBlockQps(Double blockQps) {
					this.blockQps = blockQps;
				}

				public Double getThread() {
					return this.thread;
				}

				public void setThread(Double thread) {
					this.thread = thread;
				}
			}
		}
	}

	@Override
	public GetApplicationListWithMetircsResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationListWithMetircsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
