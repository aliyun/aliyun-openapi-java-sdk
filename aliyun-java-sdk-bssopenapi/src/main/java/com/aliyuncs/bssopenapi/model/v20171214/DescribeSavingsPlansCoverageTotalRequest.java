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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSavingsPlansCoverageTotalRequest extends RpcAcsRequest<DescribeSavingsPlansCoverageTotalResponse> {
	   

	private String periodType;

	private Long billOwnerId;

	private String startPeriod;

	private String endPeriod;
	public DescribeSavingsPlansCoverageTotalRequest() {
		super("BssOpenApi", "2017-12-14", "DescribeSavingsPlansCoverageTotal");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPeriodType() {
		return this.periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
		if(periodType != null){
			putQueryParameter("PeriodType", periodType);
		}
	}

	public Long getBillOwnerId() {
		return this.billOwnerId;
	}

	public void setBillOwnerId(Long billOwnerId) {
		this.billOwnerId = billOwnerId;
		if(billOwnerId != null){
			putQueryParameter("BillOwnerId", billOwnerId.toString());
		}
	}

	public String getStartPeriod() {
		return this.startPeriod;
	}

	public void setStartPeriod(String startPeriod) {
		this.startPeriod = startPeriod;
		if(startPeriod != null){
			putQueryParameter("StartPeriod", startPeriod);
		}
	}

	public String getEndPeriod() {
		return this.endPeriod;
	}

	public void setEndPeriod(String endPeriod) {
		this.endPeriod = endPeriod;
		if(endPeriod != null){
			putQueryParameter("EndPeriod", endPeriod);
		}
	}

	@Override
	public Class<DescribeSavingsPlansCoverageTotalResponse> getResponseClass() {
		return DescribeSavingsPlansCoverageTotalResponse.class;
	}

}
