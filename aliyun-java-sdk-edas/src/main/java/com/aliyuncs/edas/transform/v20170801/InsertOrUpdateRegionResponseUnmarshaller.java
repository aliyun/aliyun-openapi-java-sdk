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

import com.aliyuncs.edas.model.v20170801.InsertOrUpdateRegionResponse;
import com.aliyuncs.edas.model.v20170801.InsertOrUpdateRegionResponse.UserDefineRegionEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertOrUpdateRegionResponseUnmarshaller {

	public static InsertOrUpdateRegionResponse unmarshall(InsertOrUpdateRegionResponse insertOrUpdateRegionResponse, UnmarshallerContext context) {
		
		insertOrUpdateRegionResponse.setRequestId(context.stringValue("InsertOrUpdateRegionResponse.RequestId"));
		insertOrUpdateRegionResponse.setCode(context.integerValue("InsertOrUpdateRegionResponse.Code"));
		insertOrUpdateRegionResponse.setMessage(context.stringValue("InsertOrUpdateRegionResponse.Message"));

		UserDefineRegionEntity userDefineRegionEntity = new UserDefineRegionEntity();
		userDefineRegionEntity.setId(context.longValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.Id"));
		userDefineRegionEntity.setUserId(context.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.UserId"));
		userDefineRegionEntity.setRegionId(context.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.RegionId"));
		userDefineRegionEntity.setRegionName(context.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.RegionName"));
		userDefineRegionEntity.setDescription(context.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.Description"));
		userDefineRegionEntity.setBelongRegion(context.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.BelongRegion"));
		insertOrUpdateRegionResponse.setUserDefineRegionEntity(userDefineRegionEntity);
	 
	 	return insertOrUpdateRegionResponse;
	}
}