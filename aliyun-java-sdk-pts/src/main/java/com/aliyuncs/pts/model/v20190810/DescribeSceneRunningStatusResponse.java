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

	private Integer totalRequestCount;

	private Integer vum;

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

	private Integer seg90Rt;

	private Integer averageRt;

	private String reportId;

	private Long beginTime;

	private Long currentTime;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private Boolean useCustomPool;

	private List<ChainElement> agentsLocation;

	public String getTips() {
		return this.tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public Integer getTotalRequestCount() {
		return this.totalRequestCount;
	}

	public void setTotalRequestCount(Integer totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}

	public Integer getVum() {
		return this.vum;
	}

	public void setVum(Integer vum) {
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

	public Integer getSeg90Rt() {
		return this.seg90Rt;
	}

	public void setSeg90Rt(Integer seg90Rt) {
		this.seg90Rt = seg90Rt;
	}

	public Integer getAverageRt() {
		return this.averageRt;
	}

	public void setAverageRt(Integer averageRt) {
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

	public List<ChainElement> getAgentsLocation() {
		return this.agentsLocation;
	}

	public void setAgentsLocation(List<ChainElement> agentsLocation) {
		this.agentsLocation = agentsLocation;
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

	@Override
	public DescribeSceneRunningStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSceneRunningStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
