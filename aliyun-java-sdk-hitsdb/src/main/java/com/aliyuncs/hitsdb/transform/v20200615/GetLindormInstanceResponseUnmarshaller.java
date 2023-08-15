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

import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceResponse.Engine;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormInstanceResponseUnmarshaller {

	public static GetLindormInstanceResponse unmarshall(GetLindormInstanceResponse getLindormInstanceResponse, UnmarshallerContext _ctx) {
		
		getLindormInstanceResponse.setRequestId(_ctx.stringValue("GetLindormInstanceResponse.RequestId"));
		getLindormInstanceResponse.setVpcId(_ctx.stringValue("GetLindormInstanceResponse.VpcId"));
		getLindormInstanceResponse.setVswitchId(_ctx.stringValue("GetLindormInstanceResponse.VswitchId"));
		getLindormInstanceResponse.setCreateTime(_ctx.stringValue("GetLindormInstanceResponse.CreateTime"));
		getLindormInstanceResponse.setPayType(_ctx.stringValue("GetLindormInstanceResponse.PayType"));
		getLindormInstanceResponse.setNetworkType(_ctx.stringValue("GetLindormInstanceResponse.NetworkType"));
		getLindormInstanceResponse.setServiceType(_ctx.stringValue("GetLindormInstanceResponse.ServiceType"));
		getLindormInstanceResponse.setEnableKms(_ctx.booleanValue("GetLindormInstanceResponse.EnableKms"));
		getLindormInstanceResponse.setEnableML(_ctx.booleanValue("GetLindormInstanceResponse.EnableML"));
		getLindormInstanceResponse.setDiskUsage(_ctx.stringValue("GetLindormInstanceResponse.DiskUsage"));
		getLindormInstanceResponse.setDiskCategory(_ctx.stringValue("GetLindormInstanceResponse.DiskCategory"));
		getLindormInstanceResponse.setColdStorage(_ctx.integerValue("GetLindormInstanceResponse.ColdStorage"));
		getLindormInstanceResponse.setExpiredMilliseconds(_ctx.longValue("GetLindormInstanceResponse.ExpiredMilliseconds"));
		getLindormInstanceResponse.setEngineType(_ctx.integerValue("GetLindormInstanceResponse.EngineType"));
		getLindormInstanceResponse.setExpireTime(_ctx.stringValue("GetLindormInstanceResponse.ExpireTime"));
		getLindormInstanceResponse.setAutoRenew(_ctx.booleanValue("GetLindormInstanceResponse.AutoRenew"));
		getLindormInstanceResponse.setDeletionProtection(_ctx.stringValue("GetLindormInstanceResponse.DeletionProtection"));
		getLindormInstanceResponse.setInstanceStorage(_ctx.stringValue("GetLindormInstanceResponse.InstanceStorage"));
		getLindormInstanceResponse.setAliUid(_ctx.longValue("GetLindormInstanceResponse.AliUid"));
		getLindormInstanceResponse.setInstanceId(_ctx.stringValue("GetLindormInstanceResponse.InstanceId"));
		getLindormInstanceResponse.setRegionId(_ctx.stringValue("GetLindormInstanceResponse.RegionId"));
		getLindormInstanceResponse.setEnableFS(_ctx.booleanValue("GetLindormInstanceResponse.EnableFS"));
		getLindormInstanceResponse.setCreateMilliseconds(_ctx.longValue("GetLindormInstanceResponse.CreateMilliseconds"));
		getLindormInstanceResponse.setInstanceAlias(_ctx.stringValue("GetLindormInstanceResponse.InstanceAlias"));
		getLindormInstanceResponse.setEnableBDS(_ctx.booleanValue("GetLindormInstanceResponse.EnableBDS"));
		getLindormInstanceResponse.setEnablePhoenix(_ctx.booleanValue("GetLindormInstanceResponse.EnablePhoenix"));
		getLindormInstanceResponse.setDiskThreshold(_ctx.stringValue("GetLindormInstanceResponse.DiskThreshold"));
		getLindormInstanceResponse.setZoneId(_ctx.stringValue("GetLindormInstanceResponse.ZoneId"));
		getLindormInstanceResponse.setInstanceStatus(_ctx.stringValue("GetLindormInstanceResponse.InstanceStatus"));
		getLindormInstanceResponse.setEnableCompute(_ctx.booleanValue("GetLindormInstanceResponse.EnableCompute"));
		getLindormInstanceResponse.setEnableSSL(_ctx.booleanValue("GetLindormInstanceResponse.EnableSSL"));
		getLindormInstanceResponse.setEnableMLCtrl(_ctx.booleanValue("GetLindormInstanceResponse.EnableMLCtrl"));
		getLindormInstanceResponse.setEnableCdc(_ctx.booleanValue("GetLindormInstanceResponse.EnableCdc"));
		getLindormInstanceResponse.setEnableStream(_ctx.booleanValue("GetLindormInstanceResponse.EnableStream"));
		getLindormInstanceResponse.setEnableLTS(_ctx.booleanValue("GetLindormInstanceResponse.EnableLTS"));
		getLindormInstanceResponse.setEnableShs(_ctx.booleanValue("GetLindormInstanceResponse.EnableShs"));
		getLindormInstanceResponse.setEnableBlob(_ctx.booleanValue("GetLindormInstanceResponse.EnableBlob"));
		getLindormInstanceResponse.setMaintainStartTime(_ctx.stringValue("GetLindormInstanceResponse.MaintainStartTime"));
		getLindormInstanceResponse.setMaintainEndTime(_ctx.stringValue("GetLindormInstanceResponse.MaintainEndTime"));
		getLindormInstanceResponse.setResourceGroupId(_ctx.stringValue("GetLindormInstanceResponse.ResourceGroupId"));
		getLindormInstanceResponse.setLocalCloudCategory(_ctx.stringValue("GetLindormInstanceResponse.LocalCloudCategory"));
		getLindormInstanceResponse.setLocalCloudStorage(_ctx.integerValue("GetLindormInstanceResponse.LocalCloudStorage"));
		getLindormInstanceResponse.setPrimaryZoneId(_ctx.stringValue("GetLindormInstanceResponse.PrimaryZoneId"));
		getLindormInstanceResponse.setStandbyZoneId(_ctx.stringValue("GetLindormInstanceResponse.StandbyZoneId"));
		getLindormInstanceResponse.setArbiterZoneId(_ctx.stringValue("GetLindormInstanceResponse.ArbiterZoneId"));
		getLindormInstanceResponse.setPrimaryVSwitchId(_ctx.stringValue("GetLindormInstanceResponse.PrimaryVSwitchId"));
		getLindormInstanceResponse.setStandbyVSwitchId(_ctx.stringValue("GetLindormInstanceResponse.StandbyVSwitchId"));
		getLindormInstanceResponse.setArbiterVSwitchId(_ctx.stringValue("GetLindormInstanceResponse.ArbiterVSwitchId"));
		getLindormInstanceResponse.setMultiZoneCombination(_ctx.stringValue("GetLindormInstanceResponse.MultiZoneCombination"));
		getLindormInstanceResponse.setCoreDiskCategory(_ctx.stringValue("GetLindormInstanceResponse.CoreDiskCategory"));
		getLindormInstanceResponse.setCoreSpec(_ctx.stringValue("GetLindormInstanceResponse.CoreSpec"));
		getLindormInstanceResponse.setCoreNum(_ctx.integerValue("GetLindormInstanceResponse.CoreNum"));
		getLindormInstanceResponse.setCoreSingleStorage(_ctx.integerValue("GetLindormInstanceResponse.CoreSingleStorage"));
		getLindormInstanceResponse.setLogDiskCategory(_ctx.stringValue("GetLindormInstanceResponse.LogDiskCategory"));
		getLindormInstanceResponse.setLogSpec(_ctx.stringValue("GetLindormInstanceResponse.LogSpec"));
		getLindormInstanceResponse.setLogNum(_ctx.integerValue("GetLindormInstanceResponse.LogNum"));
		getLindormInstanceResponse.setLogSingleStorage(_ctx.integerValue("GetLindormInstanceResponse.LogSingleStorage"));
		getLindormInstanceResponse.setArchVersion(_ctx.stringValue("GetLindormInstanceResponse.ArchVersion"));

		List<Engine> engineList = new ArrayList<Engine>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormInstanceResponse.EngineList.Length"); i++) {
			Engine engine = new Engine();
			engine.setVersion(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].Version"));
			engine.setCpuCount(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].CpuCount"));
			engine.setCoreCount(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].CoreCount"));
			engine.setEngine(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].Engine"));
			engine.setMemorySize(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].MemorySize"));
			engine.setIsLastVersion(_ctx.booleanValue("GetLindormInstanceResponse.EngineList["+ i +"].IsLastVersion"));
			engine.setLatestVersion(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].LatestVersion"));

			engineList.add(engine);
		}
		getLindormInstanceResponse.setEngineList(engineList);
	 
	 	return getLindormInstanceResponse;
	}
}