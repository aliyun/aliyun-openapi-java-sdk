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

import com.aliyuncs.linkwan.model.v20190301.ListGatewaysResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewaysResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListGatewaysResponse.Data.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewaysResponseUnmarshaller {

	public static ListGatewaysResponse unmarshall(ListGatewaysResponse listGatewaysResponse, UnmarshallerContext _ctx) {
		
		listGatewaysResponse.setRequestId(_ctx.stringValue("ListGatewaysResponse.RequestId"));
		listGatewaysResponse.setSuccess(_ctx.booleanValue("ListGatewaysResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListGatewaysResponse.Data.TotalCount"));

		List<Gateway> list = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewaysResponse.Data.List.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGwEui(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].GwEui"));
			gateway.setName(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].Name"));
			gateway.setDescription(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].Description"));
			gateway.setCity(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].City"));
			gateway.setDistrict(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].District"));
			gateway.setAddress(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].Address"));
			gateway.setAddressCode(_ctx.longValue("ListGatewaysResponse.Data.List["+ i +"].AddressCode"));
			gateway.setGisCoordinateSystem(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].GisCoordinateSystem"));
			gateway.setLongitude(_ctx.floatValue("ListGatewaysResponse.Data.List["+ i +"].Longitude"));
			gateway.setLatitude(_ctx.floatValue("ListGatewaysResponse.Data.List["+ i +"].Latitude"));
			gateway.setFreqBandPlanGroupId(_ctx.longValue("ListGatewaysResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			gateway.setCommunicationMode(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].CommunicationMode"));
			gateway.setOnlineState(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].OnlineState"));
			gateway.setEnabled(_ctx.booleanValue("ListGatewaysResponse.Data.List["+ i +"].Enabled"));
			gateway.setClassBSupported(_ctx.booleanValue("ListGatewaysResponse.Data.List["+ i +"].ClassBSupported"));
			gateway.setClassBWorking(_ctx.booleanValue("ListGatewaysResponse.Data.List["+ i +"].ClassBWorking"));
			gateway.setTimeCorrectable(_ctx.booleanValue("ListGatewaysResponse.Data.List["+ i +"].TimeCorrectable"));
			gateway.setOnlineStateChangedMillis(_ctx.longValue("ListGatewaysResponse.Data.List["+ i +"].OnlineStateChangedMillis"));
			gateway.setEmbeddedNsId(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].EmbeddedNsId"));
			gateway.setChargeStatus(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].ChargeStatus"));
			gateway.setAuthTypes(_ctx.stringValue("ListGatewaysResponse.Data.List["+ i +"].AuthTypes"));

			list.add(gateway);
		}
		data.setList(list);
		listGatewaysResponse.setData(data);
	 
	 	return listGatewaysResponse;
	}
}