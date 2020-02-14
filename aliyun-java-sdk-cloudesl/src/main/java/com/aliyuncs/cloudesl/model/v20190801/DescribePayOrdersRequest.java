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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePayOrdersRequest extends RpcAcsRequest<DescribePayOrdersResponse> {
	   

	private String orderId;

	private Integer pageNumber;

	private String fromDate;

	private String toDate;

	private Integer pageSize;
	public DescribePayOrdersRequest() {
		super("cloudesl", "2019-08-01", "DescribePayOrders", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("OrderId", orderId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
		if(fromDate != null){
			putBodyParameter("FromDate", fromDate);
		}
	}

	public String getToDate() {
		return this.toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
		if(toDate != null){
			putBodyParameter("ToDate", toDate);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescribePayOrdersResponse> getResponseClass() {
		return DescribePayOrdersResponse.class;
	}

}
