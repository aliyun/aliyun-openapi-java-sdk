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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessInstancesResponse.BusinessInstanceSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeBusinessInstancesResponseUnmarshaller {

	public static OpsDescribeBusinessInstancesResponse unmarshall(OpsDescribeBusinessInstancesResponse opsDescribeBusinessInstancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeBusinessInstancesResponse.setRequestId(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.RequestId"));

		List<BusinessInstanceSet> businessInstanceSets = new ArrayList<BusinessInstanceSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets.Length"); i++) {
			BusinessInstanceSet businessInstanceSet = new BusinessInstanceSet();
			businessInstanceSet.setStatus(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].Status"));
			businessInstanceSet.setEndDate(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].EndDate"));
			businessInstanceSet.setCommodityCode(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].CommodityCode"));
			businessInstanceSet.setResourceType(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].ResourceType"));
			businessInstanceSet.setChargeType(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].ChargeType"));
			businessInstanceSet.setStartDate(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].StartDate"));
			businessInstanceSet.setAliUid(_ctx.longValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].AliUid"));
			businessInstanceSet.setOrderType(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].OrderType"));
			businessInstanceSet.setOrderId(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].OrderId"));
			businessInstanceSet.setTradeInstanceId(_ctx.stringValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].tradeInstanceId"));
			businessInstanceSet.setId(_ctx.longValue("OpsDescribeBusinessInstancesResponse.BusinessInstanceSets["+ i +"].Id"));

			businessInstanceSets.add(businessInstanceSet);
		}
		opsDescribeBusinessInstancesResponse.setBusinessInstanceSets(businessInstanceSets);
	 
	 	return opsDescribeBusinessInstancesResponse;
	}
}