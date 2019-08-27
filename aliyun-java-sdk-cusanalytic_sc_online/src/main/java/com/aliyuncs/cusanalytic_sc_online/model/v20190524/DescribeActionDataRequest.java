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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cusanalytic_sc_online.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeActionDataRequest extends RpcAcsRequest<DescribeActionDataResponse> {
	
	public DescribeActionDataRequest() {
		super("cusanalytic_sc_online", "2019-05-24", "DescribeActionData");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long tsEnd;

	private Integer pageNo;

	private Long tsStart;

	private String storeId;

	private Integer pageLimit;

	public Long getTsEnd() {
		return this.tsEnd;
	}

	public void setTsEnd(Long tsEnd) {
		this.tsEnd = tsEnd;
		if(tsEnd != null){
			putBodyParameter("TsEnd", tsEnd.toString());
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public Long getTsStart() {
		return this.tsStart;
	}

	public void setTsStart(Long tsStart) {
		this.tsStart = tsStart;
		if(tsStart != null){
			putBodyParameter("TsStart", tsStart.toString());
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public Integer getPageLimit() {
		return this.pageLimit;
	}

	public void setPageLimit(Integer pageLimit) {
		this.pageLimit = pageLimit;
		if(pageLimit != null){
			putBodyParameter("PageLimit", pageLimit.toString());
		}
	}

	@Override
	public Class<DescribeActionDataResponse> getResponseClass() {
		return DescribeActionDataResponse.class;
	}

}
