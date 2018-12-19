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

import com.aliyuncs.edas.model.v20170801.ListResourceGroupResponse;
import com.aliyuncs.edas.model.v20170801.ListResourceGroupResponse.ResGroupEntity;
import com.aliyuncs.edas.model.v20170801.ListResourceGroupResponse.ResGroupEntity.EcsEntity;
import com.aliyuncs.edas.model.v20170801.ListResourceGroupResponse.ResGroupEntity.EcsEntity.EcuEntity;
import com.aliyuncs.edas.model.v20170801.ListResourceGroupResponse.ResGroupEntity.EcsEntity.VpcEntity;
import com.aliyuncs.edas.model.v20170801.ListResourceGroupResponse.ResGroupEntity.SlbEntity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceGroupResponseUnmarshaller {

	public static ListResourceGroupResponse unmarshall(ListResourceGroupResponse listResourceGroupResponse, UnmarshallerContext context) {
		
		listResourceGroupResponse.setRequestId(context.stringValue("ListResourceGroupResponse.RequestId"));
		listResourceGroupResponse.setCode(context.integerValue("ListResourceGroupResponse.Code"));
		listResourceGroupResponse.setMessage(context.stringValue("ListResourceGroupResponse.Message"));

		List<ResGroupEntity> resourceGroupList = new ArrayList<ResGroupEntity>();
		for (int i = 0; i < context.lengthValue("ListResourceGroupResponse.ResourceGroupList.Length"); i++) {
			ResGroupEntity resGroupEntity = new ResGroupEntity();
			resGroupEntity.setId(context.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].Id"));
			resGroupEntity.setName(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].Name"));
			resGroupEntity.setDescription(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].Description"));
			resGroupEntity.setAdminUserId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].AdminUserId"));
			resGroupEntity.setCreateTime(context.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].CreateTime"));
			resGroupEntity.setUpdateTime(context.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].UpdateTime"));
			resGroupEntity.setRegionId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].RegionId"));

			List<EcsEntity> ecsList = new ArrayList<EcsEntity>();
			for (int j = 0; j < context.lengthValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList.Length"); j++) {
				EcsEntity ecsEntity = new EcsEntity();
				ecsEntity.setInstanceId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InstanceId"));
				ecsEntity.setInstanceName(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InstanceName"));
				ecsEntity.setHostName(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].HostName"));
				ecsEntity.setDescription(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Description"));
				ecsEntity.setStatus(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Status"));
				ecsEntity.setPublicIp(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].PublicIp"));
				ecsEntity.setInnerIp(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InnerIp"));
				ecsEntity.setPrivateIp(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].PrivateIp"));
				ecsEntity.setEip(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Eip"));
				ecsEntity.setSerialNum(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].SerialNum"));
				ecsEntity.setUserId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].UserId"));
				ecsEntity.setZoneId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].ZoneId"));
				ecsEntity.setRegionId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].RegionId"));
				ecsEntity.setInstanceId1(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InstanceId"));
				ecsEntity.setExpired(context.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Expired"));
				ecsEntity.setSgId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].SgId"));
				ecsEntity.setVpcId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcId"));
				ecsEntity.setGroupId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].GroupId"));
				ecsEntity.setCpu(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Cpu"));
				ecsEntity.setMem(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Mem"));

				EcuEntity ecuEntity = new EcuEntity();
				ecuEntity.setEcuId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.EcuId"));
				ecuEntity.setOnline(context.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Online"));
				ecuEntity.setDockerEnv(context.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.DockerEnv"));
				ecuEntity.setCreateTime(context.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.CreateTime"));
				ecuEntity.setUpdateTime(context.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.UpdateTime"));
				ecuEntity.setIpAddr(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.IpAddr"));
				ecuEntity.setHeartbeatTime(context.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.HeartbeatTime"));
				ecuEntity.setUserId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.UserId"));
				ecuEntity.setName(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Name"));
				ecuEntity.setZoneId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.ZoneId"));
				ecuEntity.setRegionId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.RegionId"));
				ecuEntity.setInstanceId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.InstanceId"));
				ecuEntity.setVpcId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.VpcId"));
				ecuEntity.setAvailableCpu(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.AvailableCpu"));
				ecuEntity.setAvailableMem(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.AvailableMem"));
				ecuEntity.setCpu(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Cpu"));
				ecuEntity.setMem(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Mem"));
				ecsEntity.setEcuEntity(ecuEntity);

				VpcEntity vpcEntity = new VpcEntity();
				vpcEntity.setVpcId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.VpcId"));
				vpcEntity.setVpcName(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.VpcName"));
				vpcEntity.setRegionId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.RegionId"));
				vpcEntity.setUserId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.UserId"));
				vpcEntity.setCidrblock(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Cidrblock"));
				vpcEntity.setStatus(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Status"));
				vpcEntity.setDescription(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Description"));
				vpcEntity.setExpired(context.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Expired"));
				vpcEntity.setEcsNum(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.EcsNum"));
				ecsEntity.setVpcEntity(vpcEntity);

				ecsList.add(ecsEntity);
			}
			resGroupEntity.setEcsList(ecsList);

			List<SlbEntity> slbList = new ArrayList<SlbEntity>();
			for (int j = 0; j < context.lengthValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList.Length"); j++) {
				SlbEntity slbEntity = new SlbEntity();
				slbEntity.setSlbId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].SlbId"));
				slbEntity.setSlbName(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].SlbName"));
				slbEntity.setRegionId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].RegionId"));
				slbEntity.setUserId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].UserId"));
				slbEntity.setAddress(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].Address"));
				slbEntity.setSlbStatus(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].SlbStatus"));
				slbEntity.setAddressType(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].AddressType"));
				slbEntity.setVswitchId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].VswitchId"));
				slbEntity.setVpcId(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].VpcId"));
				slbEntity.setNetworkType(context.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].NetworkType"));
				slbEntity.setGroupId(context.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].GroupId"));
				slbEntity.setExpired(context.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].Expired"));

				slbList.add(slbEntity);
			}
			resGroupEntity.setSlbList(slbList);

			resourceGroupList.add(resGroupEntity);
		}
		listResourceGroupResponse.setResourceGroupList(resourceGroupList);
	 
	 	return listResourceGroupResponse;
	}
}