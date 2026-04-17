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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormV2StorageUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormV2StorageUsageResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> instanceStorageZoneMap;

	private String accessDeniedDetail;

	private List<Map<Object,Object>> capacityByDiskCategory;

	private List<Map<Object,Object>> usageByDiskCategory;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getInstanceStorageZoneMap() {
		return this.instanceStorageZoneMap;
	}

	public void setInstanceStorageZoneMap(Map<Object,Object> instanceStorageZoneMap) {
		this.instanceStorageZoneMap = instanceStorageZoneMap;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<Map<Object,Object>> getCapacityByDiskCategory() {
		return this.capacityByDiskCategory;
	}

	public void setCapacityByDiskCategory(List<Map<Object,Object>> capacityByDiskCategory) {
		this.capacityByDiskCategory = capacityByDiskCategory;
	}

	public List<Map<Object,Object>> getUsageByDiskCategory() {
		return this.usageByDiskCategory;
	}

	public void setUsageByDiskCategory(List<Map<Object,Object>> usageByDiskCategory) {
		this.usageByDiskCategory = usageByDiskCategory;
	}

	@Override
	public GetLindormV2StorageUsageResponse getInstance(UnmarshallerContext context) {
		return	GetLindormV2StorageUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
