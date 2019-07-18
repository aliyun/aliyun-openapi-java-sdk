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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeTask;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfo;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfo.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTranscodeTaskResponseUnmarshaller {

	public static GetTranscodeTaskResponse unmarshall(GetTranscodeTaskResponse getTranscodeTaskResponse, UnmarshallerContext _ctx) {
		
		getTranscodeTaskResponse.setRequestId(_ctx.stringValue("GetTranscodeTaskResponse.RequestId"));

		TranscodeTask transcodeTask = new TranscodeTask();
		transcodeTask.setTranscodeTaskId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeTaskId"));
		transcodeTask.setVideoId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.VideoId"));
		transcodeTask.setTaskStatus(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TaskStatus"));
		transcodeTask.setCreationTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.CreationTime"));
		transcodeTask.setCompleteTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.CompleteTime"));
		transcodeTask.setTrigger(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.Trigger"));
		transcodeTask.setTranscodeTemplateGroupId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeTemplateGroupId"));

		List<TranscodeJobInfo> transcodeJobInfoList = new ArrayList<TranscodeJobInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList.Length"); i++) {
			TranscodeJobInfo transcodeJobInfo = new TranscodeJobInfo();
			transcodeJobInfo.setTranscodeJobId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeJobId"));
			transcodeJobInfo.setTranscodeTemplateId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeTemplateId"));
			transcodeJobInfo.setTranscodeJobStatus(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeJobStatus"));
			transcodeJobInfo.setCreationTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].CreationTime"));
			transcodeJobInfo.setCompleteTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].CompleteTime"));
			transcodeJobInfo.setTranscodeProgress(_ctx.longValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeProgress"));
			transcodeJobInfo.setInputFileUrl(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].InputFileUrl"));
			transcodeJobInfo.setPriority(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].Priority"));
			transcodeJobInfo.setErrorCode(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].ErrorCode"));
			transcodeJobInfo.setErrorMessage(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].ErrorMessage"));
			transcodeJobInfo.setDefinition(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].Definition"));

			OutputFile outputFile = new OutputFile();
			outputFile.setWidth(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Width"));
			outputFile.setHeight(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Height"));
			outputFile.setBitrate(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Bitrate"));
			outputFile.setFps(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Fps"));
			outputFile.setFormat(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Format"));
			outputFile.setDuration(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Duration"));
			outputFile.setFilesize(_ctx.longValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Filesize"));
			outputFile.setEncryption(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Encryption"));
			outputFile.setAudioStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.AudioStreamList"));
			outputFile.setVideoStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.VideoStreamList"));
			outputFile.setSubtitleStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.SubtitleStreamList"));
			outputFile.setOutputFileUrl(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.OutputFileUrl"));

			List<String> watermarkIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList.Length"); j++) {
				watermarkIdList.add(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList["+ j +"]"));
			}
			outputFile.setWatermarkIdList(watermarkIdList);
			transcodeJobInfo.setOutputFile(outputFile);

			transcodeJobInfoList.add(transcodeJobInfo);
		}
		transcodeTask.setTranscodeJobInfoList(transcodeJobInfoList);
		getTranscodeTaskResponse.setTranscodeTask(transcodeTask);
	 
	 	return getTranscodeTaskResponse;
	}
}