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

import com.aliyuncs.edas.model.v20170801.ListUserDefineRegionResponse;
import com.aliyuncs.edas.model.v20170801.ListUserDefineRegionResponse.UserDefineRegionEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserDefineRegionResponseUnmarshaller {

	public static ListUserDefineRegionResponse unmarshall(ListUserDefineRegionResponse listUserDefineRegionResponse, UnmarshallerContext _ctx) {
		
		listUserDefineRegionResponse.setRequestId(_ctx.stringValue("ListUserDefineRegionResponse.RequestId"));
		listUserDefineRegionResponse.setCode(_ctx.integerValue("ListUserDefineRegionResponse.Code"));
		listUserDefineRegionResponse.setMessage(_ctx.stringValue("ListUserDefineRegionResponse.Message"));

		List<UserDefineRegionEntity> userDefineRegionList = new ArrayList<UserDefineRegionEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListUserDefineRegionResponse.UserDefineRegionList.Length"); i++) {
			UserDefineRegionEntity userDefineRegionEntity = new UserDefineRegionEntity();
			userDefineRegionEntity.setId(_ctx.longValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].Id"));
			userDefineRegionEntity.setUserId(_ctx.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].UserId"));
			userDefineRegionEntity.setRegionId(_ctx.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].RegionId"));
			userDefineRegionEntity.setRegionName(_ctx.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].RegionName"));
			userDefineRegionEntity.setDescription(_ctx.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].Description"));
			userDefineRegionEntity.setBelongRegion(_ctx.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].BelongRegion"));
			userDefineRegionEntity.setDebugEnable(_ctx.booleanValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].DebugEnable"));

			userDefineRegionList.add(userDefineRegionEntity);
		}
		listUserDefineRegionResponse.setUserDefineRegionList(userDefineRegionList);
	 
	 	return listUserDefineRegionResponse;
	}
}