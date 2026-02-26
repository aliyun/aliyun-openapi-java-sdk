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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetClientRatioStatisticRequest extends RpcAcsRequest<GetClientRatioStatisticResponse> {
	   

	private Long timeEnd;

	private Long resourceDirectoryAccountId;

	private List<String> statisticTypes;

	private Long timeStart;
	public GetClientRatioStatisticRequest() {
		super("Sas", "2018-12-03", "GetClientRatioStatistic");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Long timeEnd) {
		this.timeEnd = timeEnd;
		if(timeEnd != null){
			putQueryParameter("TimeEnd", timeEnd.toString());
		}
	}

	public Long getResourceDirectoryAccountId() {
		return this.resourceDirectoryAccountId;
	}

	public void setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
		this.resourceDirectoryAccountId = resourceDirectoryAccountId;
		if(resourceDirectoryAccountId != null){
			putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId.toString());
		}
	}

	public List<String> getStatisticTypes() {
		return this.statisticTypes;
	}

	public void setStatisticTypes(List<String> statisticTypes) {
		this.statisticTypes = statisticTypes;	
		if (statisticTypes != null) {
			for (int depth1 = 0; depth1 < statisticTypes.size(); depth1++) {
				putQueryParameter("StatisticTypes." + (depth1 + 1) , statisticTypes.get(depth1));
			}
		}	
	}

	public Long getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Long timeStart) {
		this.timeStart = timeStart;
		if(timeStart != null){
			putQueryParameter("TimeStart", timeStart.toString());
		}
	}

	@Override
	public Class<GetClientRatioStatisticResponse> getResponseClass() {
		return GetClientRatioStatisticResponse.class;
	}

}
