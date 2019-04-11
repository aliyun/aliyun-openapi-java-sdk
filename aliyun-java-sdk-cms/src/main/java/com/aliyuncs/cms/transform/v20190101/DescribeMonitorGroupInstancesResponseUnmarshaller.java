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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstancesResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstancesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupInstancesResponseUnmarshaller {

	public static DescribeMonitorGroupInstancesResponse unmarshall(DescribeMonitorGroupInstancesResponse describeMonitorGroupInstancesResponse, UnmarshallerContext context) {
		
		describeMonitorGroupInstancesResponse.setRequestId(context.stringValue("DescribeMonitorGroupInstancesResponse.RequestId"));
		describeMonitorGroupInstancesResponse.setSuccess(context.booleanValue("DescribeMonitorGroupInstancesResponse.Success"));
		describeMonitorGroupInstancesResponse.setCode(context.integerValue("DescribeMonitorGroupInstancesResponse.Code"));
		describeMonitorGroupInstancesResponse.setMessage(context.stringValue("DescribeMonitorGroupInstancesResponse.Message"));
		describeMonitorGroupInstancesResponse.setPageNumber(context.integerValue("DescribeMonitorGroupInstancesResponse.PageNumber"));
		describeMonitorGroupInstancesResponse.setPageSize(context.integerValue("DescribeMonitorGroupInstancesResponse.PageSize"));
		describeMonitorGroupInstancesResponse.setTotal(context.integerValue("DescribeMonitorGroupInstancesResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorGroupInstancesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setId(context.longValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].Id"));
			resource.setRegionId(context.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].RegionId"));
			resource.setInstanceId(context.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].InstanceId"));
			resource.setCategory(context.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].Category"));
			resource.setInstanceName(context.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].InstanceName"));

			resources.add(resource);
		}
		describeMonitorGroupInstancesResponse.setResources(resources);
	 
	 	return describeMonitorGroupInstancesResponse;
	}
}