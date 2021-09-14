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

package com.aliyuncs.emas_dmp.transform.v20210402;

import com.aliyuncs.emas_dmp.model.v20210402.GetUserByTokenResponse;
import com.aliyuncs.emas_dmp.model.v20210402.GetUserByTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserByTokenResponseUnmarshaller {

	public static GetUserByTokenResponse unmarshall(GetUserByTokenResponse getUserByTokenResponse, UnmarshallerContext _ctx) {
		
		getUserByTokenResponse.setRequestId(_ctx.stringValue("GetUserByTokenResponse.RequestId"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetUserByTokenResponse.Data.Name"));
		data.setUserId(_ctx.stringValue("GetUserByTokenResponse.Data.UserId"));
		getUserByTokenResponse.setData(data);
	 
	 	return getUserByTokenResponse;
	}
}