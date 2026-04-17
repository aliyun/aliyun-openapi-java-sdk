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

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceResponse.EngineInfo;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceResponse.EngineInfo.ConnectAddress;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceResponse.EngineInfo.NodeGroupItem;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceResponse.StorageUsage;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceResponse.WhiteIpListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2InstanceResponseUnmarshaller {

	public static GetLindormV2InstanceResponse unmarshall(GetLindormV2InstanceResponse getLindormV2InstanceResponse, UnmarshallerContext _ctx) {
		
		getLindormV2InstanceResponse.setRequestId(_ctx.stringValue("GetLindormV2InstanceResponse.RequestId"));
		getLindormV2InstanceResponse.setVpcId(_ctx.stringValue("GetLindormV2InstanceResponse.VpcId"));
		getLindormV2InstanceResponse.setVswitchId(_ctx.stringValue("GetLindormV2InstanceResponse.VswitchId"));
		getLindormV2InstanceResponse.setPayType(_ctx.stringValue("GetLindormV2InstanceResponse.PayType"));
		getLindormV2InstanceResponse.setNetworkType(_ctx.stringValue("GetLindormV2InstanceResponse.NetworkType"));
		getLindormV2InstanceResponse.setDiskUsage(_ctx.stringValue("GetLindormV2InstanceResponse.DiskUsage"));
		getLindormV2InstanceResponse.setDiskCategory(_ctx.stringValue("GetLindormV2InstanceResponse.DiskCategory"));
		getLindormV2InstanceResponse.setColdStorage(_ctx.integerValue("GetLindormV2InstanceResponse.ColdStorage"));
		getLindormV2InstanceResponse.setExpiredMilliseconds(_ctx.longValue("GetLindormV2InstanceResponse.ExpiredMilliseconds"));
		getLindormV2InstanceResponse.setAutoRenew(_ctx.booleanValue("GetLindormV2InstanceResponse.AutoRenew"));
		getLindormV2InstanceResponse.setDeletionProtection(_ctx.stringValue("GetLindormV2InstanceResponse.DeletionProtection"));
		getLindormV2InstanceResponse.setAliUid(_ctx.longValue("GetLindormV2InstanceResponse.AliUid"));
		getLindormV2InstanceResponse.setInstanceId(_ctx.stringValue("GetLindormV2InstanceResponse.InstanceId"));
		getLindormV2InstanceResponse.setInstanceType(_ctx.stringValue("GetLindormV2InstanceResponse.InstanceType"));
		getLindormV2InstanceResponse.setRegionId(_ctx.stringValue("GetLindormV2InstanceResponse.RegionId"));
		getLindormV2InstanceResponse.setCreateMilliseconds(_ctx.longValue("GetLindormV2InstanceResponse.CreateMilliseconds"));
		getLindormV2InstanceResponse.setInstanceAlias(_ctx.stringValue("GetLindormV2InstanceResponse.InstanceAlias"));
		getLindormV2InstanceResponse.setZoneId(_ctx.stringValue("GetLindormV2InstanceResponse.ZoneId"));
		getLindormV2InstanceResponse.setInstanceStatus(_ctx.stringValue("GetLindormV2InstanceResponse.InstanceStatus"));
		getLindormV2InstanceResponse.setPrimaryZoneId(_ctx.stringValue("GetLindormV2InstanceResponse.PrimaryZoneId"));
		getLindormV2InstanceResponse.setPrimaryVSwitchId(_ctx.stringValue("GetLindormV2InstanceResponse.PrimaryVSwitchId"));
		getLindormV2InstanceResponse.setStandbyZoneId(_ctx.stringValue("GetLindormV2InstanceResponse.StandbyZoneId"));
		getLindormV2InstanceResponse.setStandbyVSwitchId(_ctx.stringValue("GetLindormV2InstanceResponse.StandbyVSwitchId"));
		getLindormV2InstanceResponse.setArbiterZoneId(_ctx.stringValue("GetLindormV2InstanceResponse.ArbiterZoneId"));
		getLindormV2InstanceResponse.setArbiterVSwitchId(_ctx.stringValue("GetLindormV2InstanceResponse.ArbiterVSwitchId"));
		getLindormV2InstanceResponse.setResourceGroupId(_ctx.stringValue("GetLindormV2InstanceResponse.ResourceGroupId"));
		getLindormV2InstanceResponse.setServiceType(_ctx.stringValue("GetLindormV2InstanceResponse.ServiceType"));
		getLindormV2InstanceResponse.setZoneEngineInfoMap(_ctx.mapValue("GetLindormV2InstanceResponse.ZoneEngineInfoMap"));
		getLindormV2InstanceResponse.setInitialRootPassword(_ctx.stringValue("GetLindormV2InstanceResponse.InitialRootPassword"));
		getLindormV2InstanceResponse.setDiskThreshold(_ctx.stringValue("GetLindormV2InstanceResponse.DiskThreshold"));
		getLindormV2InstanceResponse.setEnableCompute(_ctx.booleanValue("GetLindormV2InstanceResponse.EnableCompute"));
		getLindormV2InstanceResponse.setMaintainStartTime(_ctx.stringValue("GetLindormV2InstanceResponse.MaintainStartTime"));
		getLindormV2InstanceResponse.setMaintainEndTime(_ctx.stringValue("GetLindormV2InstanceResponse.MaintainEndTime"));
		getLindormV2InstanceResponse.setCloudStorageSize(_ctx.longValue("GetLindormV2InstanceResponse.CloudStorageSize"));
		getLindormV2InstanceResponse.setEnableFS(_ctx.booleanValue("GetLindormV2InstanceResponse.EnableFS"));
		getLindormV2InstanceResponse.setEnableStoreTDE(_ctx.booleanValue("GetLindormV2InstanceResponse.EnableStoreTDE"));

		StorageUsage storageUsage = new StorageUsage();
		storageUsage.setEngineUsage(_ctx.mapValue("GetLindormV2InstanceResponse.StorageUsage.EngineUsage"));

		List<Map<Object, Object>> capacityByDiskCategory = _ctx.listMapValue("GetLindormV2InstanceResponse.StorageUsage.CapacityByDiskCategory");
		storageUsage.setCapacityByDiskCategory(capacityByDiskCategory);
		getLindormV2InstanceResponse.setStorageUsage(storageUsage);

		List<EngineInfo> engineList = new ArrayList<EngineInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceResponse.EngineList.Length"); i++) {
			EngineInfo engineInfo = new EngineInfo();
			engineInfo.setVersion(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].Version"));
			engineInfo.setEngine(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].Engine"));
			engineInfo.setIsLastVersion(_ctx.booleanValue("GetLindormV2InstanceResponse.EngineList["+ i +"].IsLastVersion"));
			engineInfo.setEnableBackup(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].EnableBackup"));
			engineInfo.setEnableCDC(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].EnableCDC"));
			engineInfo.setLatestVersion(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].LatestVersion"));
			engineInfo.setEnableMaaS(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].EnableMaaS"));

			List<ConnectAddress> connectAddressList = new ArrayList<ConnectAddress>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceResponse.EngineList["+ i +"].ConnectAddressList.Length"); j++) {
				ConnectAddress connectAddress = new ConnectAddress();
				connectAddress.setAddress(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Address"));
				connectAddress.setType(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Type"));
				connectAddress.setPort(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Port"));

				connectAddressList.add(connectAddress);
			}
			engineInfo.setConnectAddressList(connectAddressList);

			List<NodeGroupItem> nodeGroup = new ArrayList<NodeGroupItem>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup.Length"); j++) {
				NodeGroupItem nodeGroupItem = new NodeGroupItem();
				nodeGroupItem.setNodeSpec(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].NodeSpec"));
				nodeGroupItem.setEnableAttachLocalDisk(_ctx.booleanValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].EnableAttachLocalDisk"));
				nodeGroupItem.setLocalDiskCategory(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].LocalDiskCategory"));
				nodeGroupItem.setLocalDiskCapacity(_ctx.longValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].LocalDiskCapacity"));
				nodeGroupItem.setCpuCoreCount(_ctx.integerValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].CpuCoreCount"));
				nodeGroupItem.setMemorySizeGiB(_ctx.integerValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].MemorySizeGiB"));
				nodeGroupItem.setQuantity(_ctx.integerValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].Quantity"));
				nodeGroupItem.setCategory(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].Category"));
				nodeGroupItem.setResourceGroupName(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].ResourceGroupName"));
				nodeGroupItem.setSpecId(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].SpecId"));
				nodeGroupItem.setStatus(_ctx.stringValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].Status"));
				nodeGroupItem.setIsScaleSpecGroup(_ctx.booleanValue("GetLindormV2InstanceResponse.EngineList["+ i +"].NodeGroup["+ j +"].IsScaleSpecGroup"));

				nodeGroup.add(nodeGroupItem);
			}
			engineInfo.setNodeGroup(nodeGroup);

			engineList.add(engineInfo);
		}
		getLindormV2InstanceResponse.setEngineList(engineList);

		List<WhiteIpListItem> whiteIpList = new ArrayList<WhiteIpListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceResponse.WhiteIpList.Length"); i++) {
			WhiteIpListItem whiteIpListItem = new WhiteIpListItem();
			whiteIpListItem.setGroupName(_ctx.stringValue("GetLindormV2InstanceResponse.WhiteIpList["+ i +"].GroupName"));
			whiteIpListItem.setIpList(_ctx.stringValue("GetLindormV2InstanceResponse.WhiteIpList["+ i +"].IpList"));

			whiteIpList.add(whiteIpListItem);
		}
		getLindormV2InstanceResponse.setWhiteIpList(whiteIpList);
	 
	 	return getLindormV2InstanceResponse;
	}
}