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

	public static DescribeMonitorGroupInstancesResponse unmarshall(DescribeMonitorGroupInstancesResponse describeMonitorGroupInstancesResponse, UnmarshallerContext _ctx) {
		
		describeMonitorGroupInstancesResponse.setRequestId(_ctx.stringValue("DescribeMonitorGroupInstancesResponse.RequestId"));
		describeMonitorGroupInstancesResponse.setSuccess(_ctx.booleanValue("DescribeMonitorGroupInstancesResponse.Success"));
		describeMonitorGroupInstancesResponse.setCode(_ctx.integerValue("DescribeMonitorGroupInstancesResponse.Code"));
		describeMonitorGroupInstancesResponse.setMessage(_ctx.stringValue("DescribeMonitorGroupInstancesResponse.Message"));
		describeMonitorGroupInstancesResponse.setPageNumber(_ctx.integerValue("DescribeMonitorGroupInstancesResponse.PageNumber"));
		describeMonitorGroupInstancesResponse.setPageSize(_ctx.integerValue("DescribeMonitorGroupInstancesResponse.PageSize"));
		describeMonitorGroupInstancesResponse.setTotal(_ctx.integerValue("DescribeMonitorGroupInstancesResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitorGroupInstancesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setId(_ctx.longValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].Id"));
			resource.setRegionId(_ctx.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].RegionId"));
			resource.setInstanceId(_ctx.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].InstanceId"));
			resource.setCategory(_ctx.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].Category"));
			resource.setInstanceName(_ctx.stringValue("DescribeMonitorGroupInstancesResponse.Resources["+ i +"].InstanceName"));

			resources.add(resource);
		}
		describeMonitorGroupInstancesResponse.setResources(resources);
	 
	 	return describeMonitorGroupInstancesResponse;
	}
}