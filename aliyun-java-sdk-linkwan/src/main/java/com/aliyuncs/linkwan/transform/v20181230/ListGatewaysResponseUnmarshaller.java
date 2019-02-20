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

import com.aliyuncs.linkwan.model.v20181230.ListGatewaysResponse;
import com.aliyuncs.linkwan.model.v20181230.ListGatewaysResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListGatewaysResponse.Data.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewaysResponseUnmarshaller {

	public static ListGatewaysResponse unmarshall(ListGatewaysResponse listGatewaysResponse, UnmarshallerContext context) {
		
		listGatewaysResponse.setRequestId(context.stringValue("ListGatewaysResponse.RequestId"));
		listGatewaysResponse.setSuccess(context.booleanValue("ListGatewaysResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListGatewaysResponse.Data.TotalCount"));

		List<Gateway> list = new ArrayList<Gateway>();
		for (int i = 0; i < context.lengthValue("ListGatewaysResponse.Data.List.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGwEui(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].GwEui"));
			gateway.setName(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].Name"));
			gateway.setDescription(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].Description"));
			gateway.setCity(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].City"));
			gateway.setDistrict(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].District"));
			gateway.setAddress(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].Address"));
			gateway.setAddressCode(context.longValue("ListGatewaysResponse.Data.List["+ i +"].AddressCode"));
			gateway.setGisCoordinateSystem(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].GisCoordinateSystem"));
			gateway.setLongitude(context.floatValue("ListGatewaysResponse.Data.List["+ i +"].Longitude"));
			gateway.setLatitude(context.floatValue("ListGatewaysResponse.Data.List["+ i +"].Latitude"));
			gateway.setFreqBandPlanGroupId(context.longValue("ListGatewaysResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			gateway.setCommunicationMode(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].CommunicationMode"));
			gateway.setOnlineState(context.stringValue("ListGatewaysResponse.Data.List["+ i +"].OnlineState"));
			gateway.setEnabled(context.booleanValue("ListGatewaysResponse.Data.List["+ i +"].Enabled"));
			gateway.setClassBSupported(context.booleanValue("ListGatewaysResponse.Data.List["+ i +"].ClassBSupported"));
			gateway.setClassBWorking(context.booleanValue("ListGatewaysResponse.Data.List["+ i +"].ClassBWorking"));
			gateway.setTimeCorrectable(context.booleanValue("ListGatewaysResponse.Data.List["+ i +"].TimeCorrectable"));
			gateway.setOnlineStateChangedMillis(context.longValue("ListGatewaysResponse.Data.List["+ i +"].OnlineStateChangedMillis"));

			list.add(gateway);
		}
		data.setList(list);
		listGatewaysResponse.setData(data);
	 
	 	return listGatewaysResponse;
	}
}