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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListRecordingStorageSettingsResponse;
import com.aliyuncs.ccc.model.v20200701.ListRecordingStorageSettingsResponse.RecordingStorageSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingStorageSettingsResponseUnmarshaller {

	public static ListRecordingStorageSettingsResponse unmarshall(ListRecordingStorageSettingsResponse listRecordingStorageSettingsResponse, UnmarshallerContext _ctx) {
		
		listRecordingStorageSettingsResponse.setRequestId(_ctx.stringValue("ListRecordingStorageSettingsResponse.RequestId"));
		listRecordingStorageSettingsResponse.setCode(_ctx.stringValue("ListRecordingStorageSettingsResponse.Code"));
		listRecordingStorageSettingsResponse.setHttpStatusCode(_ctx.integerValue("ListRecordingStorageSettingsResponse.HttpStatusCode"));
		listRecordingStorageSettingsResponse.setMessage(_ctx.stringValue("ListRecordingStorageSettingsResponse.Message"));

		List<RecordingStorageSetting> data = new ArrayList<RecordingStorageSetting>();
		for (int i = 0; i < _ctx.lengthValue("ListRecordingStorageSettingsResponse.Data.Length"); i++) {
			RecordingStorageSetting recordingStorageSetting = new RecordingStorageSetting();
			recordingStorageSetting.setInstanceId(_ctx.stringValue("ListRecordingStorageSettingsResponse.Data["+ i +"].InstanceId"));
			recordingStorageSetting.setInstanceName(_ctx.stringValue("ListRecordingStorageSettingsResponse.Data["+ i +"].InstanceName"));
			recordingStorageSetting.setMaxStorageSize(_ctx.integerValue("ListRecordingStorageSettingsResponse.Data["+ i +"].MaxStorageSize"));
			recordingStorageSetting.setMaxStorageTtl(_ctx.integerValue("ListRecordingStorageSettingsResponse.Data["+ i +"].MaxStorageTtl"));
			recordingStorageSetting.setCustomOssBucket(_ctx.stringValue("ListRecordingStorageSettingsResponse.Data["+ i +"].CustomOssBucket"));
			recordingStorageSetting.setMkvRecordEnabled(_ctx.booleanValue("ListRecordingStorageSettingsResponse.Data["+ i +"].MkvRecordEnabled"));
			recordingStorageSetting.setMixedRecordFormat(_ctx.stringValue("ListRecordingStorageSettingsResponse.Data["+ i +"].MixedRecordFormat"));

			data.add(recordingStorageSetting);
		}
		listRecordingStorageSettingsResponse.setData(data);
	 
	 	return listRecordingStorageSettingsResponse;
	}
}