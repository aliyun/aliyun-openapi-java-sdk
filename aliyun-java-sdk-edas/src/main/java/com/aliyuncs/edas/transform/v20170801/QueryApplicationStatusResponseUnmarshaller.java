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
		application.setHealthCheckUrl(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.HealthCheckUrl"));
		application.setOwner(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Owner"));
		application.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.Application.CreateTime"));
		application.setUserId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.UserId"));
		application.setPort(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Port"));
		application.setRunningInstanceCount(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.RunningInstanceCount"));
		application.setPhone(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Phone"));
		application.setRegionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.RegionId"));
		application.setBuildPackageId(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.BuildPackageId"));
		application.setDockerize(_ctx.booleanValue("QueryApplicationStatusResponse.AppInfo.Application.Dockerize"));
		application.setEmail(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Email"));
		application.setCpu(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Cpu"));
		application.setInstanceCount(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.InstanceCount"));
		application.setLaunchTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.Application.LaunchTime"));
		application.setMemory(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.Application.Memory"));
		application.setName(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.Name"));
		application.setApplicationId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.ApplicationId"));
		application.setClusterId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.Application.ClusterId"));
		appInfo.setApplication(application);

		List<Ecu> ecuList = new ArrayList<Ecu>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.EcuList.Length"); i++) {
			Ecu ecu = new Ecu();
			ecu.setVpcId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].VpcId"));
			ecu.setUpdateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].UpdateTime"));
			ecu.setIpAddr(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].IpAddr"));
			ecu.setAvailableCpu(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].AvailableCpu"));
			ecu.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].CreateTime"));
			ecu.setUserId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].UserId"));
			ecu.setInstanceId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].InstanceId"));
			ecu.setRegionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].RegionId"));
			ecu.setEcuId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].EcuId"));
			ecu.setGroupId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].GroupId"));
			ecu.setDockerEnv(_ctx.booleanValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].DockerEnv"));
			ecu.setOnline(_ctx.booleanValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].Online"));
			ecu.setAvailableMem(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].AvailableMem"));
			ecu.setZoneId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].ZoneId"));
			ecu.setName(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].Name"));
			ecu.setHeartbeatTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EcuList["+ i +"].HeartbeatTime"));

			ecuList.add(ecu);
		}
		appInfo.setEcuList(ecuList);

		List<Ecc> eccList = new ArrayList<Ecc>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.EccList.Length"); i++) {
			Ecc ecc = new Ecc();
			ecc.setVpcId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].VpcId"));
			ecc.setUpdateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].UpdateTime"));
			ecc.setEcuId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].EcuId"));
			ecc.setEccId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].EccId"));
			ecc.setGroupId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].GroupId"));
			ecc.setAppState(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].AppState"));
			ecc.setTaskState(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].TaskState"));
			ecc.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].CreateTime"));
			ecc.setAppId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].AppId"));
			ecc.setContainerStatus(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].ContainerStatus"));
			ecc.setIp(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.EccList["+ i +"].Ip"));

			eccList.add(ecc);
		}
		appInfo.setEccList(eccList);

		List<Group> groupList = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.GroupList.Length"); i++) {
			Group group = new Group();
			group.setUpdateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].UpdateTime"));
			group.setGroupName(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupName"));
			group.setGroupId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupId"));
			group.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].CreateTime"));
			group.setAppVersionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].AppVersionId"));
			group.setAppId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].AppId"));
			group.setPackageVersionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].PackageVersionId"));
			group.setGroupType(_ctx.integerValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].GroupType"));
			group.setClusterId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.GroupList["+ i +"].ClusterId"));

			groupList.add(group);
		}
		appInfo.setGroupList(groupList);

		List<DeployRecord> deployRecordList = new ArrayList<DeployRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList.Length"); i++) {
			DeployRecord deployRecord = new DeployRecord();
			deployRecord.setEccId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].EccId"));
			deployRecord.setEcuId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].EcuId"));
			deployRecord.setPackageMd5(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].PackageMd5"));
			deployRecord.setCreateTime(_ctx.longValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].CreateTime"));
			deployRecord.setPackageVersionId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].PackageVersionId"));
			deployRecord.setDeployRecordId(_ctx.stringValue("QueryApplicationStatusResponse.AppInfo.DeployRecordList["+ i +"].DeployRecordId"));

			deployRecordList.add(deployRecord);
		}
		appInfo.setDeployRecordList(deployRecordList);
		queryApplicationStatusResponse.setAppInfo(appInfo);
	 
	 	return queryApplicationStatusResponse;
	}
}