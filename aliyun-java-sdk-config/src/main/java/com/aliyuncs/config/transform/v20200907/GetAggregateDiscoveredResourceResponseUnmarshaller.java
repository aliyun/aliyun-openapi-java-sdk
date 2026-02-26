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

package com.aliyuncs.config.transform.v20200907;

import com.aliyuncs.config.model.v20200907.GetAggregateDiscoveredResourceResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateDiscoveredResourceResponseUnmarshaller {

	public static GetAggregateDiscoveredResourceResponse unmarshall(GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResourceResponse, UnmarshallerContext _ctx) {
		
		getAggregateDiscoveredResourceResponse.setRequestId(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.RequestId"));

		DiscoveredResourceDetail discoveredResourceDetail = new DiscoveredResourceDetail();
		discoveredResourceDetail.setAvailabilityZone(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.AvailabilityZone"));
		discoveredResourceDetail.setResourceType(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceType"));
		discoveredResourceDetail.setConfiguration(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.Configuration"));
		discoveredResourceDetail.setRegion(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.Region"));
		discoveredResourceDetail.setResourceCreationTime(_ctx.longValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceCreationTime"));
		discoveredResourceDetail.setTags(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.Tags"));
		discoveredResourceDetail.setAccountId(_ctx.longValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.AccountId"));
		discoveredResourceDetail.setResourceId(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceId"));
		discoveredResourceDetail.setResourceDeleted(_ctx.integerValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceDeleted"));
		discoveredResourceDetail.setResourceName(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceName"));
		discoveredResourceDetail.setResourceStatus(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceStatus"));
		discoveredResourceDetail.setVersion(_ctx.longValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.Version"));
		discoveredResourceDetail.setComplianceType(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.ComplianceType"));
		discoveredResourceDetail.setVpcId(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.VpcId"));
		discoveredResourceDetail.setVSwitchId(_ctx.stringValue("GetAggregateDiscoveredResourceResponse.DiscoveredResourceDetail.VSwitchId"));
		getAggregateDiscoveredResourceResponse.setDiscoveredResourceDetail(discoveredResourceDetail);
	 
	 	return getAggregateDiscoveredResourceResponse;
	}
}