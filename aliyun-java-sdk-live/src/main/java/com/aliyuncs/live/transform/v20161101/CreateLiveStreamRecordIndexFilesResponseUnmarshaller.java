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

	public static CreateLiveStreamRecordIndexFilesResponse unmarshall(CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFilesResponse, UnmarshallerContext context) {
		
		createLiveStreamRecordIndexFilesResponse.setRequestId(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RequestId"));

		RecordInfo recordInfo = new RecordInfo();
		recordInfo.setRecordId(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.RecordId"));
		recordInfo.setRecordUrl(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.RecordUrl"));
		recordInfo.setDomainName(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.DomainName"));
		recordInfo.setAppName(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.AppName"));
		recordInfo.setStreamName(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.StreamName"));
		recordInfo.setOssBucket(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.OssBucket"));
		recordInfo.setOssEndpoint(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.OssEndpoint"));
		recordInfo.setOssObject(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.OssObject"));
		recordInfo.setStartTime(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.StartTime"));
		recordInfo.setEndTime(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.EndTime"));
		recordInfo.setDuration(context.floatValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Duration"));
		recordInfo.setHeight(context.integerValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Height"));
		recordInfo.setWidth(context.integerValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.Width"));
		recordInfo.setCreateTime(context.stringValue("CreateLiveStreamRecordIndexFilesResponse.RecordInfo.CreateTime"));
		createLiveStreamRecordIndexFilesResponse.setRecordInfo(recordInfo);
	 
	 	return createLiveStreamRecordIndexFilesResponse;
	}
}