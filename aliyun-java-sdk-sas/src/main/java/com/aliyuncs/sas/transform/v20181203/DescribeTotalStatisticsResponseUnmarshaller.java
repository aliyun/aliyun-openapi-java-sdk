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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeTotalStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTotalStatisticsResponseUnmarshaller {

	public static DescribeTotalStatisticsResponse unmarshall(DescribeTotalStatisticsResponse describeTotalStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeTotalStatisticsResponse.setRequestId(_ctx.stringValue("DescribeTotalStatisticsResponse.RequestId"));
		describeTotalStatisticsResponse.setSuspiciousmediumTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.SuspiciousmediumTotal"));
		describeTotalStatisticsResponse.setVulLaterSum(_ctx.integerValue("DescribeTotalStatisticsResponse.VulLaterSum"));
		describeTotalStatisticsResponse.setTrojan(_ctx.integerValue("DescribeTotalStatisticsResponse.Trojan"));
		describeTotalStatisticsResponse.setSuspicious(_ctx.integerValue("DescribeTotalStatisticsResponse.Suspicious"));
		describeTotalStatisticsResponse.setHealthlowTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.HealthlowTotal"));
		describeTotalStatisticsResponse.setPatch(_ctx.integerValue("DescribeTotalStatisticsResponse.Patch"));
		describeTotalStatisticsResponse.setSuspiciousseriousTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.SuspiciousseriousTotal"));
		describeTotalStatisticsResponse.setVulAsapSum(_ctx.integerValue("DescribeTotalStatisticsResponse.VulAsapSum"));
		describeTotalStatisticsResponse.setOnline(_ctx.booleanValue("DescribeTotalStatisticsResponse.Online"));
		describeTotalStatisticsResponse.setHealthmediumTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.HealthmediumTotal"));
		describeTotalStatisticsResponse.setNewsuspicious(_ctx.integerValue("DescribeTotalStatisticsResponse.Newsuspicious"));
		describeTotalStatisticsResponse.setAccount(_ctx.integerValue("DescribeTotalStatisticsResponse.Account"));
		describeTotalStatisticsResponse.setVulDealedTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.VulDealedTotal"));
		describeTotalStatisticsResponse.setSuspiciousTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.SuspiciousTotal"));
		describeTotalStatisticsResponse.setSuspiciousdealedTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.SuspiciousdealedTotal"));
		describeTotalStatisticsResponse.setHealthdealedTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.HealthdealedTotal"));
		describeTotalStatisticsResponse.setSuspicioushighTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.SuspicioushighTotal"));
		describeTotalStatisticsResponse.setVulNntfSum(_ctx.integerValue("DescribeTotalStatisticsResponse.VulNntfSum"));
		describeTotalStatisticsResponse.setVulTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.VulTotal"));
		describeTotalStatisticsResponse.setSuspiciouslowTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.SuspiciouslowTotal"));
		describeTotalStatisticsResponse.setHealthTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.HealthTotal"));
		describeTotalStatisticsResponse.setVul(_ctx.integerValue("DescribeTotalStatisticsResponse.Vul"));
		describeTotalStatisticsResponse.setHealth(_ctx.integerValue("DescribeTotalStatisticsResponse.Health"));
		describeTotalStatisticsResponse.setHealthseriousTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.HealthseriousTotal"));
		describeTotalStatisticsResponse.setHealthhighTotal(_ctx.integerValue("DescribeTotalStatisticsResponse.HealthhighTotal"));
	 
	 	return describeTotalStatisticsResponse;
	}
}