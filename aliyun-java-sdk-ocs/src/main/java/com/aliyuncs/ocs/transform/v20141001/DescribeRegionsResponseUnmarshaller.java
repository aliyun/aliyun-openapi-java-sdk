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
package com.aliyuncs.ocs.transform.v20141001;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ocs.model.v20141001.DescribeRegionsResponse;
import com.aliyuncs.ocs.model.v20141001.DescribeRegionsResponse.OcsRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));

		List<OcsRegion> regionIds = new ArrayList<OcsRegion>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.RegionIds.Length"); i++) {
			OcsRegion  ocsRegion = new OcsRegion();
			ocsRegion.setRegionId(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].RegionId"));
			ocsRegion.setZoneIds(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].ZoneIds"));
			ocsRegion.setLocalName(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].LocalName"));

			regionIds.add(ocsRegion);
		}
		describeRegionsResponse.setRegionIds(regionIds);
	 
	 	return describeRegionsResponse;
	}
}