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

package com.aliyuncs.config.transform.v20190108;

import com.aliyuncs.config.model.v20190108.DescribeDiscoveredResourceResponse;
import com.aliyuncs.config.model.v20190108.DescribeDiscoveredResourceResponse.DiscoveredResourceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiscoveredResourceResponseUnmarshaller {

	public static DescribeDiscoveredResourceResponse unmarshall(DescribeDiscoveredResourceResponse describeDiscoveredResourceResponse, UnmarshallerContext _ctx) {
		
		describeDiscoveredResourceResponse.setRequestId(_ctx.stringValue("DescribeDiscoveredResourceResponse.RequestId"));

		DiscoveredResourceDetail discoveredResourceDetail = new DiscoveredResourceDetail();
		discoveredResourceDetail.setAccountId(_ctx.longValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.AccountId"));
		discoveredResourceDetail.setResourceId(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceId"));
		discoveredResourceDetail.setResourceType(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceType"));
		discoveredResourceDetail.setResourceName(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceName"));
		discoveredResourceDetail.setRegion(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.Region"));
		discoveredResourceDetail.setAvailabilityZone(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.AvailabilityZone"));
		discoveredResourceDetail.setResourceCreationTime(_ctx.longValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceCreationTime"));
		discoveredResourceDetail.setResourceStatus(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceStatus"));
		discoveredResourceDetail.setResourceDeleted(_ctx.integerValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceDeleted"));
		discoveredResourceDetail.setTags(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.Tags"));
		discoveredResourceDetail.setConfiguration(_ctx.stringValue("DescribeDiscoveredResourceResponse.DiscoveredResourceDetail.Configuration"));
		describeDiscoveredResourceResponse.setDiscoveredResourceDetail(discoveredResourceDetail);
	 
	 	return describeDiscoveredResourceResponse;
	}
}