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

import com.aliyuncs.edas.model.v20170801.ListScaleOutEcuResponse;
import com.aliyuncs.edas.model.v20170801.ListScaleOutEcuResponse.EcuInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScaleOutEcuResponseUnmarshaller {

	public static ListScaleOutEcuResponse unmarshall(ListScaleOutEcuResponse listScaleOutEcuResponse, UnmarshallerContext _ctx) {
		
		listScaleOutEcuResponse.setRequestId(_ctx.stringValue("ListScaleOutEcuResponse.RequestId"));
		listScaleOutEcuResponse.setCode(_ctx.integerValue("ListScaleOutEcuResponse.Code"));
		listScaleOutEcuResponse.setMessage(_ctx.stringValue("ListScaleOutEcuResponse.Message"));

		List<EcuInfo> ecuInfoList = new ArrayList<EcuInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListScaleOutEcuResponse.EcuInfoList.Length"); i++) {
			EcuInfo ecuInfo = new EcuInfo();
			ecuInfo.setEcuId(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].EcuId"));
			ecuInfo.setOnline(_ctx.booleanValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].Online"));
			ecuInfo.setDockerEnv(_ctx.booleanValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].DockerEnv"));
			ecuInfo.setCreateTime(_ctx.longValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].CreateTime"));
			ecuInfo.setUpdateTime(_ctx.longValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].UpdateTime"));
			ecuInfo.setIpAddr(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].IpAddr"));
			ecuInfo.setHeartbeatTime(_ctx.longValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].HeartbeatTime"));
			ecuInfo.setUserId(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].UserId"));
			ecuInfo.setName(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].Name"));
			ecuInfo.setZoneId(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].ZoneId"));
			ecuInfo.setRegionId(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].RegionId"));
			ecuInfo.setInstanceId(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].InstanceId"));
			ecuInfo.setVpcId(_ctx.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].VpcId"));
			ecuInfo.setAvailableCpu(_ctx.integerValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].AvailableCpu"));
			ecuInfo.setAvailableMem(_ctx.integerValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].AvailableMem"));

			ecuInfoList.add(ecuInfo);
		}
		listScaleOutEcuResponse.setEcuInfoList(ecuInfoList);
	 
	 	return listScaleOutEcuResponse;
	}
}