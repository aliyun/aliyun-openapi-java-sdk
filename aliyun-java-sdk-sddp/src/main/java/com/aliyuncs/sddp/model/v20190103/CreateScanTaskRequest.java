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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateScanTaskRequest extends RpcAcsRequest<CreateScanTaskResponse> {
	   

	private Integer runHour;

	private String scanRangeContent;

	private String taskName;

	private Long dataLimitId;

	private Integer runMinute;

	private Integer intervalDay;

	private Integer scanRange;

	private String ossScanPath;

	private Long resourceType;

	private String taskUserName;
	public CreateScanTaskRequest() {
		super("Sddp", "2019-01-03", "CreateScanTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getRunHour() {
		return this.runHour;
	}

	public void setRunHour(Integer runHour) {
		this.runHour = runHour;
		if(runHour != null){
			putQueryParameter("RunHour", runHour.toString());
		}
	}

	public String getScanRangeContent() {
		return this.scanRangeContent;
	}

	public void setScanRangeContent(String scanRangeContent) {
		this.scanRangeContent = scanRangeContent;
		if(scanRangeContent != null){
			putQueryParameter("ScanRangeContent", scanRangeContent);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public Long getDataLimitId() {
		return this.dataLimitId;
	}

	public void setDataLimitId(Long dataLimitId) {
		this.dataLimitId = dataLimitId;
		if(dataLimitId != null){
			putQueryParameter("DataLimitId", dataLimitId.toString());
		}
	}

	public Integer getRunMinute() {
		return this.runMinute;
	}

	public void setRunMinute(Integer runMinute) {
		this.runMinute = runMinute;
		if(runMinute != null){
			putQueryParameter("RunMinute", runMinute.toString());
		}
	}

	public Integer getIntervalDay() {
		return this.intervalDay;
	}

	public void setIntervalDay(Integer intervalDay) {
		this.intervalDay = intervalDay;
		if(intervalDay != null){
			putQueryParameter("IntervalDay", intervalDay.toString());
		}
	}

	public Integer getScanRange() {
		return this.scanRange;
	}

	public void setScanRange(Integer scanRange) {
		this.scanRange = scanRange;
		if(scanRange != null){
			putQueryParameter("ScanRange", scanRange.toString());
		}
	}

	public String getOssScanPath() {
		return this.ossScanPath;
	}

	public void setOssScanPath(String ossScanPath) {
		this.ossScanPath = ossScanPath;
		if(ossScanPath != null){
			putQueryParameter("OssScanPath", ossScanPath);
		}
	}

	public Long getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType.toString());
		}
	}

	public String getTaskUserName() {
		return this.taskUserName;
	}

	public void setTaskUserName(String taskUserName) {
		this.taskUserName = taskUserName;
		if(taskUserName != null){
			putQueryParameter("TaskUserName", taskUserName);
		}
	}

	@Override
	public Class<CreateScanTaskResponse> getResponseClass() {
		return CreateScanTaskResponse.class;
	}

}
