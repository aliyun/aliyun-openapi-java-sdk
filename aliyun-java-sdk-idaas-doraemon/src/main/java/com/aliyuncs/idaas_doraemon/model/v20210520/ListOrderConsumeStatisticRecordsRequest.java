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
public class ListOrderConsumeStatisticRecordsRequest extends RpcAcsRequest<ListOrderConsumeStatisticRecordsResponse> {
	   

	private String statisticTimeMin;

	private String aliOrderCode;

	private Integer pageNumber;

	private Integer pageSize;

	private String statisticTimeMax;
	public ListOrderConsumeStatisticRecordsRequest() {
		super("idaas-doraemon", "2021-05-20", "ListOrderConsumeStatisticRecords");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStatisticTimeMin() {
		return this.statisticTimeMin;
	}

	public void setStatisticTimeMin(String statisticTimeMin) {
		this.statisticTimeMin = statisticTimeMin;
		if(statisticTimeMin != null){
			putQueryParameter("StatisticTimeMin", statisticTimeMin);
		}
	}

	public String getAliOrderCode() {
		return this.aliOrderCode;
	}

	public void setAliOrderCode(String aliOrderCode) {
		this.aliOrderCode = aliOrderCode;
		if(aliOrderCode != null){
			putQueryParameter("AliOrderCode", aliOrderCode);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getStatisticTimeMax() {
		return this.statisticTimeMax;
	}

	public void setStatisticTimeMax(String statisticTimeMax) {
		this.statisticTimeMax = statisticTimeMax;
		if(statisticTimeMax != null){
			putQueryParameter("StatisticTimeMax", statisticTimeMax);
		}
	}

	@Override
	public Class<ListOrderConsumeStatisticRecordsResponse> getResponseClass() {
		return ListOrderConsumeStatisticRecordsResponse.class;
	}

}
