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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.AddWhitelistResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWhitelistResponseUnmarshaller {

	public static AddWhitelistResponse unmarshall(AddWhitelistResponse addWhitelistResponse, UnmarshallerContext _ctx) {
		
		addWhitelistResponse.setRequestId(_ctx.stringValue("AddWhitelistResponse.RequestId"));
		addWhitelistResponse.setSuccess(_ctx.booleanValue("AddWhitelistResponse.Success"));
		addWhitelistResponse.setCode(_ctx.stringValue("AddWhitelistResponse.Code"));
		addWhitelistResponse.setMessage(_ctx.stringValue("AddWhitelistResponse.Message"));
		addWhitelistResponse.setErrorName(_ctx.stringValue("AddWhitelistResponse.ErrorName"));
		addWhitelistResponse.setHttpCode(_ctx.integerValue("AddWhitelistResponse.HttpCode"));
	 
	 	return addWhitelistResponse;
	}
}