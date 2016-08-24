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
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeRegionsTestResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRegionsTestResponse.RDSRegion;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeRegionsTestResponseUnmarshaller {

    public static DescribeRegionsTestResponse unmarshall(
            DescribeRegionsTestResponse describeRegionsTestResponse, UnmarshallerContext context) {

        describeRegionsTestResponse
                .setRequestId(context.stringValue("DescribeRegionsTestResponse.RequestId"));

        List<RDSRegion> regions = new ArrayList<RDSRegion>();
        for (int i = 0;
             i < context.lengthValue("DescribeRegionsTestResponse.Regions.Length"); i++) {
            RDSRegion rDSRegion = new RDSRegion();
            rDSRegion.setRegionId(
                    context.stringValue("DescribeRegionsTestResponse.Regions[" + i + "].RegionId"));
            rDSRegion.setZoneId(
                    context.stringValue("DescribeRegionsTestResponse.Regions[" + i + "].ZoneId"));

            regions.add(rDSRegion);
        }
        describeRegionsTestResponse.setRegions(regions);

        return describeRegionsTestResponse;
    }
}
