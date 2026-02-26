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

import com.aliyuncs.devops.model.v20210625.GetFlowTagGroupResponse;
import com.aliyuncs.devops.model.v20210625.GetFlowTagGroupResponse.FlowTagGroup;
import com.aliyuncs.devops.model.v20210625.GetFlowTagGroupResponse.FlowTagGroup.FlowTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowTagGroupResponseUnmarshaller {

	public static GetFlowTagGroupResponse unmarshall(GetFlowTagGroupResponse getFlowTagGroupResponse, UnmarshallerContext _ctx) {
		
		getFlowTagGroupResponse.setRequestId(_ctx.stringValue("GetFlowTagGroupResponse.requestId"));
		getFlowTagGroupResponse.setErrorMessage(_ctx.stringValue("GetFlowTagGroupResponse.errorMessage"));
		getFlowTagGroupResponse.setSuccess(_ctx.booleanValue("GetFlowTagGroupResponse.success"));
		getFlowTagGroupResponse.setErrorCode(_ctx.stringValue("GetFlowTagGroupResponse.errorCode"));

		FlowTagGroup flowTagGroup = new FlowTagGroup();
		flowTagGroup.setId(_ctx.longValue("GetFlowTagGroupResponse.flowTagGroup.id"));
		flowTagGroup.setName(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.name"));
		flowTagGroup.setCreatorAccountId(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.creatorAccountId"));
		flowTagGroup.setModiferAccountId(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.modiferAccountId"));

		List<FlowTag> flowTagList = new ArrayList<FlowTag>();
		for (int i = 0; i < _ctx.lengthValue("GetFlowTagGroupResponse.flowTagGroup.flowTagList.Length"); i++) {
			FlowTag flowTag = new FlowTag();
			flowTag.setId(_ctx.longValue("GetFlowTagGroupResponse.flowTagGroup.flowTagList["+ i +"].id"));
			flowTag.setName(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.flowTagList["+ i +"].name"));
			flowTag.setColor(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.flowTagList["+ i +"].color"));
			flowTag.setCreatorAccountId(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.flowTagList["+ i +"].creatorAccountId"));
			flowTag.setModiferAccountId(_ctx.stringValue("GetFlowTagGroupResponse.flowTagGroup.flowTagList["+ i +"].modiferAccountId"));

			flowTagList.add(flowTag);
		}
		flowTagGroup.setFlowTagList(flowTagList);
		getFlowTagGroupResponse.setFlowTagGroup(flowTagGroup);
	 
	 	return getFlowTagGroupResponse;
	}
}