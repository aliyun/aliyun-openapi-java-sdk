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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetApplicationResponse;
import com.aliyuncs.edas.model.v20170801.GetApplicationResponse.Applcation;
import com.aliyuncs.edas.model.v20170801.GetApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext _ctx) {
		
		getApplicationResponse.setRequestId(_ctx.stringValue("GetApplicationResponse.RequestId"));
		getApplicationResponse.setCode(_ctx.integerValue("GetApplicationResponse.Code"));
		getApplicationResponse.setMessage(_ctx.stringValue("GetApplicationResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setExtSlbIp(_ctx.stringValue("GetApplicationResponse.Applcation.ExtSlbIp"));
		applcation.setOwner(_ctx.stringValue("GetApplicationResponse.Applcation.Owner"));
		applcation.setSlbPort(_ctx.integerValue("GetApplicationResponse.Applcation.SlbPort"));
		applcation.setNameSpace(_ctx.stringValue("GetApplicationResponse.Applcation.NameSpace"));
		applcation.setExtSlbName(_ctx.stringValue("GetApplicationResponse.Applcation.ExtSlbName"));
		applcation.setCreateTime(_ctx.longValue("GetApplicationResponse.Applcation.CreateTime"));
		applcation.setUserId(_ctx.stringValue("GetApplicationResponse.Applcation.UserId"));
		applcation.setPort(_ctx.integerValue("GetApplicationResponse.Applcation.Port"));
		applcation.setRunningInstanceCount(_ctx.integerValue("GetApplicationResponse.Applcation.RunningInstanceCount"));
		applcation.setSlbIp(_ctx.stringValue("GetApplicationResponse.Applcation.SlbIp"));
		applcation.setDockerize(_ctx.booleanValue("GetApplicationResponse.Applcation.Dockerize"));
		applcation.setDescription(_ctx.stringValue("GetApplicationResponse.Applcation.Description"));
		applcation.setInstanceCount(_ctx.integerValue("GetApplicationResponse.Applcation.InstanceCount"));
		applcation.setAppId(_ctx.stringValue("GetApplicationResponse.Applcation.AppId"));
		applcation.setSlbInfo(_ctx.stringValue("GetApplicationResponse.Applcation.SlbInfo"));
		applcation.setMemory(_ctx.integerValue("GetApplicationResponse.Applcation.Memory"));
		applcation.setName(_ctx.stringValue("GetApplicationResponse.Applcation.Name"));
		applcation.setClusterId(_ctx.stringValue("GetApplicationResponse.Applcation.ClusterId"));
		applcation.setSlbId(_ctx.stringValue("GetApplicationResponse.Applcation.SlbId"));
		applcation.setHealthCheckUrl(_ctx.stringValue("GetApplicationResponse.Applcation.HealthCheckUrl"));
		applcation.setApplicationType(_ctx.stringValue("GetApplicationResponse.Applcation.ApplicationType"));
		applcation.setExtSlbId(_ctx.stringValue("GetApplicationResponse.Applcation.ExtSlbId"));
		applcation.setRegionId(_ctx.stringValue("GetApplicationResponse.Applcation.RegionId"));
		applcation.setBuildPackageId(_ctx.longValue("GetApplicationResponse.Applcation.BuildPackageId"));
		applcation.setEmail(_ctx.stringValue("GetApplicationResponse.Applcation.Email"));
		applcation.setCpu(_ctx.integerValue("GetApplicationResponse.Applcation.Cpu"));
		applcation.setClusterType(_ctx.integerValue("GetApplicationResponse.Applcation.ClusterType"));
		applcation.setSlbName(_ctx.stringValue("GetApplicationResponse.Applcation.SlbName"));
		applcation.setEnableUrlCheck(_ctx.booleanValue("GetApplicationResponse.Applcation.EnableUrlCheck"));
		applcation.setEnablePortCheck(_ctx.booleanValue("GetApplicationResponse.Applcation.EnablePortCheck"));
		getApplicationResponse.setApplcation(applcation);

		Application application = new Application();
		application.setExtSlbIp(_ctx.stringValue("GetApplicationResponse.Application.ExtSlbIp"));
		application.setOwner(_ctx.stringValue("GetApplicationResponse.Application.Owner"));
		application.setSlbPort(_ctx.integerValue("GetApplicationResponse.Application.SlbPort"));
		application.setNameSpace(_ctx.stringValue("GetApplicationResponse.Application.NameSpace"));
		application.setExtSlbName(_ctx.stringValue("GetApplicationResponse.Application.ExtSlbName"));
		application.setCreateTime(_ctx.longValue("GetApplicationResponse.Application.CreateTime"));
		application.setUserId(_ctx.stringValue("GetApplicationResponse.Application.UserId"));
		application.setPort(_ctx.integerValue("GetApplicationResponse.Application.Port"));
		application.setRunningInstanceCount(_ctx.integerValue("GetApplicationResponse.Application.RunningInstanceCount"));
		application.setSlbIp(_ctx.stringValue("GetApplicationResponse.Application.SlbIp"));
		application.setDockerize(_ctx.booleanValue("GetApplicationResponse.Application.Dockerize"));
		application.setDescription(_ctx.stringValue("GetApplicationResponse.Application.Description"));
		application.setInstanceCount(_ctx.integerValue("GetApplicationResponse.Application.InstanceCount"));
		application.setAppId(_ctx.stringValue("GetApplicationResponse.Application.AppId"));
		application.setSlbInfo(_ctx.stringValue("GetApplicationResponse.Application.SlbInfo"));
		application.setMemory(_ctx.integerValue("GetApplicationResponse.Application.Memory"));
		application.setName(_ctx.stringValue("GetApplicationResponse.Application.Name"));
		application.setClusterId(_ctx.stringValue("GetApplicationResponse.Application.ClusterId"));
		application.setSlbId(_ctx.stringValue("GetApplicationResponse.Application.SlbId"));
		application.setHealthCheckUrl(_ctx.stringValue("GetApplicationResponse.Application.HealthCheckUrl"));
		application.setApplicationType(_ctx.stringValue("GetApplicationResponse.Application.ApplicationType"));
		application.setExtSlbId(_ctx.stringValue("GetApplicationResponse.Application.ExtSlbId"));
		application.setRegionId(_ctx.stringValue("GetApplicationResponse.Application.RegionId"));
		application.setBuildPackageId(_ctx.longValue("GetApplicationResponse.Application.BuildPackageId"));
		application.setEmail(_ctx.stringValue("GetApplicationResponse.Application.Email"));
		application.setCpu(_ctx.integerValue("GetApplicationResponse.Application.Cpu"));
		application.setClusterType(_ctx.stringValue("GetApplicationResponse.Application.ClusterType"));
		application.setSlbName(_ctx.stringValue("GetApplicationResponse.Application.SlbName"));
		application.setEnableUrlCheck(_ctx.booleanValue("GetApplicationResponse.Application.EnableUrlCheck"));
		application.setEnablePortCheck(_ctx.booleanValue("GetApplicationResponse.Application.EnablePortCheck"));
		getApplicationResponse.setApplication(application);
	 
	 	return getApplicationResponse;
	}
}