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

package com.aliyuncs.btripopen.transform.v20220517;

import com.aliyuncs.btripopen.model.v20220517.TakeAccessTokenResponse;
import com.aliyuncs.btripopen.model.v20220517.TakeAccessTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TakeAccessTokenResponseUnmarshaller {

	public static TakeAccessTokenResponse unmarshall(TakeAccessTokenResponse takeAccessTokenResponse, UnmarshallerContext _ctx) {
		
		takeAccessTokenResponse.setRequestId(_ctx.stringValue("TakeAccessTokenResponse.requestId"));
		takeAccessTokenResponse.setCode(_ctx.stringValue("TakeAccessTokenResponse.code"));
		takeAccessTokenResponse.setMessage(_ctx.stringValue("TakeAccessTokenResponse.message"));
		takeAccessTokenResponse.setSuccess(_ctx.stringValue("TakeAccessTokenResponse.success"));

		Data data = new Data();
		data.setAccess_token(_ctx.stringValue("TakeAccessTokenResponse.data.access_token"));
		data.setExpire(_ctx.longValue("TakeAccessTokenResponse.data.expire"));
		takeAccessTokenResponse.setData(data);
	 
	 	return takeAccessTokenResponse;
	}
}