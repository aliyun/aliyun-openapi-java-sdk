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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetResourceConfigurationTimelineResponse;
import com.aliyuncs.config.model.v20200907.GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline;
import com.aliyuncs.config.model.v20200907.GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceConfigurationTimelineResponseUnmarshaller {

	public static GetResourceConfigurationTimelineResponse unmarshall(GetResourceConfigurationTimelineResponse getResourceConfigurationTimelineResponse, UnmarshallerContext _ctx) {
		
		getResourceConfigurationTimelineResponse.setRequestId(_ctx.stringValue("GetResourceConfigurationTimelineResponse.RequestId"));

		ResourceConfigurationTimeline resourceConfigurationTimeline = new ResourceConfigurationTimeline();
		resourceConfigurationTimeline.setNextToken(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.NextToken"));
		resourceConfigurationTimeline.setMaxResults(_ctx.integerValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.MaxResults"));

		List<ConfigurationListItem> configurationList = new ArrayList<ConfigurationListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList.Length"); i++) {
			ConfigurationListItem configurationListItem = new ConfigurationListItem();
			configurationListItem.setTags(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Tags"));
			configurationListItem.setAccountId(_ctx.longValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].AccountId"));
			configurationListItem.setResourceEventType(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceEventType"));
			configurationListItem.setAvailabilityZone(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].AvailabilityZone"));
			configurationListItem.setResourceType(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceType"));
			configurationListItem.setResourceCreateTime(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceCreateTime"));
			configurationListItem.setRegion(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Region"));
			configurationListItem.setCaptureTime(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].CaptureTime"));
			configurationListItem.setConfigurationDiff(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ConfigurationDiff"));
			configurationListItem.setResourceId(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceId"));
			configurationListItem.setResourceName(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceName"));
			configurationListItem.setRelationship(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Relationship"));
			configurationListItem.setRelationshipDiff(_ctx.stringValue("GetResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].RelationshipDiff"));

			configurationList.add(configurationListItem);
		}
		resourceConfigurationTimeline.setConfigurationList(configurationList);
		getResourceConfigurationTimelineResponse.setResourceConfigurationTimeline(resourceConfigurationTimeline);
	 
	 	return getResourceConfigurationTimelineResponse;
	}
}