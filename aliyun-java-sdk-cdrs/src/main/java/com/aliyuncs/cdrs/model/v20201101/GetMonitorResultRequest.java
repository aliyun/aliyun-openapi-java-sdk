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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetMonitorResultRequest extends RpcAcsRequest<GetMonitorResultResponse> {
	   

	private String corpId;

	private Long endTime;

	private Long startTime;

	private String algorithmVendor;

	private String minRecordId;

	private String taskId;
	public GetMonitorResultRequest() {
		super("CDRS", "2020-11-01", "GetMonitorResult");
		setMethod(MethodType.POST);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public String getAlgorithmVendor() {
		return this.algorithmVendor;
	}

	public void setAlgorithmVendor(String algorithmVendor) {
		this.algorithmVendor = algorithmVendor;
		if(algorithmVendor != null){
			putBodyParameter("AlgorithmVendor", algorithmVendor);
		}
	}

	public String getMinRecordId() {
		return this.minRecordId;
	}

	public void setMinRecordId(String minRecordId) {
		this.minRecordId = minRecordId;
		if(minRecordId != null){
			putBodyParameter("MinRecordId", minRecordId);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<GetMonitorResultResponse> getResponseClass() {
		return GetMonitorResultResponse.class;
	}

}
