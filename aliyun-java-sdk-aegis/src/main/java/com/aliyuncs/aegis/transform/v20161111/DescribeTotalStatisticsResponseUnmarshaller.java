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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeTotalStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTotalStatisticsResponseUnmarshaller {

	public static DescribeTotalStatisticsResponse unmarshall(DescribeTotalStatisticsResponse describeTotalStatisticsResponse, UnmarshallerContext context) {
		
		describeTotalStatisticsResponse.setRequestId(context.stringValue("DescribeTotalStatisticsResponse.RequestId"));
		describeTotalStatisticsResponse.setVulAsapSum(context.integerValue("DescribeTotalStatisticsResponse.VulAsapSum"));
		describeTotalStatisticsResponse.setVulNntfSum(context.integerValue("DescribeTotalStatisticsResponse.VulNntfSum"));
		describeTotalStatisticsResponse.setHealthTotal(context.integerValue("DescribeTotalStatisticsResponse.HealthTotal"));
		describeTotalStatisticsResponse.setSuspiciousmediumTotal(context.integerValue("DescribeTotalStatisticsResponse.SuspiciousmediumTotal"));
		describeTotalStatisticsResponse.setHealth(context.integerValue("DescribeTotalStatisticsResponse.Health"));
		describeTotalStatisticsResponse.setHealthdealedTotal(context.integerValue("DescribeTotalStatisticsResponse.HealthdealedTotal"));
		describeTotalStatisticsResponse.setTrojan(context.integerValue("DescribeTotalStatisticsResponse.Trojan"));
		describeTotalStatisticsResponse.setVulLaterSum(context.integerValue("DescribeTotalStatisticsResponse.VulLaterSum"));
		describeTotalStatisticsResponse.setSuspicious(context.integerValue("DescribeTotalStatisticsResponse.Suspicious"));
		describeTotalStatisticsResponse.setVul(context.integerValue("DescribeTotalStatisticsResponse.Vul"));
		describeTotalStatisticsResponse.setHealthhighTotal(context.integerValue("DescribeTotalStatisticsResponse.HealthhighTotal"));
		describeTotalStatisticsResponse.setHealthlowTotal(context.integerValue("DescribeTotalStatisticsResponse.HealthlowTotal"));
		describeTotalStatisticsResponse.setHealthseriousTotal(context.integerValue("DescribeTotalStatisticsResponse.HealthseriousTotal"));
		describeTotalStatisticsResponse.setVulDealedTotal(context.integerValue("DescribeTotalStatisticsResponse.VulDealedTotal"));
		describeTotalStatisticsResponse.setPatch(context.integerValue("DescribeTotalStatisticsResponse.Patch"));
		describeTotalStatisticsResponse.setSuspicioushighTotal(context.integerValue("DescribeTotalStatisticsResponse.SuspicioushighTotal"));
		describeTotalStatisticsResponse.setSuspiciouslowTotal(context.integerValue("DescribeTotalStatisticsResponse.SuspiciouslowTotal"));
		describeTotalStatisticsResponse.setSuspiciousTotal(context.integerValue("DescribeTotalStatisticsResponse.SuspiciousTotal"));
		describeTotalStatisticsResponse.setVulTotal(context.integerValue("DescribeTotalStatisticsResponse.VulTotal"));
		describeTotalStatisticsResponse.setSuspiciousseriousTotal(context.integerValue("DescribeTotalStatisticsResponse.SuspiciousseriousTotal"));
		describeTotalStatisticsResponse.setHealthmediumTotal(context.integerValue("DescribeTotalStatisticsResponse.HealthmediumTotal"));
		describeTotalStatisticsResponse.setOnline(context.booleanValue("DescribeTotalStatisticsResponse.Online"));
		describeTotalStatisticsResponse.setSuspiciousdealedTotal(context.integerValue("DescribeTotalStatisticsResponse.SuspiciousdealedTotal"));
		describeTotalStatisticsResponse.setAccount(context.integerValue("DescribeTotalStatisticsResponse.Account"));
		describeTotalStatisticsResponse.setNewsuspicious(context.integerValue("DescribeTotalStatisticsResponse.Newsuspicious"));
	 
	 	return describeTotalStatisticsResponse;
	}
}