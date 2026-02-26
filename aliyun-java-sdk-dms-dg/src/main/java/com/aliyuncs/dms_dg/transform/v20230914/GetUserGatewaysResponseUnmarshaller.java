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

package com.aliyuncs.dms_dg.transform.v20230914;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_dg.model.v20230914.GetUserGatewaysResponse;
import com.aliyuncs.dms_dg.model.v20230914.GetUserGatewaysResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGatewaysResponseUnmarshaller {

	public static GetUserGatewaysResponse unmarshall(GetUserGatewaysResponse getUserGatewaysResponse, UnmarshallerContext _ctx) {
		
		getUserGatewaysResponse.setRequestId(_ctx.stringValue("GetUserGatewaysResponse.RequestId"));
		getUserGatewaysResponse.setSuccess(_ctx.booleanValue("GetUserGatewaysResponse.Success"));
		getUserGatewaysResponse.setCode(_ctx.stringValue("GetUserGatewaysResponse.Code"));
		getUserGatewaysResponse.setErrorMsg(_ctx.stringValue("GetUserGatewaysResponse.ErrorMsg"));
		getUserGatewaysResponse.setCount(_ctx.integerValue("GetUserGatewaysResponse.Count"));

		List<Gateway> gatewayList = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("GetUserGatewaysResponse.GatewayList.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGatewayDesc(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].GatewayDesc"));
			gateway.setGatewayName(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].GatewayName"));
			gateway.setRegionId(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].RegionId"));
			gateway.setGatewayId(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].GatewayId"));
			gateway.setStatus(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].Status"));
			gateway.setUserId(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].UserId"));
			gateway.setCreatorId(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].CreatorId"));
			gateway.setDgVersion(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].DgVersion"));
			gateway.setExceptionMsg(_ctx.stringValue("GetUserGatewaysResponse.GatewayList["+ i +"].ExceptionMsg"));
			gateway.setNumOfExceptionInstance(_ctx.integerValue("GetUserGatewaysResponse.GatewayList["+ i +"].NumOfExceptionInstance"));
			gateway.setNumOfRunningInstance(_ctx.integerValue("GetUserGatewaysResponse.GatewayList["+ i +"].NumOfRunningInstance"));

			gatewayList.add(gateway);
		}
		getUserGatewaysResponse.setGatewayList(gatewayList);
	 
	 	return getUserGatewaysResponse;
	}
}