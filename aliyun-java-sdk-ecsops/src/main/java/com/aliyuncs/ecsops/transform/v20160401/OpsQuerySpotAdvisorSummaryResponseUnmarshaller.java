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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQuerySpotAdvisorSummaryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQuerySpotAdvisorSummaryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQuerySpotAdvisorSummaryResponseUnmarshaller {

	public static OpsQuerySpotAdvisorSummaryResponse unmarshall(OpsQuerySpotAdvisorSummaryResponse opsQuerySpotAdvisorSummaryResponse, UnmarshallerContext _ctx) {
		
		opsQuerySpotAdvisorSummaryResponse.setRequestId(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.RequestId"));
		opsQuerySpotAdvisorSummaryResponse.setCode(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Code"));
		opsQuerySpotAdvisorSummaryResponse.setMessage(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Message"));
		opsQuerySpotAdvisorSummaryResponse.setSuccess(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Success"));

		Data data = new Data();
		data.setGmtCreate(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Data.GmtModified"));
		data.setIzNo(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Data.IzNo"));
		data.setNetworkType(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Data.NetworkType"));
		data.setNetworkType1(_ctx.integerValue("OpsQuerySpotAdvisorSummaryResponse.Data.NetworkType"));
		data.setInstanceTypeName(_ctx.stringValue("OpsQuerySpotAdvisorSummaryResponse.Data.InstanceTypeName"));
		data.setUserReleaseVcpu(_ctx.integerValue("OpsQuerySpotAdvisorSummaryResponse.Data.UserReleaseVcpu"));
		data.setUserReleaseRate(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.UserReleaseRate"));
		data.setUserReleaseRateStddev(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.UserReleaseRateStddev"));
		data.setPriceReleaseVcpu(_ctx.integerValue("OpsQuerySpotAdvisorSummaryResponse.Data.PriceReleaseVcpu"));
		data.setPriceReleaseRate(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.PriceReleaseRate"));
		data.setPriceReleaseRateStddev(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.PriceReleaseRateStddev"));
		data.setInventoryReleaseVcpu(_ctx.integerValue("OpsQuerySpotAdvisorSummaryResponse.Data.InventoryReleaseVcpu"));
		data.setInventoryReleaseRate(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.InventoryReleaseRate"));
		data.setInventoryReleaseRateStddev(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.InventoryReleaseRateStddev"));
		data.setOpsReleaseVcpu(_ctx.integerValue("OpsQuerySpotAdvisorSummaryResponse.Data.OpsReleaseVcpu"));
		data.setOpsReleaseRate(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.OpsReleaseRate"));
		data.setOpsReleaseRateStddev(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.OpsReleaseRateStddev"));
		data.setPassiveReleaseVcpu(_ctx.integerValue("OpsQuerySpotAdvisorSummaryResponse.Data.PassiveReleaseVcpu"));
		data.setPassiveReleaseRate(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.PassiveReleaseRate"));
		data.setPassiveReleaseRateStddev(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.PassiveReleaseRateStddev"));
		data.setDiscountAvg(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.DiscountAvg"));
		data.setDiscountStddev(_ctx.floatValue("OpsQuerySpotAdvisorSummaryResponse.Data.DiscountStddev"));
		opsQuerySpotAdvisorSummaryResponse.setData(data);
	 
	 	return opsQuerySpotAdvisorSummaryResponse;
	}
}