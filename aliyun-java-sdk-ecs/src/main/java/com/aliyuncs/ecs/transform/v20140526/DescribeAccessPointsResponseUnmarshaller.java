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

import com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsResponse.AccessPointType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessPointsResponseUnmarshaller {

	public static DescribeAccessPointsResponse unmarshall(DescribeAccessPointsResponse describeAccessPointsResponse, UnmarshallerContext context) {
		
		describeAccessPointsResponse.setRequestId(context.stringValue("DescribeAccessPointsResponse.RequestId"));
		describeAccessPointsResponse.setPageNumber(context.integerValue("DescribeAccessPointsResponse.PageNumber"));
		describeAccessPointsResponse.setPageSize(context.integerValue("DescribeAccessPointsResponse.PageSize"));
		describeAccessPointsResponse.setTotalCount(context.integerValue("DescribeAccessPointsResponse.TotalCount"));

		List<AccessPointType> accessPointSet = new ArrayList<AccessPointType>();
		for (int i = 0; i < context.lengthValue("DescribeAccessPointsResponse.AccessPointSet.Length"); i++) {
			AccessPointType accessPointType = new AccessPointType();
			accessPointType.setAccessPointId(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AccessPointId"));
			accessPointType.setStatus(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Status"));
			accessPointType.setType(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Type"));
			accessPointType.setAttachedRegionNo(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AttachedRegionNo"));
			accessPointType.setLocation(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Location"));
			accessPointType.setHostOperator(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].HostOperator"));
			accessPointType.setName(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Name"));
			accessPointType.setDescription(context.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Description"));

			accessPointSet.add(accessPointType);
		}
		describeAccessPointsResponse.setAccessPointSet(accessPointSet);
	 
	 	return describeAccessPointsResponse;
	}
}