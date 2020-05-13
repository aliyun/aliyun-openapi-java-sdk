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
package com.aliyuncs.v5.ecs.v20140526.transform;

import com.aliyuncs.v5.ecs.v20140526.model.DescribeRegionsResponse;
import com.aliyuncs.v5.ecs.v20140526.model.DescribeRegionsResponse.Region;
import com.aliyuncs.v5.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeRegionsResponseUnmarshaller {

    public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse,
                                                     UnmarshallerContext context) {

        describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));

        List<Region> regions = new ArrayList<Region>();
        for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
            Region region = new Region();
            region.setRegionId(context.stringValue("DescribeRegionsResponse.Regions[" + i + "].RegionId"));
            region.setLocalName(context.stringValue("DescribeRegionsResponse.Regions[" + i + "].LocalName"));

            regions.add(region);
        }
        describeRegionsResponse.setRegions(regions);

        return describeRegionsResponse;
    }
}