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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.AddHDMInstanceResponse;
import com.aliyuncs.das.model.v20200116.AddHDMInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddHDMInstanceResponseUnmarshaller {

	public static AddHDMInstanceResponse unmarshall(AddHDMInstanceResponse addHDMInstanceResponse, UnmarshallerContext _ctx) {
		
		addHDMInstanceResponse.setRequestId(_ctx.stringValue("AddHDMInstanceResponse.RequestId"));
		addHDMInstanceResponse.setMessage(_ctx.stringValue("AddHDMInstanceResponse.Message"));
		addHDMInstanceResponse.setSynchro(_ctx.stringValue("AddHDMInstanceResponse.Synchro"));
		addHDMInstanceResponse.setCode(_ctx.stringValue("AddHDMInstanceResponse.Code"));
		addHDMInstanceResponse.setSuccess(_ctx.stringValue("AddHDMInstanceResponse.Success"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("AddHDMInstanceResponse.Data.VpcId"));
		data.setToken(_ctx.stringValue("AddHDMInstanceResponse.Data.Token"));
		data.setIp(_ctx.stringValue("AddHDMInstanceResponse.Data.Ip"));
		data.setCallerUid(_ctx.stringValue("AddHDMInstanceResponse.Data.CallerUid"));
		data.setInstanceId(_ctx.stringValue("AddHDMInstanceResponse.Data.InstanceId"));
		data.setPort(_ctx.integerValue("AddHDMInstanceResponse.Data.Port"));
		data.setOwnerId(_ctx.stringValue("AddHDMInstanceResponse.Data.OwnerId"));
		data.setUuid(_ctx.stringValue("AddHDMInstanceResponse.Data.Uuid"));
		data.setError(_ctx.stringValue("AddHDMInstanceResponse.Data.Error"));
		data.setCode(_ctx.integerValue("AddHDMInstanceResponse.Data.Code"));
		data.setRole(_ctx.stringValue("AddHDMInstanceResponse.Data.Role"));
		data.setTenantId(_ctx.stringValue("AddHDMInstanceResponse.Data.TenantId"));
		addHDMInstanceResponse.setData(data);
	 
	 	return addHDMInstanceResponse;
	}
}