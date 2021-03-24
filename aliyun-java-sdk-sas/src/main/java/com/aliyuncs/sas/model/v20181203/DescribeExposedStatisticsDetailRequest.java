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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedStatisticsDetailRequest extends RpcAcsRequest<DescribeExposedStatisticsDetailResponse> {
	   

	private String statisticsType;

	private String statisticsTypeGatewayType;

	private Integer currentPage;

	private String statisticsTypeInstanceValue;

	private Integer pageSize;
	public DescribeExposedStatisticsDetailRequest() {
		super("Sas", "2018-12-03", "DescribeExposedStatisticsDetail", "sas");
		setMethod(MethodType.POST);
	}

	public String getStatisticsType() {
		return this.statisticsType;
	}

	public void setStatisticsType(String statisticsType) {
		this.statisticsType = statisticsType;
		if(statisticsType != null){
			putQueryParameter("StatisticsType", statisticsType);
		}
	}

	public String getStatisticsTypeGatewayType() {
		return this.statisticsTypeGatewayType;
	}

	public void setStatisticsTypeGatewayType(String statisticsTypeGatewayType) {
		this.statisticsTypeGatewayType = statisticsTypeGatewayType;
		if(statisticsTypeGatewayType != null){
			putQueryParameter("StatisticsTypeGatewayType", statisticsTypeGatewayType);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getStatisticsTypeInstanceValue() {
		return this.statisticsTypeInstanceValue;
	}

	public void setStatisticsTypeInstanceValue(String statisticsTypeInstanceValue) {
		this.statisticsTypeInstanceValue = statisticsTypeInstanceValue;
		if(statisticsTypeInstanceValue != null){
			putQueryParameter("StatisticsTypeInstanceValue", statisticsTypeInstanceValue);
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
	public Class<DescribeExposedStatisticsDetailResponse> getResponseClass() {
		return DescribeExposedStatisticsDetailResponse.class;
	}

}
