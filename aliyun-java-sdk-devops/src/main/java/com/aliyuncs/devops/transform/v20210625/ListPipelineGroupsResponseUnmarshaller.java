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

import com.aliyuncs.devops.model.v20210625.ListPipelineGroupsResponse;
import com.aliyuncs.devops.model.v20210625.ListPipelineGroupsResponse.PieplineGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineGroupsResponseUnmarshaller {

	public static ListPipelineGroupsResponse unmarshall(ListPipelineGroupsResponse listPipelineGroupsResponse, UnmarshallerContext _ctx) {
		
		listPipelineGroupsResponse.setRequestId(_ctx.stringValue("ListPipelineGroupsResponse.requestId"));
		listPipelineGroupsResponse.setErrorMessage(_ctx.stringValue("ListPipelineGroupsResponse.errorMessage"));
		listPipelineGroupsResponse.setSuccess(_ctx.booleanValue("ListPipelineGroupsResponse.success"));
		listPipelineGroupsResponse.setErrorCode(_ctx.stringValue("ListPipelineGroupsResponse.errorCode"));
		listPipelineGroupsResponse.setTotalCount(_ctx.integerValue("ListPipelineGroupsResponse.totalCount"));
		listPipelineGroupsResponse.setNextToken(_ctx.stringValue("ListPipelineGroupsResponse.nextToken"));

		List<PieplineGroup> pipelineGroups = new ArrayList<PieplineGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineGroupsResponse.pipelineGroups.Length"); i++) {
			PieplineGroup pieplineGroup = new PieplineGroup();
			pieplineGroup.setName(_ctx.stringValue("ListPipelineGroupsResponse.pipelineGroups["+ i +"].name"));
			pieplineGroup.setId(_ctx.longValue("ListPipelineGroupsResponse.pipelineGroups["+ i +"].id"));
			pieplineGroup.setCreateTime(_ctx.longValue("ListPipelineGroupsResponse.pipelineGroups["+ i +"].createTime"));

			pipelineGroups.add(pieplineGroup);
		}
		listPipelineGroupsResponse.setPipelineGroups(pipelineGroups);
	 
	 	return listPipelineGroupsResponse;
	}
}