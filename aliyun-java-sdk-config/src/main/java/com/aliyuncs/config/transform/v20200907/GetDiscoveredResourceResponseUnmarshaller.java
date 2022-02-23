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

import com.aliyuncs.config.model.v20200907.GetDiscoveredResourceResponse;
import com.aliyuncs.config.model.v20200907.GetDiscoveredResourceResponse.DiscoveredResourceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiscoveredResourceResponseUnmarshaller {

	public static GetDiscoveredResourceResponse unmarshall(GetDiscoveredResourceResponse getDiscoveredResourceResponse, UnmarshallerContext _ctx) {
		
		getDiscoveredResourceResponse.setRequestId(_ctx.stringValue("GetDiscoveredResourceResponse.RequestId"));

		DiscoveredResourceDetail discoveredResourceDetail = new DiscoveredResourceDetail();
		discoveredResourceDetail.setAvailabilityZone(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.AvailabilityZone"));
		discoveredResourceDetail.setResourceType(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceType"));
		discoveredResourceDetail.setConfiguration(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.Configuration"));
		discoveredResourceDetail.setRegion(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.Region"));
		discoveredResourceDetail.setResourceCreationTime(_ctx.longValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceCreationTime"));
		discoveredResourceDetail.setTags(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.Tags"));
		discoveredResourceDetail.setAccountId(_ctx.longValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.AccountId"));
		discoveredResourceDetail.setResourceId(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceId"));
		discoveredResourceDetail.setResourceDeleted(_ctx.integerValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceDeleted"));
		discoveredResourceDetail.setResourceName(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceName"));
		discoveredResourceDetail.setResourceStatus(_ctx.stringValue("GetDiscoveredResourceResponse.DiscoveredResourceDetail.ResourceStatus"));
		getDiscoveredResourceResponse.setDiscoveredResourceDetail(discoveredResourceDetail);
	 
	 	return getDiscoveredResourceResponse;
	}
}