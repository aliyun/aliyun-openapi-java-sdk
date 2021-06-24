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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQuerySpotReserveAmountResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStock;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQuerySpotReserveAmountResponseUnmarshaller {

	public static OpsQuerySpotReserveAmountResponse unmarshall(OpsQuerySpotReserveAmountResponse opsQuerySpotReserveAmountResponse, UnmarshallerContext _ctx) {
		
		opsQuerySpotReserveAmountResponse.setRequestId(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.RequestId"));

		List<EcsSpotDurationReserveVmStock> ecsSpotDurationReserveVmStocks = new ArrayList<EcsSpotDurationReserveVmStock>();
		for (int i = 0; i < _ctx.lengthValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks.Length"); i++) {
			EcsSpotDurationReserveVmStock ecsSpotDurationReserveVmStock = new EcsSpotDurationReserveVmStock();
			ecsSpotDurationReserveVmStock.setIoOptimized(_ctx.integerValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].IoOptimized"));
			ecsSpotDurationReserveVmStock.setFlavor(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].Flavor"));
			ecsSpotDurationReserveVmStock.setSpotDuration(_ctx.integerValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].SpotDuration"));
			ecsSpotDurationReserveVmStock.setGmtCreate(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].GmtCreate"));
			ecsSpotDurationReserveVmStock.setNetworkType(_ctx.integerValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].NetworkType"));
			ecsSpotDurationReserveVmStock.setGmtModified(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].GmtModified"));
			ecsSpotDurationReserveVmStock.setIzNo(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].IzNo"));
			ecsSpotDurationReserveVmStock.setFlavorFamily(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].FlavorFamily"));
			ecsSpotDurationReserveVmStock.setId(_ctx.longValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].Id"));
			ecsSpotDurationReserveVmStock.setBizHour(_ctx.stringValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].BizHour"));
			ecsSpotDurationReserveVmStock.setReserveAmount(_ctx.integerValue("OpsQuerySpotReserveAmountResponse.EcsSpotDurationReserveVmStocks["+ i +"].ReserveAmount"));

			ecsSpotDurationReserveVmStocks.add(ecsSpotDurationReserveVmStock);
		}
		opsQuerySpotReserveAmountResponse.setEcsSpotDurationReserveVmStocks(ecsSpotDurationReserveVmStocks);
	 
	 	return opsQuerySpotReserveAmountResponse;
	}
}