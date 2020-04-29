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

package com.aliyuncs.reid.model.v20200422;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PullMatchedBizDataRequest extends RpcAcsRequest<PullMatchedBizDataResponse> {
	   

	private Long storeId;

	private Long startTimestamp;

	private String bizDataType;

	private Long endTimestamp;

	private Integer size;

	private String startRecordId;
	public PullMatchedBizDataRequest() {
		super("reid", "2020-04-22", "PullMatchedBizData", "1.1.3");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public Long getStartTimestamp() {
		return this.startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		if(startTimestamp != null){
			putBodyParameter("StartTimestamp", startTimestamp.toString());
		}
	}

	public String getBizDataType() {
		return this.bizDataType;
	}

	public void setBizDataType(String bizDataType) {
		this.bizDataType = bizDataType;
		if(bizDataType != null){
			putBodyParameter("BizDataType", bizDataType);
		}
	}

	public Long getEndTimestamp() {
		return this.endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		if(endTimestamp != null){
			putBodyParameter("EndTimestamp", endTimestamp.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public String getStartRecordId() {
		return this.startRecordId;
	}

	public void setStartRecordId(String startRecordId) {
		this.startRecordId = startRecordId;
		if(startRecordId != null){
			putBodyParameter("StartRecordId", startRecordId);
		}
	}

	@Override
	public Class<PullMatchedBizDataResponse> getResponseClass() {
		return PullMatchedBizDataResponse.class;
	}

}
