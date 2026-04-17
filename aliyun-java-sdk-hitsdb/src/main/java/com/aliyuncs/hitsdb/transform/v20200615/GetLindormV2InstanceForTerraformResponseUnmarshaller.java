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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceForTerraformResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceForTerraformResponse.EngineInfo;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceForTerraformResponse.EngineInfo.ConnectAddress;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceForTerraformResponse.EngineInfo.NodeGroupItem;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceForTerraformResponse.StorageUsage;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceForTerraformResponse.WhiteIpListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2InstanceForTerraformResponseUnmarshaller {

	public static GetLindormV2InstanceForTerraformResponse unmarshall(GetLindormV2InstanceForTerraformResponse getLindormV2InstanceForTerraformResponse, UnmarshallerContext _ctx) {
		
		getLindormV2InstanceForTerraformResponse.setRequestId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.RequestId"));
		getLindormV2InstanceForTerraformResponse.setVpcId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.VpcId"));
		getLindormV2InstanceForTerraformResponse.setVswitchId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.VswitchId"));
		getLindormV2InstanceForTerraformResponse.setPayType(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.PayType"));
		getLindormV2InstanceForTerraformResponse.setNetworkType(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.NetworkType"));
		getLindormV2InstanceForTerraformResponse.setDiskUsage(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.DiskUsage"));
		getLindormV2InstanceForTerraformResponse.setDiskCategory(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.DiskCategory"));
		getLindormV2InstanceForTerraformResponse.setColdStorage(_ctx.integerValue("GetLindormV2InstanceForTerraformResponse.ColdStorage"));
		getLindormV2InstanceForTerraformResponse.setExpiredMilliseconds(_ctx.longValue("GetLindormV2InstanceForTerraformResponse.ExpiredMilliseconds"));
		getLindormV2InstanceForTerraformResponse.setAutoRenew(_ctx.booleanValue("GetLindormV2InstanceForTerraformResponse.AutoRenew"));
		getLindormV2InstanceForTerraformResponse.setDeletionProtection(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.DeletionProtection"));
		getLindormV2InstanceForTerraformResponse.setAliUid(_ctx.longValue("GetLindormV2InstanceForTerraformResponse.AliUid"));
		getLindormV2InstanceForTerraformResponse.setInstanceId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.InstanceId"));
		getLindormV2InstanceForTerraformResponse.setInstanceType(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.InstanceType"));
		getLindormV2InstanceForTerraformResponse.setRegionId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.RegionId"));
		getLindormV2InstanceForTerraformResponse.setCreateMilliseconds(_ctx.longValue("GetLindormV2InstanceForTerraformResponse.CreateMilliseconds"));
		getLindormV2InstanceForTerraformResponse.setInstanceAlias(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.InstanceAlias"));
		getLindormV2InstanceForTerraformResponse.setZoneId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.ZoneId"));
		getLindormV2InstanceForTerraformResponse.setInstanceStatus(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.InstanceStatus"));
		getLindormV2InstanceForTerraformResponse.setPrimaryZoneId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.PrimaryZoneId"));
		getLindormV2InstanceForTerraformResponse.setPrimaryVSwitchId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.PrimaryVSwitchId"));
		getLindormV2InstanceForTerraformResponse.setStandbyZoneId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.StandbyZoneId"));
		getLindormV2InstanceForTerraformResponse.setStandbyVSwitchId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.StandbyVSwitchId"));
		getLindormV2InstanceForTerraformResponse.setArbiterZoneId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.ArbiterZoneId"));
		getLindormV2InstanceForTerraformResponse.setArbiterVSwitchId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.ArbiterVSwitchId"));
		getLindormV2InstanceForTerraformResponse.setResourceGroupId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.ResourceGroupId"));
		getLindormV2InstanceForTerraformResponse.setServiceType(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.ServiceType"));
		getLindormV2InstanceForTerraformResponse.setZoneEngineInfoMap(_ctx.mapValue("GetLindormV2InstanceForTerraformResponse.ZoneEngineInfoMap"));
		getLindormV2InstanceForTerraformResponse.setInitialRootPassword(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.InitialRootPassword"));
		getLindormV2InstanceForTerraformResponse.setDiskThreshold(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.DiskThreshold"));
		getLindormV2InstanceForTerraformResponse.setEnableCompute(_ctx.booleanValue("GetLindormV2InstanceForTerraformResponse.EnableCompute"));
		getLindormV2InstanceForTerraformResponse.setMaintainStartTime(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.MaintainStartTime"));
		getLindormV2InstanceForTerraformResponse.setMaintainEndTime(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.MaintainEndTime"));
		getLindormV2InstanceForTerraformResponse.setCloudStorageSize(_ctx.longValue("GetLindormV2InstanceForTerraformResponse.CloudStorageSize"));

		StorageUsage storageUsage = new StorageUsage();
		storageUsage.setEngineUsage(_ctx.mapValue("GetLindormV2InstanceForTerraformResponse.StorageUsage.EngineUsage"));

		List<Map<Object, Object>> capacityByDiskCategory = _ctx.listMapValue("GetLindormV2InstanceForTerraformResponse.StorageUsage.CapacityByDiskCategory");
		storageUsage.setCapacityByDiskCategory(capacityByDiskCategory);
		getLindormV2InstanceForTerraformResponse.setStorageUsage(storageUsage);

		List<EngineInfo> engineList = new ArrayList<EngineInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceForTerraformResponse.EngineList.Length"); i++) {
			EngineInfo engineInfo = new EngineInfo();
			engineInfo.setVersion(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].Version"));
			engineInfo.setEngine(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].Engine"));
			engineInfo.setIsLastVersion(_ctx.booleanValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].IsLastVersion"));
			engineInfo.setLatestVersion(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].LatestVersion"));

			List<ConnectAddress> connectAddressList = new ArrayList<ConnectAddress>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].ConnectAddressList.Length"); j++) {
				ConnectAddress connectAddress = new ConnectAddress();
				connectAddress.setAddress(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Address"));
				connectAddress.setType(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Type"));
				connectAddress.setPort(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Port"));

				connectAddressList.add(connectAddress);
			}
			engineInfo.setConnectAddressList(connectAddressList);

			List<NodeGroupItem> nodeGroup = new ArrayList<NodeGroupItem>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup.Length"); j++) {
				NodeGroupItem nodeGroupItem = new NodeGroupItem();
				nodeGroupItem.setNodeSpec(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].NodeSpec"));
				nodeGroupItem.setEnableAttachLocalDisk(_ctx.booleanValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].EnableAttachLocalDisk"));
				nodeGroupItem.setLocalDiskCategory(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].LocalDiskCategory"));
				nodeGroupItem.setLocalDiskCapacity(_ctx.longValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].LocalDiskCapacity"));
				nodeGroupItem.setCpuCoreCount(_ctx.integerValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].CpuCoreCount"));
				nodeGroupItem.setMemorySizeGiB(_ctx.integerValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].MemorySizeGiB"));
				nodeGroupItem.setQuantity(_ctx.integerValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].Quantity"));
				nodeGroupItem.setCategory(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].Category"));
				nodeGroupItem.setResourceGroupName(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].ResourceGroupName"));
				nodeGroupItem.setSpecId(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].SpecId"));
				nodeGroupItem.setStatus(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.EngineList["+ i +"].NodeGroup["+ j +"].Status"));

				nodeGroup.add(nodeGroupItem);
			}
			engineInfo.setNodeGroup(nodeGroup);

			engineList.add(engineInfo);
		}
		getLindormV2InstanceForTerraformResponse.setEngineList(engineList);

		List<WhiteIpListItem> whiteIpList = new ArrayList<WhiteIpListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceForTerraformResponse.WhiteIpList.Length"); i++) {
			WhiteIpListItem whiteIpListItem = new WhiteIpListItem();
			whiteIpListItem.setGroupName(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.WhiteIpList["+ i +"].GroupName"));
			whiteIpListItem.setIpList(_ctx.stringValue("GetLindormV2InstanceForTerraformResponse.WhiteIpList["+ i +"].IpList"));

			whiteIpList.add(whiteIpListItem);
		}
		getLindormV2InstanceForTerraformResponse.setWhiteIpList(whiteIpList);
	 
	 	return getLindormV2InstanceForTerraformResponse;
	}
}