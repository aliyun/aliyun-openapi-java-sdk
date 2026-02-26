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

package com.aliyuncs.onsmqtt.transform.v20200420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20200420.ListDeviceCredentialClientIdResponse;
import com.aliyuncs.onsmqtt.model.v20200420.ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceCredentialClientIdResponseUnmarshaller {

	public static ListDeviceCredentialClientIdResponse unmarshall(ListDeviceCredentialClientIdResponse listDeviceCredentialClientIdResponse, UnmarshallerContext _ctx) {
		
		listDeviceCredentialClientIdResponse.setRequestId(_ctx.stringValue("ListDeviceCredentialClientIdResponse.RequestId"));

		DeviceCredentialClientIdList deviceCredentialClientIdList = new DeviceCredentialClientIdList();
		deviceCredentialClientIdList.setTotal(_ctx.stringValue("ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList.Total"));
		deviceCredentialClientIdList.setPageNo(_ctx.stringValue("ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList.PageNo"));
		deviceCredentialClientIdList.setPageSize(_ctx.stringValue("ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList.PageSize"));
		deviceCredentialClientIdList.setNextToken(_ctx.stringValue("ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList.NextToken"));

		List<String> clientIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList.ClientIdList.Length"); i++) {
			clientIdList.add(_ctx.stringValue("ListDeviceCredentialClientIdResponse.DeviceCredentialClientIdList.ClientIdList["+ i +"]"));
		}
		deviceCredentialClientIdList.setClientIdList(clientIdList);
		listDeviceCredentialClientIdResponse.setDeviceCredentialClientIdList(deviceCredentialClientIdList);
	 
	 	return listDeviceCredentialClientIdResponse;
	}
}