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

package com.aliyuncs.cciotgw.transform.v20210721;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cciotgw.model.v20210721.GetIoTCloudConnectorGatewayResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIoTCloudConnectorGatewayResponseUnmarshaller {

	public static GetIoTCloudConnectorGatewayResponse unmarshall(GetIoTCloudConnectorGatewayResponse getIoTCloudConnectorGatewayResponse, UnmarshallerContext _ctx) {
		
		getIoTCloudConnectorGatewayResponse.setRequestId(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.RequestId"));
		getIoTCloudConnectorGatewayResponse.setSpec(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.Spec"));
		getIoTCloudConnectorGatewayResponse.setResourceUid(_ctx.longValue("GetIoTCloudConnectorGatewayResponse.ResourceUid"));
		getIoTCloudConnectorGatewayResponse.setDescription(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.Description"));
		getIoTCloudConnectorGatewayResponse.setHaMode(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.HaMode"));
		getIoTCloudConnectorGatewayResponse.setState(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.State"));
		getIoTCloudConnectorGatewayResponse.setScheduleFactor(_ctx.mapValue("GetIoTCloudConnectorGatewayResponse.ScheduleFactor"));
		getIoTCloudConnectorGatewayResponse.setApn(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.Apn"));
		getIoTCloudConnectorGatewayResponse.setForwardingUnitCount(_ctx.integerValue("GetIoTCloudConnectorGatewayResponse.ForwardingUnitCount"));
		getIoTCloudConnectorGatewayResponse.setName(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.Name"));
		getIoTCloudConnectorGatewayResponse.setIsp(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.Isp"));
		getIoTCloudConnectorGatewayResponse.setIoTCloudConnectorGatewayId(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.IoTCloudConnectorGatewayId"));

		List<String> forwardingUnitIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIoTCloudConnectorGatewayResponse.ForwardingUnitIds.Length"); i++) {
			forwardingUnitIds.add(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.ForwardingUnitIds["+ i +"]"));
		}
		getIoTCloudConnectorGatewayResponse.setForwardingUnitIds(forwardingUnitIds);

		List<String> featureList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIoTCloudConnectorGatewayResponse.FeatureList.Length"); i++) {
			featureList.add(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.FeatureList["+ i +"]"));
		}
		getIoTCloudConnectorGatewayResponse.setFeatureList(featureList);

		List<String> zoneList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIoTCloudConnectorGatewayResponse.ZoneList.Length"); i++) {
			zoneList.add(_ctx.stringValue("GetIoTCloudConnectorGatewayResponse.ZoneList["+ i +"]"));
		}
		getIoTCloudConnectorGatewayResponse.setZoneList(zoneList);
	 
	 	return getIoTCloudConnectorGatewayResponse;
	}
}