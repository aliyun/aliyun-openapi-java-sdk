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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetDefaultAppUserResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetDefaultAppUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDefaultAppUserResponseUnmarshaller {

	public static GetDefaultAppUserResponse unmarshall(GetDefaultAppUserResponse getDefaultAppUserResponse, UnmarshallerContext _ctx) {
		
		getDefaultAppUserResponse.setRequestId(_ctx.stringValue("GetDefaultAppUserResponse.RequestId"));

		Data data = new Data();
		data.setUserName(_ctx.stringValue("GetDefaultAppUserResponse.Data.UserName"));
		data.setHasPassword(_ctx.booleanValue("GetDefaultAppUserResponse.Data.HasPassword"));
		getDefaultAppUserResponse.setData(data);
	 
	 	return getDefaultAppUserResponse;
	}
}