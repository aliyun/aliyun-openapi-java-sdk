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

import com.aliyuncs.config.model.v20190108.GetResourceConfigurationTimelineResponse;
import com.aliyuncs.config.model.v20190108.GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline;
import com.aliyuncs.config.model.v20190108.GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceConfigurationTimelineResponseUnmarshaller {

	public static GetResourceConfigurationTimelineResponse unmarshall(GetResourceConfigurationTimelineResponse getResourceConfigurationTimelineResponse, UnmarshallerContext _ctx) {
		
		getResourceConfigurationTimelineResponse.setRequestId(_ctx.stringValue("GetResourceConfigurationTimelineResponse.RequestId"));

		ResourceConfigurationTimeline resourceConfigurationTimeline = new ResourceConfigurationTimeline();
		resourceConfigurationTimeline.setNextToken(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.NextToken"));
		resourceConfigurationTimeline.setLimit(_ctx.integerValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.Limit"));
		resourceConfigurationTimeline.setTotalCount(_ctx.longValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.TotalCount"));

		List<ConfigurationListItem> configurationList = new ArrayList<ConfigurationListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList.Length"); i++) {
			ConfigurationListItem configurationListItem = new ConfigurationListItem();
			configurationListItem.setAccountId(_ctx.longValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].AccountId"));
			configurationListItem.setAvailabilityZone(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].AvailabilityZone"));
			configurationListItem.setCaptureTime(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].CaptureTime"));
			configurationListItem.setConfigurationDiff(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ConfigurationDiff"));
			configurationListItem.setRegion(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Region"));
			configurationListItem.setRelationship(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Relationship"));
			configurationListItem.setRelationshipDiff(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].RelationshipDiff"));
			configurationListItem.setResourceCreateTime(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceCreateTime"));
			configurationListItem.setResourceId(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceId"));
			configurationListItem.setResourceName(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceName"));
			configurationListItem.setResourceType(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceType"));
			configurationListItem.setTags(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Tags"));

			configurationList.add(configurationListItem);
		}
		resourceConfigurationTimeline.setConfigurationList(configurationList);
		getResourceConfigurationTimelineResponse.setResourceConfigurationTimeline(resourceConfigurationTimeline);
	 
	 	return getResourceConfigurationTimelineResponse;
	}
}