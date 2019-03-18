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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse.TrafficControl;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse.TrafficControl.SpecialPolicy;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse.TrafficControl.SpecialPolicy.Special;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeTrafficControlsResponseUnmarshaller {

	public static DescribeTrafficControlsResponse unmarshall(DescribeTrafficControlsResponse describeTrafficControlsResponse, UnmarshallerContext context) {
		
		describeTrafficControlsResponse.setRequestId(context.stringValue("DescribeTrafficControlsResponse.RequestId"));
		describeTrafficControlsResponse.setTotalCount(context.integerValue("DescribeTrafficControlsResponse.TotalCount"));
		describeTrafficControlsResponse.setPageSize(context.integerValue("DescribeTrafficControlsResponse.PageSize"));
		describeTrafficControlsResponse.setPageNumber(context.integerValue("DescribeTrafficControlsResponse.PageNumber"));

		List<TrafficControl> trafficControls = new ArrayList<TrafficControl>();
		for (int i = 0; i < context.lengthValue("DescribeTrafficControlsResponse.TrafficControls.Length"); i++) {
			TrafficControl trafficControl = new TrafficControl();
			trafficControl.setTrafficControlId(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].TrafficControlId"));
			trafficControl.setTrafficControlName(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].TrafficControlName"));
			trafficControl.setDescription(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].Description"));
			trafficControl.setTrafficControlUnit(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].TrafficControlUnit"));
			trafficControl.setApiDefault(context.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].ApiDefault"));
			trafficControl.setUserDefault(context.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].UserDefault"));
			trafficControl.setAppDefault(context.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].AppDefault"));
			trafficControl.setCreatedTime(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].CreatedTime"));
			trafficControl.setModifiedTime(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].ModifiedTime"));

			List<SpecialPolicy> specialPolicies = new ArrayList<SpecialPolicy>();
			for (int j = 0; j < context.lengthValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies.Length"); j++) {
				SpecialPolicy specialPolicy = new SpecialPolicy();
				specialPolicy.setSpecialType(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].SpecialType"));

				List<Special> specials = new ArrayList<Special>();
				for (int k = 0; k < context.lengthValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].Specials.Length"); k++) {
					Special special = new Special();
					special.setSpecialKey(context.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].Specials["+ k +"].SpecialKey"));
					special.setTrafficValue(context.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].Specials["+ k +"].TrafficValue"));

					specials.add(special);
				}
				specialPolicy.setSpecials(specials);

				specialPolicies.add(specialPolicy);
			}
			trafficControl.setSpecialPolicies(specialPolicies);

			trafficControls.add(trafficControl);
		}
		describeTrafficControlsResponse.setTrafficControls(trafficControls);
	 
	 	return describeTrafficControlsResponse;
	}
}