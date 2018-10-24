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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventRelationsResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventRelationsResponse.EventRelation;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCCNEventRelationsResponseUnmarshaller {

	public static InnerListCCNEventRelationsResponse unmarshall(InnerListCCNEventRelationsResponse innerListCCNEventRelationsResponse, UnmarshallerContext context) {
		
		innerListCCNEventRelationsResponse.setRequestId(context.stringValue("InnerListCCNEventRelationsResponse.RequestId"));
		innerListCCNEventRelationsResponse.setTotal(context.integerValue("InnerListCCNEventRelationsResponse.Total"));
		innerListCCNEventRelationsResponse.setPageNumber(context.integerValue("InnerListCCNEventRelationsResponse.PageNumber"));
		innerListCCNEventRelationsResponse.setPageSize(context.integerValue("InnerListCCNEventRelationsResponse.PageSize"));

		List<EventRelation> eventRelations = new ArrayList<EventRelation>();
		for (int i = 0; i < context.lengthValue("InnerListCCNEventRelationsResponse.EventRelations.Length"); i++) {
			EventRelation eventRelation = new EventRelation();
			eventRelation.setId(context.longValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].Id"));
			eventRelation.setParentEventRegionNo(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].ParentEventRegionNo"));
			eventRelation.setParentEventInstanceId(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].ParentEventInstanceId"));
			eventRelation.setParentEventNamespace(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].ParentEventNamespace"));
			eventRelation.setChildEventRegionNo(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].ChildEventRegionNo"));
			eventRelation.setChildEventInstanceId(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].ChildEventInstanceId"));
			eventRelation.setChildEventNamespace(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].ChildEventNamespace"));
			eventRelation.setGmtCreate(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].GmtCreate"));
			eventRelation.setGmtModify(context.stringValue("InnerListCCNEventRelationsResponse.EventRelations["+ i +"].GmtModify"));

			eventRelations.add(eventRelation);
		}
		innerListCCNEventRelationsResponse.setEventRelations(eventRelations);
	 
	 	return innerListCCNEventRelationsResponse;
	}
}