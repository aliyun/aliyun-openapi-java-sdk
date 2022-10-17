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

package com.aliyuncs.ahas_openapi.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.GetMetricsOfAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetricsOfAppResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

		private String appName;

		private String namespace;

		private List<InnerMetricsItem> innerMetrics;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public List<InnerMetricsItem> getInnerMetrics() {
			return this.innerMetrics;
		}

		public void setInnerMetrics(List<InnerMetricsItem> innerMetrics) {
			this.innerMetrics = innerMetrics;
		}

		public static class InnerMetricsItem {

			private Float rtP99;

			private Float successQpsAvg;

			private Float passedQpsP99;

			private Float rtAvg;

			private Integer count;

			private Float threadStd;

			private Float passedQpsAvg;

			private Float exceptionP95;

			private Float successQpsMax;

			private Float rtP95;

			private Float blockedQpsMin;

			private Float blockedQps;

			private Long timestamp;

			private Float threadP95;

			private Float rtStd;

			private Float passedQpsMin;

			private Float blockedQpsP99;

			private Float passedQpsMax;

			private Float exceptionMax;

			private Float successQps;

			private Float successQpsP75;

			private Float threadP75;

			private Float successQpsStd;

			private Float exceptionMin;

			private Float passedQpsP75;

			private Float passedQps;

			private Float threadMax;

			private Float successQpsP99;

			private Float successQpsMin;

			private Float threadP99;

			private Float exceptionStd;

			private Float blockedQpsP95;

			private Float thread;

			private Float threadMin;

			private Float rtMin;

			private Float blockedQpsAvg;

			private Float threadAvg;

			private Float blockedQpsP75;

			private Float rtP75;

			private Float exceptionP99;

			private Float exceptionP75;

			private Float successQpsP95;

			private Float rt;

			private Float passedQpsP95;

			private Float rtMax;

			private Float blockedQpsStd;

			private Float blockedQpsMax;

			private Float exception;

			private Float exceptionAvg;

			private Float passedQpsStd;

			public Float getRtP99() {
				return this.rtP99;
			}

			public void setRtP99(Float rtP99) {
				this.rtP99 = rtP99;
			}

			public Float getSuccessQpsAvg() {
				return this.successQpsAvg;
			}

			public void setSuccessQpsAvg(Float successQpsAvg) {
				this.successQpsAvg = successQpsAvg;
			}

			public Float getPassedQpsP99() {
				return this.passedQpsP99;
			}

			public void setPassedQpsP99(Float passedQpsP99) {
				this.passedQpsP99 = passedQpsP99;
			}

			public Float getRtAvg() {
				return this.rtAvg;
			}

			public void setRtAvg(Float rtAvg) {
				this.rtAvg = rtAvg;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Float getThreadStd() {
				return this.threadStd;
			}

			public void setThreadStd(Float threadStd) {
				this.threadStd = threadStd;
			}

			public Float getPassedQpsAvg() {
				return this.passedQpsAvg;
			}

			public void setPassedQpsAvg(Float passedQpsAvg) {
				this.passedQpsAvg = passedQpsAvg;
			}

			public Float getExceptionP95() {
				return this.exceptionP95;
			}

			public void setExceptionP95(Float exceptionP95) {
				this.exceptionP95 = exceptionP95;
			}

			public Float getSuccessQpsMax() {
				return this.successQpsMax;
			}

			public void setSuccessQpsMax(Float successQpsMax) {
				this.successQpsMax = successQpsMax;
			}

			public Float getRtP95() {
				return this.rtP95;
			}

			public void setRtP95(Float rtP95) {
				this.rtP95 = rtP95;
			}

			public Float getBlockedQpsMin() {
				return this.blockedQpsMin;
			}

			public void setBlockedQpsMin(Float blockedQpsMin) {
				this.blockedQpsMin = blockedQpsMin;
			}

			public Float getBlockedQps() {
				return this.blockedQps;
			}

			public void setBlockedQps(Float blockedQps) {
				this.blockedQps = blockedQps;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public Float getThreadP95() {
				return this.threadP95;
			}

			public void setThreadP95(Float threadP95) {
				this.threadP95 = threadP95;
			}

			public Float getRtStd() {
				return this.rtStd;
			}

			public void setRtStd(Float rtStd) {
				this.rtStd = rtStd;
			}

			public Float getPassedQpsMin() {
				return this.passedQpsMin;
			}

			public void setPassedQpsMin(Float passedQpsMin) {
				this.passedQpsMin = passedQpsMin;
			}

			public Float getBlockedQpsP99() {
				return this.blockedQpsP99;
			}

			public void setBlockedQpsP99(Float blockedQpsP99) {
				this.blockedQpsP99 = blockedQpsP99;
			}

			public Float getPassedQpsMax() {
				return this.passedQpsMax;
			}

			public void setPassedQpsMax(Float passedQpsMax) {
				this.passedQpsMax = passedQpsMax;
			}

			public Float getExceptionMax() {
				return this.exceptionMax;
			}

			public void setExceptionMax(Float exceptionMax) {
				this.exceptionMax = exceptionMax;
			}

			public Float getSuccessQps() {
				return this.successQps;
			}

			public void setSuccessQps(Float successQps) {
				this.successQps = successQps;
			}

			public Float getSuccessQpsP75() {
				return this.successQpsP75;
			}

			public void setSuccessQpsP75(Float successQpsP75) {
				this.successQpsP75 = successQpsP75;
			}

			public Float getThreadP75() {
				return this.threadP75;
			}

			public void setThreadP75(Float threadP75) {
				this.threadP75 = threadP75;
			}

			public Float getSuccessQpsStd() {
				return this.successQpsStd;
			}

			public void setSuccessQpsStd(Float successQpsStd) {
				this.successQpsStd = successQpsStd;
			}

			public Float getExceptionMin() {
				return this.exceptionMin;
			}

			public void setExceptionMin(Float exceptionMin) {
				this.exceptionMin = exceptionMin;
			}

			public Float getPassedQpsP75() {
				return this.passedQpsP75;
			}

			public void setPassedQpsP75(Float passedQpsP75) {
				this.passedQpsP75 = passedQpsP75;
			}

			public Float getPassedQps() {
				return this.passedQps;
			}

			public void setPassedQps(Float passedQps) {
				this.passedQps = passedQps;
			}

			public Float getThreadMax() {
				return this.threadMax;
			}

			public void setThreadMax(Float threadMax) {
				this.threadMax = threadMax;
			}

			public Float getSuccessQpsP99() {
				return this.successQpsP99;
			}

			public void setSuccessQpsP99(Float successQpsP99) {
				this.successQpsP99 = successQpsP99;
			}

			public Float getSuccessQpsMin() {
				return this.successQpsMin;
			}

			public void setSuccessQpsMin(Float successQpsMin) {
				this.successQpsMin = successQpsMin;
			}

			public Float getThreadP99() {
				return this.threadP99;
			}

			public void setThreadP99(Float threadP99) {
				this.threadP99 = threadP99;
			}

			public Float getExceptionStd() {
				return this.exceptionStd;
			}

			public void setExceptionStd(Float exceptionStd) {
				this.exceptionStd = exceptionStd;
			}

			public Float getBlockedQpsP95() {
				return this.blockedQpsP95;
			}

			public void setBlockedQpsP95(Float blockedQpsP95) {
				this.blockedQpsP95 = blockedQpsP95;
			}

			public Float getThread() {
				return this.thread;
			}

			public void setThread(Float thread) {
				this.thread = thread;
			}

			public Float getThreadMin() {
				return this.threadMin;
			}

			public void setThreadMin(Float threadMin) {
				this.threadMin = threadMin;
			}

			public Float getRtMin() {
				return this.rtMin;
			}

			public void setRtMin(Float rtMin) {
				this.rtMin = rtMin;
			}

			public Float getBlockedQpsAvg() {
				return this.blockedQpsAvg;
			}

			public void setBlockedQpsAvg(Float blockedQpsAvg) {
				this.blockedQpsAvg = blockedQpsAvg;
			}

			public Float getThreadAvg() {
				return this.threadAvg;
			}

			public void setThreadAvg(Float threadAvg) {
				this.threadAvg = threadAvg;
			}

			public Float getBlockedQpsP75() {
				return this.blockedQpsP75;
			}

			public void setBlockedQpsP75(Float blockedQpsP75) {
				this.blockedQpsP75 = blockedQpsP75;
			}

			public Float getRtP75() {
				return this.rtP75;
			}

			public void setRtP75(Float rtP75) {
				this.rtP75 = rtP75;
			}

			public Float getExceptionP99() {
				return this.exceptionP99;
			}

			public void setExceptionP99(Float exceptionP99) {
				this.exceptionP99 = exceptionP99;
			}

			public Float getExceptionP75() {
				return this.exceptionP75;
			}

			public void setExceptionP75(Float exceptionP75) {
				this.exceptionP75 = exceptionP75;
			}

			public Float getSuccessQpsP95() {
				return this.successQpsP95;
			}

			public void setSuccessQpsP95(Float successQpsP95) {
				this.successQpsP95 = successQpsP95;
			}

			public Float getRt() {
				return this.rt;
			}

			public void setRt(Float rt) {
				this.rt = rt;
			}

			public Float getPassedQpsP95() {
				return this.passedQpsP95;
			}

			public void setPassedQpsP95(Float passedQpsP95) {
				this.passedQpsP95 = passedQpsP95;
			}

			public Float getRtMax() {
				return this.rtMax;
			}

			public void setRtMax(Float rtMax) {
				this.rtMax = rtMax;
			}

			public Float getBlockedQpsStd() {
				return this.blockedQpsStd;
			}

			public void setBlockedQpsStd(Float blockedQpsStd) {
				this.blockedQpsStd = blockedQpsStd;
			}

			public Float getBlockedQpsMax() {
				return this.blockedQpsMax;
			}

			public void setBlockedQpsMax(Float blockedQpsMax) {
				this.blockedQpsMax = blockedQpsMax;
			}

			public Float getException() {
				return this.exception;
			}

			public void setException(Float exception) {
				this.exception = exception;
			}

			public Float getExceptionAvg() {
				return this.exceptionAvg;
			}

			public void setExceptionAvg(Float exceptionAvg) {
				this.exceptionAvg = exceptionAvg;
			}

			public Float getPassedQpsStd() {
				return this.passedQpsStd;
			}

			public void setPassedQpsStd(Float passedQpsStd) {
				this.passedQpsStd = passedQpsStd;
			}
		}
	}

	@Override
	public GetMetricsOfAppResponse getInstance(UnmarshallerContext context) {
		return	GetMetricsOfAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
