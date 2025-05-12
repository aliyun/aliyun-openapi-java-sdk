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

import com.aliyuncs.live.model.v20161101.DescribeRtcCloudRecordingFilesResponse;
import com.aliyuncs.live.model.v20161101.DescribeRtcCloudRecordingFilesResponse.TaskInfo;
import com.aliyuncs.live.model.v20161101.DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcCloudRecordingFilesResponseUnmarshaller {

	public static DescribeRtcCloudRecordingFilesResponse unmarshall(DescribeRtcCloudRecordingFilesResponse describeRtcCloudRecordingFilesResponse, UnmarshallerContext _ctx) {
		
		describeRtcCloudRecordingFilesResponse.setRequestId(_ctx.stringValue("DescribeRtcCloudRecordingFilesResponse.RequestId"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setTaskId(_ctx.stringValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.TaskId"));
		taskInfo.setStatus(_ctx.stringValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.Status"));

		RecordFileList recordFileList = new RecordFileList();

		List<String> mp3FileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList.Mp3FileList.Length"); i++) {
			mp3FileList.add(_ctx.stringValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList.Mp3FileList["+ i +"]"));
		}
		recordFileList.setMp3FileList(mp3FileList);

		List<String> mp4FileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList.Mp4FileList.Length"); i++) {
			mp4FileList.add(_ctx.stringValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList.Mp4FileList["+ i +"]"));
		}
		recordFileList.setMp4FileList(mp4FileList);

		List<String> hlsFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList.HlsFileList.Length"); i++) {
			hlsFileList.add(_ctx.stringValue("DescribeRtcCloudRecordingFilesResponse.TaskInfo.RecordFileList.HlsFileList["+ i +"]"));
		}
		recordFileList.setHlsFileList(hlsFileList);
		taskInfo.setRecordFileList(recordFileList);
		describeRtcCloudRecordingFilesResponse.setTaskInfo(taskInfo);
	 
	 	return describeRtcCloudRecordingFilesResponse;
	}
}