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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeMigrationPreferencesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationPreferencesResponseUnmarshaller {

	public static DescribeMigrationPreferencesResponse unmarshall(DescribeMigrationPreferencesResponse describeMigrationPreferencesResponse, UnmarshallerContext _ctx) {
		
		describeMigrationPreferencesResponse.setRequestId(_ctx.stringValue("DescribeMigrationPreferencesResponse.RequestId"));
		describeMigrationPreferencesResponse.setMigrationNetworkType(_ctx.stringValue("DescribeMigrationPreferencesResponse.MigrationNetworkType"));
		describeMigrationPreferencesResponse.setRegionId(_ctx.stringValue("DescribeMigrationPreferencesResponse.RegionId"));

		List<String> targetZoneIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationPreferencesResponse.TargetZoneIdSet.Length"); i++) {
			targetZoneIdSet.add(_ctx.stringValue("DescribeMigrationPreferencesResponse.TargetZoneIdSet["+ i +"]"));
		}
		describeMigrationPreferencesResponse.setTargetZoneIdSet(targetZoneIdSet);
	 
	 	return describeMigrationPreferencesResponse;
	}
}