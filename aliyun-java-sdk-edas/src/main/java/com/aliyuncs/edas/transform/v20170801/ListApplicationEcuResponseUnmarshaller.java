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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationEcuResponseUnmarshaller {

	public static ListApplicationEcuResponse unmarshall(ListApplicationEcuResponse listApplicationEcuResponse, UnmarshallerContext context) {
		
		listApplicationEcuResponse.setRequestId(context.stringValue("ListApplicationEcuResponse.RequestId"));
		listApplicationEcuResponse.setCode(context.integerValue("ListApplicationEcuResponse.Code"));
		listApplicationEcuResponse.setMessage(context.stringValue("ListApplicationEcuResponse.Message"));

		List<EcuEntity> ecuInfoList = new ArrayList<EcuEntity>();
		for (int i = 0; i < context.lengthValue("ListApplicationEcuResponse.EcuInfoList.Length"); i++) {
			EcuEntity ecuEntity = new EcuEntity();
			ecuEntity.setEcuId(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].EcuId"));
			ecuEntity.setOnline(context.booleanValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Online"));
			ecuEntity.setDockerEnv(context.booleanValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].DockerEnv"));
			ecuEntity.setCreateTime(context.longValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].CreateTime"));
			ecuEntity.setUpdateTime(context.longValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].UpdateTime"));
			ecuEntity.setIpAddr(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].IpAddr"));
			ecuEntity.setHeartbeatTime(context.longValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].HeartbeatTime"));
			ecuEntity.setUserId(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].UserId"));
			ecuEntity.setName(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Name"));
			ecuEntity.setZoneId(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].ZoneId"));
			ecuEntity.setRegionId(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].RegionId"));
			ecuEntity.setInstanceId(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].InstanceId"));
			ecuEntity.setVpcId(context.stringValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].VpcId"));
			ecuEntity.setAvailableCpu(context.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].AvailableCpu"));
			ecuEntity.setAvailableMem(context.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].AvailableMem"));
			ecuEntity.setCpu(context.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Cpu"));
			ecuEntity.setMem(context.integerValue("ListApplicationEcuResponse.EcuInfoList["+ i +"].Mem"));

			ecuInfoList.add(ecuEntity);
		}
		listApplicationEcuResponse.setEcuInfoList(ecuInfoList);
	 
	 	return listApplicationEcuResponse;
	}
}