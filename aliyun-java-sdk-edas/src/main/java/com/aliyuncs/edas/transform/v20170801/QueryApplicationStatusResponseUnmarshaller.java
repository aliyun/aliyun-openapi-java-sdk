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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse;
import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse.AppInfo;
import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse.AppInfo.Application;
import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse.AppInfo.DeployRecord;
import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse.AppInfo.Ecc;
import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse.AppInfo.Ecu;
import com.aliyuncs.edas.model.v20170801.QueryApplicationStatusResponse.AppInfo.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApplicationStatusResponseUnmarshaller {

	public static QueryApplicationStatusResponse unmarshall(QueryApplicationStatusResponse queryApplicationStatusResponse, UnmarshallerContext context) {
		
		queryApplicationStatusResponse.setRequestId(context.stringValue("QueryApplicationStatusResponse.RequestId"));
		queryApplicationStatusResponse.setCode(context.integerValue("QueryApplicationStatusResponse.Code"));
		queryApplicationStatusResponse.setMessage(context.stringValue("QueryApplicationStatusResponse.Message"));

		AppInfo appInfo = new AppInfo();

		Application application = new Application();
		application.setApplicationId(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.ApplicationId"));
		application.setBuildPackageId(context.integerValue("QueryApplicationStatusResponse.AppInfo.Application.BuildPackageId"));
		application.setClusterId(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.ClusterId"));
		application.setCpu(context.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Cpu"));
		application.setCreateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.Application.CreateTime"));
		application.setDockerize(context.booleanValue("QueryApplicationStatusResponse.AppInfo.Application.Dockerize"));
		application.setEmail(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Email"));
		application.setHealthCheckUrl(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.HealthCheckUrl"));
		application.setInstanceCount(context.integerValue("QueryApplicationStatusResponse.AppInfo.Application.InstanceCount"));
		application.setLaunchTime(context.longValue("QueryApplicationStatusResponse.AppInfo.Application.LaunchTime"));
		application.setMemory(context.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Memory"));
		application.setName(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Name"));
		application.setOwner(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Owner"));
		application.setPhone(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Phone"));
		application.setPort(context.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Port"));
		application.setRegionId(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.RegionId"));
		application.setRunningInstanceCount(context.integerValue("QueryApplicationStatusResponse.AppInfo.Application.RunningInstanceCount"));
		application.setUserId(context.stringValue("QueryApplicationStatusResponse.AppInfo.Application.UserId"));
		appInfo.setApplication(application);

		List<Ecu> ecuList = new ArrayList<Ecu>();
		for (int i = 0; i < context.lengthValue("QueryApplicationStatusResponse.AppInfo.EcuList.Length"); i++) {
			Ecu ecu = new Ecu();
			ecu.setEcuId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].EcuId"));
			ecu.setOnline(context.booleanValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].Online"));
			ecu.setDockerEnv(context.booleanValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].DockerEnv"));
			ecu.setCreateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].CreateTime"));
			ecu.setUpdateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].UpdateTime"));
			ecu.setIpAddr(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].IpAddr"));
			ecu.setHeartbeatTime(context.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].HeartbeatTime"));
			ecu.setUserId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].UserId"));
			ecu.setGroupId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].GroupId"));
			ecu.setName(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].Name"));
			ecu.setZoneId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].ZoneId"));
			ecu.setRegionId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].RegionId"));
			ecu.setInstanceId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].InstanceId"));
			ecu.setVpcId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].VpcId"));
			ecu.setRegionId1(context.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].RegionId"));
			ecu.setAvailableCpu(context.integerValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].AvailableCpu"));
			ecu.setAvailableMem(context.integerValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].AvailableMem"));

			ecuList.add(ecu);
		}
		appInfo.setEcuList(ecuList);

		List<Ecc> eccList = new ArrayList<Ecc>();
		for (int i = 0; i < context.lengthValue("QueryApplicationStatusResponse.AppInfo.EccList.Length"); i++) {
			Ecc ecc = new Ecc();
			ecc.setEccId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].EccId"));
			ecc.setEcuId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].EcuId"));
			ecc.setAppId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].AppId"));
			ecc.setAppState(context.integerValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].AppState"));
			ecc.setTaskState(context.integerValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].TaskState"));
			ecc.setCreateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].CreateTime"));
			ecc.setUpdateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].UpdateTime"));
			ecc.setIp(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].Ip"));
			ecc.setVpcId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].VpcId"));
			ecc.setGroupId(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].GroupId"));
			ecc.setContainerStatus(context.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].ContainerStatus"));

			eccList.add(ecc);
		}
		appInfo.setEccList(eccList);

		List<Group> groupList = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("QueryApplicationStatusResponse.AppInfo.GroupList.Length"); i++) {
			Group group = new Group();
			group.setGroupId(context.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupId"));
			group.setGroupName(context.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupName"));
			group.setAppId(context.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].AppId"));
			group.setPackageVersionId(context.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].PackageVersionId"));
			group.setAppVersionId(context.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].AppVersionId"));
			group.setGroupType(context.integerValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupType"));
			group.setClusterId(context.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].ClusterId"));
			group.setCreateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].CreateTime"));
			group.setUpdateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].UpdateTime"));

			groupList.add(group);
		}
		appInfo.setGroupList(groupList);

		List<DeployRecord> deployRecordList = new ArrayList<DeployRecord>();
		for (int i = 0; i < context.lengthValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList.Length"); i++) {
			DeployRecord deployRecord = new DeployRecord();
			deployRecord.setDeployRecordId(context.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].DeployRecordId"));
			deployRecord.setEccId(context.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].EccId"));
			deployRecord.setEcuId(context.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].EcuId"));
			deployRecord.setPackageVersionId(context.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].PackageVersionId"));
			deployRecord.setPackageMd5(context.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].PackageMd5"));
			deployRecord.setCreateTime(context.longValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].CreateTime"));

			deployRecordList.add(deployRecord);
		}
		appInfo.setDeployRecordList(deployRecordList);
		queryApplicationStatusResponse.setAppInfo(appInfo);
	 
	 	return queryApplicationStatusResponse;
	}
}