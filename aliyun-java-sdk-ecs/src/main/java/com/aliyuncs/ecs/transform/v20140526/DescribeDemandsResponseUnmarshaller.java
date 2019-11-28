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

	public static DescribeDemandsResponse unmarshall(DescribeDemandsResponse describeDemandsResponse, UnmarshallerContext _ctx) {
		
		describeDemandsResponse.setRequestId(_ctx.stringValue("DescribeDemandsResponse.RequestId"));
		describeDemandsResponse.setTotalCount(_ctx.integerValue("DescribeDemandsResponse.TotalCount"));
		describeDemandsResponse.setPageNumber(_ctx.integerValue("DescribeDemandsResponse.PageNumber"));
		describeDemandsResponse.setPageSize(_ctx.integerValue("DescribeDemandsResponse.PageSize"));
		describeDemandsResponse.setRegionId(_ctx.stringValue("DescribeDemandsResponse.RegionId"));

		List<Demand> demands = new ArrayList<Demand>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDemandsResponse.Demands.Length"); i++) {
			Demand demand = new Demand();
			demand.setZoneId(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].ZoneId"));
			demand.setDemandTime(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandTime"));
			demand.setInstanceTypeFamily(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].InstanceTypeFamily"));
			demand.setDemandId(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandId"));
			demand.setDemandName(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandName"));
			demand.setComment(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].Comment"));
			demand.setDemandDescription(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandDescription"));
			demand.setInstanceType(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].InstanceType"));
			demand.setInstanceChargeType(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].InstanceChargeType"));
			demand.setPeriod(_ctx.integerValue("DescribeDemandsResponse.Demands["+ i +"].Period"));
			demand.setPeriodUnit(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].PeriodUnit"));
			demand.setStartTime(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].StartTime"));
			demand.setEndTime(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].EndTime"));
			demand.setDemandStatus(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].DemandStatus"));
			demand.setTotalAmount(_ctx.integerValue("DescribeDemandsResponse.Demands["+ i +"].TotalAmount"));
			demand.setAvailableAmount(_ctx.integerValue("DescribeDemandsResponse.Demands["+ i +"].AvailableAmount"));
			demand.setUsedAmount(_ctx.integerValue("DescribeDemandsResponse.Demands["+ i +"].UsedAmount"));
			demand.setDeliveringAmount(_ctx.integerValue("DescribeDemandsResponse.Demands["+ i +"].DeliveringAmount"));

			List<SupplyInfo> supplyInfos = new ArrayList<SupplyInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos.Length"); j++) {
				SupplyInfo supplyInfo = new SupplyInfo();
				supplyInfo.setAmount(_ctx.integerValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].Amount"));
				supplyInfo.setSupplyStatus(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].SupplyStatus"));
				supplyInfo.setSupplyStartTime(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].SupplyStartTime"));
				supplyInfo.setSupplyEndTime(_ctx.stringValue("DescribeDemandsResponse.Demands["+ i +"].SupplyInfos["+ j +"].SupplyEndTime"));

				supplyInfos.add(supplyInfo);
			}
			demand.setSupplyInfos(supplyInfos);

			demands.add(demand);
		}
		describeDemandsResponse.setDemands(demands);
	 
	 	return describeDemandsResponse;
	}
}