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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListBizChainDataRequest extends RpcAcsRequest<ListBizChainDataResponse> {
	   

	private Integer num;

	private Long endTime;

	private Long startTime;

	private String bizChainId;

	private Integer size;

	private String ioTDataDID;

	private String memberId;
	public ListBizChainDataRequest() {
		super("lto", "2021-07-07", "ListBizChainData");
		setMethod(MethodType.POST);
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
		if(num != null){
			putQueryParameter("Num", num.toString());
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getBizChainId() {
		return this.bizChainId;
	}

	public void setBizChainId(String bizChainId) {
		this.bizChainId = bizChainId;
		if(bizChainId != null){
			putQueryParameter("BizChainId", bizChainId);
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getIoTDataDID() {
		return this.ioTDataDID;
	}

	public void setIoTDataDID(String ioTDataDID) {
		this.ioTDataDID = ioTDataDID;
		if(ioTDataDID != null){
			putQueryParameter("IoTDataDID", ioTDataDID);
		}
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId);
		}
	}

	@Override
	public Class<ListBizChainDataResponse> getResponseClass() {
		return ListBizChainDataResponse.class;
	}

}
