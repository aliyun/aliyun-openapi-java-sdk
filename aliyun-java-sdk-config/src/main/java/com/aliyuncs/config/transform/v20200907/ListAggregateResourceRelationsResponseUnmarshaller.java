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

import com.aliyuncs.config.model.v20200907.ListAggregateResourceRelationsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateResourceRelationsResponse.ResourceRelations;
import com.aliyuncs.config.model.v20200907.ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateResourceRelationsResponseUnmarshaller {

	public static ListAggregateResourceRelationsResponse unmarshall(ListAggregateResourceRelationsResponse listAggregateResourceRelationsResponse, UnmarshallerContext _ctx) {
		
		listAggregateResourceRelationsResponse.setRequestId(_ctx.stringValue("ListAggregateResourceRelationsResponse.RequestId"));

		ResourceRelations resourceRelations = new ResourceRelations();
		resourceRelations.setNextToken(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.NextToken"));
		resourceRelations.setMaxResults(_ctx.integerValue("ListAggregateResourceRelationsResponse.ResourceRelations.MaxResults"));
		resourceRelations.setTotalCount(_ctx.integerValue("ListAggregateResourceRelationsResponse.ResourceRelations.TotalCount"));

		List<ResourceRelationListItem> resourceRelationList = new ArrayList<ResourceRelationListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList.Length"); i++) {
			ResourceRelationListItem resourceRelationListItem = new ResourceRelationListItem();
			resourceRelationListItem.setAccountId(_ctx.longValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].AccountId"));
			resourceRelationListItem.setSourceResourceType(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].SourceResourceType"));
			resourceRelationListItem.setSourceResourceRegionId(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].SourceResourceRegionId"));
			resourceRelationListItem.setSourceResourceId(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].SourceResourceId"));
			resourceRelationListItem.setTargetResourceType(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].TargetResourceType"));
			resourceRelationListItem.setTargetResourceId(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].TargetResourceId"));
			resourceRelationListItem.setRelationType(_ctx.stringValue("ListAggregateResourceRelationsResponse.ResourceRelations.ResourceRelationList["+ i +"].RelationType"));

			resourceRelationList.add(resourceRelationListItem);
		}
		resourceRelations.setResourceRelationList(resourceRelationList);
		listAggregateResourceRelationsResponse.setResourceRelations(resourceRelations);
	 
	 	return listAggregateResourceRelationsResponse;
	}
}