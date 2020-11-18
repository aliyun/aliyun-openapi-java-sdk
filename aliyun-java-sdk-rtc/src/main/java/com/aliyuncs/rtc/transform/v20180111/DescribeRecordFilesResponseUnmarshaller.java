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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRecordFilesResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordFilesResponse.RecordFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordFilesResponseUnmarshaller {

	public static DescribeRecordFilesResponse unmarshall(DescribeRecordFilesResponse describeRecordFilesResponse, UnmarshallerContext _ctx) {
		
		describeRecordFilesResponse.setRequestId(_ctx.stringValue("DescribeRecordFilesResponse.RequestId"));
		describeRecordFilesResponse.setTotalNum(_ctx.longValue("DescribeRecordFilesResponse.TotalNum"));
		describeRecordFilesResponse.setTotalPage(_ctx.longValue("DescribeRecordFilesResponse.TotalPage"));

		List<RecordFile> recordFiles = new ArrayList<RecordFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordFilesResponse.RecordFiles.Length"); i++) {
			RecordFile recordFile = new RecordFile();
			recordFile.setCreateTime(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].CreateTime"));
			recordFile.setAppId(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].AppId"));
			recordFile.setChannelId(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].ChannelId"));
			recordFile.setTaskId(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].TaskId"));
			recordFile.setStartTime(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].StartTime"));
			recordFile.setStopTime(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].StopTime"));
			recordFile.setUrl(_ctx.stringValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].Url"));
			recordFile.setDuration(_ctx.floatValue("DescribeRecordFilesResponse.RecordFiles["+ i +"].Duration"));

			recordFiles.add(recordFile);
		}
		describeRecordFilesResponse.setRecordFiles(recordFiles);
	 
	 	return describeRecordFilesResponse;
	}
}