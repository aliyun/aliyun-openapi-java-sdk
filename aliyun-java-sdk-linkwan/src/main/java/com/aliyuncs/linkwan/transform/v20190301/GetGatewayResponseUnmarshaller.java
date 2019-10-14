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

import com.aliyuncs.linkwan.model.v20190301.GetGatewayResponse;
import com.aliyuncs.linkwan.model.v20190301.GetGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayResponseUnmarshaller {

	public static GetGatewayResponse unmarshall(GetGatewayResponse getGatewayResponse, UnmarshallerContext _ctx) {
		
		getGatewayResponse.setRequestId(_ctx.stringValue("GetGatewayResponse.RequestId"));
		getGatewayResponse.setSuccess(_ctx.booleanValue("GetGatewayResponse.Success"));

		Data data = new Data();
		data.setGwEui(_ctx.stringValue("GetGatewayResponse.Data.GwEui"));
		data.setOnlineState(_ctx.stringValue("GetGatewayResponse.Data.OnlineState"));
		data.setName(_ctx.stringValue("GetGatewayResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetGatewayResponse.Data.Description"));
		data.setCity(_ctx.stringValue("GetGatewayResponse.Data.City"));
		data.setDistrict(_ctx.stringValue("GetGatewayResponse.Data.District"));
		data.setAddress(_ctx.stringValue("GetGatewayResponse.Data.Address"));
		data.setAddressCode(_ctx.longValue("GetGatewayResponse.Data.AddressCode"));
		data.setGisCoordinateSystem(_ctx.stringValue("GetGatewayResponse.Data.GisCoordinateSystem"));
		data.setLongitude(_ctx.floatValue("GetGatewayResponse.Data.Longitude"));
		data.setLatitude(_ctx.floatValue("GetGatewayResponse.Data.Latitude"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetGatewayResponse.Data.FreqBandPlanGroupId"));
		data.setCommunicationMode(_ctx.stringValue("GetGatewayResponse.Data.CommunicationMode"));
		data.setTimeCorrectable(_ctx.booleanValue("GetGatewayResponse.Data.TimeCorrectable"));
		data.setClassBSupported(_ctx.booleanValue("GetGatewayResponse.Data.ClassBSupported"));
		data.setClassBWorking(_ctx.booleanValue("GetGatewayResponse.Data.ClassBWorking"));
		data.setEnabled(_ctx.booleanValue("GetGatewayResponse.Data.Enabled"));
		data.setOnlineStateChangedMillis(_ctx.longValue("GetGatewayResponse.Data.OnlineStateChangedMillis"));
		data.setEmbeddedNsId(_ctx.stringValue("GetGatewayResponse.Data.EmbeddedNsId"));
		data.setChargeStatus(_ctx.stringValue("GetGatewayResponse.Data.ChargeStatus"));

		List<String> authTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayResponse.Data.AuthTypes.Length"); i++) {
			authTypes.add(_ctx.stringValue("GetGatewayResponse.Data.AuthTypes["+ i +"]"));
		}
		data.setAuthTypes(authTypes);
		getGatewayResponse.setData(data);
	 
	 	return getGatewayResponse;
	}
}