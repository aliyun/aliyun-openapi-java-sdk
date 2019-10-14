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

import com.aliyuncs.linkwan.model.v20190301.ListGatewaysGisInfoResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewaysGisInfoResponse.GatewayGisInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewaysGisInfoResponseUnmarshaller {

	public static ListGatewaysGisInfoResponse unmarshall(ListGatewaysGisInfoResponse listGatewaysGisInfoResponse, UnmarshallerContext _ctx) {
		
		listGatewaysGisInfoResponse.setRequestId(_ctx.stringValue("ListGatewaysGisInfoResponse.RequestId"));
		listGatewaysGisInfoResponse.setSuccess(_ctx.booleanValue("ListGatewaysGisInfoResponse.Success"));

		List<GatewayGisInfo> data = new ArrayList<GatewayGisInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewaysGisInfoResponse.Data.Length"); i++) {
			GatewayGisInfo gatewayGisInfo = new GatewayGisInfo();
			gatewayGisInfo.setGwEui(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].GwEui"));
			gatewayGisInfo.setGisCoordinateSystem(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].GisCoordinateSystem"));
			gatewayGisInfo.setLongitude(_ctx.floatValue("ListGatewaysGisInfoResponse.Data["+ i +"].Longitude"));
			gatewayGisInfo.setLatitude(_ctx.floatValue("ListGatewaysGisInfoResponse.Data["+ i +"].Latitude"));
			gatewayGisInfo.setFreqBandPlanGroupId(_ctx.longValue("ListGatewaysGisInfoResponse.Data["+ i +"].FreqBandPlanGroupId"));
			gatewayGisInfo.setName(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].Name"));
			gatewayGisInfo.setOnlineState(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].OnlineState"));
			gatewayGisInfo.setGisSourceType(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].GisSourceType"));
			gatewayGisInfo.setEnabled(_ctx.booleanValue("ListGatewaysGisInfoResponse.Data["+ i +"].Enabled"));
			gatewayGisInfo.setChargeStatus(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].ChargeStatus"));
			gatewayGisInfo.setAuthTypes(_ctx.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].AuthTypes"));

			data.add(gatewayGisInfo);
		}
		listGatewaysGisInfoResponse.setData(data);
	 
	 	return listGatewaysGisInfoResponse;
	}
}