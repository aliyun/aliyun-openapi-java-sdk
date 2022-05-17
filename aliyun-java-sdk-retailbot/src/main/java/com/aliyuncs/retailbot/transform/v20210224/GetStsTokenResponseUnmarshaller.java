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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.GetStsTokenResponse;
import com.aliyuncs.retailbot.model.v20210224.GetStsTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStsTokenResponseUnmarshaller {

	public static GetStsTokenResponse unmarshall(GetStsTokenResponse getStsTokenResponse, UnmarshallerContext _ctx) {
		
		getStsTokenResponse.setSuccess(_ctx.booleanValue("GetStsTokenResponse.Success"));
		getStsTokenResponse.setCode(_ctx.stringValue("GetStsTokenResponse.Code"));
		getStsTokenResponse.setMessage(_ctx.stringValue("GetStsTokenResponse.Message"));

		Data data = new Data();
		data.setAccessKeyId(_ctx.stringValue("GetStsTokenResponse.Data.AccessKeyId"));
		data.setAccessKeySecret(_ctx.stringValue("GetStsTokenResponse.Data.AccessKeySecret"));
		data.setSecurityToken(_ctx.stringValue("GetStsTokenResponse.Data.SecurityToken"));
		data.setExpiration(_ctx.stringValue("GetStsTokenResponse.Data.Expiration"));
		getStsTokenResponse.setData(data);
	 
	 	return getStsTokenResponse;
	}
}