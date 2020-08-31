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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.GetResourceComplianceTimelineResponse;
import com.aliyuncs.config.model.v20190108.GetResourceComplianceTimelineResponse.ResourceComplianceTimeline;
import com.aliyuncs.config.model.v20190108.GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceComplianceTimelineResponseUnmarshaller {

	public static GetResourceComplianceTimelineResponse unmarshall(GetResourceComplianceTimelineResponse getResourceComplianceTimelineResponse, UnmarshallerContext _ctx) {
		
		getResourceComplianceTimelineResponse.setRequestId(_ctx.stringValue("GetResourceComplianceTimelineResponse.RequestId"));

		ResourceComplianceTimeline resourceComplianceTimeline = new ResourceComplianceTimeline();
		resourceComplianceTimeline.setLimit(_ctx.integerValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.Limit"));
		resourceComplianceTimeline.setTotalCount(_ctx.longValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.TotalCount"));
		resourceComplianceTimeline.setNextToken(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.NextToken"));

		List<ComplianceListItem> complianceList = new ArrayList<ComplianceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList.Length"); i++) {
			ComplianceListItem complianceListItem = new ComplianceListItem();
			complianceListItem.setAccountId(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].AccountId"));
			complianceListItem.setAvailabilityZone(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].AvailabilityZone"));
			complianceListItem.setCaptureTime(_ctx.longValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].CaptureTime"));
			complianceListItem.setConfiguration(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].Configuration"));
			complianceListItem.setConfigurationDiff(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].ConfigurationDiff"));
			complianceListItem.setRegion(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].Region"));
			complianceListItem.setResourceCreateTime(_ctx.longValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].ResourceCreateTime"));
			complianceListItem.setResourceId(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].ResourceId"));
			complianceListItem.setResourceName(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].ResourceName"));
			complianceListItem.setResourceStatus(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].ResourceStatus"));
			complianceListItem.setResourceType(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].ResourceType"));
			complianceListItem.setTags(_ctx.stringValue("GetResourceComplianceTimelineResponse.ResourceComplianceTimeline.ComplianceList["+ i +"].Tags"));

			complianceList.add(complianceListItem);
		}
		resourceComplianceTimeline.setComplianceList(complianceList);
		getResourceComplianceTimelineResponse.setResourceComplianceTimeline(resourceComplianceTimeline);
	 
	 	return getResourceComplianceTimelineResponse;
	}
}