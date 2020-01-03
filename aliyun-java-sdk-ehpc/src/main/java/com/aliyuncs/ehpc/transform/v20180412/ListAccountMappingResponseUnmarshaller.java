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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListAccountMappingResponse;
import com.aliyuncs.ehpc.model.v20180412.ListAccountMappingResponse.UserMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountMappingResponseUnmarshaller {

	public static ListAccountMappingResponse unmarshall(ListAccountMappingResponse listAccountMappingResponse, UnmarshallerContext _ctx) {
		
		listAccountMappingResponse.setRequestId(_ctx.stringValue("ListAccountMappingResponse.RequestId"));

		List<UserMapping> userMappings = new ArrayList<UserMapping>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountMappingResponse.UserMappings.Length"); i++) {
			UserMapping userMapping = new UserMapping();
			userMapping.setUserName(_ctx.stringValue("ListAccountMappingResponse.UserMappings["+ i +"].UserName"));
			userMapping.setAccountId(_ctx.stringValue("ListAccountMappingResponse.UserMappings["+ i +"].AccountId"));
			userMapping.setAccountName(_ctx.stringValue("ListAccountMappingResponse.UserMappings["+ i +"].AccountName"));

			userMappings.add(userMapping);
		}
		listAccountMappingResponse.setUserMappings(userMappings);
	 
	 	return listAccountMappingResponse;
	}
}