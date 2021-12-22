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

package com.aliyuncs.cciotgw.transform.v20210721;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cciotgw.model.v20210721.ListCloudConnectorGatewayPrivilegeResponse;
import com.aliyuncs.cciotgw.model.v20210721.ListCloudConnectorGatewayPrivilegeResponse.IoTCloudConnectorGatewayPrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudConnectorGatewayPrivilegeResponseUnmarshaller {

	public static ListCloudConnectorGatewayPrivilegeResponse unmarshall(ListCloudConnectorGatewayPrivilegeResponse listCloudConnectorGatewayPrivilegeResponse, UnmarshallerContext _ctx) {
		
		listCloudConnectorGatewayPrivilegeResponse.setRequestId(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.RequestId"));
		listCloudConnectorGatewayPrivilegeResponse.setCode(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.Code"));
		listCloudConnectorGatewayPrivilegeResponse.setMessage(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.Message"));
		listCloudConnectorGatewayPrivilegeResponse.setSuccess(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.Success"));
		listCloudConnectorGatewayPrivilegeResponse.setIoTCloudConnectorGatewayId(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.IoTCloudConnectorGatewayId"));

		List<IoTCloudConnectorGatewayPrivilege> ioTCloudConnectorGatewayPrivileges = new ArrayList<IoTCloudConnectorGatewayPrivilege>();
		for (int i = 0; i < _ctx.lengthValue("ListCloudConnectorGatewayPrivilegeResponse.IoTCloudConnectorGatewayPrivileges.Length"); i++) {
			IoTCloudConnectorGatewayPrivilege ioTCloudConnectorGatewayPrivilege = new IoTCloudConnectorGatewayPrivilege();
			ioTCloudConnectorGatewayPrivilege.setType(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.IoTCloudConnectorGatewayPrivileges["+ i +"].Type"));
			ioTCloudConnectorGatewayPrivilege.setAliuid(_ctx.stringValue("ListCloudConnectorGatewayPrivilegeResponse.IoTCloudConnectorGatewayPrivileges["+ i +"].Aliuid"));

			ioTCloudConnectorGatewayPrivileges.add(ioTCloudConnectorGatewayPrivilege);
		}
		listCloudConnectorGatewayPrivilegeResponse.setIoTCloudConnectorGatewayPrivileges(ioTCloudConnectorGatewayPrivileges);
	 
	 	return listCloudConnectorGatewayPrivilegeResponse;
	}
}