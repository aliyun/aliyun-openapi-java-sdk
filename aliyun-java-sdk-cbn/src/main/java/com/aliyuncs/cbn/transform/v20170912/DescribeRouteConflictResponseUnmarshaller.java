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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeRouteConflictResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeRouteConflictResponse.RouteConflict;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteConflictResponseUnmarshaller {

	public static DescribeRouteConflictResponse unmarshall(DescribeRouteConflictResponse describeRouteConflictResponse, UnmarshallerContext context) {
		
		describeRouteConflictResponse.setRequestId(context.stringValue("DescribeRouteConflictResponse.RequestId"));
		describeRouteConflictResponse.setPageNumber(context.integerValue("DescribeRouteConflictResponse.PageNumber"));
		describeRouteConflictResponse.setTotalCount(context.integerValue("DescribeRouteConflictResponse.TotalCount"));
		describeRouteConflictResponse.setPageSize(context.integerValue("DescribeRouteConflictResponse.PageSize"));

		List<RouteConflict> routeConflicts = new ArrayList<RouteConflict>();
		for (int i = 0; i < context.lengthValue("DescribeRouteConflictResponse.RouteConflicts.Length"); i++) {
			RouteConflict routeConflict = new RouteConflict();
			routeConflict.setDestinationCidrBlock(context.stringValue("DescribeRouteConflictResponse.RouteConflicts["+ i +"].DestinationCidrBlock"));
			routeConflict.setRegionId(context.stringValue("DescribeRouteConflictResponse.RouteConflicts["+ i +"].RegionId"));
			routeConflict.setInstanceId(context.stringValue("DescribeRouteConflictResponse.RouteConflicts["+ i +"].InstanceId"));
			routeConflict.setInstanceType(context.stringValue("DescribeRouteConflictResponse.RouteConflicts["+ i +"].InstanceType"));
			routeConflict.setStatus(context.stringValue("DescribeRouteConflictResponse.RouteConflicts["+ i +"].Status"));

			routeConflicts.add(routeConflict);
		}
		describeRouteConflictResponse.setRouteConflicts(routeConflicts);
	 
	 	return describeRouteConflictResponse;
	}
}