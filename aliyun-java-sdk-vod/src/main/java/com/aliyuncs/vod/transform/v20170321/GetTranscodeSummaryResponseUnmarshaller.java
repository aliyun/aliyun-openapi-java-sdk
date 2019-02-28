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

import com.aliyuncs.vod.model.v20170321.GetTranscodeSummaryResponse;
import com.aliyuncs.vod.model.v20170321.GetTranscodeSummaryResponse.TranscodeSummary;
import com.aliyuncs.vod.model.v20170321.GetTranscodeSummaryResponse.TranscodeSummary.TranscodeJobInfoSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTranscodeSummaryResponseUnmarshaller {

	public static GetTranscodeSummaryResponse unmarshall(GetTranscodeSummaryResponse getTranscodeSummaryResponse, UnmarshallerContext context) {
		
		getTranscodeSummaryResponse.setRequestId(context.stringValue("GetTranscodeSummaryResponse.RequestId"));

		List<String> nonExistVideoIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetTranscodeSummaryResponse.NonExistVideoIds.Length"); i++) {
			nonExistVideoIds.add(context.stringValue("GetTranscodeSummaryResponse.NonExistVideoIds["+ i +"]"));
		}
		getTranscodeSummaryResponse.setNonExistVideoIds(nonExistVideoIds);

		List<TranscodeSummary> transcodeSummaryList = new ArrayList<TranscodeSummary>();
		for (int i = 0; i < context.lengthValue("GetTranscodeSummaryResponse.TranscodeSummaryList.Length"); i++) {
			TranscodeSummary transcodeSummary = new TranscodeSummary();
			transcodeSummary.setVideoId(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].VideoId"));
			transcodeSummary.setTranscodeStatus(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeStatus"));
			transcodeSummary.setCreationTime(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].CreationTime"));
			transcodeSummary.setCompleteTime(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].CompleteTime"));
			transcodeSummary.setTrigger(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].Trigger"));
			transcodeSummary.setTranscodeTemplateGroupId(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeTemplateGroupId"));

			List<TranscodeJobInfoSummary> transcodeJobInfoSummaryList = new ArrayList<TranscodeJobInfoSummary>();
			for (int j = 0; j < context.lengthValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList.Length"); j++) {
				TranscodeJobInfoSummary transcodeJobInfoSummary = new TranscodeJobInfoSummary();
				transcodeJobInfoSummary.setTranscodeTemplateId(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].TranscodeTemplateId"));
				transcodeJobInfoSummary.setTranscodeJobStatus(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].TranscodeJobStatus"));
				transcodeJobInfoSummary.setCreationTime(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].CreationTime"));
				transcodeJobInfoSummary.setCompleteTime(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].CompleteTime"));
				transcodeJobInfoSummary.setTranscodeProgress(context.longValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].TranscodeProgress"));
				transcodeJobInfoSummary.setErrorCode(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].ErrorCode"));
				transcodeJobInfoSummary.setErrorMessage(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].ErrorMessage"));
				transcodeJobInfoSummary.setDefinition(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Definition"));
				transcodeJobInfoSummary.setEncryption(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Encryption"));
				transcodeJobInfoSummary.setWidth(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Width"));
				transcodeJobInfoSummary.setHeight(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Height"));
				transcodeJobInfoSummary.setBitrate(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Bitrate"));
				transcodeJobInfoSummary.setFps(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Fps"));
				transcodeJobInfoSummary.setFormat(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Format"));
				transcodeJobInfoSummary.setDuration(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Duration"));
				transcodeJobInfoSummary.setFilesize(context.longValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].Filesize"));

				List<String> watermarkIdList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].WatermarkIdList.Length"); k++) {
					watermarkIdList.add(context.stringValue("GetTranscodeSummaryResponse.TranscodeSummaryList["+ i +"].TranscodeJobInfoSummaryList["+ j +"].WatermarkIdList["+ k +"]"));
				}
				transcodeJobInfoSummary.setWatermarkIdList(watermarkIdList);

				transcodeJobInfoSummaryList.add(transcodeJobInfoSummary);
			}
			transcodeSummary.setTranscodeJobInfoSummaryList(transcodeJobInfoSummaryList);

			transcodeSummaryList.add(transcodeSummary);
		}
		getTranscodeSummaryResponse.setTranscodeSummaryList(transcodeSummaryList);
	 
	 	return getTranscodeSummaryResponse;
	}
}