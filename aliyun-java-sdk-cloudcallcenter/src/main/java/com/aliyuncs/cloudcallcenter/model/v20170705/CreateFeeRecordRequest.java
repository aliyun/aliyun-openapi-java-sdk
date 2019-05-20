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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateFeeRecordRequest extends RpcAcsRequest<CreateFeeRecordResponse> {
	
	public CreateFeeRecordRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateFeeRecord", "CloudCallCenter", "innerAPI");
	}

	private String statusCode;

	private Integer duration;

	private String caller;

	private Long taobaoMainUid;

	private String callee;

	private String bizId;

	private Long endTime;

	private Long startTime;

	private Long taobaoUid;

	private Long mainRamId;

	private Long ramId;

	private Integer origDuration;

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
		if(statusCode != null){
			putQueryParameter("statusCode", statusCode);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("duration", duration.toString());
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("caller", caller);
		}
	}

	public Long getTaobaoMainUid() {
		return this.taobaoMainUid;
	}

	public void setTaobaoMainUid(Long taobaoMainUid) {
		this.taobaoMainUid = taobaoMainUid;
		if(taobaoMainUid != null){
			putQueryParameter("taobaoMainUid", taobaoMainUid.toString());
		}
	}

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = callee;
		if(callee != null){
			putQueryParameter("callee", callee);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("bizId", bizId);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public Long getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Long taobaoUid) {
		this.taobaoUid = taobaoUid;
		if(taobaoUid != null){
			putQueryParameter("taobaoUid", taobaoUid.toString());
		}
	}

	public Long getMainRamId() {
		return this.mainRamId;
	}

	public void setMainRamId(Long mainRamId) {
		this.mainRamId = mainRamId;
		if(mainRamId != null){
			putQueryParameter("mainRamId", mainRamId.toString());
		}
	}

	public Long getRamId() {
		return this.ramId;
	}

	public void setRamId(Long ramId) {
		this.ramId = ramId;
		if(ramId != null){
			putQueryParameter("ramId", ramId.toString());
		}
	}

	public Integer getOrigDuration() {
		return this.origDuration;
	}

	public void setOrigDuration(Integer origDuration) {
		this.origDuration = origDuration;
		if(origDuration != null){
			putQueryParameter("origDuration", origDuration.toString());
		}
	}

	@Override
	public Class<CreateFeeRecordResponse> getResponseClass() {
		return CreateFeeRecordResponse.class;
	}

}
