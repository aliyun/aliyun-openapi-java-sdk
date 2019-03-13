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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDemandsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDemandsResponse.Demand;
import com.aliyuncs.ecs.model.v20140526.DescribeDemandsResponse.Demand.SupplyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDemandsResponseUnmarshaller {

	public static DescribeDemandsResponse unmarshall(DescribeDemandsResponse describeDemandsResponse, UnmarshallerContext context) {
		
		describeDemandsResponse.setRequestId(context.stringValue("DescribeDemandsResponse.RequestId"));
		describeDemandsResponse.setTotalCount(context.integerValue("DescribeDemandsResponse.TotalCount"));
		describeDemandsResponse.setPageNumber(context.integerValue("DescribeDemandsResponse.PageNumber"));
		describeDemandsResponse.setPageSize(context.integerValue("DescribeDemandsResponse.PageSize"));
		describeDemandsResponse.setRegionId(context.stringValue("DescribeDemandsResponse.RegionId"));

		List<Demand> demands = new ArrayList<Demand>();
		for (int i = 0; i < context.lengthValue("DescribeDemandsResponse.Demands.Length"); i++) {
			Demand demand = new Demand();
			demand.setZoneId(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].ZoneId"));
			demand.setDemandTime(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandTime"));
			demand.setInstanceTypeFamily(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].InstanceTypeFamily"));
			demand.setInstanceType(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].InstanceType"));
			demand.setInstanceChargeType(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].InstanceChargeType"));
			demand.setPeriod(context.integerValue("DescribeDemandsResponse.Demands["+ i +"].Period"));
			demand.setPeriodUnit(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].PeriodUnit"));
			demand.setStartTime(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].StartTime"));
			demand.setEndTime(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].EndTime"));
			demand.setDemandStatus(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandStatus"));
			demand.setTotalAmount(context.integerValue("DescribeDemandsResponse.Demands["+ i +"].TotalAmount"));
			demand.setAvailableAmount(context.integerValue("DescribeDemandsResponse.Demands["+ i +"].AvailableAmount"));
			demand.setUsedAmount(context.integerValue("DescribeDemandsResponse.Demands["+ i +"].UsedAmount"));
			demand.setDeliveringAmount(context.integerValue("DescribeDemandsResponse.Demands["+ i +"].DeliveringAmount"));

			List<SupplyInfo> supplyInfos = new ArrayList<SupplyInfo>();
			for (int j = 0; j < context.lengthValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos.Length"); j++) {
				SupplyInfo supplyInfo = new SupplyInfo();
				supplyInfo.setAmount(context.integerValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].Amount"));
				supplyInfo.setSupplyStatus(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].SupplyStatus"));
				supplyInfo.setSupplyStartTime(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].SupplyStartTime"));
				supplyInfo.setSupplyEndTime(context.stringValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].SupplyEndTime"));

				supplyInfos.add(supplyInfo);
			}
			demand.setSupplyInfos(supplyInfos);

			demands.add(demand);
		}
		describeDemandsResponse.setDemands(demands);
	 
	 	return describeDemandsResponse;
	}
}