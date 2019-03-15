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

package com.aliyuncs.sas_api.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeHitRateColumnRequest extends RpcAcsRequest<DescribeHitRateColumnResponse> {
	
	public DescribeHitRateColumnRequest() {
		super("Sas-api", "2017-07-05", "DescribeHitRateColumn", "sas-api");
	}

	private String endDate;

	private String sourceIp;

	private Integer hitDay;

	private String startDate;

	private Integer apiType;

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getHitDay() {
		return this.hitDay;
	}

	public void setHitDay(Integer hitDay) {
		this.hitDay = hitDay;
		if(hitDay != null){
			putQueryParameter("HitDay", hitDay.toString());
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public Integer getApiType() {
		return this.apiType;
	}

	public void setApiType(Integer apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putQueryParameter("ApiType", apiType.toString());
		}
	}

	@Override
	public Class<DescribeHitRateColumnResponse> getResponseClass() {
		return DescribeHitRateColumnResponse.class;
	}

}
