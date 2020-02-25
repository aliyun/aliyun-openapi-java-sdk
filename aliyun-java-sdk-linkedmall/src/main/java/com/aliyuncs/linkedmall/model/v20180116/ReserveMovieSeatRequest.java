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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReserveMovieSeatRequest extends RpcAcsRequest<ReserveMovieSeatResponse> {
	   

	private String seatIds;

	private String bizUid;

	private String extJson;

	private String bizId;

	private String mobile;

	private String seatNames;

	private Long scheduleId;
	public ReserveMovieSeatRequest() {
		super("linkedmall", "2018-01-16", "ReserveMovieSeat");
		setMethod(MethodType.POST);
	}

	public String getSeatIds() {
		return this.seatIds;
	}

	public void setSeatIds(String seatIds) {
		this.seatIds = seatIds;
		if(seatIds != null){
			putQueryParameter("SeatIds", seatIds);
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
		}
	}

	public String getSeatNames() {
		return this.seatNames;
	}

	public void setSeatNames(String seatNames) {
		this.seatNames = seatNames;
		if(seatNames != null){
			putQueryParameter("SeatNames", seatNames);
		}
	}

	public Long getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
		if(scheduleId != null){
			putQueryParameter("ScheduleId", scheduleId.toString());
		}
	}

	@Override
	public Class<ReserveMovieSeatResponse> getResponseClass() {
		return ReserveMovieSeatResponse.class;
	}

}
