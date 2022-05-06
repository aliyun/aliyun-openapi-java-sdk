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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddLabReservedRequest extends RpcAcsRequest<AddLabReservedResponse> {
	   

	private Long number;

	private String labId;

	private Long endTime;

	private Long startTime;
	public AddLabReservedRequest() {
		super("EduCloud", "2022-02-02", "AddLabReserved");
		setMethod(MethodType.POST);
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
		if(number != null){
			putBodyParameter("Number", number.toString());
		}
	}

	public String getLabId() {
		return this.labId;
	}

	public void setLabId(String labId) {
		this.labId = labId;
		if(labId != null){
			putBodyParameter("LabId", labId);
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

	@Override
	public Class<AddLabReservedResponse> getResponseClass() {
		return AddLabReservedResponse.class;
	}

}
