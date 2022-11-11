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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeSyncEcsHostTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncEcsHostTaskResponse extends AcsResponse {

	private String status;

	private String zoneId;

	private String requestId;

	private Boolean success;

	private List<EcsRegion> ecsRegions;

	private List<String> regions;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EcsRegion> getEcsRegions() {
		return this.ecsRegions;
	}

	public void setEcsRegions(List<EcsRegion> ecsRegions) {
		this.ecsRegions = ecsRegions;
	}

	public List<String> getRegions() {
		return this.regions;
	}

	public void setRegions(List<String> regions) {
		this.regions = regions;
	}

	public static class EcsRegion {

		private Long userId;

		private List<String> regionIds;

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public List<String> getRegionIds() {
			return this.regionIds;
		}

		public void setRegionIds(List<String> regionIds) {
			this.regionIds = regionIds;
		}
	}

	@Override
	public DescribeSyncEcsHostTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeSyncEcsHostTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
