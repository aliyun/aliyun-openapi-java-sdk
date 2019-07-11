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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListAuthorityResponse;
import com.aliyuncs.edas.model.v20170801.ListAuthorityResponse.Authority;
import com.aliyuncs.edas.model.v20170801.ListAuthorityResponse.Authority.Action;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorityResponseUnmarshaller {

	public static ListAuthorityResponse unmarshall(ListAuthorityResponse listAuthorityResponse, UnmarshallerContext _ctx) {
		
		listAuthorityResponse.setRequestId(_ctx.stringValue("ListAuthorityResponse.RequestId"));
		listAuthorityResponse.setCode(_ctx.integerValue("ListAuthorityResponse.Code"));
		listAuthorityResponse.setMessage(_ctx.stringValue("ListAuthorityResponse.Message"));

		List<Authority> authorityList = new ArrayList<Authority>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorityResponse.AuthorityList.Length"); i++) {
			Authority authority = new Authority();
			authority.setGroupId(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].GroupId"));
			authority.setName(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].Name"));
			authority.setDescription(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].Description"));

			List<Action> actionList = new ArrayList<Action>();
			for (int j = 0; j < _ctx.lengthValue("ListAuthorityResponse.AuthorityList["+ i +"].ActionList.Length"); j++) {
				Action action = new Action();
				action.setGroupId(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].ActionList["+ j +"].GroupId"));
				action.setCode(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].ActionList["+ j +"].Code"));
				action.setName(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].ActionList["+ j +"].Name"));
				action.setDescription(_ctx.stringValue("ListAuthorityResponse.AuthorityList["+ i +"].ActionList["+ j +"].Description"));

				actionList.add(action);
			}
			authority.setActionList(actionList);

			authorityList.add(authority);
		}
		listAuthorityResponse.setAuthorityList(authorityList);
	 
	 	return listAuthorityResponse;
	}
}