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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2StorageUsageResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2StorageUsageResponseUnmarshaller {

	public static GetLindormV2StorageUsageResponse unmarshall(GetLindormV2StorageUsageResponse getLindormV2StorageUsageResponse, UnmarshallerContext _ctx) {
		
		getLindormV2StorageUsageResponse.setRequestId(_ctx.stringValue("GetLindormV2StorageUsageResponse.RequestId"));
		getLindormV2StorageUsageResponse.setInstanceStorageZoneMap(_ctx.mapValue("GetLindormV2StorageUsageResponse.InstanceStorageZoneMap"));
		getLindormV2StorageUsageResponse.setAccessDeniedDetail(_ctx.stringValue("GetLindormV2StorageUsageResponse.AccessDeniedDetail"));

		List<Map<Object, Object>> capacityByDiskCategory = _ctx.listMapValue("GetLindormV2StorageUsageResponse.CapacityByDiskCategory");
		getLindormV2StorageUsageResponse.setCapacityByDiskCategory(capacityByDiskCategory);

		List<Map<Object, Object>> usageByDiskCategory = _ctx.listMapValue("GetLindormV2StorageUsageResponse.UsageByDiskCategory");
		getLindormV2StorageUsageResponse.setUsageByDiskCategory(usageByDiskCategory);
	 
	 	return getLindormV2StorageUsageResponse;
	}
}