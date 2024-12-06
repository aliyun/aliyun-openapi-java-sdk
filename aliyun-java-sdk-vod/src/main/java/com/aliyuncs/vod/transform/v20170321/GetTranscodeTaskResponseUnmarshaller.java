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
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeJobInfo;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeJobInfo.OutputFile;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeTask;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfo2;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfo2.OutputFile3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTranscodeTaskResponseUnmarshaller {

	public static GetTranscodeTaskResponse unmarshall(GetTranscodeTaskResponse getTranscodeTaskResponse, UnmarshallerContext _ctx) {
		
		getTranscodeTaskResponse.setRequestId(_ctx.stringValue("GetTranscodeTaskResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTranscodeTaskResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("GetTranscodeTaskResponse.NonExistJobIds["+ i +"]"));
		}
		getTranscodeTaskResponse.setNonExistJobIds(nonExistJobIds);

		TranscodeTask transcodeTask = new TranscodeTask();
		transcodeTask.setCreationTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.CreationTime"));
		transcodeTask.setTrigger(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.Trigger"));
		transcodeTask.setTaskStatus(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TaskStatus"));
		transcodeTask.setVideoId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.VideoId"));
		transcodeTask.setCompleteTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.CompleteTime"));
		transcodeTask.setTranscodeTemplateGroupId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeTemplateGroupId"));
		transcodeTask.setTranscodeTaskId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeTaskId"));

		List<TranscodeJobInfo2> transcodeJobInfoList1 = new ArrayList<TranscodeJobInfo2>();
		for (int i = 0; i < _ctx.lengthValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList.Length"); i++) {
			TranscodeJobInfo2 transcodeJobInfo2 = new TranscodeJobInfo2();
			transcodeJobInfo2.setDefinition(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].Definition"));
			transcodeJobInfo2.setCreationTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].CreationTime"));
			transcodeJobInfo2.setInputFileUrl(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].InputFileUrl"));
			transcodeJobInfo2.setErrorMessage(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].ErrorMessage"));
			transcodeJobInfo2.setErrorCode(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].ErrorCode"));
			transcodeJobInfo2.setCompleteTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].CompleteTime"));
			transcodeJobInfo2.setTranscodeProgress(_ctx.longValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeProgress"));
			transcodeJobInfo2.setPriority(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].Priority"));
			transcodeJobInfo2.setTranscodeJobStatus(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeJobStatus"));
			transcodeJobInfo2.setTranscodeTemplateId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeTemplateId"));
			transcodeJobInfo2.setTranscodeJobId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].TranscodeJobId"));

			OutputFile3 outputFile3 = new OutputFile3();
			outputFile3.setVideoStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.VideoStreamList"));
			outputFile3.setOutputFileUrl(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.OutputFileUrl"));
			outputFile3.setEncryption(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Encryption"));
			outputFile3.setHeight(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Height"));
			outputFile3.setSubtitleStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.SubtitleStreamList"));
			outputFile3.setBitrate(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Bitrate"));
			outputFile3.setAudioStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.AudioStreamList"));
			outputFile3.setWidth(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Width"));
			outputFile3.setFps(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Fps"));
			outputFile3.setDuration(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Duration"));
			outputFile3.setFormat(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Format"));
			outputFile3.setFilesize(_ctx.longValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.Filesize"));

			List<String> watermarkIdList4 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList.Length"); j++) {
				watermarkIdList4.add(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeTask.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList["+ j +"]"));
			}
			outputFile3.setWatermarkIdList4(watermarkIdList4);
			transcodeJobInfo2.setOutputFile3(outputFile3);

			transcodeJobInfoList1.add(transcodeJobInfo2);
		}
		transcodeTask.setTranscodeJobInfoList1(transcodeJobInfoList1);
		getTranscodeTaskResponse.setTranscodeTask(transcodeTask);

		List<TranscodeJobInfo> transcodeJobInfoList = new ArrayList<TranscodeJobInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTranscodeTaskResponse.TranscodeJobInfoList.Length"); i++) {
			TranscodeJobInfo transcodeJobInfo = new TranscodeJobInfo();
			transcodeJobInfo.setDefinition(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].Definition"));
			transcodeJobInfo.setCreationTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].CreationTime"));
			transcodeJobInfo.setInputFileUrl(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].InputFileUrl"));
			transcodeJobInfo.setErrorMessage(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].ErrorMessage"));
			transcodeJobInfo.setErrorCode(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].ErrorCode"));
			transcodeJobInfo.setCompleteTime(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].CompleteTime"));
			transcodeJobInfo.setTranscodeProgress(_ctx.longValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].TranscodeProgress"));
			transcodeJobInfo.setPriority(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].Priority"));
			transcodeJobInfo.setTranscodeJobStatus(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].TranscodeJobStatus"));
			transcodeJobInfo.setTranscodeTemplateId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].TranscodeTemplateId"));
			transcodeJobInfo.setTranscodeJobId(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].TranscodeJobId"));

			OutputFile outputFile = new OutputFile();
			outputFile.setVideoStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.VideoStreamList"));
			outputFile.setOutputFileUrl(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.OutputFileUrl"));
			outputFile.setEncryption(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Encryption"));
			outputFile.setHeight(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Height"));
			outputFile.setSubtitleStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.SubtitleStreamList"));
			outputFile.setBitrate(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Bitrate"));
			outputFile.setAudioStreamList(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.AudioStreamList"));
			outputFile.setWidth(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Width"));
			outputFile.setFps(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Fps"));
			outputFile.setDuration(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Duration"));
			outputFile.setFormat(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Format"));
			outputFile.setFilesize(_ctx.longValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.Filesize"));

			List<String> watermarkIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList.Length"); j++) {
				watermarkIdList.add(_ctx.stringValue("GetTranscodeTaskResponse.TranscodeJobInfoList["+ i +"].OutputFile.WatermarkIdList["+ j +"]"));
			}
			outputFile.setWatermarkIdList(watermarkIdList);
			transcodeJobInfo.setOutputFile(outputFile);

			transcodeJobInfoList.add(transcodeJobInfo);
		}
		getTranscodeTaskResponse.setTranscodeJobInfoList(transcodeJobInfoList);
	 
	 	return getTranscodeTaskResponse;
	}
}