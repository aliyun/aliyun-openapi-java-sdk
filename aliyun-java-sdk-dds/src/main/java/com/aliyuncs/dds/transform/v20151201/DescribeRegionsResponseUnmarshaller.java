/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeRegionsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRegionsResponse.DdsRegion;
import com.aliyuncs.dds.model.v20151201.DescribeRegionsResponse.DdsRegion.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));

		List<DdsRegion> regions = new ArrayList<DdsRegion>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			DdsRegion ddsRegion = new DdsRegion();
			ddsRegion.setRegionId(context.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));
			ddsRegion.setZoneIds(context.stringValue("DescribeRegionsResponse.Regions["+ i +"].ZoneIds"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < context.lengthValue("DescribeRegionsResponse.Regions["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneId(context.stringValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].ZoneId"));
				zone.setVpcEnabled(context.booleanValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].VpcEnabled"));

				zones.add(zone);
			}
			ddsRegion.setZones(zones);

			regions.add(ddsRegion);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}