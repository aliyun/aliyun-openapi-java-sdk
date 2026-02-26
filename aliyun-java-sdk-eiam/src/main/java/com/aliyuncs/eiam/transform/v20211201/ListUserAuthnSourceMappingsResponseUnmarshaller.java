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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListUserAuthnSourceMappingsResponse;
import com.aliyuncs.eiam.model.v20211201.ListUserAuthnSourceMappingsResponse.UserAuthnSourceMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserAuthnSourceMappingsResponseUnmarshaller {

	public static ListUserAuthnSourceMappingsResponse unmarshall(ListUserAuthnSourceMappingsResponse listUserAuthnSourceMappingsResponse, UnmarshallerContext _ctx) {
		
		listUserAuthnSourceMappingsResponse.setRequestId(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.RequestId"));
		listUserAuthnSourceMappingsResponse.setTotalCount(_ctx.integerValue("ListUserAuthnSourceMappingsResponse.TotalCount"));
		listUserAuthnSourceMappingsResponse.setNextToken(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.NextToken"));
		listUserAuthnSourceMappingsResponse.setPreviousToken(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.PreviousToken"));
		listUserAuthnSourceMappingsResponse.setMaxResults(_ctx.integerValue("ListUserAuthnSourceMappingsResponse.MaxResults"));

		List<UserAuthnSourceMapping> userAuthnSourceMappings = new ArrayList<UserAuthnSourceMapping>();
		for (int i = 0; i < _ctx.lengthValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings.Length"); i++) {
			UserAuthnSourceMapping userAuthnSourceMapping = new UserAuthnSourceMapping();
			userAuthnSourceMapping.setInstanceId(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].InstanceId"));
			userAuthnSourceMapping.setUserId(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].UserId"));
			userAuthnSourceMapping.setUserExternalId(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].UserExternalId"));
			userAuthnSourceMapping.setAuthnSourceType(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].AuthnSourceType"));
			userAuthnSourceMapping.setIdentityProviderId(_ctx.stringValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].IdentityProviderId"));
			userAuthnSourceMapping.setCreateTime(_ctx.longValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].CreateTime"));
			userAuthnSourceMapping.setUpdateTime(_ctx.longValue("ListUserAuthnSourceMappingsResponse.UserAuthnSourceMappings["+ i +"].UpdateTime"));

			userAuthnSourceMappings.add(userAuthnSourceMapping);
		}
		listUserAuthnSourceMappingsResponse.setUserAuthnSourceMappings(userAuthnSourceMappings);
	 
	 	return listUserAuthnSourceMappingsResponse;
	}
}