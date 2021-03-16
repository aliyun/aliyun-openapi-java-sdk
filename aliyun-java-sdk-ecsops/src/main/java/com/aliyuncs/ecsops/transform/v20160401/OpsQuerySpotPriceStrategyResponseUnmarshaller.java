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

import com.aliyuncs.ecsops.model.v20160401.OpsQuerySpotPriceStrategyResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQuerySpotPriceStrategyResponse.SpotStrategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQuerySpotPriceStrategyResponseUnmarshaller {

	public static OpsQuerySpotPriceStrategyResponse unmarshall(OpsQuerySpotPriceStrategyResponse opsQuerySpotPriceStrategyResponse, UnmarshallerContext _ctx) {
		
		opsQuerySpotPriceStrategyResponse.setRequestId(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.RequestId"));
		opsQuerySpotPriceStrategyResponse.setCode(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.Code"));
		opsQuerySpotPriceStrategyResponse.setMessage(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.Message"));
		opsQuerySpotPriceStrategyResponse.setSuccess(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.Success"));

		List<SpotStrategy> spotStrategies = new ArrayList<SpotStrategy>();
		for (int i = 0; i < _ctx.lengthValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies.Length"); i++) {
			SpotStrategy spotStrategy = new SpotStrategy();
			spotStrategy.setId(_ctx.longValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].Id"));
			spotStrategy.setGmtCreate(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].GmtCreate"));
			spotStrategy.setGmtModified(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].GmtModified"));
			spotStrategy.setGmtModified1(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].GmtModified"));
			spotStrategy.setRegionNo(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].RegionNo"));
			spotStrategy.setIzNo(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].IzNo"));
			spotStrategy.setInstanceType(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].InstanceType"));
			spotStrategy.setInstanceTypeFamily(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].InstanceTypeFamily"));
			spotStrategy.setIoOptimized(_ctx.integerValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].IoOptimized"));
			spotStrategy.setNetworkType(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].NetworkType"));
			spotStrategy.setSpotDuration(_ctx.integerValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].SpotDuration"));
			spotStrategy.setStartDate(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].StartDate"));
			spotStrategy.setEndDate(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].EndDate"));
			spotStrategy.setStrategyType(_ctx.integerValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].StrategyType"));
			spotStrategy.setStrategyDetails(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].StrategyDetails"));
			spotStrategy.setCreatedBy(_ctx.stringValue("OpsQuerySpotPriceStrategyResponse.SpotStrategies["+ i +"].CreatedBy"));

			spotStrategies.add(spotStrategy);
		}
		opsQuerySpotPriceStrategyResponse.setSpotStrategies(spotStrategies);
	 
	 	return opsQuerySpotPriceStrategyResponse;
	}
}