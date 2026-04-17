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

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceDetailsResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceDetailsResponse.EngineInfo;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceDetailsResponse.EngineInfo.ConnectAddress;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceDetailsResponse.EngineInfo.NodeGroupItem;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceDetailsResponse.StorageUsage;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceDetailsResponse.WhiteIpListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2InstanceDetailsResponseUnmarshaller {

	public static GetLindormV2InstanceDetailsResponse unmarshall(GetLindormV2InstanceDetailsResponse getLindormV2InstanceDetailsResponse, UnmarshallerContext _ctx) {
		
		getLindormV2InstanceDetailsResponse.setRequestId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.RequestId"));
		getLindormV2InstanceDetailsResponse.setVpcId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.VpcId"));
		getLindormV2InstanceDetailsResponse.setVswitchId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.VswitchId"));
		getLindormV2InstanceDetailsResponse.setPayType(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.PayType"));
		getLindormV2InstanceDetailsResponse.setNetworkType(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.NetworkType"));
		getLindormV2InstanceDetailsResponse.setDiskUsage(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.DiskUsage"));
		getLindormV2InstanceDetailsResponse.setDiskCategory(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.DiskCategory"));
		getLindormV2InstanceDetailsResponse.setColdStorage(_ctx.integerValue("GetLindormV2InstanceDetailsResponse.ColdStorage"));
		getLindormV2InstanceDetailsResponse.setExpiredMilliseconds(_ctx.longValue("GetLindormV2InstanceDetailsResponse.ExpiredMilliseconds"));
		getLindormV2InstanceDetailsResponse.setAutoRenew(_ctx.booleanValue("GetLindormV2InstanceDetailsResponse.AutoRenew"));
		getLindormV2InstanceDetailsResponse.setDeletionProtection(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.DeletionProtection"));
		getLindormV2InstanceDetailsResponse.setAliUid(_ctx.longValue("GetLindormV2InstanceDetailsResponse.AliUid"));
		getLindormV2InstanceDetailsResponse.setInstanceId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.InstanceId"));
		getLindormV2InstanceDetailsResponse.setInstanceType(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.InstanceType"));
		getLindormV2InstanceDetailsResponse.setRegionId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.RegionId"));
		getLindormV2InstanceDetailsResponse.setCreateMilliseconds(_ctx.longValue("GetLindormV2InstanceDetailsResponse.CreateMilliseconds"));
		getLindormV2InstanceDetailsResponse.setInstanceAlias(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.InstanceAlias"));
		getLindormV2InstanceDetailsResponse.setZoneId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.ZoneId"));
		getLindormV2InstanceDetailsResponse.setInstanceStatus(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.InstanceStatus"));
		getLindormV2InstanceDetailsResponse.setPrimaryZoneId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.PrimaryZoneId"));
		getLindormV2InstanceDetailsResponse.setPrimaryVSwitchId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.PrimaryVSwitchId"));
		getLindormV2InstanceDetailsResponse.setStandbyZoneId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.StandbyZoneId"));
		getLindormV2InstanceDetailsResponse.setStandbyVSwitchId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.StandbyVSwitchId"));
		getLindormV2InstanceDetailsResponse.setArbiterZoneId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.ArbiterZoneId"));
		getLindormV2InstanceDetailsResponse.setArbiterVSwitchId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.ArbiterVSwitchId"));
		getLindormV2InstanceDetailsResponse.setResourceGroupId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.ResourceGroupId"));
		getLindormV2InstanceDetailsResponse.setServiceType(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.ServiceType"));
		getLindormV2InstanceDetailsResponse.setZoneEngineInfoMap(_ctx.mapValue("GetLindormV2InstanceDetailsResponse.ZoneEngineInfoMap"));
		getLindormV2InstanceDetailsResponse.setInitialRootPassword(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.InitialRootPassword"));
		getLindormV2InstanceDetailsResponse.setDiskThreshold(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.DiskThreshold"));
		getLindormV2InstanceDetailsResponse.setEnableCompute(_ctx.booleanValue("GetLindormV2InstanceDetailsResponse.EnableCompute"));
		getLindormV2InstanceDetailsResponse.setMaintainStartTime(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.MaintainStartTime"));
		getLindormV2InstanceDetailsResponse.setMaintainEndTime(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.MaintainEndTime"));
		getLindormV2InstanceDetailsResponse.setCloudStorageSize(_ctx.longValue("GetLindormV2InstanceDetailsResponse.CloudStorageSize"));
		getLindormV2InstanceDetailsResponse.setEnableFs(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EnableFs"));
		getLindormV2InstanceDetailsResponse.setEnableStoreTDE(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EnableStoreTDE"));

		StorageUsage storageUsage = new StorageUsage();
		storageUsage.setEngineUsage(_ctx.mapValue("GetLindormV2InstanceDetailsResponse.StorageUsage.EngineUsage"));

		List<Map<Object, Object>> capacityByDiskCategory = _ctx.listMapValue("GetLindormV2InstanceDetailsResponse.StorageUsage.CapacityByDiskCategory");
		storageUsage.setCapacityByDiskCategory(capacityByDiskCategory);
		getLindormV2InstanceDetailsResponse.setStorageUsage(storageUsage);

		List<EngineInfo> engineList = new ArrayList<EngineInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceDetailsResponse.EngineList.Length"); i++) {
			EngineInfo engineInfo = new EngineInfo();
			engineInfo.setVersion(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].Version"));
			engineInfo.setEngine(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].Engine"));
			engineInfo.setIsLastVersion(_ctx.booleanValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].IsLastVersion"));
			engineInfo.setLatestVersion(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].LatestVersion"));

			List<ConnectAddress> connectAddressList = new ArrayList<ConnectAddress>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].ConnectAddressList.Length"); j++) {
				ConnectAddress connectAddress = new ConnectAddress();
				connectAddress.setAddress(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Address"));
				connectAddress.setType(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Type"));
				connectAddress.setPort(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].ConnectAddressList["+ j +"].Port"));

				connectAddressList.add(connectAddress);
			}
			engineInfo.setConnectAddressList(connectAddressList);

			List<NodeGroupItem> nodeGroup = new ArrayList<NodeGroupItem>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup.Length"); j++) {
				NodeGroupItem nodeGroupItem = new NodeGroupItem();
				nodeGroupItem.setNodeSpec(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].NodeSpec"));
				nodeGroupItem.setEnableAttachLocalDisk(_ctx.booleanValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].EnableAttachLocalDisk"));
				nodeGroupItem.setLocalDiskCategory(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].LocalDiskCategory"));
				nodeGroupItem.setLocalDiskCapacity(_ctx.longValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].LocalDiskCapacity"));
				nodeGroupItem.setCpuCoreCount(_ctx.integerValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].CpuCoreCount"));
				nodeGroupItem.setMemorySizeGiB(_ctx.integerValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].MemorySizeGiB"));
				nodeGroupItem.setQuantity(_ctx.integerValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].Quantity"));
				nodeGroupItem.setCategory(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].Category"));
				nodeGroupItem.setResourceGroupName(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].ResourceGroupName"));
				nodeGroupItem.setSpecId(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].SpecId"));
				nodeGroupItem.setStatus(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.EngineList["+ i +"].NodeGroup["+ j +"].Status"));

				nodeGroup.add(nodeGroupItem);
			}
			engineInfo.setNodeGroup(nodeGroup);

			engineList.add(engineInfo);
		}
		getLindormV2InstanceDetailsResponse.setEngineList(engineList);

		List<WhiteIpListItem> whiteIpList = new ArrayList<WhiteIpListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceDetailsResponse.WhiteIpList.Length"); i++) {
			WhiteIpListItem whiteIpListItem = new WhiteIpListItem();
			whiteIpListItem.setGroupName(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.WhiteIpList["+ i +"].GroupName"));
			whiteIpListItem.setIpList(_ctx.stringValue("GetLindormV2InstanceDetailsResponse.WhiteIpList["+ i +"].IpList"));

			whiteIpList.add(whiteIpListItem);
		}
		getLindormV2InstanceDetailsResponse.setWhiteIpList(whiteIpList);
	 
	 	return getLindormV2InstanceDetailsResponse;
	}
}