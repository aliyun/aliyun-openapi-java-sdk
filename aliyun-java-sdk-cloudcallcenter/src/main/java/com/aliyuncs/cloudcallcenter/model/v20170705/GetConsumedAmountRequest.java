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
public class GetConsumedAmountRequest extends RpcAcsRequest<GetConsumedAmountResponse> {
	
	public GetConsumedAmountRequest() {
		super("CloudCallCenter", "2017-07-05", "GetConsumedAmount", "CloudCallCenter", "innerAPI");
	}

	private String phone;

	private Long taobaoMainUid;

	private Long endTime;

	private Long startTime;

	private Integer taobaoUid;

	private Long mainRamId;

	private Long ramId;

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("phone", phone);
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

	public Integer getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Integer taobaoUid) {
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

	@Override
	public Class<GetConsumedAmountResponse> getResponseClass() {
		return GetConsumedAmountResponse.class;
	}

}
