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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.BarrageCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.CoverImageCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.CoverImageCensorResult.Result;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.DescCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.TitleCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult.CensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult.VideoTimeline;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult.VideoTimeline.CensorResult2;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VideoCensorConfig;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VideoCensorConfig.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaCensorJobListResponseUnmarshaller {

	public static QueryMediaCensorJobListResponse unmarshall(QueryMediaCensorJobListResponse queryMediaCensorJobListResponse, UnmarshallerContext context) {
		
		queryMediaCensorJobListResponse.setRequestId(context.stringValue("QueryMediaCensorJobListResponse.RequestId"));
		queryMediaCensorJobListResponse.setNextPageToken(context.stringValue("QueryMediaCensorJobListResponse.NextPageToken"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaCensorJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryMediaCensorJobListResponse.NonExistIds["+ i +"]"));
		}
		queryMediaCensorJobListResponse.setNonExistIds(nonExistIds);

		List<MediaCensorJob> mediaCensorJobList = new ArrayList<MediaCensorJob>();
		for (int i = 0; i < context.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList.Length"); i++) {
			MediaCensorJob mediaCensorJob = new MediaCensorJob();
			mediaCensorJob.setJobId(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].JobId"));
			mediaCensorJob.setUserData(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].UserData"));
			mediaCensorJob.setPipelineId(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].PipelineId"));
			mediaCensorJob.setState(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].State"));
			mediaCensorJob.setCode(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Code"));
			mediaCensorJob.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Suggestion"));
			mediaCensorJob.setMessage(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Message"));
			mediaCensorJob.setCreationTime(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CreationTime"));
			mediaCensorJob.setFinishTime(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].FinishTime"));

			TitleCensorResult titleCensorResult = new TitleCensorResult();
			titleCensorResult.setRate(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Rate"));
			titleCensorResult.setScene(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Scene"));
			titleCensorResult.setLabel(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Label"));
			titleCensorResult.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Suggestion"));
			mediaCensorJob.setTitleCensorResult(titleCensorResult);

			DescCensorResult descCensorResult = new DescCensorResult();
			descCensorResult.setRate(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Rate"));
			descCensorResult.setScene(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Scene"));
			descCensorResult.setLabel(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Label"));
			descCensorResult.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Suggestion"));
			mediaCensorJob.setDescCensorResult(descCensorResult);

			BarrageCensorResult barrageCensorResult = new BarrageCensorResult();
			barrageCensorResult.setRate(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Rate"));
			barrageCensorResult.setScene(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Scene"));
			barrageCensorResult.setLabel(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Label"));
			barrageCensorResult.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Suggestion"));
			mediaCensorJob.setBarrageCensorResult(barrageCensorResult);

			Input input = new Input();
			input.setBucket(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Input.Object"));
			mediaCensorJob.setInput(input);

			VideoCensorConfig videoCensorConfig = new VideoCensorConfig();
			videoCensorConfig.setBizType(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.BizType"));
			videoCensorConfig.setVideoCensor(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.VideoCensor"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.OutputFile.Object"));
			videoCensorConfig.setOutputFile(outputFile);
			mediaCensorJob.setVideoCensorConfig(videoCensorConfig);

			VensorCensorResult vensorCensorResult = new VensorCensorResult();
			vensorCensorResult.setNextPageToken(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.NextPageToken"));

			List<CensorResult> censorResults = new ArrayList<CensorResult>();
			for (int j = 0; j < context.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults.Length"); j++) {
				CensorResult censorResult = new CensorResult();
				censorResult.setRate(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Rate"));
				censorResult.setScene(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Scene"));
				censorResult.setLabel(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Label"));
				censorResult.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Suggestion"));

				censorResults.add(censorResult);
			}
			vensorCensorResult.setCensorResults(censorResults);

			List<VideoTimeline> videoTimelines = new ArrayList<VideoTimeline>();
			for (int j = 0; j < context.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines.Length"); j++) {
				VideoTimeline videoTimeline = new VideoTimeline();
				videoTimeline.setObject(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].Object"));
				videoTimeline.setTimestamp(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].Timestamp"));

				List<CensorResult2> censorResults1 = new ArrayList<CensorResult2>();
				for (int k = 0; k < context.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults.Length"); k++) {
					CensorResult2 censorResult2 = new CensorResult2();
					censorResult2.setRate(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Rate"));
					censorResult2.setScene(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Scene"));
					censorResult2.setLabel(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Label"));
					censorResult2.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Suggestion"));

					censorResults1.add(censorResult2);
				}
				videoTimeline.setCensorResults1(censorResults1);

				videoTimelines.add(videoTimeline);
			}
			vensorCensorResult.setVideoTimelines(videoTimelines);
			mediaCensorJob.setVensorCensorResult(vensorCensorResult);

			List<CoverImageCensorResult> coverImageCensorResults = new ArrayList<CoverImageCensorResult>();
			for (int j = 0; j < context.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults.Length"); j++) {
				CoverImageCensorResult coverImageCensorResult = new CoverImageCensorResult();
				coverImageCensorResult.setLocation(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Location"));
				coverImageCensorResult.setBucket(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Bucket"));
				coverImageCensorResult.setObject(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Object"));

				List<Result> results = new ArrayList<Result>();
				for (int k = 0; k < context.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results.Length"); k++) {
					Result result = new Result();
					result.setRate(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Rate"));
					result.setScene(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Scene"));
					result.setLabel(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Label"));
					result.setSuggestion(context.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Suggestion"));

					results.add(result);
				}
				coverImageCensorResult.setResults(results);

				coverImageCensorResults.add(coverImageCensorResult);
			}
			mediaCensorJob.setCoverImageCensorResults(coverImageCensorResults);

			mediaCensorJobList.add(mediaCensorJob);
		}
		queryMediaCensorJobListResponse.setMediaCensorJobList(mediaCensorJobList);
	 
	 	return queryMediaCensorJobListResponse;
	}
}