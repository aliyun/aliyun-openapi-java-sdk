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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeMigrationPreferencesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationPreferencesResponse extends AcsResponse {

	private String migrationNetworkType;

	private String requestId;

	private String regionId;

	private List<String> targetZoneIdSet;

	public String getMigrationNetworkType() {
		return this.migrationNetworkType;
	}

	public void setMigrationNetworkType(String migrationNetworkType) {
		this.migrationNetworkType = migrationNetworkType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<String> getTargetZoneIdSet() {
		return this.targetZoneIdSet;
	}

	public void setTargetZoneIdSet(List<String> targetZoneIdSet) {
		this.targetZoneIdSet = targetZoneIdSet;
	}

	@Override
	public DescribeMigrationPreferencesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationPreferencesResponseUnmarshaller.unmarshall(this, context);
	}
}
