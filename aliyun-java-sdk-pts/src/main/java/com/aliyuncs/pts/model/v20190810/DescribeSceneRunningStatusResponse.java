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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeSceneRunningStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSceneRunningStatusResponse extends AcsResponse {

	private String tips;

	private Long totalRequestCount;

	private Long vum;

	private String requestBps;

	private String responseBps;

	private Long failedRequestCount;

	private Long failedBusinessCount;

	private Integer concurrency;

	private Integer concurrencyLimit;

	private Integer tps;

	private Integer tpsLimit;

	private Integer aliveAgents;

	private Integer totalAgents;

	private Long seg90Rt;

	private Long averageRt;

	private String reportId;

	private Long beginTime;

	private Long currentTime;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private Boolean useCustomPool;

	private String requestId;

	private List<ChainElement> agentsLocation;

	private List<ChainMonitorData> chainMonitorDataList;

	public String getTips() {
		return this.tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public Long getTotalRequestCount() {
		return this.totalRequestCount;
	}

	public void setTotalRequestCount(Long totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}

	public Long getVum() {
		return this.vum;
	}

	public void setVum(Long vum) {
		this.vum = vum;
	}

	public String getRequestBps() {
		return this.requestBps;
	}

	public void setRequestBps(String requestBps) {
		this.requestBps = requestBps;
	}

	public String getResponseBps() {
		return this.responseBps;
	}

	public void setResponseBps(String responseBps) {
		this.responseBps = responseBps;
	}

	public Long getFailedRequestCount() {
		return this.failedRequestCount;
	}

	public void setFailedRequestCount(Long failedRequestCount) {
		this.failedRequestCount = failedRequestCount;
	}

	public Long getFailedBusinessCount() {
		return this.failedBusinessCount;
	}

	public void setFailedBusinessCount(Long failedBusinessCount) {
		this.failedBusinessCount = failedBusinessCount;
	}

	public Integer getConcurrency() {
		return this.concurrency;
	}

	public void setConcurrency(Integer concurrency) {
		this.concurrency = concurrency;
	}

	public Integer getConcurrencyLimit() {
		return this.concurrencyLimit;
	}

	public void setConcurrencyLimit(Integer concurrencyLimit) {
		this.concurrencyLimit = concurrencyLimit;
	}

	public Integer getTps() {
		return this.tps;
	}

	public void setTps(Integer tps) {
		this.tps = tps;
	}

	public Integer getTpsLimit() {
		return this.tpsLimit;
	}

	public void setTpsLimit(Integer tpsLimit) {
		this.tpsLimit = tpsLimit;
	}

	public Integer getAliveAgents() {
		return this.aliveAgents;
	}

	public void setAliveAgents(Integer aliveAgents) {
		this.aliveAgents = aliveAgents;
	}

	public Integer getTotalAgents() {
		return this.totalAgents;
	}

	public void setTotalAgents(Integer totalAgents) {
		this.totalAgents = totalAgents;
	}

	public Long getSeg90Rt() {
		return this.seg90Rt;
	}

	public void setSeg90Rt(Long seg90Rt) {
		this.seg90Rt = seg90Rt;
	}

	public Long getAverageRt() {
		return this.averageRt;
	}

	public void setAverageRt(Long averageRt) {
		this.averageRt = averageRt;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getCurrentTime() {
		return this.currentTime;
	}

	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getUseCustomPool() {
		return this.useCustomPool;
	}

	public void setUseCustomPool(Boolean useCustomPool) {
		this.useCustomPool = useCustomPool;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ChainElement> getAgentsLocation() {
		return this.agentsLocation;
	}

	public void setAgentsLocation(List<ChainElement> agentsLocation) {
		this.agentsLocation = agentsLocation;
	}

	public List<ChainMonitorData> getChainMonitorDataList() {
		return this.chainMonitorDataList;
	}

	public void setChainMonitorDataList(List<ChainMonitorData> chainMonitorDataList) {
		this.chainMonitorDataList = chainMonitorDataList;
	}

	public static class ChainElement {

		private String region;

		private String province;

		private String isp;

		private Integer count;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	public static class ChainMonitorData {

		private Long chainId;

		private Long timePoint;

		private Integer configQps;

		private Float realQps;

		private Float concurrency;

		private Float qps2XX;

		private Float failedQps;

		private Integer averageRt;

		private Integer maxRt;

		private Integer minRt;

		private Long count2XX;

		private Long failedCount;

		private Integer queueSize;

		private Integer queueCapacity;

		private List<QpsSummaryItem> qpsSummary;

		private CheckPointResult checkPointResult;

		public Long getChainId() {
			return this.chainId;
		}

		public void setChainId(Long chainId) {
			this.chainId = chainId;
		}

		public Long getTimePoint() {
			return this.timePoint;
		}

		public void setTimePoint(Long timePoint) {
			this.timePoint = timePoint;
		}

		public Integer getConfigQps() {
			return this.configQps;
		}

		public void setConfigQps(Integer configQps) {
			this.configQps = configQps;
		}

		public Float getRealQps() {
			return this.realQps;
		}

		public void setRealQps(Float realQps) {
			this.realQps = realQps;
		}

		public Float getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Float concurrency) {
			this.concurrency = concurrency;
		}

		public Float getQps2XX() {
			return this.qps2XX;
		}

		public void setQps2XX(Float qps2XX) {
			this.qps2XX = qps2XX;
		}

		public Float getFailedQps() {
			return this.failedQps;
		}

		public void setFailedQps(Float failedQps) {
			this.failedQps = failedQps;
		}

		public Integer getAverageRt() {
			return this.averageRt;
		}

		public void setAverageRt(Integer averageRt) {
			this.averageRt = averageRt;
		}

		public Integer getMaxRt() {
			return this.maxRt;
		}

		public void setMaxRt(Integer maxRt) {
			this.maxRt = maxRt;
		}

		public Integer getMinRt() {
			return this.minRt;
		}

		public void setMinRt(Integer minRt) {
			this.minRt = minRt;
		}

		public Long getCount2XX() {
			return this.count2XX;
		}

		public void setCount2XX(Long count2XX) {
			this.count2XX = count2XX;
		}

		public Long getFailedCount() {
			return this.failedCount;
		}

		public void setFailedCount(Long failedCount) {
			this.failedCount = failedCount;
		}

		public Integer getQueueSize() {
			return this.queueSize;
		}

		public void setQueueSize(Integer queueSize) {
			this.queueSize = queueSize;
		}

		public Integer getQueueCapacity() {
			return this.queueCapacity;
		}

		public void setQueueCapacity(Integer queueCapacity) {
			this.queueCapacity = queueCapacity;
		}

		public List<QpsSummaryItem> getQpsSummary() {
			return this.qpsSummary;
		}

		public void setQpsSummary(List<QpsSummaryItem> qpsSummary) {
			this.qpsSummary = qpsSummary;
		}

		public CheckPointResult getCheckPointResult() {
			return this.checkPointResult;
		}

		public void setCheckPointResult(CheckPointResult checkPointResult) {
			this.checkPointResult = checkPointResult;
		}

		public static class QpsSummaryItem {

			private Integer statusCode;

			private Float qps;

			private Integer totalCount;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer statusCode) {
				this.statusCode = statusCode;
			}

			public Float getQps() {
				return this.qps;
			}

			public void setQps(Float qps) {
				this.qps = qps;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}
		}

		public static class CheckPointResult {

			private Long succeedBusinessCount;

			private Long failedBusinessCount;

			private Float succeedBusinessQps;

			private Float failedBusinessQps;

			public Long getSucceedBusinessCount() {
				return this.succeedBusinessCount;
			}

			public void setSucceedBusinessCount(Long succeedBusinessCount) {
				this.succeedBusinessCount = succeedBusinessCount;
			}

			public Long getFailedBusinessCount() {
				return this.failedBusinessCount;
			}

			public void setFailedBusinessCount(Long failedBusinessCount) {
				this.failedBusinessCount = failedBusinessCount;
			}

			public Float getSucceedBusinessQps() {
				return this.succeedBusinessQps;
			}

			public void setSucceedBusinessQps(Float succeedBusinessQps) {
				this.succeedBusinessQps = succeedBusinessQps;
			}

			public Float getFailedBusinessQps() {
				return this.failedBusinessQps;
			}

			public void setFailedBusinessQps(Float failedBusinessQps) {
				this.failedBusinessQps = failedBusinessQps;
			}
		}
	}

	@Override
	public DescribeSceneRunningStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSceneRunningStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
