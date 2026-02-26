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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetWorkitemRelationsResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkitemRelationsResponse.RelationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkitemRelationsResponseUnmarshaller {

	public static GetWorkitemRelationsResponse unmarshall(GetWorkitemRelationsResponse getWorkitemRelationsResponse, UnmarshallerContext _ctx) {
		
		getWorkitemRelationsResponse.setRequestId(_ctx.stringValue("GetWorkitemRelationsResponse.requestId"));
		getWorkitemRelationsResponse.setErrorMsg(_ctx.stringValue("GetWorkitemRelationsResponse.errorMsg"));
		getWorkitemRelationsResponse.setErrorCode(_ctx.stringValue("GetWorkitemRelationsResponse.errorCode"));
		getWorkitemRelationsResponse.setSuccess(_ctx.booleanValue("GetWorkitemRelationsResponse.success"));

		List<RelationListItem> relationList = new ArrayList<RelationListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkitemRelationsResponse.relationList.Length"); i++) {
			RelationListItem relationListItem = new RelationListItem();
			relationListItem.setIdentifier(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].identifier"));
			relationListItem.setSubject(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].subject"));
			relationListItem.setAssignedTo(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].assignedTo"));
			relationListItem.setSpaceIdentifier(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].spaceIdentifier"));
			relationListItem.setCategoryIdentifier(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].categoryIdentifier"));
			relationListItem.setWorkitemTypeIdentifier(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].workitemTypeIdentifier"));
			relationListItem.setGmtCreate(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].gmtCreate"));
			relationListItem.setGmtModified(_ctx.stringValue("GetWorkitemRelationsResponse.relationList["+ i +"].gmtModified"));

			relationList.add(relationListItem);
		}
		getWorkitemRelationsResponse.setRelationList(relationList);
	 
	 	return getWorkitemRelationsResponse;
	}
}