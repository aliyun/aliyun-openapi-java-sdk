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

import com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesResponse.Link;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClassicLinkInstancesResponseUnmarshaller {

	public static DescribeClassicLinkInstancesResponse unmarshall(DescribeClassicLinkInstancesResponse describeClassicLinkInstancesResponse, UnmarshallerContext _ctx) {
		
		describeClassicLinkInstancesResponse.setRequestId(_ctx.stringValue("DescribeClassicLinkInstancesResponse.RequestId"));
		describeClassicLinkInstancesResponse.setTotalCount(_ctx.integerValue("DescribeClassicLinkInstancesResponse.TotalCount"));
		describeClassicLinkInstancesResponse.setPageNumber(_ctx.integerValue("DescribeClassicLinkInstancesResponse.PageNumber"));
		describeClassicLinkInstancesResponse.setPageSize(_ctx.integerValue("DescribeClassicLinkInstancesResponse.PageSize"));

		List<Link> links = new ArrayList<Link>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClassicLinkInstancesResponse.Links.Length"); i++) {
			Link link = new Link();
			link.setInstanceId(_ctx.stringValue("DescribeClassicLinkInstancesResponse.Links["+ i +"].InstanceId"));
			link.setVpcId(_ctx.stringValue("DescribeClassicLinkInstancesResponse.Links["+ i +"].VpcId"));

			links.add(link);
		}
		describeClassicLinkInstancesResponse.setLinks(links);
	 
	 	return describeClassicLinkInstancesResponse;
	}
}