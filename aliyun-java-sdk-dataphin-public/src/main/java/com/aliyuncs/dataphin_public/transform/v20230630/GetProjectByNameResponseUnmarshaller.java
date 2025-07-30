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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetProjectByNameResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetProjectByNameResponse.ProjectInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetProjectByNameResponse.ProjectInfo.WhiteList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectByNameResponseUnmarshaller {

	public static GetProjectByNameResponse unmarshall(GetProjectByNameResponse getProjectByNameResponse, UnmarshallerContext _ctx) {
		
		getProjectByNameResponse.setRequestId(_ctx.stringValue("GetProjectByNameResponse.RequestId"));
		getProjectByNameResponse.setSuccess(_ctx.booleanValue("GetProjectByNameResponse.Success"));
		getProjectByNameResponse.setHttpStatusCode(_ctx.integerValue("GetProjectByNameResponse.HttpStatusCode"));
		getProjectByNameResponse.setCode(_ctx.stringValue("GetProjectByNameResponse.Code"));
		getProjectByNameResponse.setMessage(_ctx.stringValue("GetProjectByNameResponse.Message"));

		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setBizUnitId(_ctx.longValue("GetProjectByNameResponse.ProjectInfo.BizUnitId"));
		projectInfo.setBizUnitDisplayName(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.BizUnitDisplayName"));
		projectInfo.setComputeSourceId(_ctx.longValue("GetProjectByNameResponse.ProjectInfo.ComputeSourceId"));
		projectInfo.setComputeSourceName(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.ComputeSourceName"));
		projectInfo.setStreamComputeSourceId(_ctx.longValue("GetProjectByNameResponse.ProjectInfo.StreamComputeSourceId"));
		projectInfo.setStreamComputeSourceName(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.StreamComputeSourceName"));
		projectInfo.setNameSpaceTag(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.NameSpaceTag"));
		projectInfo.setEnv(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.Env"));
		projectInfo.setMode(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.Mode"));
		projectInfo.setType(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.Type"));
		projectInfo.setId(_ctx.longValue("GetProjectByNameResponse.ProjectInfo.Id"));
		projectInfo.setName(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.Name"));
		projectInfo.setDisplayName(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.DisplayName"));
		projectInfo.setDescription(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.Description"));
		projectInfo.setGmtCreate(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.GmtCreate"));
		projectInfo.setGmtModified(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.GmtModified"));
		projectInfo.setOwner(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.Owner"));
		projectInfo.setOwnerName(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.OwnerName"));

		List<WhiteList> whiteLists = new ArrayList<WhiteList>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectByNameResponse.ProjectInfo.WhiteLists.Length"); i++) {
			WhiteList whiteList = new WhiteList();
			whiteList.setDescription(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.WhiteLists["+ i +"].Description"));
			whiteList.setIp(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.WhiteLists["+ i +"].Ip"));
			whiteList.setPort(_ctx.stringValue("GetProjectByNameResponse.ProjectInfo.WhiteLists["+ i +"].Port"));

			whiteLists.add(whiteList);
		}
		projectInfo.setWhiteLists(whiteLists);
		getProjectByNameResponse.setProjectInfo(projectInfo);
	 
	 	return getProjectByNameResponse;
	}
}