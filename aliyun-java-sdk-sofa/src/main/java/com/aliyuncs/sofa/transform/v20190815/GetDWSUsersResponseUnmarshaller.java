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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetDWSUsersResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSUsersResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSUsersResponseUnmarshaller {

	public static GetDWSUsersResponse unmarshall(GetDWSUsersResponse getDWSUsersResponse, UnmarshallerContext _ctx) {
		
		getDWSUsersResponse.setRequestId(_ctx.stringValue("GetDWSUsersResponse.RequestId"));
		getDWSUsersResponse.setResultCode(_ctx.stringValue("GetDWSUsersResponse.ResultCode"));
		getDWSUsersResponse.setResultMessage(_ctx.stringValue("GetDWSUsersResponse.ResultMessage"));

		Data data = new Data();
		data.setRealName(_ctx.stringValue("GetDWSUsersResponse.Data.RealName"));
		data.setUserId(_ctx.longValue("GetDWSUsersResponse.Data.UserId"));
		data.setUserName(_ctx.stringValue("GetDWSUsersResponse.Data.UserName"));
		getDWSUsersResponse.setData(data);
	 
	 	return getDWSUsersResponse;
	}
}