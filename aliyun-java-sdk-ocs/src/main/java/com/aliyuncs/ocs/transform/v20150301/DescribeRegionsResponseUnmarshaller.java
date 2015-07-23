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
package com.aliyuncs.ocs.transform.v20150301;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ocs.model.v20150301.DescribeRegionsResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeRegionsResponse.GetDescribeRegionsResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeRegionsResponse.GetDescribeRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));

		GetDescribeRegionsResponse  getDescribeRegionsResponse = new GetDescribeRegionsResponse();
		getDescribeRegionsResponse.setTotal(context.integerValue("DescribeRegionsResponse.GetDescribeRegionsResponse.Total"));
		getDescribeRegionsResponse.setPageNo(context.integerValue("DescribeRegionsResponse.GetDescribeRegionsResponse.PageNo"));
		getDescribeRegionsResponse.setPageSize(context.integerValue("DescribeRegionsResponse.GetDescribeRegionsResponse.PageSize"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.GetDescribeRegionsResponse.Regions.Length"); i++) {
			Region  region = new Region();
			region.setRegionId(context.stringValue("DescribeRegionsResponse.GetDescribeRegionsResponse.Regions["+ i +"].RegionId"));
			region.setIzNumber(context.stringValue("DescribeRegionsResponse.GetDescribeRegionsResponse.Regions["+ i +"].IzNumber"));
			region.setLocalName(context.stringValue("DescribeRegionsResponse.GetDescribeRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(region);
		}
		getDescribeRegionsResponse.setRegions(regions);
		describeRegionsResponse.setGetDescribeRegionsResponse(getDescribeRegionsResponse);
	 
	 	return describeRegionsResponse;
	}
}