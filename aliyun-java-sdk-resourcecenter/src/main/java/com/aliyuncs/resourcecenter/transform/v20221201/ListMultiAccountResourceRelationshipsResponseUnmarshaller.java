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

import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountResourceRelationshipsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountResourceRelationshipsResponse.ResourceRelationship;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiAccountResourceRelationshipsResponseUnmarshaller {

	public static ListMultiAccountResourceRelationshipsResponse unmarshall(ListMultiAccountResourceRelationshipsResponse listMultiAccountResourceRelationshipsResponse, UnmarshallerContext _ctx) {
		
		listMultiAccountResourceRelationshipsResponse.setRequestId(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.RequestId"));
		listMultiAccountResourceRelationshipsResponse.setMaxResults(_ctx.integerValue("ListMultiAccountResourceRelationshipsResponse.MaxResults"));
		listMultiAccountResourceRelationshipsResponse.setNextToken(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.NextToken"));
		listMultiAccountResourceRelationshipsResponse.setScope(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.Scope"));

		List<ResourceRelationship> resourceRelationships = new ArrayList<ResourceRelationship>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships.Length"); i++) {
			ResourceRelationship resourceRelationship = new ResourceRelationship();
			resourceRelationship.setAccountId(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].AccountId"));
			resourceRelationship.setRegionId(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].RegionId"));
			resourceRelationship.setResourceType(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].ResourceType"));
			resourceRelationship.setResourceId(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].ResourceId"));
			resourceRelationship.setRelatedResourceRegionId(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].RelatedResourceRegionId"));
			resourceRelationship.setRelatedResourceType(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].RelatedResourceType"));
			resourceRelationship.setRelatedResourceId(_ctx.stringValue("ListMultiAccountResourceRelationshipsResponse.ResourceRelationships["+ i +"].RelatedResourceId"));

			resourceRelationships.add(resourceRelationship);
		}
		listMultiAccountResourceRelationshipsResponse.setResourceRelationships(resourceRelationships);
	 
	 	return listMultiAccountResourceRelationshipsResponse;
	}
}