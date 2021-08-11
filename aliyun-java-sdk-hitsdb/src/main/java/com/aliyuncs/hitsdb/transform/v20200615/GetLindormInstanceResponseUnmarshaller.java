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
		getLindormInstanceResponse.setInstanceId(_ctx.stringValue("GetLindormInstanceResponse.InstanceId"));
		getLindormInstanceResponse.setInstanceAlias(_ctx.stringValue("GetLindormInstanceResponse.InstanceAlias"));
		getLindormInstanceResponse.setRegionId(_ctx.stringValue("GetLindormInstanceResponse.RegionId"));
		getLindormInstanceResponse.setZoneId(_ctx.stringValue("GetLindormInstanceResponse.ZoneId"));
		getLindormInstanceResponse.setInstanceStatus(_ctx.stringValue("GetLindormInstanceResponse.InstanceStatus"));
		getLindormInstanceResponse.setPayType(_ctx.stringValue("GetLindormInstanceResponse.PayType"));
		getLindormInstanceResponse.setNetworkType(_ctx.stringValue("GetLindormInstanceResponse.NetworkType"));
		getLindormInstanceResponse.setCreateTime(_ctx.stringValue("GetLindormInstanceResponse.CreateTime"));
		getLindormInstanceResponse.setExpireTime(_ctx.stringValue("GetLindormInstanceResponse.ExpireTime"));
		getLindormInstanceResponse.setInstanceStorage(_ctx.stringValue("GetLindormInstanceResponse.InstanceStorage"));
		getLindormInstanceResponse.setVpcId(_ctx.stringValue("GetLindormInstanceResponse.VpcId"));
		getLindormInstanceResponse.setVswitchId(_ctx.stringValue("GetLindormInstanceResponse.VswitchId"));
		getLindormInstanceResponse.setAutoRenew(_ctx.booleanValue("GetLindormInstanceResponse.AutoRenew"));
		getLindormInstanceResponse.setEngineType(_ctx.integerValue("GetLindormInstanceResponse.EngineType"));
		getLindormInstanceResponse.setServiceType(_ctx.stringValue("GetLindormInstanceResponse.ServiceType"));
		getLindormInstanceResponse.setDeletionProtection(_ctx.stringValue("GetLindormInstanceResponse.DeletionProtection"));
		getLindormInstanceResponse.setDiskCategory(_ctx.stringValue("GetLindormInstanceResponse.DiskCategory"));
		getLindormInstanceResponse.setColdStorage(_ctx.integerValue("GetLindormInstanceResponse.ColdStorage"));
		getLindormInstanceResponse.setEnableBDS(_ctx.booleanValue("GetLindormInstanceResponse.EnableBDS"));
		getLindormInstanceResponse.setAliUid(_ctx.longValue("GetLindormInstanceResponse.AliUid"));
		getLindormInstanceResponse.setEnableFS(_ctx.booleanValue("GetLindormInstanceResponse.EnableFS"));
		getLindormInstanceResponse.setEnablePhoenix(_ctx.booleanValue("GetLindormInstanceResponse.EnablePhoenix"));
		getLindormInstanceResponse.setDiskUsage(_ctx.stringValue("GetLindormInstanceResponse.DiskUsage"));
		getLindormInstanceResponse.setDiskThreshold(_ctx.stringValue("GetLindormInstanceResponse.DiskThreshold"));
		getLindormInstanceResponse.setCreateMilliseconds(_ctx.longValue("GetLindormInstanceResponse.CreateMilliseconds"));
		getLindormInstanceResponse.setExpiredMilliseconds(_ctx.longValue("GetLindormInstanceResponse.ExpiredMilliseconds"));
		getLindormInstanceResponse.setEnableKms(_ctx.booleanValue("GetLindormInstanceResponse.EnableKms"));

		List<Engine> engineList = new ArrayList<Engine>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormInstanceResponse.EngineList.Length"); i++) {
			Engine engine = new Engine();
			engine.setEngine(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].Engine"));
			engine.setVersion(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].Version"));
			engine.setCpuCount(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].CpuCount"));
			engine.setMemorySize(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].MemorySize"));
			engine.setCoreCount(_ctx.stringValue("GetLindormInstanceResponse.EngineList["+ i +"].CoreCount"));
			engine.setIsLastVersion(_ctx.booleanValue("GetLindormInstanceResponse.EngineList["+ i +"].IsLastVersion"));

			engineList.add(engine);
		}
		getLindormInstanceResponse.setEngineList(engineList);
	 
	 	return getLindormInstanceResponse;
	}
}