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

	public static UpdateApplicationBaseInfoResponse unmarshall(UpdateApplicationBaseInfoResponse updateApplicationBaseInfoResponse, UnmarshallerContext context) {
		
		updateApplicationBaseInfoResponse.setRequestId(context.stringValue("UpdateApplicationBaseInfoResponse.RequestId"));
		updateApplicationBaseInfoResponse.setCode(context.integerValue("UpdateApplicationBaseInfoResponse.Code"));
		updateApplicationBaseInfoResponse.setMessage(context.stringValue("UpdateApplicationBaseInfoResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setAppId(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.AppId"));
		applcation.setName(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.Name"));
		applcation.setRegionId(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.RegionId"));
		applcation.setDescription(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.Description"));
		applcation.setOwner(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.Owner"));
		applcation.setInstanceCount(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.InstanceCount"));
		applcation.setRunningInstanceCount(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.RunningInstanceCount"));
		applcation.setPort(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.Port"));
		applcation.setUserId(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.UserId"));
		applcation.setSlbId(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.SlbId"));
		applcation.setSlbIp(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.SlbIp"));
		applcation.setSlbPort(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.SlbPort"));
		applcation.setExtSlbId(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ExtSlbId"));
		applcation.setExtSlbIp(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ExtSlbIp"));
		applcation.setSlbName(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.SlbName"));
		applcation.setExtSlbName(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ExtSlbName"));
		applcation.setApplicationType(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ApplicationType"));
		applcation.setClusterType(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.ClusterType"));
		applcation.setClusterId(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.ClusterId"));
		applcation.setDockerize(context.booleanValue("UpdateApplicationBaseInfoResponse.Applcation.Dockerize"));
		applcation.setCpu(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.Cpu"));
		applcation.setMemory(context.integerValue("UpdateApplicationBaseInfoResponse.Applcation.Memory"));
		applcation.setHealthCheckUrl(context.stringValue("UpdateApplicationBaseInfoResponse.Applcation.HealthCheckUrl"));
		applcation.setBuildPackageId(context.longValue("UpdateApplicationBaseInfoResponse.Applcation.BuildPackageId"));
		applcation.setCreateTime(context.longValue("UpdateApplicationBaseInfoResponse.Applcation.CreateTime"));
		updateApplicationBaseInfoResponse.setApplcation(applcation);
	 
	 	return updateApplicationBaseInfoResponse;
	}
}