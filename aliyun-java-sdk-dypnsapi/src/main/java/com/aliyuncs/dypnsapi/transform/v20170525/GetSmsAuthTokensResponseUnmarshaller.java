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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.GetSmsAuthTokensResponse;
import com.aliyuncs.dypnsapi.model.v20170525.GetSmsAuthTokensResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSmsAuthTokensResponseUnmarshaller {

	public static GetSmsAuthTokensResponse unmarshall(GetSmsAuthTokensResponse getSmsAuthTokensResponse, UnmarshallerContext _ctx) {
		
		getSmsAuthTokensResponse.setRequestId(_ctx.stringValue("GetSmsAuthTokensResponse.RequestId"));
		getSmsAuthTokensResponse.setCode(_ctx.stringValue("GetSmsAuthTokensResponse.Code"));
		getSmsAuthTokensResponse.setMessage(_ctx.stringValue("GetSmsAuthTokensResponse.Message"));

		Data data = new Data();
		data.setBizToken(_ctx.stringValue("GetSmsAuthTokensResponse.Data.BizToken"));
		data.setStsAccessKeySecret(_ctx.stringValue("GetSmsAuthTokensResponse.Data.StsAccessKeySecret"));
		data.setStsAccessKeyId(_ctx.stringValue("GetSmsAuthTokensResponse.Data.StsAccessKeyId"));
		data.setExpireTime(_ctx.longValue("GetSmsAuthTokensResponse.Data.ExpireTime"));
		data.setStsToken(_ctx.stringValue("GetSmsAuthTokensResponse.Data.StsToken"));
		getSmsAuthTokensResponse.setData(data);
	 
	 	return getSmsAuthTokensResponse;
	}
}