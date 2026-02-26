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

import com.aliyuncs.sas.model.v20181203.CreateJenkinsImageRegistryResponse;
import com.aliyuncs.sas.model.v20181203.CreateJenkinsImageRegistryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJenkinsImageRegistryResponseUnmarshaller {

	public static CreateJenkinsImageRegistryResponse unmarshall(CreateJenkinsImageRegistryResponse createJenkinsImageRegistryResponse, UnmarshallerContext _ctx) {
		
		createJenkinsImageRegistryResponse.setRequestId(_ctx.stringValue("CreateJenkinsImageRegistryResponse.RequestId"));
		createJenkinsImageRegistryResponse.setSuccess(_ctx.booleanValue("CreateJenkinsImageRegistryResponse.Success"));
		createJenkinsImageRegistryResponse.setCode(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Code"));
		createJenkinsImageRegistryResponse.setMessage(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Message"));
		createJenkinsImageRegistryResponse.setHttpStatusCode(_ctx.integerValue("CreateJenkinsImageRegistryResponse.HttpStatusCode"));
		createJenkinsImageRegistryResponse.setTimeCost(_ctx.longValue("CreateJenkinsImageRegistryResponse.TimeCost"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateJenkinsImageRegistryResponse.Data.Id"));
		data.setGmtCreate(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.GmtModified"));
		data.setAliUid(_ctx.longValue("CreateJenkinsImageRegistryResponse.Data.AliUid"));
		data.setRegistryName(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.RegistryName"));
		data.setRegistryType(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.RegistryType"));
		data.setProtocolType(_ctx.integerValue("CreateJenkinsImageRegistryResponse.Data.ProtocolType"));
		data.setNetType(_ctx.integerValue("CreateJenkinsImageRegistryResponse.Data.NetType"));
		data.setVpcId(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.VpcId"));
		data.setRegistryHostIp(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.RegistryHostIp"));
		data.setDomainName(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.DomainName"));
		data.setUserName(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.UserName"));
		data.setPassword(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.Password"));
		data.setRegionId(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.RegionId"));
		data.setToken(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.Token"));
		data.setWhiteList(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.WhiteList"));
		data.setBlackList(_ctx.stringValue("CreateJenkinsImageRegistryResponse.Data.BlackList"));
		data.setTransPerHour(_ctx.integerValue("CreateJenkinsImageRegistryResponse.Data.TransPerHour"));
		data.setPersistenceDay(_ctx.integerValue("CreateJenkinsImageRegistryResponse.Data.PersistenceDay"));
		createJenkinsImageRegistryResponse.setData(data);
	 
	 	return createJenkinsImageRegistryResponse;
	}
}