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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRedeemRequest extends RpcAcsRequest<QueryRedeemResponse> {
	
	public QueryRedeemRequest() {
		super("BssOpenApi", "2017-12-14", "QueryRedeem");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String expiryTimeEnd;

	private Integer pageSize;

	private String expiryTimeStart;

	private Integer pageNum;

	private Boolean effectiveOrNot;

	public String getExpiryTimeEnd() {
		return this.expiryTimeEnd;
	}

	public void setExpiryTimeEnd(String expiryTimeEnd) {
		this.expiryTimeEnd = expiryTimeEnd;
		if(expiryTimeEnd != null){
			putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
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

	public String getExpiryTimeStart() {
		return this.expiryTimeStart;
	}

	public void setExpiryTimeStart(String expiryTimeStart) {
		this.expiryTimeStart = expiryTimeStart;
		if(expiryTimeStart != null){
			putQueryParameter("ExpiryTimeStart", expiryTimeStart);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Boolean getEffectiveOrNot() {
		return this.effectiveOrNot;
	}

	public void setEffectiveOrNot(Boolean effectiveOrNot) {
		this.effectiveOrNot = effectiveOrNot;
		if(effectiveOrNot != null){
			putQueryParameter("EffectiveOrNot", effectiveOrNot.toString());
		}
	}

	@Override
	public Class<QueryRedeemResponse> getResponseClass() {
		return QueryRedeemResponse.class;
	}

}
