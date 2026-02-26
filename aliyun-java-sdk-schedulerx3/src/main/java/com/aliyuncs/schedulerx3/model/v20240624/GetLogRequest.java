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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetLogRequest extends RpcAcsRequest<GetLogResponse> {
	   

	private Long startTime;

	private String appName;

	private Integer lineNum;

	private String keyword;

	private String jobExecutionId;

	private Integer offset;

	private String level;

	private Long endTime;

	private String clusterId;

	private Boolean reverse;

	private Long logId;
	public GetLogRequest() {
		super("SchedulerX3", "2024-06-24", "GetLog");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Integer getLineNum() {
		return this.lineNum;
	}

	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
		if(lineNum != null){
			putQueryParameter("LineNum", lineNum.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(String jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
		if(jobExecutionId != null){
			putQueryParameter("JobExecutionId", jobExecutionId);
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Boolean getReverse() {
		return this.reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		if(reverse != null){
			putQueryParameter("Reverse", reverse.toString());
		}
	}

	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
		if(logId != null){
			putQueryParameter("LogId", logId.toString());
		}
	}

	@Override
	public Class<GetLogResponse> getResponseClass() {
		return GetLogResponse.class;
	}

}
