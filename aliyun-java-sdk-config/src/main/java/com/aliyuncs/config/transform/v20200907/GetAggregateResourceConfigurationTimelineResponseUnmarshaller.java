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

import com.aliyuncs.config.model.v20200907.GetAggregateResourceConfigurationTimelineResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateResourceConfigurationTimelineResponseUnmarshaller {

	public static GetAggregateResourceConfigurationTimelineResponse unmarshall(GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimelineResponse, UnmarshallerContext _ctx) {
		
		getAggregateResourceConfigurationTimelineResponse.setRequestId(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.RequestId"));

		ResourceConfigurationTimeline resourceConfigurationTimeline = new ResourceConfigurationTimeline();
		resourceConfigurationTimeline.setNextToken(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.NextToken"));
		resourceConfigurationTimeline.setMaxResults(_ctx.integerValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.MaxResults"));

		List<ConfigurationListItem> configurationList = new ArrayList<ConfigurationListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList.Length"); i++) {
			ConfigurationListItem configurationListItem = new ConfigurationListItem();
			configurationListItem.setRelationship(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Relationship"));
			configurationListItem.setTags(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Tags"));
			configurationListItem.setAccountId(_ctx.longValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].AccountId"));
			configurationListItem.setResourceEventType(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceEventType"));
			configurationListItem.setRelationshipDiff(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].RelationshipDiff"));
			configurationListItem.setAvailabilityZone(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].AvailabilityZone"));
			configurationListItem.setResourceType(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceType"));
			configurationListItem.setResourceCreateTime(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceCreateTime"));
			configurationListItem.setRegion(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].Region"));
			configurationListItem.setCaptureTime(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].CaptureTime"));
			configurationListItem.setConfigurationDiff(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ConfigurationDiff"));
			configurationListItem.setResourceId(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceId"));
			configurationListItem.setResourceName(_ctx.stringValue("GetAggregateResourceConfigurationTimelineResponse.ResourceConfigurationTimeline.ConfigurationList["+ i +"].ResourceName"));

			configurationList.add(configurationListItem);
		}
		resourceConfigurationTimeline.setConfigurationList(configurationList);
		getAggregateResourceConfigurationTimelineResponse.setResourceConfigurationTimeline(resourceConfigurationTimeline);
	 
	 	return getAggregateResourceConfigurationTimelineResponse;
	}
}