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

import com.aliyuncs.ecs.model.v20140526.DescribeSpotAdviceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSpotAdviceResponse.AvailableSpotZone;
import com.aliyuncs.ecs.model.v20140526.DescribeSpotAdviceResponse.AvailableSpotZone.AvailableSpotResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpotAdviceResponseUnmarshaller {

	public static DescribeSpotAdviceResponse unmarshall(DescribeSpotAdviceResponse describeSpotAdviceResponse, UnmarshallerContext _ctx) {
		
		describeSpotAdviceResponse.setRequestId(_ctx.stringValue("DescribeSpotAdviceResponse.RequestId"));
		describeSpotAdviceResponse.setRegionId(_ctx.stringValue("DescribeSpotAdviceResponse.RegionId"));

		List<AvailableSpotZone> availableSpotZones = new ArrayList<AvailableSpotZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSpotAdviceResponse.AvailableSpotZones.Length"); i++) {
			AvailableSpotZone availableSpotZone = new AvailableSpotZone();
			availableSpotZone.setZoneId(_ctx.stringValue("DescribeSpotAdviceResponse.AvailableSpotZones["+ i +"].ZoneId"));

			List<AvailableSpotResource> availableSpotResources = new ArrayList<AvailableSpotResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSpotAdviceResponse.AvailableSpotZones["+ i +"].AvailableSpotResources.Length"); j++) {
				AvailableSpotResource availableSpotResource = new AvailableSpotResource();
				availableSpotResource.setInterruptRateDesc(_ctx.stringValue("DescribeSpotAdviceResponse.AvailableSpotZones["+ i +"].AvailableSpotResources["+ j +"].InterruptRateDesc"));
				availableSpotResource.setAverageSpotDiscount(_ctx.integerValue("DescribeSpotAdviceResponse.AvailableSpotZones["+ i +"].AvailableSpotResources["+ j +"].AverageSpotDiscount"));
				availableSpotResource.setInstanceType(_ctx.stringValue("DescribeSpotAdviceResponse.AvailableSpotZones["+ i +"].AvailableSpotResources["+ j +"].InstanceType"));
				availableSpotResource.setInterruptionRate(_ctx.floatValue("DescribeSpotAdviceResponse.AvailableSpotZones["+ i +"].AvailableSpotResources["+ j +"].InterruptionRate"));

				availableSpotResources.add(availableSpotResource);
			}
			availableSpotZone.setAvailableSpotResources(availableSpotResources);

			availableSpotZones.add(availableSpotZone);
		}
		describeSpotAdviceResponse.setAvailableSpotZones(availableSpotZones);
	 
	 	return describeSpotAdviceResponse;
	}
}