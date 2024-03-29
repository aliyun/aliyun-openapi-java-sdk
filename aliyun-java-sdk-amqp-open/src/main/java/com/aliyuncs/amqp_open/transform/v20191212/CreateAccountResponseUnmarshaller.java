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

package com.aliyuncs.amqp_open.transform.v20191212;

import com.aliyuncs.amqp_open.model.v20191212.CreateAccountResponse;
import com.aliyuncs.amqp_open.model.v20191212.CreateAccountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAccountResponseUnmarshaller {

	public static CreateAccountResponse unmarshall(CreateAccountResponse createAccountResponse, UnmarshallerContext _ctx) {
		
		createAccountResponse.setRequestId(_ctx.stringValue("CreateAccountResponse.RequestId"));
		createAccountResponse.setCode(_ctx.integerValue("CreateAccountResponse.Code"));
		createAccountResponse.setMessage(_ctx.stringValue("CreateAccountResponse.Message"));
		createAccountResponse.setSuccess(_ctx.booleanValue("CreateAccountResponse.Success"));

		Data data = new Data();
		data.setAccessKey(_ctx.stringValue("CreateAccountResponse.Data.AccessKey"));
		data.setPassword(_ctx.stringValue("CreateAccountResponse.Data.Password"));
		data.setCreateTimeStamp(_ctx.longValue("CreateAccountResponse.Data.CreateTimeStamp"));
		data.setInstanceId(_ctx.stringValue("CreateAccountResponse.Data.InstanceId"));
		data.setMasterUId(_ctx.longValue("CreateAccountResponse.Data.MasterUId"));
		data.setUserName(_ctx.stringValue("CreateAccountResponse.Data.UserName"));
		createAccountResponse.setData(data);
	 
	 	return createAccountResponse;
	}
}