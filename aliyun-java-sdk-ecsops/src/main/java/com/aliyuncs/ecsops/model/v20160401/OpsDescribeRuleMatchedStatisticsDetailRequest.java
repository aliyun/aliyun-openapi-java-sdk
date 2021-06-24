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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeRuleMatchedStatisticsDetailRequest extends RpcAcsRequest<OpsDescribeRuleMatchedStatisticsDetailResponse> {
	   

	private List<String> targetIds;

	private String ruleName;

	private Long startTime;

	private Integer pageNumber;

	private Integer intervalSeconds;

	private Integer pageSize;

	private Long endTime;

	private String auditParamStr;
	public OpsDescribeRuleMatchedStatisticsDetailRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeRuleMatchedStatisticsDetail", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getTargetIds() {
		return this.targetIds;
	}

	public void setTargetIds(List<String> targetIds) {
		this.targetIds = targetIds;	
		if (targetIds != null) {
			for (int i = 0; i < targetIds.size(); i++) {
				putQueryParameter("TargetId." + (i + 1) , targetIds.get(i));
			}
		}	
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getIntervalSeconds() {
		return this.intervalSeconds;
	}

	public void setIntervalSeconds(Integer intervalSeconds) {
		this.intervalSeconds = intervalSeconds;
		if(intervalSeconds != null){
			putQueryParameter("IntervalSeconds", intervalSeconds.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeRuleMatchedStatisticsDetailResponse> getResponseClass() {
		return OpsDescribeRuleMatchedStatisticsDetailResponse.class;
	}

}
