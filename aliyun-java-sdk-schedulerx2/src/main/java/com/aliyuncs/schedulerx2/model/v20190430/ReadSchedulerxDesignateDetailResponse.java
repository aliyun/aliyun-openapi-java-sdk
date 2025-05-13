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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.ReadSchedulerxDesignateDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReadSchedulerxDesignateDetailResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	private AccessDeniedDetail accessDeniedDetail;

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

	public AccessDeniedDetail getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public static class Data {

		private List<DesignateDetailVo> designateDetailVos;

		public List<DesignateDetailVo> getDesignateDetailVos() {
			return this.designateDetailVos;
		}

		public void setDesignateDetailVos(List<DesignateDetailVo> designateDetailVos) {
			this.designateDetailVos = designateDetailVos;
		}

		public static class DesignateDetailVo {

			private Boolean offline;

			private Integer size;

			private String starter;

			private String busy;

			private Boolean checked;

			private String version;

			private String key;

			private Metrics metrics;

			public Boolean getOffline() {
				return this.offline;
			}

			public void setOffline(Boolean offline) {
				this.offline = offline;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getStarter() {
				return this.starter;
			}

			public void setStarter(String starter) {
				this.starter = starter;
			}

			public String getBusy() {
				return this.busy;
			}

			public void setBusy(String busy) {
				this.busy = busy;
			}

			public Boolean getChecked() {
				return this.checked;
			}

			public void setChecked(Boolean checked) {
				this.checked = checked;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public Metrics getMetrics() {
				return this.metrics;
			}

			public void setMetrics(Metrics metrics) {
				this.metrics = metrics;
			}

			public static class Metrics {

				private Double cpuLoad1;

				private Double cpuLoad5;

				private Integer cpuProcessors;

				private Double heap1Usage;

				private Double heap5Usage;

				private Double heap1Used;

				private Integer heapMax;

				private Double diskUsage;

				private Integer diskUsed;

				private Integer diskMax;

				private Integer sharePoolQueueSize;

				private Integer sharePoolAvailableSize;

				private Long execCount;

				public Double getCpuLoad1() {
					return this.cpuLoad1;
				}

				public void setCpuLoad1(Double cpuLoad1) {
					this.cpuLoad1 = cpuLoad1;
				}

				public Double getCpuLoad5() {
					return this.cpuLoad5;
				}

				public void setCpuLoad5(Double cpuLoad5) {
					this.cpuLoad5 = cpuLoad5;
				}

				public Integer getCpuProcessors() {
					return this.cpuProcessors;
				}

				public void setCpuProcessors(Integer cpuProcessors) {
					this.cpuProcessors = cpuProcessors;
				}

				public Double getHeap1Usage() {
					return this.heap1Usage;
				}

				public void setHeap1Usage(Double heap1Usage) {
					this.heap1Usage = heap1Usage;
				}

				public Double getHeap5Usage() {
					return this.heap5Usage;
				}

				public void setHeap5Usage(Double heap5Usage) {
					this.heap5Usage = heap5Usage;
				}

				public Double getHeap1Used() {
					return this.heap1Used;
				}

				public void setHeap1Used(Double heap1Used) {
					this.heap1Used = heap1Used;
				}

				public Integer getHeapMax() {
					return this.heapMax;
				}

				public void setHeapMax(Integer heapMax) {
					this.heapMax = heapMax;
				}

				public Double getDiskUsage() {
					return this.diskUsage;
				}

				public void setDiskUsage(Double diskUsage) {
					this.diskUsage = diskUsage;
				}

				public Integer getDiskUsed() {
					return this.diskUsed;
				}

				public void setDiskUsed(Integer diskUsed) {
					this.diskUsed = diskUsed;
				}

				public Integer getDiskMax() {
					return this.diskMax;
				}

				public void setDiskMax(Integer diskMax) {
					this.diskMax = diskMax;
				}

				public Integer getSharePoolQueueSize() {
					return this.sharePoolQueueSize;
				}

				public void setSharePoolQueueSize(Integer sharePoolQueueSize) {
					this.sharePoolQueueSize = sharePoolQueueSize;
				}

				public Integer getSharePoolAvailableSize() {
					return this.sharePoolAvailableSize;
				}

				public void setSharePoolAvailableSize(Integer sharePoolAvailableSize) {
					this.sharePoolAvailableSize = sharePoolAvailableSize;
				}

				public Long getExecCount() {
					return this.execCount;
				}

				public void setExecCount(Long execCount) {
					this.execCount = execCount;
				}
			}
		}
	}

	public static class AccessDeniedDetail {

		private String authAction;

		private String authPrincipalDisplayName;

		private String authPrincipalOwnerId;

		private String authPrincipalType;

		private String encodedDiagnosticMessage;

		private String noPermissionType;

		private String policyType;

		public String getAuthAction() {
			return this.authAction;
		}

		public void setAuthAction(String authAction) {
			this.authAction = authAction;
		}

		public String getAuthPrincipalDisplayName() {
			return this.authPrincipalDisplayName;
		}

		public void setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
			this.authPrincipalDisplayName = authPrincipalDisplayName;
		}

		public String getAuthPrincipalOwnerId() {
			return this.authPrincipalOwnerId;
		}

		public void setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
			this.authPrincipalOwnerId = authPrincipalOwnerId;
		}

		public String getAuthPrincipalType() {
			return this.authPrincipalType;
		}

		public void setAuthPrincipalType(String authPrincipalType) {
			this.authPrincipalType = authPrincipalType;
		}

		public String getEncodedDiagnosticMessage() {
			return this.encodedDiagnosticMessage;
		}

		public void setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
			this.encodedDiagnosticMessage = encodedDiagnosticMessage;
		}

		public String getNoPermissionType() {
			return this.noPermissionType;
		}

		public void setNoPermissionType(String noPermissionType) {
			this.noPermissionType = noPermissionType;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
	}

	@Override
	public ReadSchedulerxDesignateDetailResponse getInstance(UnmarshallerContext context) {
		return	ReadSchedulerxDesignateDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
