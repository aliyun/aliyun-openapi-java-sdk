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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserDefineRegionResponseUnmarshaller {

	public static ListUserDefineRegionResponse unmarshall(ListUserDefineRegionResponse listUserDefineRegionResponse, UnmarshallerContext context) {
		
		listUserDefineRegionResponse.setRequestId(context.stringValue("ListUserDefineRegionResponse.RequestId"));
		listUserDefineRegionResponse.setCode(context.integerValue("ListUserDefineRegionResponse.Code"));
		listUserDefineRegionResponse.setMessage(context.stringValue("ListUserDefineRegionResponse.Message"));

		List<UserDefineRegionEntity> userDefineRegionList = new ArrayList<UserDefineRegionEntity>();
		for (int i = 0; i < context.lengthValue("ListUserDefineRegionResponse.UserDefineRegionList.Length"); i++) {
			UserDefineRegionEntity userDefineRegionEntity = new UserDefineRegionEntity();
			userDefineRegionEntity.setId(context.longValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].Id"));
			userDefineRegionEntity.setUserId(context.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].UserId"));
			userDefineRegionEntity.setRegionId(context.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].RegionId"));
			userDefineRegionEntity.setRegionName(context.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].RegionName"));
			userDefineRegionEntity.setDescription(context.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].Description"));
			userDefineRegionEntity.setBelongRegion(context.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].BelongRegion"));
			userDefineRegionEntity.setHybridCloudEnable(context.booleanValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].HybridCloudEnable"));
			userDefineRegionEntity.setVpcId(context.stringValue("ListUserDefineRegionResponse.UserDefineRegionList["+ i +"].VpcId"));

			userDefineRegionList.add(userDefineRegionEntity);
		}
		listUserDefineRegionResponse.setUserDefineRegionList(userDefineRegionList);
	 
	 	return listUserDefineRegionResponse;
	}
}