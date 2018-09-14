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

import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstancesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstancesResponse.ChildInstance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenAttachedChildInstancesResponseUnmarshaller {

	public static DescribeCenAttachedChildInstancesResponse unmarshall(DescribeCenAttachedChildInstancesResponse describeCenAttachedChildInstancesResponse, UnmarshallerContext context) {
		
		describeCenAttachedChildInstancesResponse.setRequestId(context.stringValue("DescribeCenAttachedChildInstancesResponse.RequestId"));
		describeCenAttachedChildInstancesResponse.setTotalCount(context.integerValue("DescribeCenAttachedChildInstancesResponse.TotalCount"));
		describeCenAttachedChildInstancesResponse.setPageNumber(context.integerValue("DescribeCenAttachedChildInstancesResponse.PageNumber"));
		describeCenAttachedChildInstancesResponse.setPageSize(context.integerValue("DescribeCenAttachedChildInstancesResponse.PageSize"));

		List<ChildInstance> childInstances = new ArrayList<ChildInstance>();
		for (int i = 0; i < context.lengthValue("DescribeCenAttachedChildInstancesResponse.ChildInstances.Length"); i++) {
			ChildInstance childInstance = new ChildInstance();
			childInstance.setCenId(context.stringValue("DescribeCenAttachedChildInstancesResponse.ChildInstances["+ i +"].CenId"));
			childInstance.setChildInstanceId(context.stringValue("DescribeCenAttachedChildInstancesResponse.ChildInstances["+ i +"].ChildInstanceId"));
			childInstance.setChildInstanceType(context.stringValue("DescribeCenAttachedChildInstancesResponse.ChildInstances["+ i +"].ChildInstanceType"));
			childInstance.setChildInstanceRegionId(context.stringValue("DescribeCenAttachedChildInstancesResponse.ChildInstances["+ i +"].ChildInstanceRegionId"));
			childInstance.setChildInstanceOwnerId(context.longValue("DescribeCenAttachedChildInstancesResponse.ChildInstances["+ i +"].ChildInstanceOwnerId"));
			childInstance.setStatus(context.stringValue("DescribeCenAttachedChildInstancesResponse.ChildInstances["+ i +"].Status"));

			childInstances.add(childInstance);
		}
		describeCenAttachedChildInstancesResponse.setChildInstances(childInstances);
	 
	 	return describeCenAttachedChildInstancesResponse;
	}
}