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

package com.aliyuncs.pts.model.v20181111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20181111.QueryPlanStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPlanStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String tips;

	private String requestCount;

	private Integer vum;

	private String bpsRequest;

	private String bpsResponse;

	private Integer failedRequestCount;

	private Integer failedBusinessCount;

	private Integer concurrency;

	private Integer concurrencyLimit;

	private Integer tps;

	private Integer tpsLimit;

	private Integer aliveAgentCount;

	private Integer totalAgentCount;

	private Integer seg90Rt;

	private Integer averageRt;

	private Long reportId;

	private Long startTime;

	private Long currentTime;

	private List<Map<Object,Object>> monitorData;

	private List<Map<Object,Object>> agentLocations;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTips() {
		return this.tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getRequestCount() {
		return this.requestCount;
	}

	public void setRequestCount(String requestCount) {
		this.requestCount = requestCount;
	}

	public Integer getVum() {
		return this.vum;
	}

	public void setVum(Integer vum) {
		this.vum = vum;
	}

	public String getBpsRequest() {
		return this.bpsRequest;
	}

	public void setBpsRequest(String bpsRequest) {
		this.bpsRequest = bpsRequest;
	}

	public String getBpsResponse() {
		return this.bpsResponse;
	}

	public void setBpsResponse(String bpsResponse) {
		this.bpsResponse = bpsResponse;
	}

	public Integer getFailedRequestCount() {
		return this.failedRequestCount;
	}

	public void setFailedRequestCount(Integer failedRequestCount) {
		this.failedRequestCount = failedRequestCount;
	}

	public Integer getFailedBusinessCount() {
		return this.failedBusinessCount;
	}

	public void setFailedBusinessCount(Integer failedBusinessCount) {
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

	public Integer getAliveAgentCount() {
		return this.aliveAgentCount;
	}

	public void setAliveAgentCount(Integer aliveAgentCount) {
		this.aliveAgentCount = aliveAgentCount;
	}

	public Integer getTotalAgentCount() {
		return this.totalAgentCount;
	}

	public void setTotalAgentCount(Integer totalAgentCount) {
		this.totalAgentCount = totalAgentCount;
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

	public Long getReportId() {
		return this.reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getCurrentTime() {
		return this.currentTime;
	}

	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
	}

	public List<Map<Object,Object>> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<Map<Object,Object>> monitorData) {
		this.monitorData = monitorData;
	}

	public List<Map<Object,Object>> getAgentLocations() {
		return this.agentLocations;
	}

	public void setAgentLocations(List<Map<Object,Object>> agentLocations) {
		this.agentLocations = agentLocations;
	}

	@Override
	public QueryPlanStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryPlanStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
