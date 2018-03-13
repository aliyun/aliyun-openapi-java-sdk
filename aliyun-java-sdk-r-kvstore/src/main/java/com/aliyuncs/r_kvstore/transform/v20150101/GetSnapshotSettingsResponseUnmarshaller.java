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
package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.GetSnapshotSettingsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSnapshotSettingsResponseUnmarshaller {

	public static GetSnapshotSettingsResponse unmarshall(GetSnapshotSettingsResponse getSnapshotSettingsResponse, UnmarshallerContext context) {
		
		getSnapshotSettingsResponse.setRequestId(context.stringValue("GetSnapshotSettingsResponse.RequestId"));
		getSnapshotSettingsResponse.setInstanceId(context.stringValue("GetSnapshotSettingsResponse.InstanceId"));
		getSnapshotSettingsResponse.setBeginHour(context.integerValue("GetSnapshotSettingsResponse.BeginHour"));
		getSnapshotSettingsResponse.setEndHour(context.integerValue("GetSnapshotSettingsResponse.EndHour"));
		getSnapshotSettingsResponse.setRetentionDay(context.integerValue("GetSnapshotSettingsResponse.RetentionDay"));
		getSnapshotSettingsResponse.setMaxAutoSnapshots(context.integerValue("GetSnapshotSettingsResponse.MaxAutoSnapshots"));
		getSnapshotSettingsResponse.setMaxManualSnapshots(context.integerValue("GetSnapshotSettingsResponse.MaxManualSnapshots"));
		getSnapshotSettingsResponse.setDayList(context.integerValue("GetSnapshotSettingsResponse.DayList"));
		getSnapshotSettingsResponse.setNextTime(context.stringValue("GetSnapshotSettingsResponse.NextTime"));
	 
	 	return getSnapshotSettingsResponse;
	}
}