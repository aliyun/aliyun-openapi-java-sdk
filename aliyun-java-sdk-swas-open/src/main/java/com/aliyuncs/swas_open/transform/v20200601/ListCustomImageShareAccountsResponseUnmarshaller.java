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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListCustomImageShareAccountsResponse;
import com.aliyuncs.swas_open.model.v20200601.ListCustomImageShareAccountsResponse.ImageShareUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomImageShareAccountsResponseUnmarshaller {

	public static ListCustomImageShareAccountsResponse unmarshall(ListCustomImageShareAccountsResponse listCustomImageShareAccountsResponse, UnmarshallerContext _ctx) {
		
		listCustomImageShareAccountsResponse.setRequestId(_ctx.stringValue("ListCustomImageShareAccountsResponse.RequestId"));
		listCustomImageShareAccountsResponse.setTotalCount(_ctx.integerValue("ListCustomImageShareAccountsResponse.TotalCount"));
		listCustomImageShareAccountsResponse.setPageSize(_ctx.integerValue("ListCustomImageShareAccountsResponse.PageSize"));
		listCustomImageShareAccountsResponse.setPageNumber(_ctx.integerValue("ListCustomImageShareAccountsResponse.PageNumber"));

		List<ImageShareUser> imageShareUsers = new ArrayList<ImageShareUser>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomImageShareAccountsResponse.ImageShareUsers.Length"); i++) {
			ImageShareUser imageShareUser = new ImageShareUser();
			imageShareUser.setUserId(_ctx.longValue("ListCustomImageShareAccountsResponse.ImageShareUsers["+ i +"].UserId"));
			imageShareUser.setSharedTime(_ctx.stringValue("ListCustomImageShareAccountsResponse.ImageShareUsers["+ i +"].SharedTime"));

			imageShareUsers.add(imageShareUser);
		}
		listCustomImageShareAccountsResponse.setImageShareUsers(imageShareUsers);
	 
	 	return listCustomImageShareAccountsResponse;
	}
}