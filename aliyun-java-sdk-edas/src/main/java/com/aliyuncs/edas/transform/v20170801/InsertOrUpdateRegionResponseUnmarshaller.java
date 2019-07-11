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

	public static InsertOrUpdateRegionResponse unmarshall(InsertOrUpdateRegionResponse insertOrUpdateRegionResponse, UnmarshallerContext _ctx) {
		
		insertOrUpdateRegionResponse.setRequestId(_ctx.stringValue("InsertOrUpdateRegionResponse.RequestId"));
		insertOrUpdateRegionResponse.setCode(_ctx.integerValue("InsertOrUpdateRegionResponse.Code"));
		insertOrUpdateRegionResponse.setMessage(_ctx.stringValue("InsertOrUpdateRegionResponse.Message"));

		UserDefineRegionEntity userDefineRegionEntity = new UserDefineRegionEntity();
		userDefineRegionEntity.setId(_ctx.longValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.Id"));
		userDefineRegionEntity.setUserId(_ctx.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.UserId"));
		userDefineRegionEntity.setRegionId(_ctx.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.RegionId"));
		userDefineRegionEntity.setRegionName(_ctx.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.RegionName"));
		userDefineRegionEntity.setDescription(_ctx.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.Description"));
		userDefineRegionEntity.setBelongRegion(_ctx.stringValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.BelongRegion"));
		userDefineRegionEntity.setDebugEnable(_ctx.booleanValue("InsertOrUpdateRegionResponse.UserDefineRegionEntity.DebugEnable"));
		insertOrUpdateRegionResponse.setUserDefineRegionEntity(userDefineRegionEntity);
	 
	 	return insertOrUpdateRegionResponse;
	}
}