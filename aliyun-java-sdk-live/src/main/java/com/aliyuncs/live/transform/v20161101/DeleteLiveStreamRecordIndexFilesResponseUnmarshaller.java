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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DeleteLiveStreamRecordIndexFilesResponse;
import com.aliyuncs.live.model.v20161101.DeleteLiveStreamRecordIndexFilesResponse.RecordDeleteInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLiveStreamRecordIndexFilesResponseUnmarshaller {

	public static DeleteLiveStreamRecordIndexFilesResponse unmarshall(DeleteLiveStreamRecordIndexFilesResponse deleteLiveStreamRecordIndexFilesResponse, UnmarshallerContext _ctx) {
		
		deleteLiveStreamRecordIndexFilesResponse.setRequestId(_ctx.stringValue("DeleteLiveStreamRecordIndexFilesResponse.RequestId"));
		deleteLiveStreamRecordIndexFilesResponse.setMessage(_ctx.stringValue("DeleteLiveStreamRecordIndexFilesResponse.Message"));
		deleteLiveStreamRecordIndexFilesResponse.setCode(_ctx.stringValue("DeleteLiveStreamRecordIndexFilesResponse.Code"));

		List<RecordDeleteInfo> recordDeleteInfoList = new ArrayList<RecordDeleteInfo>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLiveStreamRecordIndexFilesResponse.RecordDeleteInfoList.Length"); i++) {
			RecordDeleteInfo recordDeleteInfo = new RecordDeleteInfo();
			recordDeleteInfo.setRecordId(_ctx.stringValue("DeleteLiveStreamRecordIndexFilesResponse.RecordDeleteInfoList["+ i +"].RecordId"));
			recordDeleteInfo.setMessage(_ctx.stringValue("DeleteLiveStreamRecordIndexFilesResponse.RecordDeleteInfoList["+ i +"].Message"));

			recordDeleteInfoList.add(recordDeleteInfo);
		}
		deleteLiveStreamRecordIndexFilesResponse.setRecordDeleteInfoList(recordDeleteInfoList);
	 
	 	return deleteLiveStreamRecordIndexFilesResponse;
	}
}