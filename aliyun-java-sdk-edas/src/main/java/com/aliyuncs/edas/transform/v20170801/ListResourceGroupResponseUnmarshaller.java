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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceGroupResponseUnmarshaller {

	public static ListResourceGroupResponse unmarshall(ListResourceGroupResponse listResourceGroupResponse, UnmarshallerContext _ctx) {
		
		listResourceGroupResponse.setRequestId(_ctx.stringValue("ListResourceGroupResponse.RequestId"));
		listResourceGroupResponse.setCode(_ctx.integerValue("ListResourceGroupResponse.Code"));
		listResourceGroupResponse.setMessage(_ctx.stringValue("ListResourceGroupResponse.Message"));

		List<ResGroupEntity> resourceGroupList = new ArrayList<ResGroupEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceGroupResponse.ResourceGroupList.Length"); i++) {
			ResGroupEntity resGroupEntity = new ResGroupEntity();
			resGroupEntity.setUpdateTime(_ctx.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].UpdateTime"));
			resGroupEntity.setDescription(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].Description"));
			resGroupEntity.setAdminUserId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].AdminUserId"));
			resGroupEntity.setCreateTime(_ctx.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].CreateTime"));
			resGroupEntity.setName(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].Name"));
			resGroupEntity.setId(_ctx.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].Id"));
			resGroupEntity.setRegionId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].RegionId"));

			List<EcsEntity> ecsList = new ArrayList<EcsEntity>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList.Length"); j++) {
				EcsEntity ecsEntity = new EcsEntity();
				ecsEntity.setVpcId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcId"));
				ecsEntity.setSgId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].SgId"));
				ecsEntity.setStatus(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Status"));
				ecsEntity.setPrivateIp(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].PrivateIp"));
				ecsEntity.setExpired(_ctx.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Expired"));
				ecsEntity.setUserId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].UserId"));
				ecsEntity.setHostName(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].HostName"));
				ecsEntity.setInstanceId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InstanceId"));
				ecsEntity.setMem(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Mem"));
				ecsEntity.setRegionId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].RegionId"));
				ecsEntity.setCpu(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Cpu"));
				ecsEntity.setInnerIp(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InnerIp"));
				ecsEntity.setGroupId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].GroupId"));
				ecsEntity.setEip(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Eip"));
				ecsEntity.setDescription(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].Description"));
				ecsEntity.setInstanceName(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].InstanceName"));
				ecsEntity.setZoneId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].ZoneId"));
				ecsEntity.setSerialNum(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].SerialNum"));
				ecsEntity.setPublicIp(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].PublicIp"));

				EcuEntity ecuEntity = new EcuEntity();
				ecuEntity.setVpcId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.VpcId"));
				ecuEntity.setUpdateTime(_ctx.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.UpdateTime"));
				ecuEntity.setIpAddr(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.IpAddr"));
				ecuEntity.setAvailableCpu(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.AvailableCpu"));
				ecuEntity.setCreateTime(_ctx.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.CreateTime"));
				ecuEntity.setUserId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.UserId"));
				ecuEntity.setInstanceId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.InstanceId"));
				ecuEntity.setMem(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Mem"));
				ecuEntity.setRegionId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.RegionId"));
				ecuEntity.setEcuId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.EcuId"));
				ecuEntity.setCpu(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Cpu"));
				ecuEntity.setDockerEnv(_ctx.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.DockerEnv"));
				ecuEntity.setOnline(_ctx.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Online"));
				ecuEntity.setAvailableMem(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.AvailableMem"));
				ecuEntity.setZoneId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.ZoneId"));
				ecuEntity.setName(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.Name"));
				ecuEntity.setHeartbeatTime(_ctx.longValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].EcuEntity.HeartbeatTime"));
				ecsEntity.setEcuEntity(ecuEntity);

				VpcEntity vpcEntity = new VpcEntity();
				vpcEntity.setStatus(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Status"));
				vpcEntity.setVpcName(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.VpcName"));
				vpcEntity.setVpcId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.VpcId"));
				vpcEntity.setDescription(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Description"));
				vpcEntity.setExpired(_ctx.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Expired"));
				vpcEntity.setCidrblock(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.Cidrblock"));
				vpcEntity.setUserId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.UserId"));
				vpcEntity.setEcsNum(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.EcsNum"));
				vpcEntity.setRegionId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].ecsList["+ j +"].VpcEntity.RegionId"));
				ecsEntity.setVpcEntity(vpcEntity);

				ecsList.add(ecsEntity);
			}
			resGroupEntity.setEcsList(ecsList);

			List<SlbEntity> slbList = new ArrayList<SlbEntity>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList.Length"); j++) {
				SlbEntity slbEntity = new SlbEntity();
				slbEntity.setSlbId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].SlbId"));
				slbEntity.setVpcId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].VpcId"));
				slbEntity.setVswitchId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].VswitchId"));
				slbEntity.setExpired(_ctx.booleanValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].Expired"));
				slbEntity.setUserId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].UserId"));
				slbEntity.setAddressType(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].AddressType"));
				slbEntity.setNetworkType(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].NetworkType"));
				slbEntity.setRegionId(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].RegionId"));
				slbEntity.setGroupId(_ctx.integerValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].GroupId"));
				slbEntity.setAddress(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].Address"));
				slbEntity.setSlbName(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].SlbName"));
				slbEntity.setSlbStatus(_ctx.stringValue("ListResourceGroupResponse.ResourceGroupList["+ i +"].SlbList["+ j +"].SlbStatus"));

				slbList.add(slbEntity);
			}
			resGroupEntity.setSlbList(slbList);

			resourceGroupList.add(resGroupEntity);
		}
		listResourceGroupResponse.setResourceGroupList(resourceGroupList);
	 
	 	return listResourceGroupResponse;
	}
}