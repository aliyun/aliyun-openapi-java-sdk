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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetPtsSceneRunningDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPtsSceneRunningDataResponse extends AcsResponse {

	private Integer status;

	private Long totalRequestCount;

	private Boolean hasReport;

	private Integer concurrencyLimit;

	private String message;

	private String requestId;

	private Long beginTime;

	private Long seg90Rt;

	private String responseBps;

	private Integer totalAgents;

	private String code;

	private Boolean success;

	private Long vum;

	private Long averageRt;

	private String requestBps;

	private Long failedBusinessCount;

	private Integer concurrency;

	private Integer httpStatusCode;

	private Long failedRequestCount;

	private Integer tpsLimit;

	private Integer aliveAgents;

	private Integer totalRealQps;

	private List<Location> agentLocation;

	private List<ChainMonitorData> chainMonitorDataList;

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTotalRequestCount() {
		return this.totalRequestCount;
	}

	public void setTotalRequestCount(Long totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}

	public Boolean getHasReport() {
		return this.hasReport;
	}

	public void setHasReport(Boolean hasReport) {
		this.hasReport = hasReport;
	}

	public Integer getConcurrencyLimit() {
		return this.concurrencyLimit;
	}

	public void setConcurrencyLimit(Integer concurrencyLimit) {
		this.concurrencyLimit = concurrencyLimit;
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

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getSeg90Rt() {
		return this.seg90Rt;
	}

	public void setSeg90Rt(Long seg90Rt) {
		this.seg90Rt = seg90Rt;
	}

	public String getResponseBps() {
		return this.responseBps;
	}

	public void setResponseBps(String responseBps) {
		this.responseBps = responseBps;
	}

	public Integer getTotalAgents() {
		return this.totalAgents;
	}

	public void setTotalAgents(Integer totalAgents) {
		this.totalAgents = totalAgents;
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

	public Long getVum() {
		return this.vum;
	}

	public void setVum(Long vum) {
		this.vum = vum;
	}

	public Long getAverageRt() {
		return this.averageRt;
	}

	public void setAverageRt(Long averageRt) {
		this.averageRt = averageRt;
	}

	public String getRequestBps() {
		return this.requestBps;
	}

	public void setRequestBps(String requestBps) {
		this.requestBps = requestBps;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Long getFailedRequestCount() {
		return this.failedRequestCount;
	}

	public void setFailedRequestCount(Long failedRequestCount) {
		this.failedRequestCount = failedRequestCount;
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

	public Integer getTotalRealQps() {
		return this.totalRealQps;
	}

	public void setTotalRealQps(Integer totalRealQps) {
		this.totalRealQps = totalRealQps;
	}

	public List<Location> getAgentLocation() {
		return this.agentLocation;
	}

	public void setAgentLocation(List<Location> agentLocation) {
		this.agentLocation = agentLocation;
	}

	public List<ChainMonitorData> getChainMonitorDataList() {
		return this.chainMonitorDataList;
	}

	public void setChainMonitorDataList(List<ChainMonitorData> chainMonitorDataList) {
		this.chainMonitorDataList = chainMonitorDataList;
	}

	public static class Location {

		private String region;

		private String isp;

		private Integer count;

		private String province;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
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

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
	}

	public static class ChainMonitorData {

		private Long timePoint;

		private String apiId;

		private Integer minRt;

		private Float qps2XX;

		private Integer maxRt;

		private Integer configQps;

		private Long failedCount;

		private Float failedQps;

		private Integer averageRt;

		private Long count2XX;

		private Float realQps;

		private String apiName;

		private Long nodeId;

		private Float concurrency;

		private CheckPointResult checkPointResult;

		public Long getTimePoint() {
			return this.timePoint;
		}

		public void setTimePoint(Long timePoint) {
			this.timePoint = timePoint;
		}

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public Integer getMinRt() {
			return this.minRt;
		}

		public void setMinRt(Integer minRt) {
			this.minRt = minRt;
		}

		public Float getQps2XX() {
			return this.qps2XX;
		}

		public void setQps2XX(Float qps2XX) {
			this.qps2XX = qps2XX;
		}

		public Integer getMaxRt() {
			return this.maxRt;
		}

		public void setMaxRt(Integer maxRt) {
			this.maxRt = maxRt;
		}

		public Integer getConfigQps() {
			return this.configQps;
		}

		public void setConfigQps(Integer configQps) {
			this.configQps = configQps;
		}

		public Long getFailedCount() {
			return this.failedCount;
		}

		public void setFailedCount(Long failedCount) {
			this.failedCount = failedCount;
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

		public Long getCount2XX() {
			return this.count2XX;
		}

		public void setCount2XX(Long count2XX) {
			this.count2XX = count2XX;
		}

		public Float getRealQps() {
			return this.realQps;
		}

		public void setRealQps(Float realQps) {
			this.realQps = realQps;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public Float getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Float concurrency) {
			this.concurrency = concurrency;
		}

		public CheckPointResult getCheckPointResult() {
			return this.checkPointResult;
		}

		public void setCheckPointResult(CheckPointResult checkPointResult) {
			this.checkPointResult = checkPointResult;
		}

		public static class CheckPointResult {

			private Long succeedBusinessCount;

			private Float succeedBusinessQps;

			private Long failedBusinessCount;

			private Float failedBusinessQps;

			public Long getSucceedBusinessCount() {
				return this.succeedBusinessCount;
			}

			public void setSucceedBusinessCount(Long succeedBusinessCount) {
				this.succeedBusinessCount = succeedBusinessCount;
			}

			public Float getSucceedBusinessQps() {
				return this.succeedBusinessQps;
			}

			public void setSucceedBusinessQps(Float succeedBusinessQps) {
				this.succeedBusinessQps = succeedBusinessQps;
			}

			public Long getFailedBusinessCount() {
				return this.failedBusinessCount;
			}

			public void setFailedBusinessCount(Long failedBusinessCount) {
				this.failedBusinessCount = failedBusinessCount;
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
	public GetPtsSceneRunningDataResponse getInstance(UnmarshallerContext context) {
		return	GetPtsSceneRunningDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
