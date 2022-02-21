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
public class ListBookkeepingStatisticsesRequest extends RpcAcsRequest<ListBookkeepingStatisticsesResponse> {
	   

	private Integer year;

	private String produceBizId;

	private Integer pageNumber;

	private Integer month;

	private Integer pageSize;
	public ListBookkeepingStatisticsesRequest() {
		super("companyreg", "2019-05-08", "ListBookkeepingStatisticses");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
		if(year != null){
			putQueryParameter("Year", year.toString());
		}
	}

	public String getProduceBizId() {
		return this.produceBizId;
	}

	public void setProduceBizId(String produceBizId) {
		this.produceBizId = produceBizId;
		if(produceBizId != null){
			putQueryParameter("ProduceBizId", produceBizId);
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

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
		if(month != null){
			putQueryParameter("Month", month.toString());
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
	public Class<ListBookkeepingStatisticsesResponse> getResponseClass() {
		return ListBookkeepingStatisticsesResponse.class;
	}

}
