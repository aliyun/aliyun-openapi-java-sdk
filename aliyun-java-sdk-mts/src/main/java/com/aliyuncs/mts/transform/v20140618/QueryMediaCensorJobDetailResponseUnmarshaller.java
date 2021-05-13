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
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResult2;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimeline;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimeline.CensorResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig;
import com.aliyuncs.mts.model.v20140618.QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaCensorJobDetailResponseUnmarshaller {

	public static QueryMediaCensorJobDetailResponse unmarshall(QueryMediaCensorJobDetailResponse queryMediaCensorJobDetailResponse, UnmarshallerContext _ctx) {
		
		queryMediaCensorJobDetailResponse.setRequestId(_ctx.stringValue("QueryMediaCensorJobDetailResponse.RequestId"));

		MediaCensorJobDetail mediaCensorJobDetail = new MediaCensorJobDetail();
		mediaCensorJobDetail.setCreationTime(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CreationTime"));
		mediaCensorJobDetail.setFinishTime(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.FinishTime"));
		mediaCensorJobDetail.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Suggestion"));
		mediaCensorJobDetail.setState(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.State"));
		mediaCensorJobDetail.setMessage(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Message"));
		mediaCensorJobDetail.setJobId(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.JobId"));
		mediaCensorJobDetail.setUserData(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.UserData"));
		mediaCensorJobDetail.setCode(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Code"));
		mediaCensorJobDetail.setPipelineId(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.PipelineId"));

		TitleCensorResult titleCensorResult = new TitleCensorResult();
		titleCensorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Suggestion"));
		titleCensorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Label"));
		titleCensorResult.setScene(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Scene"));
		titleCensorResult.setRate(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.TitleCensorResult.Rate"));
		mediaCensorJobDetail.setTitleCensorResult(titleCensorResult);

		Input input = new Input();
		input.setObject(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input.Object"));
		input.setLocation(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input.Location"));
		input.setBucket(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.Input.Bucket"));
		mediaCensorJobDetail.setInput(input);

		BarrageCensorResult barrageCensorResult = new BarrageCensorResult();
		barrageCensorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Suggestion"));
		barrageCensorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Label"));
		barrageCensorResult.setScene(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Scene"));
		barrageCensorResult.setRate(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.BarrageCensorResult.Rate"));
		mediaCensorJobDetail.setBarrageCensorResult(barrageCensorResult);

		DescCensorResult descCensorResult = new DescCensorResult();
		descCensorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Suggestion"));
		descCensorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Label"));
		descCensorResult.setScene(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Scene"));
		descCensorResult.setRate(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.DescCensorResult.Rate"));
		mediaCensorJobDetail.setDescCensorResult(descCensorResult);

		VideoCensorConfig videoCensorConfig = new VideoCensorConfig();
		videoCensorConfig.setVideoCensor(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.VideoCensor"));
		videoCensorConfig.setBizType(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.BizType"));

		OutputFile outputFile = new OutputFile();
		outputFile.setObject(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile.Object"));
		outputFile.setLocation(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile.Location"));
		outputFile.setBucket(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VideoCensorConfig.OutputFile.Bucket"));
		videoCensorConfig.setOutputFile(outputFile);
		mediaCensorJobDetail.setVideoCensorConfig(videoCensorConfig);

		VensorCensorResult vensorCensorResult = new VensorCensorResult();
		vensorCensorResult.setNextPageToken(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.NextPageToken"));

		List<VideoTimeline> videoTimelines = new ArrayList<VideoTimeline>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines.Length"); i++) {
			VideoTimeline videoTimeline = new VideoTimeline();
			videoTimeline.setTimestamp(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].Timestamp"));
			videoTimeline.setObject(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].Object"));

			List<CensorResult> censorResults1 = new ArrayList<CensorResult>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults.Length"); j++) {
				CensorResult censorResult = new CensorResult();
				censorResult.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Suggestion"));
				censorResult.setLabel(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Label"));
				censorResult.setScene(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Scene"));
				censorResult.setRate(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.VideoTimelines["+ i +"].CensorResults["+ j +"].Rate"));

				censorResults1.add(censorResult);
			}
			videoTimeline.setCensorResults1(censorResults1);

			videoTimelines.add(videoTimeline);
		}
		vensorCensorResult.setVideoTimelines(videoTimelines);

		List<CensorResult2> censorResults = new ArrayList<CensorResult2>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults.Length"); i++) {
			CensorResult2 censorResult2 = new CensorResult2();
			censorResult2.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Suggestion"));
			censorResult2.setLabel(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Label"));
			censorResult2.setScene(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Scene"));
			censorResult2.setRate(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.VensorCensorResult.CensorResults["+ i +"].Rate"));

			censorResults.add(censorResult2);
		}
		vensorCensorResult.setCensorResults(censorResults);
		mediaCensorJobDetail.setVensorCensorResult(vensorCensorResult);

		List<CoverImageCensorResult> coverImageCensorResults = new ArrayList<CoverImageCensorResult>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults.Length"); i++) {
			CoverImageCensorResult coverImageCensorResult = new CoverImageCensorResult();
			coverImageCensorResult.setObject(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Object"));
			coverImageCensorResult.setLocation(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Location"));
			coverImageCensorResult.setBucket(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Bucket"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setSuggestion(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Suggestion"));
				result.setLabel(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Label"));
				result.setScene(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Scene"));
				result.setRate(_ctx.stringValue("QueryMediaCensorJobDetailResponse.MediaCensorJobDetail.CoverImageCensorResults["+ i +"].Results["+ j +"].Rate"));

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