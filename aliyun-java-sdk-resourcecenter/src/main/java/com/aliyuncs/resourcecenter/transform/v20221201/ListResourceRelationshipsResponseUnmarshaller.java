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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ListResourceRelationshipsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListResourceRelationshipsResponse.ResourceRelationship;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceRelationshipsResponseUnmarshaller {

	public static ListResourceRelationshipsResponse unmarshall(ListResourceRelationshipsResponse listResourceRelationshipsResponse, UnmarshallerContext _ctx) {
		
		listResourceRelationshipsResponse.setRequestId(_ctx.stringValue("ListResourceRelationshipsResponse.RequestId"));
		listResourceRelationshipsResponse.setMaxResults(_ctx.integerValue("ListResourceRelationshipsResponse.MaxResults"));
		listResourceRelationshipsResponse.setNextToken(_ctx.stringValue("ListResourceRelationshipsResponse.NextToken"));

		List<ResourceRelationship> resourceRelationships = new ArrayList<ResourceRelationship>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceRelationshipsResponse.ResourceRelationships.Length"); i++) {
			ResourceRelationship resourceRelationship = new ResourceRelationship();
			resourceRelationship.setRegionId(_ctx.stringValue("ListResourceRelationshipsResponse.ResourceRelationships["+ i +"].RegionId"));
			resourceRelationship.setResourceType(_ctx.stringValue("ListResourceRelationshipsResponse.ResourceRelationships["+ i +"].ResourceType"));
			resourceRelationship.setResourceId(_ctx.stringValue("ListResourceRelationshipsResponse.ResourceRelationships["+ i +"].ResourceId"));
			resourceRelationship.setRelatedResourceRegionId(_ctx.stringValue("ListResourceRelationshipsResponse.ResourceRelationships["+ i +"].RelatedResourceRegionId"));
			resourceRelationship.setRelatedResourceType(_ctx.stringValue("ListResourceRelationshipsResponse.ResourceRelationships["+ i +"].RelatedResourceType"));
			resourceRelationship.setRelatedResourceId(_ctx.stringValue("ListResourceRelationshipsResponse.ResourceRelationships["+ i +"].RelatedResourceId"));

			resourceRelationships.add(resourceRelationship);
		}
		listResourceRelationshipsResponse.setResourceRelationships(resourceRelationships);
	 
	 	return listResourceRelationshipsResponse;
	}
}