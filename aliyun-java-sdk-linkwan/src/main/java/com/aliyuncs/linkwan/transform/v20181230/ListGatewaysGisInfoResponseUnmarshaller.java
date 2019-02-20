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

import com.aliyuncs.linkwan.model.v20181230.ListGatewaysGisInfoResponse;
import com.aliyuncs.linkwan.model.v20181230.ListGatewaysGisInfoResponse.GatewayGisInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewaysGisInfoResponseUnmarshaller {

	public static ListGatewaysGisInfoResponse unmarshall(ListGatewaysGisInfoResponse listGatewaysGisInfoResponse, UnmarshallerContext context) {
		
		listGatewaysGisInfoResponse.setRequestId(context.stringValue("ListGatewaysGisInfoResponse.RequestId"));
		listGatewaysGisInfoResponse.setSuccess(context.booleanValue("ListGatewaysGisInfoResponse.Success"));

		List<GatewayGisInfo> data = new ArrayList<GatewayGisInfo>();
		for (int i = 0; i < context.lengthValue("ListGatewaysGisInfoResponse.Data.Length"); i++) {
			GatewayGisInfo gatewayGisInfo = new GatewayGisInfo();
			gatewayGisInfo.setGwEui(context.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].GwEui"));
			gatewayGisInfo.setGisCoordinateSystem(context.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].GisCoordinateSystem"));
			gatewayGisInfo.setLongitude(context.floatValue("ListGatewaysGisInfoResponse.Data["+ i +"].Longitude"));
			gatewayGisInfo.setLatitude(context.floatValue("ListGatewaysGisInfoResponse.Data["+ i +"].Latitude"));
			gatewayGisInfo.setFreqBandPlanGroupId(context.longValue("ListGatewaysGisInfoResponse.Data["+ i +"].FreqBandPlanGroupId"));
			gatewayGisInfo.setName(context.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].Name"));
			gatewayGisInfo.setOnlineState(context.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].OnlineState"));
			gatewayGisInfo.setGisSourceType(context.stringValue("ListGatewaysGisInfoResponse.Data["+ i +"].GisSourceType"));
			gatewayGisInfo.setEnabled(context.booleanValue("ListGatewaysGisInfoResponse.Data["+ i +"].Enabled"));

			data.add(gatewayGisInfo);
		}
		listGatewaysGisInfoResponse.setData(data);
	 
	 	return listGatewaysGisInfoResponse;
	}
}