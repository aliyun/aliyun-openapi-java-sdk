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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.AddPrivateRegistryResponse;
import com.aliyuncs.sas.model.v20181203.AddPrivateRegistryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPrivateRegistryResponseUnmarshaller {

	public static AddPrivateRegistryResponse unmarshall(AddPrivateRegistryResponse addPrivateRegistryResponse, UnmarshallerContext _ctx) {
		
		addPrivateRegistryResponse.setRequestId(_ctx.stringValue("AddPrivateRegistryResponse.RequestId"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("AddPrivateRegistryResponse.Data.VpcId"));
		data.setToken(_ctx.stringValue("AddPrivateRegistryResponse.Data.Token"));
		data.setTransPerHour(_ctx.integerValue("AddPrivateRegistryResponse.Data.TransPerHour"));
		data.setAliUid(_ctx.longValue("AddPrivateRegistryResponse.Data.AliUid"));
		data.setRegistryType(_ctx.stringValue("AddPrivateRegistryResponse.Data.RegistryType"));
		data.setDomainName(_ctx.stringValue("AddPrivateRegistryResponse.Data.DomainName"));
		data.setRegionId(_ctx.stringValue("AddPrivateRegistryResponse.Data.RegionId"));
		data.setPassword(_ctx.stringValue("AddPrivateRegistryResponse.Data.Password"));
		data.setNetType(_ctx.longValue("AddPrivateRegistryResponse.Data.NetType"));
		data.setRegistryVersion(_ctx.stringValue("AddPrivateRegistryResponse.Data.RegistryVersion"));
		data.setProtocolType(_ctx.longValue("AddPrivateRegistryResponse.Data.ProtocolType"));
		data.setRegistryHostIp(_ctx.stringValue("AddPrivateRegistryResponse.Data.RegistryHostIp"));
		data.setUserName(_ctx.stringValue("AddPrivateRegistryResponse.Data.UserName"));
		data.setId(_ctx.longValue("AddPrivateRegistryResponse.Data.Id"));
		addPrivateRegistryResponse.setData(data);
	 
	 	return addPrivateRegistryResponse;
	}
}