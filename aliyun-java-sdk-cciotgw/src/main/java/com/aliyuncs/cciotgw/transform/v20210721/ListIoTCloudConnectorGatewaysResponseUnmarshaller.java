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

import com.aliyuncs.cciotgw.model.v20210721.ListIoTCloudConnectorGatewaysResponse;
import com.aliyuncs.cciotgw.model.v20210721.ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateway;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIoTCloudConnectorGatewaysResponseUnmarshaller {

	public static ListIoTCloudConnectorGatewaysResponse unmarshall(ListIoTCloudConnectorGatewaysResponse listIoTCloudConnectorGatewaysResponse, UnmarshallerContext _ctx) {
		
		listIoTCloudConnectorGatewaysResponse.setRequestId(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.RequestId"));
		listIoTCloudConnectorGatewaysResponse.setPageNumber(_ctx.integerValue("ListIoTCloudConnectorGatewaysResponse.PageNumber"));
		listIoTCloudConnectorGatewaysResponse.setPageSize(_ctx.integerValue("ListIoTCloudConnectorGatewaysResponse.PageSize"));
		listIoTCloudConnectorGatewaysResponse.setTotalCount(_ctx.integerValue("ListIoTCloudConnectorGatewaysResponse.TotalCount"));

		List<IoTCloudConnectorGateway> ioTCloudConnectorGateways = new ArrayList<IoTCloudConnectorGateway>();
		for (int i = 0; i < _ctx.lengthValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways.Length"); i++) {
			IoTCloudConnectorGateway ioTCloudConnectorGateway = new IoTCloudConnectorGateway();
			ioTCloudConnectorGateway.setSpec(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].Spec"));
			ioTCloudConnectorGateway.setResourceUid(_ctx.longValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ResourceUid"));
			ioTCloudConnectorGateway.setDescription(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].Description"));
			ioTCloudConnectorGateway.setState(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].State"));
			ioTCloudConnectorGateway.setScheduleFactor(_ctx.mapValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ScheduleFactor"));
			ioTCloudConnectorGateway.setApn(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].Apn"));
			ioTCloudConnectorGateway.setForwardingUnitCount(_ctx.integerValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ForwardingUnitCount"));
			ioTCloudConnectorGateway.setName(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].Name"));
			ioTCloudConnectorGateway.setIsp(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].Isp"));
			ioTCloudConnectorGateway.setIoTCloudConnectorGatewayId(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].IoTCloudConnectorGatewayId"));

			List<String> forwardingUnitIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ForwardingUnitIds.Length"); j++) {
				forwardingUnitIds.add(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ForwardingUnitIds["+ j +"]"));
			}
			ioTCloudConnectorGateway.setForwardingUnitIds(forwardingUnitIds);

			List<String> featureList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].FeatureList.Length"); j++) {
				featureList.add(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].FeatureList["+ j +"]"));
			}
			ioTCloudConnectorGateway.setFeatureList(featureList);

			List<String> zoneList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ZoneList.Length"); j++) {
				zoneList.add(_ctx.stringValue("ListIoTCloudConnectorGatewaysResponse.IoTCloudConnectorGateways["+ i +"].ZoneList["+ j +"]"));
			}
			ioTCloudConnectorGateway.setZoneList(zoneList);

			ioTCloudConnectorGateways.add(ioTCloudConnectorGateway);
		}
		listIoTCloudConnectorGatewaysResponse.setIoTCloudConnectorGateways(ioTCloudConnectorGateways);
	 
	 	return listIoTCloudConnectorGatewaysResponse;
	}
}