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
public class DescribeHoneyPotSuspStatisticsRequest extends RpcAcsRequest<DescribeHoneyPotSuspStatisticsResponse> {
	   

	private Integer statisticsDays;

	private String statisticsKeyType;

	private String from;
	public DescribeHoneyPotSuspStatisticsRequest() {
		super("Sas", "2018-12-03", "DescribeHoneyPotSuspStatistics", "sas");
		setMethod(MethodType.POST);
	}

	public Integer getStatisticsDays() {
		return this.statisticsDays;
	}

	public void setStatisticsDays(Integer statisticsDays) {
		this.statisticsDays = statisticsDays;
		if(statisticsDays != null){
			putQueryParameter("StatisticsDays", statisticsDays.toString());
		}
	}

	public String getStatisticsKeyType() {
		return this.statisticsKeyType;
	}

	public void setStatisticsKeyType(String statisticsKeyType) {
		this.statisticsKeyType = statisticsKeyType;
		if(statisticsKeyType != null){
			putQueryParameter("StatisticsKeyType", statisticsKeyType);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	@Override
	public Class<DescribeHoneyPotSuspStatisticsResponse> getResponseClass() {
		return DescribeHoneyPotSuspStatisticsResponse.class;
	}

}
