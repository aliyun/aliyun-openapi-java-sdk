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

import com.aliyuncs.mts.model.v20140618.QueryImageSearchJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryImageSearchJobListResponse.ImageSearchJob;
import com.aliyuncs.mts.model.v20140618.QueryImageSearchJobListResponse.ImageSearchJob.InputImage;
import com.aliyuncs.mts.model.v20140618.QueryImageSearchJobListResponse.ImageSearchJob.InputVideo;
import com.aliyuncs.mts.model.v20140618.QueryImageSearchJobListResponse.ImageSearchJob.Result;
import com.aliyuncs.mts.model.v20140618.QueryImageSearchJobListResponse.ImageSearchJob.Result.ImageSearchShotsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryImageSearchJobListResponseUnmarshaller {

	public static QueryImageSearchJobListResponse unmarshall(QueryImageSearchJobListResponse queryImageSearchJobListResponse, UnmarshallerContext _ctx) {
		
		queryImageSearchJobListResponse.setRequestId(_ctx.stringValue("QueryImageSearchJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryImageSearchJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryImageSearchJobListResponse.NonExistIds["+ i +"]"));
		}
		queryImageSearchJobListResponse.setNonExistIds(nonExistIds);

		List<ImageSearchJob> imageSearchJobList = new ArrayList<ImageSearchJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryImageSearchJobListResponse.ImageSearchJobList.Length"); i++) {
			ImageSearchJob imageSearchJob = new ImageSearchJob();
			imageSearchJob.setCreationTime(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].CreationTime"));
			imageSearchJob.setFinishTime(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].FinishTime"));
			imageSearchJob.setState(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].State"));
			imageSearchJob.setUserData(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].UserData"));
			imageSearchJob.setCode(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Code"));
			imageSearchJob.setMessage(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Message"));
			imageSearchJob.setPipelineId(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].PipelineId"));
			imageSearchJob.setId(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Id"));

			Result result = new Result();

			List<ImageSearchShotsItem> imageSearchShots = new ArrayList<ImageSearchShotsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots.Length"); j++) {
				ImageSearchShotsItem imageSearchShotsItem = new ImageSearchShotsItem();
				imageSearchShotsItem.setMatchedFrame(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots["+ j +"].MatchedFrame"));
				imageSearchShotsItem.setMatchedTimestamp(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots["+ j +"].MatchedTimestamp"));
				imageSearchShotsItem.setSimilarity(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots["+ j +"].Similarity"));

				imageSearchShots.add(imageSearchShotsItem);
			}
			result.setImageSearchShots(imageSearchShots);
			imageSearchJob.setResult(result);

			InputImage inputImage = new InputImage();
			inputImage.setObject(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].inputImage.Object"));
			inputImage.setLocation(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].inputImage.Location"));
			inputImage.setBucket(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].inputImage.Bucket"));
			imageSearchJob.setInputImage(inputImage);

			InputVideo inputVideo = new InputVideo();
			inputVideo.setObject(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].InputVideo.Object"));
			inputVideo.setLocation(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].InputVideo.Location"));
			inputVideo.setBucket(_ctx.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].InputVideo.Bucket"));
			imageSearchJob.setInputVideo(inputVideo);

			imageSearchJobList.add(imageSearchJob);
		}
		queryImageSearchJobListResponse.setImageSearchJobList(imageSearchJobList);
	 
	 	return queryImageSearchJobListResponse;
	}
}