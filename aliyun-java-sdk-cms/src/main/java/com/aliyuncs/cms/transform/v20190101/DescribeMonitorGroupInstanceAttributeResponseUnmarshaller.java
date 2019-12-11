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

import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstanceAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstanceAttributeResponse.Resource;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstanceAttributeResponse.Resource.Region;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstanceAttributeResponse.Resource.Tag;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupInstanceAttributeResponse.Resource.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupInstanceAttributeResponseUnmarshaller {

	public static DescribeMonitorGroupInstanceAttributeResponse unmarshall(DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeMonitorGroupInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.RequestId"));
		describeMonitorGroupInstanceAttributeResponse.setSuccess(_ctx.booleanValue("DescribeMonitorGroupInstanceAttributeResponse.Success"));
		describeMonitorGroupInstanceAttributeResponse.setCode(_ctx.integerValue("DescribeMonitorGroupInstanceAttributeResponse.Code"));
		describeMonitorGroupInstanceAttributeResponse.setMessage(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Message"));
		describeMonitorGroupInstanceAttributeResponse.setPageNumber(_ctx.integerValue("DescribeMonitorGroupInstanceAttributeResponse.PageNumber"));
		describeMonitorGroupInstanceAttributeResponse.setPageSize(_ctx.integerValue("DescribeMonitorGroupInstanceAttributeResponse.PageSize"));
		describeMonitorGroupInstanceAttributeResponse.setTotal(_ctx.integerValue("DescribeMonitorGroupInstanceAttributeResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitorGroupInstanceAttributeResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setInstanceName(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].InstanceName"));
			resource.setInstanceId(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].InstanceId"));
			resource.setDesc(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Desc"));
			resource.setNetworkType(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].NetworkType"));
			resource.setCategory(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Category"));
			resource.setDimension(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Dimension"));

			Region region = new Region();
			region.setRegionId(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Region.RegionId"));
			region.setAvailabilityZone(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Region.AvailabilityZone"));
			resource.setRegion(region);

			Vpc vpc = new Vpc();
			vpc.setVpcInstanceId(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Vpc.VpcInstanceId"));
			vpc.setVswitchInstanceId(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Vpc.VswitchInstanceId"));
			resource.setVpc(vpc);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeMonitorGroupInstanceAttributeResponse.Resources["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			resource.setTags(tags);

			resources.add(resource);
		}
		describeMonitorGroupInstanceAttributeResponse.setResources(resources);
	 
	 	return describeMonitorGroupInstanceAttributeResponse;
	}
}