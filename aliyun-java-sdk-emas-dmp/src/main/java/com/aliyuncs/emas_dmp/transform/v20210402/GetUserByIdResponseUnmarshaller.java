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

import com.aliyuncs.emas_dmp.model.v20210402.GetUserByIdResponse;
import com.aliyuncs.emas_dmp.model.v20210402.GetUserByIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserByIdResponseUnmarshaller {

	public static GetUserByIdResponse unmarshall(GetUserByIdResponse getUserByIdResponse, UnmarshallerContext _ctx) {
		
		getUserByIdResponse.setRequestId(_ctx.stringValue("GetUserByIdResponse.RequestId"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetUserByIdResponse.Data.Name"));
		data.setUserId(_ctx.stringValue("GetUserByIdResponse.Data.UserId"));
		getUserByIdResponse.setData(data);
	 
	 	return getUserByIdResponse;
	}
}