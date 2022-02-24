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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryRskStatisticRequest extends RpcAcsRequest<QueryRskStatisticResponse> {
	   

	private String oneCompId;

	private String rskType;

	private String startDate;

	private String endDate;
	public QueryRskStatisticRequest() {
		super("dt-oc-info", "2020-04-01", "QueryRskStatistic");
		setMethod(MethodType.POST);
	}

	public String getOneCompId() {
		return this.oneCompId;
	}

	public void setOneCompId(String oneCompId) {
		this.oneCompId = oneCompId;
		if(oneCompId != null){
			putQueryParameter("OneCompId", oneCompId);
		}
	}

	public String getRskType() {
		return this.rskType;
	}

	public void setRskType(String rskType) {
		this.rskType = rskType;
		if(rskType != null){
			putQueryParameter("RskType", rskType);
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

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	@Override
	public Class<QueryRskStatisticResponse> getResponseClass() {
		return QueryRskStatisticResponse.class;
	}

}
