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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeContainerResourceResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeContainerResourceResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerResourceResponseUnmarshaller {

	public static DescribeContainerResourceResponse unmarshall(DescribeContainerResourceResponse describeContainerResourceResponse, UnmarshallerContext _ctx) {
		
		describeContainerResourceResponse.setRequestId(_ctx.stringValue("DescribeContainerResourceResponse.RequestId"));
		describeContainerResourceResponse.setSuccess(_ctx.booleanValue("DescribeContainerResourceResponse.Success"));
		describeContainerResourceResponse.setCode(_ctx.stringValue("DescribeContainerResourceResponse.Code"));
		describeContainerResourceResponse.setMessage(_ctx.stringValue("DescribeContainerResourceResponse.Message"));
		describeContainerResourceResponse.setPageSize(_ctx.integerValue("DescribeContainerResourceResponse.PageSize"));
		describeContainerResourceResponse.setPageNumber(_ctx.integerValue("DescribeContainerResourceResponse.PageNumber"));
		describeContainerResourceResponse.setTotalCount(_ctx.longValue("DescribeContainerResourceResponse.TotalCount"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContainerResourceResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceInfo(_ctx.stringValue("DescribeContainerResourceResponse.Resources["+ i +"].ResourceInfo"));
			resource.setClusterIdentifier(_ctx.stringValue("DescribeContainerResourceResponse.Resources["+ i +"].ClusterIdentifier"));
			resource.setResourceType(_ctx.stringValue("DescribeContainerResourceResponse.Resources["+ i +"].ResourceType"));
			resource.setResourceId(_ctx.stringValue("DescribeContainerResourceResponse.Resources["+ i +"].ResourceId"));
			resource.setClusterId(_ctx.stringValue("DescribeContainerResourceResponse.Resources["+ i +"].ClusterId"));

			resources.add(resource);
		}
		describeContainerResourceResponse.setResources(resources);
	 
	 	return describeContainerResourceResponse;
	}
}