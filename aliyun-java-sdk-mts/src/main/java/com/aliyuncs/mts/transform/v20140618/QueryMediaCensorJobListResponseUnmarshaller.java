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
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult.CensorResult2;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult.VideoTimeline;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VensorCensorResult.VideoTimeline.CensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VideoCensorConfig;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobListResponse.MediaCensorJob.VideoCensorConfig.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaCensorJobListResponseUnmarshaller {

	public static QueryMediaCensorJobListResponse unmarshall(QueryMediaCensorJobListResponse queryMediaCensorJobListResponse, UnmarshallerContext _ctx) {
		
		queryMediaCensorJobListResponse.setRequestId(_ctx.stringValue("QueryMediaCensorJobListResponse.RequestId"));
		queryMediaCensorJobListResponse.setNextPageToken(_ctx.stringValue("QueryMediaCensorJobListResponse.NextPageToken"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaCensorJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryMediaCensorJobListResponse.NonExistIds["+ i +"]"));
		}
		queryMediaCensorJobListResponse.setNonExistIds(nonExistIds);

		List<MediaCensorJob> mediaCensorJobList = new ArrayList<MediaCensorJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList.Length"); i++) {
			MediaCensorJob mediaCensorJob = new MediaCensorJob();
			mediaCensorJob.setCreationTime(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CreationTime"));
			mediaCensorJob.setFinishTime(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].FinishTime"));
			mediaCensorJob.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Suggestion"));
			mediaCensorJob.setState(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].State"));
			mediaCensorJob.setMessage(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Message"));
			mediaCensorJob.setJobId(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].JobId"));
			mediaCensorJob.setUserData(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].UserData"));
			mediaCensorJob.setCode(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Code"));
			mediaCensorJob.setPipelineId(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].PipelineId"));

			TitleCensorResult titleCensorResult = new TitleCensorResult();
			titleCensorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Suggestion"));
			titleCensorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Label"));
			titleCensorResult.setScene(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Scene"));
			titleCensorResult.setRate(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].TitleCensorResult.Rate"));
			mediaCensorJob.setTitleCensorResult(titleCensorResult);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].Input.Bucket"));
			mediaCensorJob.setInput(input);

			BarrageCensorResult barrageCensorResult = new BarrageCensorResult();
			barrageCensorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Suggestion"));
			barrageCensorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Label"));
			barrageCensorResult.setScene(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Scene"));
			barrageCensorResult.setRate(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].BarrageCensorResult.Rate"));
			mediaCensorJob.setBarrageCensorResult(barrageCensorResult);

			DescCensorResult descCensorResult = new DescCensorResult();
			descCensorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Suggestion"));
			descCensorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Label"));
			descCensorResult.setScene(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Scene"));
			descCensorResult.setRate(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].DescCensorResult.Rate"));
			mediaCensorJob.setDescCensorResult(descCensorResult);

			VideoCensorConfig videoCensorConfig = new VideoCensorConfig();
			videoCensorConfig.setVideoCensor(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.VideoCensor"));
			videoCensorConfig.setBizType(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.BizType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VideoCensorConfig.OutputFile.Bucket"));
			videoCensorConfig.setOutputFile(outputFile);
			mediaCensorJob.setVideoCensorConfig(videoCensorConfig);

			VensorCensorResult vensorCensorResult = new VensorCensorResult();
			vensorCensorResult.setNextPageToken(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.NextPageToken"));

			List<VideoTimeline> videoTimelines = new ArrayList<VideoTimeline>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines.Length"); j++) {
				VideoTimeline videoTimeline = new VideoTimeline();
				videoTimeline.setTimestamp(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].Timestamp"));
				videoTimeline.setObject(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].Object"));

				List<CensorResult> censorResults1 = new ArrayList<CensorResult>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults.Length"); k++) {
					CensorResult censorResult = new CensorResult();
					censorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Suggestion"));
					censorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Label"));
					censorResult.setScene(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Scene"));
					censorResult.setRate(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.VideoTimelines["+ j +"].CensorResults["+ k +"].Rate"));

					censorResults1.add(censorResult);
				}
				videoTimeline.setCensorResults1(censorResults1);

				videoTimelines.add(videoTimeline);
			}
			vensorCensorResult.setVideoTimelines(videoTimelines);

			List<CensorResult2> censorResults = new ArrayList<CensorResult2>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults.Length"); j++) {
				CensorResult2 censorResult2 = new CensorResult2();
				censorResult2.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Suggestion"));
				censorResult2.setLabel(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Label"));
				censorResult2.setScene(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Scene"));
				censorResult2.setRate(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].VensorCensorResult.CensorResults["+ j +"].Rate"));

				censorResults.add(censorResult2);
			}
			vensorCensorResult.setCensorResults(censorResults);
			mediaCensorJob.setVensorCensorResult(vensorCensorResult);

			List<CoverImageCensorResult> coverImageCensorResults = new ArrayList<CoverImageCensorResult>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults.Length"); j++) {
				CoverImageCensorResult coverImageCensorResult = new CoverImageCensorResult();
				coverImageCensorResult.setObject(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Object"));
				coverImageCensorResult.setLocation(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Location"));
				coverImageCensorResult.setBucket(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Bucket"));

				List<Result> results = new ArrayList<Result>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results.Length"); k++) {
					Result result = new Result();
					result.setSuggestion(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Suggestion"));
					result.setLabel(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Label"));
					result.setScene(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Scene"));
					result.setRate(_ctx.stringValue("QueryMediaCensorJobListResponse.MediaCensorJobList["+ i +"].CoverImageCensorResults["+ j +"].Results["+ k +"].Rate"));

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