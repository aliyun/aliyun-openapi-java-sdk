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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMigrationPreferencesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeMigrationPreferencesResponseUnmarshaller {

	public static OpsDescribeMigrationPreferencesResponse unmarshall(OpsDescribeMigrationPreferencesResponse opsDescribeMigrationPreferencesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeMigrationPreferencesResponse.setRequestId(_ctx.stringValue("OpsDescribeMigrationPreferencesResponse.RequestId"));
		opsDescribeMigrationPreferencesResponse.setRegionId(_ctx.stringValue("OpsDescribeMigrationPreferencesResponse.RegionId"));
		opsDescribeMigrationPreferencesResponse.setMigrationNetworkType(_ctx.stringValue("OpsDescribeMigrationPreferencesResponse.MigrationNetworkType"));
		opsDescribeMigrationPreferencesResponse.setAliUid(_ctx.longValue("OpsDescribeMigrationPreferencesResponse.AliUid"));

		List<String> targetZoneIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeMigrationPreferencesResponse.TargetZoneIdSet.Length"); i++) {
			targetZoneIdSet.add(_ctx.stringValue("OpsDescribeMigrationPreferencesResponse.TargetZoneIdSet["+ i +"]"));
		}
		opsDescribeMigrationPreferencesResponse.setTargetZoneIdSet(targetZoneIdSet);
	 
	 	return opsDescribeMigrationPreferencesResponse;
	}
}