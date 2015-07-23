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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse.VRouter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVRoutersResponseUnmarshaller {

	public static DescribeVRoutersResponse unmarshall(DescribeVRoutersResponse describeVRoutersResponse, UnmarshallerContext context) {
		
		describeVRoutersResponse.setRequestId(context.stringValue("DescribeVRoutersResponse.RequestId"));
		describeVRoutersResponse.setTotalCount(context.integerValue("DescribeVRoutersResponse.TotalCount"));
		describeVRoutersResponse.setPageNumber(context.integerValue("DescribeVRoutersResponse.PageNumber"));
		describeVRoutersResponse.setPageSize(context.integerValue("DescribeVRoutersResponse.PageSize"));

		List<VRouter> vRouters = new ArrayList<VRouter>();
		for (int i = 0; i < context.lengthValue("DescribeVRoutersResponse.VRouters.Length"); i++) {
			VRouter  vRouter = new VRouter();
			vRouter.setRegionId(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].RegionId"));
			vRouter.setVpcId(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].VpcId"));
			vRouter.setVRouterName(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].VRouterName"));
			vRouter.setDescription(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].Description"));
			vRouter.setVRouterId(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].VRouterId"));
			vRouter.setCreationTime(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].CreationTime"));

			List<String> routeTableIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeVRoutersResponse.VRouters["+ i +"].RouteTableIds.Length"); j++) {
				routeTableIds.add(context.stringValue("DescribeVRoutersResponse.VRouters["+ i +"].RouteTableIds["+ j +"]"));
			}
			vRouter.setRouteTableIds(routeTableIds);

			vRouters.add(vRouter);
		}
		describeVRoutersResponse.setVRouters(vRouters);
	 
	 	return describeVRoutersResponse;
	}
}