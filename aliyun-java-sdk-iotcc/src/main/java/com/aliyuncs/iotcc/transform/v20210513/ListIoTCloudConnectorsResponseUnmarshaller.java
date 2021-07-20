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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorsResponse.IoTCloudConnectorModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIoTCloudConnectorsResponseUnmarshaller {

	public static ListIoTCloudConnectorsResponse unmarshall(ListIoTCloudConnectorsResponse listIoTCloudConnectorsResponse, UnmarshallerContext _ctx) {
		
		listIoTCloudConnectorsResponse.setRequestId(_ctx.stringValue("ListIoTCloudConnectorsResponse.RequestId"));
		listIoTCloudConnectorsResponse.setTotalCount(_ctx.integerValue("ListIoTCloudConnectorsResponse.TotalCount"));
		listIoTCloudConnectorsResponse.setNextToken(_ctx.stringValue("ListIoTCloudConnectorsResponse.NextToken"));
		listIoTCloudConnectorsResponse.setMaxResults(_ctx.integerValue("ListIoTCloudConnectorsResponse.MaxResults"));

		List<IoTCloudConnectorModels> ioTCloudConnectors = new ArrayList<IoTCloudConnectorModels>();
		for (int i = 0; i < _ctx.lengthValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors.Length"); i++) {
			IoTCloudConnectorModels ioTCloudConnectorModels = new IoTCloudConnectorModels();
			ioTCloudConnectorModels.setIoTCloudConnectorId(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].IoTCloudConnectorId"));
			ioTCloudConnectorModels.setIoTCloudConnectorStatus(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].IoTCloudConnectorStatus"));
			ioTCloudConnectorModels.setIsp(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].Isp"));
			ioTCloudConnectorModels.setIoTCloudConnectorBusinessStatus(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].IoTCloudConnectorBusinessStatus"));
			ioTCloudConnectorModels.setApn(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].Apn"));
			ioTCloudConnectorModels.setRateLimit(_ctx.longValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].RateLimit"));
			ioTCloudConnectorModels.setVpcId(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].VpcId"));
			ioTCloudConnectorModels.setIoTCloudConnectorName(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].IoTCloudConnectorName"));
			ioTCloudConnectorModels.setIoTCloudConnectorDescription(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].IoTCloudConnectorDescription"));
			ioTCloudConnectorModels.setWildcardDomainEnabled(_ctx.booleanValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].WildcardDomainEnabled"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("ListIoTCloudConnectorsResponse.IoTCloudConnectors["+ i +"].VSwitchIds["+ j +"]"));
			}
			ioTCloudConnectorModels.setVSwitchIds(vSwitchIds);

			ioTCloudConnectors.add(ioTCloudConnectorModels);
		}
		listIoTCloudConnectorsResponse.setIoTCloudConnectors(ioTCloudConnectors);
	 
	 	return listIoTCloudConnectorsResponse;
	}
}