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

import com.aliyuncs.config.model.v20200907.ListResourceRelationsResponse;
import com.aliyuncs.config.model.v20200907.ListResourceRelationsResponse.ResourceRelations;
import com.aliyuncs.config.model.v20200907.ListResourceRelationsResponse.ResourceRelations.ResourceRelationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceRelationsResponseUnmarshaller {

	public static ListResourceRelationsResponse unmarshall(ListResourceRelationsResponse listResourceRelationsResponse, UnmarshallerContext _ctx) {
		
		listResourceRelationsResponse.setRequestId(_ctx.stringValue("ListResourceRelationsResponse.RequestId"));

		ResourceRelations resourceRelations = new ResourceRelations();
		resourceRelations.setNextToken(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.NextToken"));
		resourceRelations.setMaxResults(_ctx.integerValue("ListResourceRelationsResponse.ResourceRelations.MaxResults"));
		resourceRelations.setTotalCount(_ctx.integerValue("ListResourceRelationsResponse.ResourceRelations.TotalCount"));

		List<ResourceRelationListItem> resourceRelationList = new ArrayList<ResourceRelationListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList.Length"); i++) {
			ResourceRelationListItem resourceRelationListItem = new ResourceRelationListItem();
			resourceRelationListItem.setAccountId(_ctx.longValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].AccountId"));
			resourceRelationListItem.setSourceResourceType(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].SourceResourceType"));
			resourceRelationListItem.setSourceResourceRegionId(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].SourceResourceRegionId"));
			resourceRelationListItem.setSourceResourceId(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].SourceResourceId"));
			resourceRelationListItem.setTargetResourceType(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].TargetResourceType"));
			resourceRelationListItem.setTargetResourceId(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].TargetResourceId"));
			resourceRelationListItem.setRelationType(_ctx.stringValue("ListResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].RelationType"));

			resourceRelationList.add(resourceRelationListItem);
		}
		resourceRelations.setResourceRelationList(resourceRelationList);
		listResourceRelationsResponse.setResourceRelations(resourceRelations);
	 
	 	return listResourceRelationsResponse;
	}
}