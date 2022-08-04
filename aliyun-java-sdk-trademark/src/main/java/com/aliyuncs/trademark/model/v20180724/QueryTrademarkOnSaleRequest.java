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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkOnSaleRequest extends RpcAcsRequest<QueryTrademarkOnSaleResponse> {
	   

	private Integer pageNum;

	private String registerCode;

	private String classification;

	private Integer pageSize;

	private String tmType;

	private String registerNumber;
	public QueryTrademarkOnSaleRequest() {
		super("Trademark", "2018-07-24", "QueryTrademarkOnSale");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getRegisterCode() {
		return this.registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
		if(registerCode != null){
			putQueryParameter("RegisterCode", registerCode);
		}
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putQueryParameter("Classification", classification);
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

	public String getTmType() {
		return this.tmType;
	}

	public void setTmType(String tmType) {
		this.tmType = tmType;
		if(tmType != null){
			putQueryParameter("TmType", tmType);
		}
	}

	public String getRegisterNumber() {
		return this.registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
		if(registerNumber != null){
			putQueryParameter("RegisterNumber", registerNumber);
		}
	}

	@Override
	public Class<QueryTrademarkOnSaleResponse> getResponseClass() {
		return QueryTrademarkOnSaleResponse.class;
	}

}
