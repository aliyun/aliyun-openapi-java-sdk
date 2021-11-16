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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetProjectDetailResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetProjectDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectDetailResponseUnmarshaller {

	public static GetProjectDetailResponse unmarshall(GetProjectDetailResponse getProjectDetailResponse, UnmarshallerContext _ctx) {
		
		getProjectDetailResponse.setRequestId(_ctx.stringValue("GetProjectDetailResponse.RequestId"));
		getProjectDetailResponse.setHttpStatusCode(_ctx.integerValue("GetProjectDetailResponse.HttpStatusCode"));
		getProjectDetailResponse.setSuccess(_ctx.booleanValue("GetProjectDetailResponse.Success"));

		Data data = new Data();
		data.setGmtModified(_ctx.stringValue("GetProjectDetailResponse.Data.GmtModified"));
		data.setDefaultDiResourceGroupIdentifier(_ctx.stringValue("GetProjectDetailResponse.Data.DefaultDiResourceGroupIdentifier"));
		data.setIsAllowDownload(_ctx.integerValue("GetProjectDetailResponse.Data.IsAllowDownload"));
		data.setSchedulerRetryInterval(_ctx.integerValue("GetProjectDetailResponse.Data.SchedulerRetryInterval"));
		data.setResidentArea(_ctx.stringValue("GetProjectDetailResponse.Data.ResidentArea"));
		data.setProjectOwnerBaseId(_ctx.stringValue("GetProjectDetailResponse.Data.ProjectOwnerBaseId"));
		data.setProjectMode(_ctx.integerValue("GetProjectDetailResponse.Data.ProjectMode"));
		data.setGmtCreate(_ctx.stringValue("GetProjectDetailResponse.Data.GmtCreate"));
		data.setProtectedMode(_ctx.integerValue("GetProjectDetailResponse.Data.ProtectedMode"));
		data.setTenantId(_ctx.longValue("GetProjectDetailResponse.Data.TenantId"));
		data.setProjectDescription(_ctx.stringValue("GetProjectDetailResponse.Data.ProjectDescription"));
		data.setSchedulerMaxRetryTimes(_ctx.integerValue("GetProjectDetailResponse.Data.SchedulerMaxRetryTimes"));
		data.setProjectName(_ctx.stringValue("GetProjectDetailResponse.Data.ProjectName"));
		data.setProjectIdentifier(_ctx.stringValue("GetProjectDetailResponse.Data.ProjectIdentifier"));
		data.setProjectId(_ctx.integerValue("GetProjectDetailResponse.Data.ProjectId"));
		data.setStatus(_ctx.integerValue("GetProjectDetailResponse.Data.Status"));
		data.setDevelopmentType(_ctx.integerValue("GetProjectDetailResponse.Data.DevelopmentType"));

		List<String> envTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectDetailResponse.Data.EnvTypes.Length"); i++) {
			envTypes.add(_ctx.stringValue("GetProjectDetailResponse.Data.EnvTypes["+ i +"]"));
		}
		data.setEnvTypes(envTypes);
		getProjectDetailResponse.setData(data);
	 
	 	return getProjectDetailResponse;
	}
}