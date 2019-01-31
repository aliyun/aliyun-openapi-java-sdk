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

	public static ListScaleOutEcuResponse unmarshall(ListScaleOutEcuResponse listScaleOutEcuResponse, UnmarshallerContext context) {
		
		listScaleOutEcuResponse.setRequestId(context.stringValue("ListScaleOutEcuResponse.RequestId"));
		listScaleOutEcuResponse.setCode(context.integerValue("ListScaleOutEcuResponse.Code"));
		listScaleOutEcuResponse.setMessage(context.stringValue("ListScaleOutEcuResponse.Message"));

		List<EcuInfo> ecuInfoList = new ArrayList<EcuInfo>();
		for (int i = 0; i < context.lengthValue("ListScaleOutEcuResponse.EcuInfoList.Length"); i++) {
			EcuInfo ecuInfo = new EcuInfo();
			ecuInfo.setEcuId(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].EcuId"));
			ecuInfo.setOnline(context.booleanValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].Online"));
			ecuInfo.setDockerEnv(context.booleanValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].DockerEnv"));
			ecuInfo.setCreateTime(context.longValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].CreateTime"));
			ecuInfo.setUpdateTime(context.longValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].UpdateTime"));
			ecuInfo.setIpAddr(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].IpAddr"));
			ecuInfo.setHeartbeatTime(context.longValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].HeartbeatTime"));
			ecuInfo.setUserId(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].UserId"));
			ecuInfo.setName(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].Name"));
			ecuInfo.setZoneId(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].ZoneId"));
			ecuInfo.setRegionId(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].RegionId"));
			ecuInfo.setInstanceId(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].InstanceId"));
			ecuInfo.setVpcId(context.stringValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].VpcId"));
			ecuInfo.setAvailableCpu(context.integerValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].AvailableCpu"));
			ecuInfo.setAvailableMem(context.integerValue("ListScaleOutEcuResponse.EcuInfoList["+ i +"].AvailableMem"));

			ecuInfoList.add(ecuInfo);
		}
		listScaleOutEcuResponse.setEcuInfoList(ecuInfoList);
	 
	 	return listScaleOutEcuResponse;
	}
}