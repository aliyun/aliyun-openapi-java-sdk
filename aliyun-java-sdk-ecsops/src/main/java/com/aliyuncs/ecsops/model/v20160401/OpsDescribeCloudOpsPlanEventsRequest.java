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
public class OpsDescribeCloudOpsPlanEventsRequest extends RpcAcsRequest<OpsDescribeCloudOpsPlanEventsResponse> {
	   

	private String source;

	private String startTime;

	private List<String> eventIdss;

	private Integer pageSize;

	private String key;

	private String endTime;

	private String opsCode;

	private String bizEventId;

	private Integer pageNo;

	private String auditParamStr;

	private String status;

	private List<String> resourceIdss;
	public OpsDescribeCloudOpsPlanEventsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeCloudOpsPlanEvents", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public List<String> getEventIdss() {
		return this.eventIdss;
	}

	public void setEventIdss(List<String> eventIdss) {
		this.eventIdss = eventIdss;	
		if (eventIdss != null) {
			for (int i = 0; i < eventIdss.size(); i++) {
				putQueryParameter("EventIds." + (i + 1) , eventIdss.get(i));
			}
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getOpsCode() {
		return this.opsCode;
	}

	public void setOpsCode(String opsCode) {
		this.opsCode = opsCode;
		if(opsCode != null){
			putQueryParameter("OpsCode", opsCode);
		}
	}

	public String getBizEventId() {
		return this.bizEventId;
	}

	public void setBizEventId(String bizEventId) {
		this.bizEventId = bizEventId;
		if(bizEventId != null){
			putQueryParameter("BizEventId", bizEventId);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public List<String> getResourceIdss() {
		return this.resourceIdss;
	}

	public void setResourceIdss(List<String> resourceIdss) {
		this.resourceIdss = resourceIdss;	
		if (resourceIdss != null) {
			for (int i = 0; i < resourceIdss.size(); i++) {
				putQueryParameter("ResourceIds." + (i + 1) , resourceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<OpsDescribeCloudOpsPlanEventsResponse> getResponseClass() {
		return OpsDescribeCloudOpsPlanEventsResponse.class;
	}

}
