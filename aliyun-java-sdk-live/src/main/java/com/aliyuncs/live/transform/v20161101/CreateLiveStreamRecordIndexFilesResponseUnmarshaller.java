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

import com.aliyuncs.live.model.v20161101.CreateLiveStreamRecordIndexFilesResponse;
import com.aliyuncs.live.model.v20161101.CreateLiveStreamRecordIndexFilesResponse.RecordInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLiveStreamRecordIndexFilesResponseUnmarshaller {

	public static CreateLiveStreamRecordIndexFilesResponse unmarshall(CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFilesResponse, UnmarshallerContext _ctx) {
		
		createLiveStreamRecordIndexFilesResponse.setRequestId(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RequestId"));

		RecordInfo recordInfo = new RecordInfo();
		recordInfo.setRecordUrl(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.RecordUrl"));
		recordInfo.setStreamName(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.StreamName"));
		recordInfo.setCreateTime(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.CreateTime"));
		recordInfo.setRecordId(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.RecordId"));
		recordInfo.setHeight(_ctx.integerValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Height"));
		recordInfo.setOssBucket(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.OssBucket"));
		recordInfo.setDomainName(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.DomainName"));
		recordInfo.setOssObject(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.OssObject"));
		recordInfo.setEndTime(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.EndTime"));
		recordInfo.setAppName(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.AppName"));
		recordInfo.setStartTime(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.StartTime"));
		recordInfo.setWidth(_ctx.integerValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Width"));
		recordInfo.setDuration(_ctx.floatValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Duration"));
		recordInfo.setOssEndpoint(_ctx.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.OssEndpoint"));
		createLiveStreamRecordIndexFilesResponse.setRecordInfo(recordInfo);
	 
	 	return createLiveStreamRecordIndexFilesResponse;
	}
}