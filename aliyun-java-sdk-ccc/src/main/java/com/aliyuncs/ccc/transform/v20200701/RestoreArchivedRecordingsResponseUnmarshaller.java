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

import com.aliyuncs.ccc.model.v20200701.RestoreArchivedRecordingsResponse;
import com.aliyuncs.ccc.model.v20200701.RestoreArchivedRecordingsResponse.RecordingRestoreDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestoreArchivedRecordingsResponseUnmarshaller {

	public static RestoreArchivedRecordingsResponse unmarshall(RestoreArchivedRecordingsResponse restoreArchivedRecordingsResponse, UnmarshallerContext _ctx) {
		
		restoreArchivedRecordingsResponse.setRequestId(_ctx.stringValue("RestoreArchivedRecordingsResponse.RequestId"));
		restoreArchivedRecordingsResponse.setCode(_ctx.stringValue("RestoreArchivedRecordingsResponse.Code"));
		restoreArchivedRecordingsResponse.setHttpStatusCode(_ctx.integerValue("RestoreArchivedRecordingsResponse.HttpStatusCode"));
		restoreArchivedRecordingsResponse.setMessage(_ctx.stringValue("RestoreArchivedRecordingsResponse.Message"));

		List<RecordingRestoreDetail> data = new ArrayList<RecordingRestoreDetail>();
		for (int i = 0; i < _ctx.lengthValue("RestoreArchivedRecordingsResponse.Data.Length"); i++) {
			RecordingRestoreDetail recordingRestoreDetail = new RecordingRestoreDetail();
			recordingRestoreDetail.setExists(_ctx.stringValue("RestoreArchivedRecordingsResponse.Data["+ i +"].Exists"));
			recordingRestoreDetail.setContactId(_ctx.stringValue("RestoreArchivedRecordingsResponse.Data["+ i +"].ContactId"));
			recordingRestoreDetail.setStatus(_ctx.stringValue("RestoreArchivedRecordingsResponse.Data["+ i +"].Status"));
			recordingRestoreDetail.setStorageType(_ctx.stringValue("RestoreArchivedRecordingsResponse.Data["+ i +"].StorageType"));

			data.add(recordingRestoreDetail);
		}
		restoreArchivedRecordingsResponse.setData(data);
	 
	 	return restoreArchivedRecordingsResponse;
	}
}