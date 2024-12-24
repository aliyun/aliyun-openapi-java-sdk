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

package com.aliyuncs.brinekingdom.transform.v20190627;

import com.aliyuncs.brinekingdom.model.v20190627.WeeksSummaryQuotaResponse;
import com.aliyuncs.brinekingdom.model.v20190627.WeeksSummaryQuotaResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class WeeksSummaryQuotaResponseUnmarshaller {

	public static WeeksSummaryQuotaResponse unmarshall(WeeksSummaryQuotaResponse weeksSummaryQuotaResponse, UnmarshallerContext _ctx) {
		
		weeksSummaryQuotaResponse.setMessage(_ctx.stringValue("WeeksSummaryQuotaResponse.Message"));
		weeksSummaryQuotaResponse.setSuccess(_ctx.booleanValue("WeeksSummaryQuotaResponse.Success"));

		Result result = new Result();
		result.setExpectDate(_ctx.longValue("WeeksSummaryQuotaResponse.Result.ExpectDate"));
		result.setForecastTotal(_ctx.longValue("WeeksSummaryQuotaResponse.Result.ForecastTotal"));
		result.setModel(_ctx.stringValue("WeeksSummaryQuotaResponse.Result.Model"));
		result.setNic(_ctx.stringValue("WeeksSummaryQuotaResponse.Result.Nic"));
		result.setOrgName(_ctx.stringValue("WeeksSummaryQuotaResponse.Result.OrgName"));
		result.setPlannedAvailable(_ctx.longValue("WeeksSummaryQuotaResponse.Result.PlannedAvailable"));
		result.setReplenishable(_ctx.longValue("WeeksSummaryQuotaResponse.Result.Replenishable"));
		result.setSupplyCnt(_ctx.longValue("WeeksSummaryQuotaResponse.Result.SupplyCnt"));
		weeksSummaryQuotaResponse.setResult(result);
	 
	 	return weeksSummaryQuotaResponse;
	}
}