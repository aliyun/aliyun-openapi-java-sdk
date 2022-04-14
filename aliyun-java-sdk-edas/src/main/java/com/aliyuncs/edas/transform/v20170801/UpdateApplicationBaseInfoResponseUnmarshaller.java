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

import com.aliyuncs.edas.model.v20170801.UpdateApplicationBaseInfoResponse;
import com.aliyuncs.edas.model.v20170801.UpdateApplicationBaseInfoResponse.Applcation;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationBaseInfoResponseUnmarshaller {

	public static UpdateApplicationBaseInfoResponse unmarshall(UpdateApplicationBaseInfoResponse updateApplicationBaseInfoResponse, UnmarshallerContext _ctx) {
		
		updateApplicationBaseInfoResponse.setRequestId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.RequestId"));
		updateApplicationBaseInfoResponse.setCode(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Code"));
		updateApplicationBaseInfoResponse.setMessage(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setExtSlbIp(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ExtSlbIp"));
		applcation.setOwner(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.Owner"));
		applcation.setSlbPort(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.SlbPort"));
		applcation.setExtSlbName(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ExtSlbName"));
		applcation.setCreateTime(_ctx.longValue("UpdateApplicationBaseInfoResponse.Applcation.CreateTime"));
		applcation.setUserId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.UserId"));
		applcation.setPort(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.Port"));
		applcation.setRunningInstanceCount(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.RunningInstanceCount"));
		applcation.setSlbIp(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.SlbIp"));
		applcation.setDockerize(_ctx.booleanValue("UpdateApplicationBaseInfoResponse.Applcation.Dockerize"));
		applcation.setDescription(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.Description"));
		applcation.setInstanceCount(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.InstanceCount"));
		applcation.setAppId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.AppId"));
		applcation.setMemory(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.Memory"));
		applcation.setName(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.Name"));
		applcation.setClusterId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ClusterId"));
		applcation.setSlbId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.SlbId"));
		applcation.setHealthCheckUrl(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.HealthCheckUrl"));
		applcation.setApplicationType(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ApplicationType"));
		applcation.setExtSlbId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ExtSlbId"));
		applcation.setRegionId(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.RegionId"));
		applcation.setBuildPackageId(_ctx.longValue("UpdateApplicationBaseInfoResponse.Applcation.BuildPackageId"));
		applcation.setCpu(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.Cpu"));
		applcation.setClusterType(_ctx.integerValue("UpdateApplicationBaseInfoResponse.Applcation.ClusterType"));
		applcation.setSlbName(_ctx.stringValue("UpdateApplicationBaseInfoResponse.Applcation.SlbName"));
		updateApplicationBaseInfoResponse.setApplcation(applcation);
	 
	 	return updateApplicationBaseInfoResponse;
	}
}