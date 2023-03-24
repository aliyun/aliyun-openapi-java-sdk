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

package com.aliyuncs.ims.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.ListUserBasicInfosResponse;
import com.aliyuncs.ims.model.v20190815.ListUserBasicInfosResponse.UserBasicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserBasicInfosResponseUnmarshaller {

	public static ListUserBasicInfosResponse unmarshall(ListUserBasicInfosResponse listUserBasicInfosResponse, UnmarshallerContext _ctx) {
		
		listUserBasicInfosResponse.setRequestId(_ctx.stringValue("ListUserBasicInfosResponse.RequestId"));
		listUserBasicInfosResponse.setIsTruncated(_ctx.booleanValue("ListUserBasicInfosResponse.IsTruncated"));
		listUserBasicInfosResponse.setMarker(_ctx.stringValue("ListUserBasicInfosResponse.Marker"));

		List<UserBasicInfo> userBasicInfos = new ArrayList<UserBasicInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListUserBasicInfosResponse.UserBasicInfos.Length"); i++) {
			UserBasicInfo userBasicInfo = new UserBasicInfo();
			userBasicInfo.setUserPrincipalName(_ctx.stringValue("ListUserBasicInfosResponse.UserBasicInfos["+ i +"].UserPrincipalName"));
			userBasicInfo.setDisplayName(_ctx.stringValue("ListUserBasicInfosResponse.UserBasicInfos["+ i +"].DisplayName"));
			userBasicInfo.setUserId(_ctx.stringValue("ListUserBasicInfosResponse.UserBasicInfos["+ i +"].UserId"));

			userBasicInfos.add(userBasicInfo);
		}
		listUserBasicInfosResponse.setUserBasicInfos(userBasicInfos);
	 
	 	return listUserBasicInfosResponse;
	}
}