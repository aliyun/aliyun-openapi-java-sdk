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

import com.aliyuncs.dataphin_public.model.v20230630.GetProjectResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetProjectResponse.ProjectInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetProjectResponse.ProjectInfo.WhiteList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setSuccess(_ctx.booleanValue("GetProjectResponse.Success"));
		getProjectResponse.setHttpStatusCode(_ctx.integerValue("GetProjectResponse.HttpStatusCode"));
		getProjectResponse.setCode(_ctx.stringValue("GetProjectResponse.Code"));
		getProjectResponse.setMessage(_ctx.stringValue("GetProjectResponse.Message"));

		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setBizUnitId(_ctx.longValue("GetProjectResponse.ProjectInfo.BizUnitId"));
		projectInfo.setBizUnitDisplayName(_ctx.stringValue("GetProjectResponse.ProjectInfo.BizUnitDisplayName"));
		projectInfo.setComputeSourceId(_ctx.longValue("GetProjectResponse.ProjectInfo.ComputeSourceId"));
		projectInfo.setComputeSourceName(_ctx.stringValue("GetProjectResponse.ProjectInfo.ComputeSourceName"));
		projectInfo.setStreamComputeSourceId(_ctx.longValue("GetProjectResponse.ProjectInfo.StreamComputeSourceId"));
		projectInfo.setStreamComputeSourceName(_ctx.stringValue("GetProjectResponse.ProjectInfo.StreamComputeSourceName"));
		projectInfo.setNameSpaceTag(_ctx.stringValue("GetProjectResponse.ProjectInfo.NameSpaceTag"));
		projectInfo.setEnv(_ctx.stringValue("GetProjectResponse.ProjectInfo.Env"));
		projectInfo.setMode(_ctx.stringValue("GetProjectResponse.ProjectInfo.Mode"));
		projectInfo.setType(_ctx.stringValue("GetProjectResponse.ProjectInfo.Type"));
		projectInfo.setId(_ctx.longValue("GetProjectResponse.ProjectInfo.Id"));
		projectInfo.setName(_ctx.stringValue("GetProjectResponse.ProjectInfo.Name"));
		projectInfo.setDisplayName(_ctx.stringValue("GetProjectResponse.ProjectInfo.DisplayName"));
		projectInfo.setDescription(_ctx.stringValue("GetProjectResponse.ProjectInfo.Description"));
		projectInfo.setGmtCreate(_ctx.stringValue("GetProjectResponse.ProjectInfo.GmtCreate"));
		projectInfo.setGmtModified(_ctx.stringValue("GetProjectResponse.ProjectInfo.GmtModified"));
		projectInfo.setOwner(_ctx.stringValue("GetProjectResponse.ProjectInfo.Owner"));
		projectInfo.setOwnerName(_ctx.stringValue("GetProjectResponse.ProjectInfo.OwnerName"));

		List<WhiteList> whiteLists = new ArrayList<WhiteList>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectResponse.ProjectInfo.WhiteLists.Length"); i++) {
			WhiteList whiteList = new WhiteList();
			whiteList.setDescription(_ctx.stringValue("GetProjectResponse.ProjectInfo.WhiteLists["+ i +"].Description"));
			whiteList.setIp(_ctx.stringValue("GetProjectResponse.ProjectInfo.WhiteLists["+ i +"].Ip"));
			whiteList.setPort(_ctx.stringValue("GetProjectResponse.ProjectInfo.WhiteLists["+ i +"].Port"));

			whiteLists.add(whiteList);
		}
		projectInfo.setWhiteLists(whiteLists);
		getProjectResponse.setProjectInfo(projectInfo);
	 
	 	return getProjectResponse;
	}
}