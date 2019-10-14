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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListActiveGatewaysResponse;
import com.aliyuncs.linkwan.model.v20190301.ListActiveGatewaysResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActiveGatewaysResponseUnmarshaller {

	public static ListActiveGatewaysResponse unmarshall(ListActiveGatewaysResponse listActiveGatewaysResponse, UnmarshallerContext _ctx) {
		
		listActiveGatewaysResponse.setRequestId(_ctx.stringValue("ListActiveGatewaysResponse.RequestId"));
		listActiveGatewaysResponse.setSuccess(_ctx.booleanValue("ListActiveGatewaysResponse.Success"));

		List<Gateway> data = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("ListActiveGatewaysResponse.Data.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGwEui(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].GwEui"));
			gateway.setName(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].Name"));
			gateway.setDescription(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].Description"));
			gateway.setCity(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].City"));
			gateway.setDistrict(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].District"));
			gateway.setAddress(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].Address"));
			gateway.setAddressCode(_ctx.longValue("ListActiveGatewaysResponse.Data["+ i +"].AddressCode"));
			gateway.setGisCoordinateSystem(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].GisCoordinateSystem"));
			gateway.setLongitude(_ctx.floatValue("ListActiveGatewaysResponse.Data["+ i +"].Longitude"));
			gateway.setLatitude(_ctx.floatValue("ListActiveGatewaysResponse.Data["+ i +"].Latitude"));
			gateway.setFreqBandPlanGroupId(_ctx.longValue("ListActiveGatewaysResponse.Data["+ i +"].FreqBandPlanGroupId"));
			gateway.setCommunicationMode(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].CommunicationMode"));
			gateway.setOnlineState(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].OnlineState"));
			gateway.setChargeStatus(_ctx.stringValue("ListActiveGatewaysResponse.Data["+ i +"].ChargeStatus"));

			data.add(gateway);
		}
		listActiveGatewaysResponse.setData(data);
	 
	 	return listActiveGatewaysResponse;
	}
}