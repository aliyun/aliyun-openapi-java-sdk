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

import com.aliyuncs.linkwan.model.v20181230.GetGatewayResponse;
import com.aliyuncs.linkwan.model.v20181230.GetGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayResponseUnmarshaller {

	public static GetGatewayResponse unmarshall(GetGatewayResponse getGatewayResponse, UnmarshallerContext context) {
		
		getGatewayResponse.setRequestId(context.stringValue("GetGatewayResponse.RequestId"));
		getGatewayResponse.setSuccess(context.booleanValue("GetGatewayResponse.Success"));

		Data data = new Data();
		data.setGwEui(context.stringValue("GetGatewayResponse.Data.GwEui"));
		data.setOnlineState(context.stringValue("GetGatewayResponse.Data.OnlineState"));
		data.setName(context.stringValue("GetGatewayResponse.Data.Name"));
		data.setDescription(context.stringValue("GetGatewayResponse.Data.Description"));
		data.setCity(context.stringValue("GetGatewayResponse.Data.City"));
		data.setDistrict(context.stringValue("GetGatewayResponse.Data.District"));
		data.setAddress(context.stringValue("GetGatewayResponse.Data.Address"));
		data.setAddressCode(context.longValue("GetGatewayResponse.Data.AddressCode"));
		data.setGisCoordinateSystem(context.stringValue("GetGatewayResponse.Data.GisCoordinateSystem"));
		data.setLongitude(context.floatValue("GetGatewayResponse.Data.Longitude"));
		data.setLatitude(context.floatValue("GetGatewayResponse.Data.Latitude"));
		data.setFreqBandPlanGroupId(context.longValue("GetGatewayResponse.Data.FreqBandPlanGroupId"));
		data.setCommunicationMode(context.stringValue("GetGatewayResponse.Data.CommunicationMode"));
		data.setTimeCorrectable(context.booleanValue("GetGatewayResponse.Data.TimeCorrectable"));
		data.setClassBSupported(context.booleanValue("GetGatewayResponse.Data.ClassBSupported"));
		data.setClassBWorking(context.booleanValue("GetGatewayResponse.Data.ClassBWorking"));
		data.setEnabled(context.booleanValue("GetGatewayResponse.Data.Enabled"));
		data.setOnlineStateChangedMillis(context.longValue("GetGatewayResponse.Data.OnlineStateChangedMillis"));
		getGatewayResponse.setData(data);
	 
	 	return getGatewayResponse;
	}
}