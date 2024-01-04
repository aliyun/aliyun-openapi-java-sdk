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

import com.aliyuncs.devops.model.v20210625.ListFlowTagGroupsResponse;
import com.aliyuncs.devops.model.v20210625.ListFlowTagGroupsResponse.FlowTagGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowTagGroupsResponseUnmarshaller {

	public static ListFlowTagGroupsResponse unmarshall(ListFlowTagGroupsResponse listFlowTagGroupsResponse, UnmarshallerContext _ctx) {
		
		listFlowTagGroupsResponse.setRequestId(_ctx.stringValue("ListFlowTagGroupsResponse.requestId"));
		listFlowTagGroupsResponse.setErrorMessage(_ctx.stringValue("ListFlowTagGroupsResponse.errorMessage"));
		listFlowTagGroupsResponse.setSuccess(_ctx.booleanValue("ListFlowTagGroupsResponse.success"));
		listFlowTagGroupsResponse.setErrorCode(_ctx.stringValue("ListFlowTagGroupsResponse.errorCode"));

		List<FlowTagGroup> flowTagGroups = new ArrayList<FlowTagGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowTagGroupsResponse.flowTagGroups.Length"); i++) {
			FlowTagGroup flowTagGroup = new FlowTagGroup();
			flowTagGroup.setId(_ctx.longValue("ListFlowTagGroupsResponse.flowTagGroups["+ i +"].id"));
			flowTagGroup.setName(_ctx.stringValue("ListFlowTagGroupsResponse.flowTagGroups["+ i +"].name"));
			flowTagGroup.setCreatorAccountId(_ctx.stringValue("ListFlowTagGroupsResponse.flowTagGroups["+ i +"].creatorAccountId"));
			flowTagGroup.setModiferAccountId(_ctx.stringValue("ListFlowTagGroupsResponse.flowTagGroups["+ i +"].modiferAccountId"));

			flowTagGroups.add(flowTagGroup);
		}
		listFlowTagGroupsResponse.setFlowTagGroups(flowTagGroups);
	 
	 	return listFlowTagGroupsResponse;
	}
}