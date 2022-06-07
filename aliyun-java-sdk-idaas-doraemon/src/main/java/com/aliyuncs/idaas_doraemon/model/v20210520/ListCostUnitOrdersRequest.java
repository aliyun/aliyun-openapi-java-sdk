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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCostUnitOrdersRequest extends RpcAcsRequest<ListCostUnitOrdersResponse> {
	   

	private String beginDate;

	private Integer pageNumber;

	private String finalDate;

	private Integer pageSize;
	public ListCostUnitOrdersRequest() {
		super("idaas-doraemon", "2021-05-20", "ListCostUnitOrders");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putQueryParameter("BeginDate", beginDate);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFinalDate() {
		return this.finalDate;
	}

	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
		if(finalDate != null){
			putQueryParameter("FinalDate", finalDate);
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

	@Override
	public Class<ListCostUnitOrdersResponse> getResponseClass() {
		return ListCostUnitOrdersResponse.class;
	}

}
