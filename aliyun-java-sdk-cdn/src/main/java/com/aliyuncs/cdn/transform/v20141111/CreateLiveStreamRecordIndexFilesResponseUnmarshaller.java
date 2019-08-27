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

package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.CreateLiveStreamRecordIndexFilesResponse;
import com.aliyuncs.cdn.model.v20141111.CreateLiveStreamRecordIndexFilesResponse.RecordInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLiveStreamRecordIndexFilesResponseUnmarshaller {

	public static CreateLiveStreamRecordIndexFilesResponse unmarshall(CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFilesResponse, UnmarshallerContext _ctx) {
		
		createLiveStreamRecordIndexFilesResponse.setRequestId(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RequestId"));

		RecordInfo recordInfo = new RecordInfo();
		recordInfo.setRecordId(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.RecordId"));
		recordInfo.setRecordUrl(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.RecordUrl"));
		recordInfo.setDuration(_ctx.floatValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Duration"));
		recordInfo.setHeight(_ctx.integerValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Height"));
		recordInfo.setWidth(_ctx.integerValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Width"));
		recordInfo.setCreateTime(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.CreateTime"));
		createLiveStreamRecordIndexFilesResponse.setRecordInfo(recordInfo);
	 
	 	return createLiveStreamRecordIndexFilesResponse;
	}
}