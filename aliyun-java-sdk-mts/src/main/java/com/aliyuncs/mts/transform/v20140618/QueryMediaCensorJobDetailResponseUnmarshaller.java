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

import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResult.Result;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimeline;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimeline.CensorResult2;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaCensorJobDetailResponseUnmarshaller {

	public static QueryMediaCensorJobDetailResponse unmarshall(QueryMediaCensorJobDetailResponse queryMediaCensorJobDetailResponse, UnmarshallerContext context) {
		
		queryMediaCensorJobDetailResponse.setRequestId(context.stringValue("QueryMediaCensorJobDetailResponse.RequestId"));

		MediaCensorJobDetail mediaCensorJobDetail = new MediaCensorJobDetail();
		mediaCensorJobDetail.setId(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Id"));
		mediaCensorJobDetail.setUserData(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.UserData"));
		mediaCensorJobDetail.setPipelineId(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.PipelineId"));
		mediaCensorJobDetail.setState(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.State"));
		mediaCensorJobDetail.setCode(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Code"));
		mediaCensorJobDetail.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Suggestion"));
		mediaCensorJobDetail.setMessage(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Message"));
		mediaCensorJobDetail.setCreationTime(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CreationTime"));

		TitleCensorResult titleCensorResult = new TitleCensorResult();
		titleCensorResult.setRate(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Rate"));
		titleCensorResult.setScene(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Scene"));
		titleCensorResult.setLabel(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Label"));
		titleCensorResult.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Suggestion"));
		mediaCensorJobDetail.setTitleCensorResult(titleCensorResult);

		DescCensorResult descCensorResult = new DescCensorResult();
		descCensorResult.setRate(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Rate"));
		descCensorResult.setScene(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Scene"));
		descCensorResult.setLabel(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Label"));
		descCensorResult.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Suggestion"));
		mediaCensorJobDetail.setDescCensorResult(descCensorResult);

		BarrageCensorResult barrageCensorResult = new BarrageCensorResult();
		barrageCensorResult.setRate(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Rate"));
		barrageCensorResult.setScene(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Scene"));
		barrageCensorResult.setLabel(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Label"));
		barrageCensorResult.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Suggestion"));
		mediaCensorJobDetail.setBarrageCensorResult(barrageCensorResult);

		Input input = new Input();
		input.setBucket(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input.Bucket"));
		input.setLocation(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input.Location"));
		input.setObject(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input.Object"));
		mediaCensorJobDetail.setInput(input);

		VideoCensorConfig videoCensorConfig = new VideoCensorConfig();
		videoCensorConfig.setBizType(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.BizType"));
		videoCensorConfig.setVideoCensor(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.VideoCensor"));

		OutputFile outputFile = new OutputFile();
		outputFile.setBucket(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile.Bucket"));
		outputFile.setLocation(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile.Location"));
		outputFile.setObject(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile.Object"));
		videoCensorConfig.setOutputFile(outputFile);
		mediaCensorJobDetail.setVideoCensorConfig(videoCensorConfig);

		VensorCensorResult vensorCensorResult = new VensorCensorResult();
		vensorCensorResult.setNextPageToken(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.NextPageToken"));

		List<CensorResult> censorResults = new ArrayList<CensorResult>();
		for (int i = 0; i < context.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults.Length"); i++) {
			CensorResult censorResult = new CensorResult();
			censorResult.setRate(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Rate"));
			censorResult.setScene(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Scene"));
			censorResult.setLabel(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Label"));
			censorResult.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Suggestion"));

			censorResults.add(censorResult);
		}
		vensorCensorResult.setCensorResults(censorResults);

		List<VideoTimeline> videoTimelines = new ArrayList<VideoTimeline>();
		for (int i = 0; i < context.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines.Length"); i++) {
			VideoTimeline videoTimeline = new VideoTimeline();
			videoTimeline.setObject(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].Object"));
			videoTimeline.setTimestamp(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].Timestamp"));

			List<CensorResult2> censorResults1 = new ArrayList<CensorResult2>();
			for (int j = 0; j < context.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults.Length"); j++) {
				CensorResult2 censorResult2 = new CensorResult2();
				censorResult2.setRate(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Rate"));
				censorResult2.setScene(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Scene"));
				censorResult2.setLabel(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Label"));
				censorResult2.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Suggestion"));

				censorResults1.add(censorResult2);
			}
			videoTimeline.setCensorResults1(censorResults1);

			videoTimelines.add(videoTimeline);
		}
		vensorCensorResult.setVideoTimelines(videoTimelines);
		mediaCensorJobDetail.setVensorCensorResult(vensorCensorResult);

		List<CoverImageCensorResult> coverImageCensorResults = new ArrayList<CoverImageCensorResult>();
		for (int i = 0; i < context.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults.Length"); i++) {
			CoverImageCensorResult coverImageCensorResult = new CoverImageCensorResult();
			coverImageCensorResult.setLocation(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Location"));
			coverImageCensorResult.setBucket(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Bucket"));
			coverImageCensorResult.setObject(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Object"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < context.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setRate(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Rate"));
				result.setScene(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Scene"));
				result.setLabel(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Label"));
				result.setSuggestion(context.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Suggestion"));

				results.add(result);
			}
			coverImageCensorResult.setResults(results);

			coverImageCensorResults.add(coverImageCensorResult);
		}
		mediaCensorJobDetail.setCoverImageCensorResults(coverImageCensorResults);
		queryMediaCensorJobDetailResponse.setMediaCensorJobDetail(mediaCensorJobDetail);
	 
	 	return queryMediaCensorJobDetailResponse;
	}
}