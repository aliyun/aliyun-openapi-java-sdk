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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.CreateActivationCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateActivationCodeResponseUnmarshaller {

	public static CreateActivationCodeResponse unmarshall(CreateActivationCodeResponse createActivationCodeResponse, UnmarshallerContext _ctx) {
		
		createActivationCodeResponse.setRequestId(_ctx.stringValue("CreateActivationCodeResponse.RequestId"));
		createActivationCodeResponse.setActivateAt(_ctx.stringValue("CreateActivationCodeResponse.ActivateAt"));
		createActivationCodeResponse.setCertContentB64(_ctx.stringValue("CreateActivationCodeResponse.CertContentB64"));
		createActivationCodeResponse.setDescription(_ctx.stringValue("CreateActivationCodeResponse.Description"));
		createActivationCodeResponse.setExpireAt(_ctx.stringValue("CreateActivationCodeResponse.ExpireAt"));
		createActivationCodeResponse.setGmtCreated(_ctx.stringValue("CreateActivationCodeResponse.GmtCreated"));
		createActivationCodeResponse.setGmtModified(_ctx.stringValue("CreateActivationCodeResponse.GmtModified"));
		createActivationCodeResponse.setId(_ctx.integerValue("CreateActivationCodeResponse.Id"));
		createActivationCodeResponse.setMacAddress(_ctx.stringValue("CreateActivationCodeResponse.MacAddress"));
		createActivationCodeResponse.setName(_ctx.stringValue("CreateActivationCodeResponse.Name"));
		createActivationCodeResponse.setSystemIdentifier(_ctx.stringValue("CreateActivationCodeResponse.SystemIdentifier"));
	 
	 	return createActivationCodeResponse;
	}
}