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

import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse.RecommendInstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse.RecommendInstanceType.InstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse.RecommendInstanceType.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecommendInstanceTypeResponseUnmarshaller {

	public static DescribeRecommendInstanceTypeResponse unmarshall(DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeResponse, UnmarshallerContext _ctx) {
		
		describeRecommendInstanceTypeResponse.setRequestId(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.RequestId"));

		List<RecommendInstanceType> data = new ArrayList<RecommendInstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecommendInstanceTypeResponse.Data.Length"); i++) {
			RecommendInstanceType recommendInstanceType = new RecommendInstanceType();
			recommendInstanceType.setRegionId(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].RegionId"));
			recommendInstanceType.setCommodityCode(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].CommodityCode"));
			recommendInstanceType.setScene(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Scene"));
			recommendInstanceType.setInstanceChargeType(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceChargeType"));
			recommendInstanceType.setSpotStrategy(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].SpotStrategy"));
			recommendInstanceType.setPriority(_ctx.integerValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Priority"));

			InstanceType instanceType = new InstanceType();
			instanceType.setGeneration(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.Generation"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.InstanceTypeFamily"));
			instanceType.setInstanceType(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.InstanceType"));
			instanceType.setSupportIoOptimized(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.SupportIoOptimized"));
			instanceType.setCores(_ctx.integerValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.Cores"));
			instanceType.setMemory(_ctx.integerValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].InstanceType.Memory"));
			recommendInstanceType.setInstanceType(instanceType);

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneNo(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones["+ j +"].ZoneNo"));

				List<String> networkTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones["+ j +"].NetworkTypes.Length"); k++) {
					networkTypes.add(_ctx.stringValue("DescribeRecommendInstanceTypeResponse.Data["+ i +"].Zones["+ j +"].NetworkTypes["+ k +"]"));
				}
				zone.setNetworkTypes(networkTypes);

				zones.add(zone);
			}
			recommendInstanceType.setZones(zones);

			data.add(recommendInstanceType);
		}
		describeRecommendInstanceTypeResponse.setData(data);
	 
	 	return describeRecommendInstanceTypeResponse;
	}
}