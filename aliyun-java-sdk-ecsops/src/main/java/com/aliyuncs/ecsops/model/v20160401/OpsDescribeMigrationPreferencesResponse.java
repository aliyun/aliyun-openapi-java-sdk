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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeMigrationPreferencesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeMigrationPreferencesResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String migrationNetworkType;

	private Long aliUid;

	private List<String> targetZoneIdSet;

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

	public String getMigrationNetworkType() {
		return this.migrationNetworkType;
	}

	public void setMigrationNetworkType(String migrationNetworkType) {
		this.migrationNetworkType = migrationNetworkType;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public List<String> getTargetZoneIdSet() {
		return this.targetZoneIdSet;
	}

	public void setTargetZoneIdSet(List<String> targetZoneIdSet) {
		this.targetZoneIdSet = targetZoneIdSet;
	}

	@Override
	public OpsDescribeMigrationPreferencesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeMigrationPreferencesResponseUnmarshaller.unmarshall(this, context);
	}
}
