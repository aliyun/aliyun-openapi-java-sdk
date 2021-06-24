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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryInventoryOverviewResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInventoryOverviewResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryInventoryOverviewResponseUnmarshaller {

	public static OpsQueryInventoryOverviewResponse unmarshall(OpsQueryInventoryOverviewResponse opsQueryInventoryOverviewResponse, UnmarshallerContext _ctx) {
		
		opsQueryInventoryOverviewResponse.setRequestId(_ctx.stringValue("OpsQueryInventoryOverviewResponse.RequestId"));
		opsQueryInventoryOverviewResponse.setMessage(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Message"));
		opsQueryInventoryOverviewResponse.setCode(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Code"));
		opsQueryInventoryOverviewResponse.setSuccess(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Success"));

		Data data = new Data();
		data.setMemCycleDays(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.MemCycleDays"));
		data.setCycleMem(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.CycleMem"));
		data.setDs(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.Ds"));
		data.setCycleCpu(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.CycleCpu"));
		data.setFragmentMem(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.FragmentMem"));
		data.setWaterCpu(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.WaterCpu"));
		data.setCycleMemSaleRate(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.CycleMemSaleRate"));
		data.setGmtModified(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Data.GmtModified"));
		data.setElasticMem(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.ElasticMem"));
		data.setCpuCycleDays(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.CpuCycleDays"));
		data.setElasticCpu(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.ElasticCpu"));
		data.setDailyIncreaseMem(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.DailyIncreaseMem"));
		data.setGmtCreate(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Data.GmtCreate"));
		data.setWaterMem(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.WaterMem"));
		data.setCycleCpuSaleRate(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.CycleCpuSaleRate"));
		data.setDailyIncreaseCpu(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.DailyIncreaseCpu"));
		data.setIzNo(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Data.IzNo"));
		data.setFlavorFamily(_ctx.stringValue("OpsQueryInventoryOverviewResponse.Data.FlavorFamily"));
		data.setFragmentCpu(_ctx.longValue("OpsQueryInventoryOverviewResponse.Data.FragmentCpu"));
		opsQueryInventoryOverviewResponse.setData(data);
	 
	 	return opsQueryInventoryOverviewResponse;
	}
}