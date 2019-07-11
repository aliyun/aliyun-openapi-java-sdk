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

import com.aliyuncs.edas.model.v20170801.ListEcuByRegionResponse;
import com.aliyuncs.edas.model.v20170801.ListEcuByRegionResponse.EcuEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEcuByRegionResponseUnmarshaller {

	public static ListEcuByRegionResponse unmarshall(ListEcuByRegionResponse listEcuByRegionResponse, UnmarshallerContext _ctx) {
		
		listEcuByRegionResponse.setRequestId(_ctx.stringValue("ListEcuByRegionResponse.RequestId"));
		listEcuByRegionResponse.setCode(_ctx.integerValue("ListEcuByRegionResponse.Code"));
		listEcuByRegionResponse.setMessage(_ctx.stringValue("ListEcuByRegionResponse.Message"));

		List<EcuEntity> ecuEntityList = new ArrayList<EcuEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListEcuByRegionResponse.EcuEntityList.Length"); i++) {
			EcuEntity ecuEntity = new EcuEntity();
			ecuEntity.setEcuId(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].EcuId"));
			ecuEntity.setOnline(_ctx.booleanValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].Online"));
			ecuEntity.setDockerEnv(_ctx.booleanValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].DockerEnv"));
			ecuEntity.setCreateTime(_ctx.longValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].CreateTime"));
			ecuEntity.setUpdateTime(_ctx.longValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].UpdateTime"));
			ecuEntity.setIpAddr(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].IpAddr"));
			ecuEntity.setHeartbeatTime(_ctx.longValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].HeartbeatTime"));
			ecuEntity.setUserId(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].UserId"));
			ecuEntity.setName(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].Name"));
			ecuEntity.setZoneId(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].ZoneId"));
			ecuEntity.setRegionId(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].RegionId"));
			ecuEntity.setInstanceId(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].InstanceId"));
			ecuEntity.setVpcId(_ctx.stringValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].VpcId"));
			ecuEntity.setAvailableCpu(_ctx.integerValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].AvailableCpu"));
			ecuEntity.setAvailableMem(_ctx.integerValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].AvailableMem"));
			ecuEntity.setCpu(_ctx.integerValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].Cpu"));
			ecuEntity.setMem(_ctx.integerValue("ListEcuByRegionResponse.EcuEntityList["+ i +"].Mem"));

			ecuEntityList.add(ecuEntity);
		}
		listEcuByRegionResponse.setEcuEntityList(ecuEntityList);
	 
	 	return listEcuByRegionResponse;
	}
}