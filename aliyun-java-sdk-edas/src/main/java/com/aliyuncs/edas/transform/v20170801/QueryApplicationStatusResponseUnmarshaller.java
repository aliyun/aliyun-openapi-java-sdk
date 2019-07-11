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

	public static QueryApplicationStatusResponse unmarshall(QueryApplicationStatusResponse queryApplicationStatusResponse, UnmarshallerContext _ctx) {
		
		queryApplicationStatusResponse.setRequestId(_ctx.stringValue("QueryApplicationStatusResponse.RequestId"));
		queryApplicationStatusResponse.setCode(_ctx.integerValue("QueryApplicationStatusResponse.Code"));
		queryApplicationStatusResponse.setMessage(_ctx.stringValue("QueryApplicationStatusResponse.Message"));

		AppInfo appInfo = new AppInfo();

		Application application = new Application();
		application.setApplicationId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.ApplicationId"));
		application.setBuildPackageId(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.BuildPackageId"));
		application.setClusterId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.ClusterId"));
		application.setCpu(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Cpu"));
		application.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.Application.CreateTime"));
		application.setDockerize(_ctx.booleanValue("QueryApplicationStatusResponse.AppInfo.Application.Dockerize"));
		application.setEmail(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Email"));
		application.setHealthCheckUrl(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.HealthCheckUrl"));
		application.setInstanceCount(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.InstanceCount"));
		application.setLaunchTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.Application.LaunchTime"));
		application.setMemory(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Memory"));
		application.setName(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Name"));
		application.setOwner(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Owner"));
		application.setPhone(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Phone"));
		application.setPort(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Port"));
		application.setRegionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.RegionId"));
		application.setRunningInstanceCount(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.RunningInstanceCount"));
		application.setUserId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.UserId"));
		appInfo.setApplication(application);

		List<Ecu> ecuList = new ArrayList<Ecu>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.EcuList.Length"); i++) {
			Ecu ecu = new Ecu();
			ecu.setEcuId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].EcuId"));
			ecu.setOnline(_ctx.booleanValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].Online"));
			ecu.setDockerEnv(_ctx.booleanValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].DockerEnv"));
			ecu.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].CreateTime"));
			ecu.setUpdateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].UpdateTime"));
			ecu.setIpAddr(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].IpAddr"));
			ecu.setHeartbeatTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].HeartbeatTime"));
			ecu.setUserId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].UserId"));
			ecu.setGroupId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].GroupId"));
			ecu.setName(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].Name"));
			ecu.setZoneId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].ZoneId"));
			ecu.setRegionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].RegionId"));
			ecu.setInstanceId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].InstanceId"));
			ecu.setVpcId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].VpcId"));
			ecu.setRegionId1(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].RegionId"));
			ecu.setAvailableCpu(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].AvailableCpu"));
			ecu.setAvailableMem(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].AvailableMem"));

			ecuList.add(ecu);
		}
		appInfo.setEcuList(ecuList);

		List<Ecc> eccList = new ArrayList<Ecc>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.EccList.Length"); i++) {
			Ecc ecc = new Ecc();
			ecc.setEccId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].EccId"));
			ecc.setEcuId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].EcuId"));
			ecc.setAppId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].AppId"));
			ecc.setAppState(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].AppState"));
			ecc.setTaskState(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].TaskState"));
			ecc.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].CreateTime"));
			ecc.setUpdateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].UpdateTime"));
			ecc.setIp(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].Ip"));
			ecc.setVpcId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].VpcId"));
			ecc.setGroupId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].GroupId"));
			ecc.setContainerStatus(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].ContainerStatus"));

			eccList.add(ecc);
		}
		appInfo.setEccList(eccList);

		List<Group> groupList = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.GroupList.Length"); i++) {
			Group group = new Group();
			group.setGroupId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupId"));
			group.setGroupName(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupName"));
			group.setAppId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].AppId"));
			group.setPackageVersionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].PackageVersionId"));
			group.setAppVersionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].AppVersionId"));
			group.setGroupType(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupType"));
			group.setClusterId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].ClusterId"));
			group.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].CreateTime"));
			group.setUpdateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].UpdateTime"));

			groupList.add(group);
		}
		appInfo.setGroupList(groupList);

		List<DeployRecord> deployRecordList = new ArrayList<DeployRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList.Length"); i++) {
			DeployRecord deployRecord = new DeployRecord();
			deployRecord.setDeployRecordId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].DeployRecordId"));
			deployRecord.setEccId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].EccId"));
			deployRecord.setEcuId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].EcuId"));
			deployRecord.setPackageVersionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].PackageVersionId"));
			deployRecord.setPackageMd5(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].PackageMd5"));
			deployRecord.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].CreateTime"));

			deployRecordList.add(deployRecord);
		}
		appInfo.setDeployRecordList(deployRecordList);
		queryApplicationStatusResponse.setAppInfo(appInfo);
	 
	 	return queryApplicationStatusResponse;
	}
}