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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.GetUserTokenResponse;
import com.aliyuncs.scsp.model.v20200702.GetUserTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserTokenResponseUnmarshaller {

	public static GetUserTokenResponse unmarshall(GetUserTokenResponse getUserTokenResponse, UnmarshallerContext _ctx) {
		
		getUserTokenResponse.setRequestId(_ctx.stringValue("GetUserTokenResponse.RequestId"));
		getUserTokenResponse.setMessage(_ctx.stringValue("GetUserTokenResponse.Message"));
		getUserTokenResponse.setCode(_ctx.stringValue("GetUserTokenResponse.Code"));
		getUserTokenResponse.setSuccess(_ctx.booleanValue("GetUserTokenResponse.Success"));

		Data data = new Data();
		data.setExpires(_ctx.longValue("GetUserTokenResponse.Data.Expires"));
		data.setToken(_ctx.stringValue("GetUserTokenResponse.Data.Token"));
		getUserTokenResponse.setData(data);
	 
	 	return getUserTokenResponse;
	}
}