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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListActiveGatewaysResponse;
import com.aliyuncs.linkwan.model.v20181230.ListActiveGatewaysResponse.Gateway;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActiveGatewaysResponseUnmarshaller {

	public static ListActiveGatewaysResponse unmarshall(ListActiveGatewaysResponse listActiveGatewaysResponse, UnmarshallerContext context) {
		
		listActiveGatewaysResponse.setRequestId(context.stringValue("ListActiveGatewaysResponse.RequestId"));
		listActiveGatewaysResponse.setSuccess(context.booleanValue("ListActiveGatewaysResponse.Success"));

		List<Gateway> data = new ArrayList<Gateway>();
		for (int i = 0; i < context.lengthValue("ListActiveGatewaysResponse.Data.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGwEui(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].GwEui"));
			gateway.setName(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].Name"));
			gateway.setDescription(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].Description"));
			gateway.setCity(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].City"));
			gateway.setDistrict(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].District"));
			gateway.setAddress(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].Address"));
			gateway.setAddressCode(context.longValue("ListActiveGatewaysResponse.Data["+ i +"].AddressCode"));
			gateway.setGisCoordinateSystem(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].GisCoordinateSystem"));
			gateway.setLongitude(context.floatValue("ListActiveGatewaysResponse.Data["+ i +"].Longitude"));
			gateway.setLatitude(context.floatValue("ListActiveGatewaysResponse.Data["+ i +"].Latitude"));
			gateway.setFreqBandPlanGroupId(context.longValue("ListActiveGatewaysResponse.Data["+ i +"].FreqBandPlanGroupId"));
			gateway.setCommunicationMode(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].CommunicationMode"));
			gateway.setOnlineState(context.stringValue("ListActiveGatewaysResponse.Data["+ i +"].OnlineState"));

			data.add(gateway);
		}
		listActiveGatewaysResponse.setData(data);
	 
	 	return listActiveGatewaysResponse;
	}
}