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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.CreateConnectChannelRandomCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConnectChannelRandomCodeResponseUnmarshaller {

	public static CreateConnectChannelRandomCodeResponse unmarshall(CreateConnectChannelRandomCodeResponse createConnectChannelRandomCodeResponse, UnmarshallerContext _ctx) {
		
		createConnectChannelRandomCodeResponse.setRequestId(_ctx.stringValue("CreateConnectChannelRandomCodeResponse.RequestId"));
		createConnectChannelRandomCodeResponse.setSuccess(_ctx.booleanValue("CreateConnectChannelRandomCodeResponse.Success"));
		createConnectChannelRandomCodeResponse.setCode(_ctx.stringValue("CreateConnectChannelRandomCodeResponse.Code"));
		createConnectChannelRandomCodeResponse.setErrorMsg(_ctx.stringValue("CreateConnectChannelRandomCodeResponse.ErrorMsg"));
		createConnectChannelRandomCodeResponse.setData(_ctx.stringValue("CreateConnectChannelRandomCodeResponse.Data"));
	 
	 	return createConnectChannelRandomCodeResponse;
	}
}