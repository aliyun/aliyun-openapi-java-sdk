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

	public static QueryImageSearchJobListResponse unmarshall(QueryImageSearchJobListResponse queryImageSearchJobListResponse, UnmarshallerContext context) {
		
		queryImageSearchJobListResponse.setRequestId(context.stringValue("QueryImageSearchJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryImageSearchJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryImageSearchJobListResponse.NonExistIds["+ i +"]"));
		}
		queryImageSearchJobListResponse.setNonExistIds(nonExistIds);

		List<ImageSearchJob> imageSearchJobList = new ArrayList<ImageSearchJob>();
		for (int i = 0; i < context.lengthValue("QueryImageSearchJobListResponse.ImageSearchJobList.Length"); i++) {
			ImageSearchJob imageSearchJob = new ImageSearchJob();
			imageSearchJob.setId(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Id"));
			imageSearchJob.setUserData(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].UserData"));
			imageSearchJob.setPipelineId(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].PipelineId"));
			imageSearchJob.setState(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].State"));
			imageSearchJob.setCode(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Code"));
			imageSearchJob.setMessage(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Message"));
			imageSearchJob.setCreationTime(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].CreationTime"));
			imageSearchJob.setFinishTime(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].FinishTime"));

			InputVideo inputVideo = new InputVideo();
			inputVideo.setBucket(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].InputVideo.Bucket"));
			inputVideo.setLocation(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].InputVideo.Location"));
			inputVideo.setObject(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].InputVideo.Object"));
			imageSearchJob.setInputVideo(inputVideo);

			InputImage inputImage = new InputImage();
			inputImage.setBucket(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].inputImage.Bucket"));
			inputImage.setLocation(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].inputImage.Location"));
			inputImage.setObject(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].inputImage.Object"));
			imageSearchJob.setInputImage(inputImage);

			Result result = new Result();

			List<ImageSearchShotsItem> imageSearchShots = new ArrayList<ImageSearchShotsItem>();
			for (int j = 0; j < context.lengthValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots.Length"); j++) {
				ImageSearchShotsItem imageSearchShotsItem = new ImageSearchShotsItem();
				imageSearchShotsItem.setMatchedTimestamp(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots["+ j +"].MatchedTimestamp"));
				imageSearchShotsItem.setMatchedFrame(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots["+ j +"].MatchedFrame"));
				imageSearchShotsItem.setSimilarity(context.stringValue("QueryImageSearchJobListResponse.ImageSearchJobList["+ i +"].Result.ImageSearchShots["+ j +"].Similarity"));

				imageSearchShots.add(imageSearchShotsItem);
			}
			result.setImageSearchShots(imageSearchShots);
			imageSearchJob.setResult(result);

			imageSearchJobList.add(imageSearchJob);
		}
		queryImageSearchJobListResponse.setImageSearchJobList(imageSearchJobList);
	 
	 	return queryImageSearchJobListResponse;
	}
}