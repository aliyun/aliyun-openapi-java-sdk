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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCompanyRegOrdersRequest extends RpcAcsRequest<ListCompanyRegOrdersResponse> {
	   

	private String notBizStatus;

	private Integer pageNum;

	private String bizStatus;

	private String companyName;

	private Integer pageSize;

	private String aliyunOrderId;

	private String bizSubCode;
	public ListCompanyRegOrdersRequest() {
		super("companyreg", "2019-05-08", "ListCompanyRegOrders", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNotBizStatus() {
		return this.notBizStatus;
	}

	public void setNotBizStatus(String notBizStatus) {
		this.notBizStatus = notBizStatus;
		if(notBizStatus != null){
			putQueryParameter("NotBizStatus", notBizStatus);
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

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
		if(bizStatus != null){
			putQueryParameter("BizStatus", bizStatus);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putQueryParameter("CompanyName", companyName);
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

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}

	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
		if(aliyunOrderId != null){
			putQueryParameter("AliyunOrderId", aliyunOrderId);
		}
	}

	public String getBizSubCode() {
		return this.bizSubCode;
	}

	public void setBizSubCode(String bizSubCode) {
		this.bizSubCode = bizSubCode;
		if(bizSubCode != null){
			putQueryParameter("BizSubCode", bizSubCode);
		}
	}

	@Override
	public Class<ListCompanyRegOrdersResponse> getResponseClass() {
		return ListCompanyRegOrdersResponse.class;
	}

}
