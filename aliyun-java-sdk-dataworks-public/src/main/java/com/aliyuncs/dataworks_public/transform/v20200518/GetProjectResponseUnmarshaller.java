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
		data.setGmtModified(_ctx.stringValue("GetProjectResponse.Data.GmtModified"));
		data.setMaxFlowNode(_ctx.integerValue("GetProjectResponse.Data.MaxFlowNode"));
		data.setDefaultDiResourceGroupIdentifier(_ctx.stringValue("GetProjectResponse.Data.DefaultDiResourceGroupIdentifier"));
		data.setDestination(_ctx.integerValue("GetProjectResponse.Data.Destination"));
		data.setIsAllowDownload(_ctx.integerValue("GetProjectResponse.Data.IsAllowDownload"));
		data.setProdStorageQuota(_ctx.stringValue("GetProjectResponse.Data.ProdStorageQuota"));
		data.setSchedulerRetryInterval(_ctx.integerValue("GetProjectResponse.Data.SchedulerRetryInterval"));
		data.setResidentArea(_ctx.stringValue("GetProjectResponse.Data.ResidentArea"));
		data.setTablePrivacyMode(_ctx.integerValue("GetProjectResponse.Data.TablePrivacyMode"));
		data.setProjectOwnerBaseId(_ctx.stringValue("GetProjectResponse.Data.ProjectOwnerBaseId"));
		data.setUseProxyOdpsAccount(_ctx.booleanValue("GetProjectResponse.Data.UseProxyOdpsAccount"));
		data.setDisableDevelopment(_ctx.booleanValue("GetProjectResponse.Data.DisableDevelopment"));
		data.setProjectMode(_ctx.integerValue("GetProjectResponse.Data.ProjectMode"));
		data.setGmtCreate(_ctx.stringValue("GetProjectResponse.Data.GmtCreate"));
		data.setDevStorageQuota(_ctx.stringValue("GetProjectResponse.Data.DevStorageQuota"));
		data.setIsDefault(_ctx.integerValue("GetProjectResponse.Data.IsDefault"));
		data.setProtectedMode(_ctx.integerValue("GetProjectResponse.Data.ProtectedMode"));
		data.setBaseProject(_ctx.booleanValue("GetProjectResponse.Data.BaseProject"));
		data.setTenantId(_ctx.longValue("GetProjectResponse.Data.TenantId"));
		data.setProjectDescription(_ctx.stringValue("GetProjectResponse.Data.ProjectDescription"));
		data.setAppkey(_ctx.stringValue("GetProjectResponse.Data.Appkey"));
		data.setSchedulerMaxRetryTimes(_ctx.integerValue("GetProjectResponse.Data.SchedulerMaxRetryTimes"));
		data.setProjectName(_ctx.stringValue("GetProjectResponse.Data.ProjectName"));
		data.setProjectIdentifier(_ctx.stringValue("GetProjectResponse.Data.ProjectIdentifier"));
		data.setProjectId(_ctx.integerValue("GetProjectResponse.Data.ProjectId"));
		data.setStatus(_ctx.integerValue("GetProjectResponse.Data.Status"));
		data.setDevelopmentType(_ctx.integerValue("GetProjectResponse.Data.DevelopmentType"));

		List<String> envTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectResponse.Data.EnvTypes.Length"); i++) {
			envTypes.add(_ctx.stringValue("GetProjectResponse.Data.EnvTypes["+ i +"]"));
		}
		data.setEnvTypes(envTypes);
		getProjectResponse.setData(data);
	 
	 	return getProjectResponse;
	}
}