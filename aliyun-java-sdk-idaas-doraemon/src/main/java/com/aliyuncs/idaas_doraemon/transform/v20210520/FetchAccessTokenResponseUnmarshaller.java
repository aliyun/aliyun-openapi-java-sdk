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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import com.aliyuncs.idaas_doraemon.model.v20210520.FetchAccessTokenResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.FetchAccessTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchAccessTokenResponseUnmarshaller {

	public static FetchAccessTokenResponse unmarshall(FetchAccessTokenResponse fetchAccessTokenResponse, UnmarshallerContext _ctx) {
		
		fetchAccessTokenResponse.setRequestId(_ctx.stringValue("FetchAccessTokenResponse.RequestId"));
		fetchAccessTokenResponse.setMessage(_ctx.stringValue("FetchAccessTokenResponse.Message"));
		fetchAccessTokenResponse.setCode(_ctx.stringValue("FetchAccessTokenResponse.Code"));
		fetchAccessTokenResponse.setSuccess(_ctx.booleanValue("FetchAccessTokenResponse.Success"));

		Data data = new Data();
		data.setAccess_token(_ctx.stringValue("FetchAccessTokenResponse.Data.Access_token"));
		data.setToken_type(_ctx.stringValue("FetchAccessTokenResponse.Data.Token_type"));
		data.setScope(_ctx.stringValue("FetchAccessTokenResponse.Data.Scope"));
		data.setExpires_in(_ctx.stringValue("FetchAccessTokenResponse.Data.Expires_in"));
		data.setRefresh_token(_ctx.stringValue("FetchAccessTokenResponse.Data.Refresh_token"));
		data.setId_token(_ctx.stringValue("FetchAccessTokenResponse.Data.Id_token"));
		fetchAccessTokenResponse.setData(data);
	 
	 	return fetchAccessTokenResponse;
	}
}