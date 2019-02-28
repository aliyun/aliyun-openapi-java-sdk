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

	public static GetTranscodeTaskResponse unmarshall(GetTranscodeTaskResponse getTranscodeTaskResponse, UnmarshallerContext context) {
		
		getTranscodeTaskResponse.setRequestId(context.stringValue("GetTranscodeTaskResponse.RequestId"));

		TranscodeTask transcodeTask = new TranscodeTask();
		transcodeTask.setTranscodeTaskId(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeTaskId"));
		transcodeTask.setVideoId(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.VideoId"));
		transcodeTask.setTaskStatus(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TaskStatus"));
		transcodeTask.setCreationTime(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.CreationTime"));
		transcodeTask.setCompleteTime(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.CompleteTime"));
		transcodeTask.setTrigger(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.Trigger"));
		transcodeTask.setTranscodeTemplateGroupId(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeTemplateGroupId"));

		List<TranscodeJobInfo> transcodeJobInfoList = new ArrayList<TranscodeJobInfo>();
		for (int i = 0; i < context.lengthValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList.Length"); i++) {
			TranscodeJobInfo transcodeJobInfo = new TranscodeJobInfo();
			transcodeJobInfo.setTranscodeJobId(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeJobId"));
			transcodeJobInfo.setTranscodeTemplateId(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeTemplateId"));
			transcodeJobInfo.setTranscodeJobStatus(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeJobStatus"));
			transcodeJobInfo.setCreationTime(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].CreationTime"));
			transcodeJobInfo.setCompleteTime(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].CompleteTime"));
			transcodeJobInfo.setTranscodeProgress(context.longValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeProgress"));
			transcodeJobInfo.setInputFileUrl(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].InputFileUrl"));
			transcodeJobInfo.setPriority(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].Priority"));
			transcodeJobInfo.setErrorCode(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].ErrorCode"));
			transcodeJobInfo.setErrorMessage(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].ErrorMessage"));
			transcodeJobInfo.setDefinition(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].Definition"));

			OutputFile outputFile = new OutputFile();
			outputFile.setWidth(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Width"));
			outputFile.setHeight(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Height"));
			outputFile.setBitrate(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Bitrate"));
			outputFile.setFps(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Fps"));
			outputFile.setFormat(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Format"));
			outputFile.setDuration(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Duration"));
			outputFile.setFilesize(context.longValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Filesize"));
			outputFile.setEncryption(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Encryption"));
			outputFile.setAudioStreamList(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.AudioStreamList"));
			outputFile.setVideoStreamList(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.VideoStreamList"));
			outputFile.setSubtitleStreamList(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.SubtitleStreamList"));
			outputFile.setOutputFileUrl(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.OutputFileUrl"));

			List<String> watermarkIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList.Length"); j++) {
				watermarkIdList.add(context.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList["+ j +"]"));
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