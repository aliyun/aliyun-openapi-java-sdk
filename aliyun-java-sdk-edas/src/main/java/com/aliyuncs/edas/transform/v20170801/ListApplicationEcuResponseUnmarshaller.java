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

import com.aliyuncs.edas.model.v20170801.ListApplicationEcuResponse;
import com.aliyuncs.edas.model.v20170801.ListApplicationEcuResponse.EcuEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationEcuResponseUnmarshaller {

	public static ListApplicationEcuResponse unmarshall(ListApplicationEcuResponse listApplicationEcuResponse, UnmarshallerContext _ctx) {
		
		listApplicationEcuResponse.setRequestId(_ctx.stringValue("ListApplicationEcuResponse.RequestId"));
		listApplicationEcuResponse.setCode(_ctx.integerValue("ListApplicationEcuResponse.Code"));
		listApplicationEcuResponse.setMessage(_ctx.stringValue("ListApplicationEcuResponse.Message"));

		List<EcuEntity> ecuInfoList = new ArrayList<EcuEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationEcuResponse.EcuInfoList.Length"); i++) {
			EcuEntity ecuEntity = new EcuEntity();
			ecuEntity.setVpcId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].VpcId"));
			ecuEntity.setUpdateTime(_ctx.longValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].UpdateTime"));
			ecuEntity.setIpAddr(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].IpAddr"));
			ecuEntity.setAvailableCpu(_ctx.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].AvailableCpu"));
			ecuEntity.setCreateTime(_ctx.longValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].CreateTime"));
			ecuEntity.setUserId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].UserId"));
			ecuEntity.setInstanceId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].InstanceId"));
			ecuEntity.setMem(_ctx.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Mem"));
			ecuEntity.setRegionId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].RegionId"));
			ecuEntity.setEcuId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].EcuId"));
			ecuEntity.setCpu(_ctx.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Cpu"));
			ecuEntity.setAppId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].AppId"));
			ecuEntity.setDockerEnv(_ctx.booleanValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].DockerEnv"));
			ecuEntity.setOnline(_ctx.booleanValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Online"));
			ecuEntity.setAvailableMem(_ctx.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].AvailableMem"));
			ecuEntity.setZoneId(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].ZoneId"));
			ecuEntity.setName(_ctx.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Name"));
			ecuEntity.setHeartbeatTime(_ctx.longValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].HeartbeatTime"));

			ecuInfoList.add(ecuEntity);
		}
		listApplicationEcuResponse.setEcuInfoList(ecuInfoList);
	 
	 	return listApplicationEcuResponse;
	}
}