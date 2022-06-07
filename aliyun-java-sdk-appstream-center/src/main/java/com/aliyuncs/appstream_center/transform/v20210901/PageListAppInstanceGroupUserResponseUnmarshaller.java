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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.PageListAppInstanceGroupUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageListAppInstanceGroupUserResponseUnmarshaller {

	public static PageListAppInstanceGroupUserResponse unmarshall(PageListAppInstanceGroupUserResponse pageListAppInstanceGroupUserResponse, UnmarshallerContext _ctx) {
		
		pageListAppInstanceGroupUserResponse.setRequestId(_ctx.stringValue("PageListAppInstanceGroupUserResponse.RequestId"));

		List<String> users = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PageListAppInstanceGroupUserResponse.Users.Length"); i++) {
			users.add(_ctx.stringValue("PageListAppInstanceGroupUserResponse.Users["+ i +"]"));
		}
		pageListAppInstanceGroupUserResponse.setUsers(users);
	 
	 	return pageListAppInstanceGroupUserResponse;
	}
}