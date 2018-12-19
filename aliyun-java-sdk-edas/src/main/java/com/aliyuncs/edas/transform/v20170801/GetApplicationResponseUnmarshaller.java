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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext context) {
		
		getApplicationResponse.setRequestId(context.stringValue("GetApplicationResponse.RequestId"));
		getApplicationResponse.setCode(context.integerValue("GetApplicationResponse.Code"));
		getApplicationResponse.setMessage(context.stringValue("GetApplicationResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setAppId(context.stringValue("GetApplicationResponse.Applcation.AppId"));
		applcation.setName(context.stringValue("GetApplicationResponse.Applcation.Name"));
		applcation.setRegionId(context.stringValue("GetApplicationResponse.Applcation.RegionId"));
		applcation.setDescription(context.stringValue("GetApplicationResponse.Applcation.Description"));
		applcation.setOwner(context.stringValue("GetApplicationResponse.Applcation.Owner"));
		applcation.setInstanceCount(context.integerValue("GetApplicationResponse.Applcation.InstanceCount"));
		applcation.setRunningInstanceCount(context.integerValue("GetApplicationResponse.Applcation.RunningInstanceCount"));
		applcation.setPort(context.integerValue("GetApplicationResponse.Applcation.Port"));
		applcation.setUserId(context.stringValue("GetApplicationResponse.Applcation.UserId"));
		applcation.setSlbId(context.stringValue("GetApplicationResponse.Applcation.SlbId"));
		applcation.setSlbIp(context.stringValue("GetApplicationResponse.Applcation.SlbIp"));
		applcation.setSlbPort(context.integerValue("GetApplicationResponse.Applcation.SlbPort"));
		applcation.setExtSlbId(context.stringValue("GetApplicationResponse.Applcation.ExtSlbId"));
		applcation.setExtSlbIp(context.stringValue("GetApplicationResponse.Applcation.ExtSlbIp"));
		applcation.setSlbName(context.stringValue("GetApplicationResponse.Applcation.SlbName"));
		applcation.setExtSlbName(context.stringValue("GetApplicationResponse.Applcation.ExtSlbName"));
		applcation.setApplicationType(context.stringValue("GetApplicationResponse.Applcation.ApplicationType"));
		applcation.setClusterType(context.integerValue("GetApplicationResponse.Applcation.ClusterType"));
		applcation.setClusterId(context.stringValue("GetApplicationResponse.Applcation.ClusterId"));
		applcation.setDockerize(context.booleanValue("GetApplicationResponse.Applcation.Dockerize"));
		applcation.setCpu(context.integerValue("GetApplicationResponse.Applcation.Cpu"));
		applcation.setMemory(context.integerValue("GetApplicationResponse.Applcation.Memory"));
		applcation.setHealthCheckUrl(context.stringValue("GetApplicationResponse.Applcation.HealthCheckUrl"));
		applcation.setBuildPackageId(context.longValue("GetApplicationResponse.Applcation.BuildPackageId"));
		applcation.setCreateTime(context.longValue("GetApplicationResponse.Applcation.CreateTime"));
		getApplicationResponse.setApplcation(applcation);
	 
	 	return getApplicationResponse;
	}
}