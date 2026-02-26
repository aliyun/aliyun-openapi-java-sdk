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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetUserApplicationGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserApplicationGroupsResponseUnmarshaller {

	public static GetUserApplicationGroupsResponse unmarshall(GetUserApplicationGroupsResponse getUserApplicationGroupsResponse, UnmarshallerContext _ctx) {
		
		getUserApplicationGroupsResponse.setRequestId(_ctx.stringValue("GetUserApplicationGroupsResponse.RequestId"));
		getUserApplicationGroupsResponse.setHttpStatusCode(_ctx.integerValue("GetUserApplicationGroupsResponse.HttpStatusCode"));
		getUserApplicationGroupsResponse.setSuccess(_ctx.booleanValue("GetUserApplicationGroupsResponse.Success"));
		getUserApplicationGroupsResponse.setMessage(_ctx.stringValue("GetUserApplicationGroupsResponse.Message"));
		getUserApplicationGroupsResponse.setCode(_ctx.stringValue("GetUserApplicationGroupsResponse.Code"));

		List<String> appGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserApplicationGroupsResponse.AppGroups.Length"); i++) {
			appGroups.add(_ctx.stringValue("GetUserApplicationGroupsResponse.AppGroups["+ i +"]"));
		}
		getUserApplicationGroupsResponse.setAppGroups(appGroups);
	 
	 	return getUserApplicationGroupsResponse;
	}
}