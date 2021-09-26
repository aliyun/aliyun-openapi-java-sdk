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

import com.aliyuncs.dataworks_public.model.v20200518.GetProjectResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetProjectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setHttpStatusCode(_ctx.integerValue("GetProjectResponse.HttpStatusCode"));
		getProjectResponse.setSuccess(_ctx.booleanValue("GetProjectResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetProjectResponse.Data.Status"));
		data.setMaxFlowNode(_ctx.integerValue("GetProjectResponse.Data.MaxFlowNode"));
		data.setProjectId(_ctx.integerValue("GetProjectResponse.Data.ProjectId"));
		data.setIsAllowDownload(_ctx.integerValue("GetProjectResponse.Data.IsAllowDownload"));
		data.setProjectMode(_ctx.integerValue("GetProjectResponse.Data.ProjectMode"));
		data.setGmtModified(_ctx.stringValue("GetProjectResponse.Data.GmtModified"));
		data.setProdStorageQuota(_ctx.stringValue("GetProjectResponse.Data.ProdStorageQuota"));
		data.setProjectDescription(_ctx.stringValue("GetProjectResponse.Data.ProjectDescription"));
		data.setDevelopmentType(_ctx.integerValue("GetProjectResponse.Data.DevelopmentType"));
		data.setTablePrivacyMode(_ctx.integerValue("GetProjectResponse.Data.TablePrivacyMode"));
		data.setDefaultDiResourceGroupIdentifier(_ctx.stringValue("GetProjectResponse.Data.DefaultDiResourceGroupIdentifier"));
		data.setSchedulerMaxRetryTimes(_ctx.integerValue("GetProjectResponse.Data.SchedulerMaxRetryTimes"));
		data.setProtectedMode(_ctx.integerValue("GetProjectResponse.Data.ProtectedMode"));
		data.setSchedulerRetryInterval(_ctx.integerValue("GetProjectResponse.Data.SchedulerRetryInterval"));
		data.setAppkey(_ctx.stringValue("GetProjectResponse.Data.Appkey"));
		data.setDevStorageQuota(_ctx.stringValue("GetProjectResponse.Data.DevStorageQuota"));
		data.setResidentArea(_ctx.stringValue("GetProjectResponse.Data.ResidentArea"));
		data.setIsDefault(_ctx.integerValue("GetProjectResponse.Data.IsDefault"));
		data.setDestination(_ctx.integerValue("GetProjectResponse.Data.Destination"));
		data.setProjectName(_ctx.stringValue("GetProjectResponse.Data.ProjectName"));
		data.setProjectIdentifier(_ctx.stringValue("GetProjectResponse.Data.ProjectIdentifier"));
		data.setDisableDevelopment(_ctx.booleanValue("GetProjectResponse.Data.DisableDevelopment"));
		data.setProjectOwnerBaseId(_ctx.stringValue("GetProjectResponse.Data.ProjectOwnerBaseId"));
		data.setBaseProject(_ctx.booleanValue("GetProjectResponse.Data.BaseProject"));
		data.setUseProxyOdpsAccount(_ctx.booleanValue("GetProjectResponse.Data.UseProxyOdpsAccount"));
		data.setGmtCreate(_ctx.stringValue("GetProjectResponse.Data.GmtCreate"));
		data.setTenantId(_ctx.longValue("GetProjectResponse.Data.TenantId"));

		List<String> envTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectResponse.Data.EnvTypes.Length"); i++) {
			envTypes.add(_ctx.stringValue("GetProjectResponse.Data.EnvTypes["+ i +"]"));
		}
		data.setEnvTypes(envTypes);
		getProjectResponse.setData(data);
	 
	 	return getProjectResponse;
	}
}