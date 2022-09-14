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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListGatewaySlbResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewaySlbResponse.Sources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewaySlbResponseUnmarshaller {

	public static ListGatewaySlbResponse unmarshall(ListGatewaySlbResponse listGatewaySlbResponse, UnmarshallerContext _ctx) {
		
		listGatewaySlbResponse.setRequestId(_ctx.stringValue("ListGatewaySlbResponse.RequestId"));
		listGatewaySlbResponse.setHttpStatusCode(_ctx.integerValue("ListGatewaySlbResponse.HttpStatusCode"));
		listGatewaySlbResponse.setMessage(_ctx.stringValue("ListGatewaySlbResponse.Message"));
		listGatewaySlbResponse.setCode(_ctx.integerValue("ListGatewaySlbResponse.Code"));
		listGatewaySlbResponse.setSuccess(_ctx.booleanValue("ListGatewaySlbResponse.Success"));

		List<Sources> data = new ArrayList<Sources>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewaySlbResponse.Data.Length"); i++) {
			Sources sources = new Sources();
			sources.setId(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].Id"));
			sources.setSlbId(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].SlbId"));
			sources.setSlbIp(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].SlbIp"));
			sources.setSlbPort(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].SlbPort"));
			sources.setType(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].Type"));
			sources.setGatewayId(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].GatewayId"));
			sources.setGmtCreate(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].GmtCreate"));
			sources.setGatewaySlbMode(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].GatewaySlbMode"));
			sources.setGatewaySlbStatus(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].GatewaySlbStatus"));
			sources.setStatusDesc(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].StatusDesc"));
			sources.setVServerGroupId(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].VServerGroupId"));
			sources.setHttpPort(_ctx.integerValue("ListGatewaySlbResponse.Data["+ i +"].HttpPort"));
			sources.setHttpsPort(_ctx.integerValue("ListGatewaySlbResponse.Data["+ i +"].HttpsPort"));
			sources.setServiceWeight(_ctx.integerValue("ListGatewaySlbResponse.Data["+ i +"].ServiceWeight"));
			sources.setEditEnable(_ctx.booleanValue("ListGatewaySlbResponse.Data["+ i +"].EditEnable"));
			sources.setHttpsVServerGroupId(_ctx.stringValue("ListGatewaySlbResponse.Data["+ i +"].HttpsVServerGroupId"));

			data.add(sources);
		}
		listGatewaySlbResponse.setData(data);
	 
	 	return listGatewaySlbResponse;
	}
}