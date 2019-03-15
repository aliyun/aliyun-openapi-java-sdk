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

import com.aliyuncs.mts.model.v20140618.QueryCoverJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryCoverJobListResponse.CoverJob;
import com.aliyuncs.mts.model.v20140618.QueryCoverJobListResponse.CoverJob.CoverConfig;
import com.aliyuncs.mts.model.v20140618.QueryCoverJobListResponse.CoverJob.CoverConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryCoverJobListResponse.CoverJob.CoverImage;
import com.aliyuncs.mts.model.v20140618.QueryCoverJobListResponse.CoverJob.Input;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCoverJobListResponseUnmarshaller {

	public static QueryCoverJobListResponse unmarshall(QueryCoverJobListResponse queryCoverJobListResponse, UnmarshallerContext context) {
		
		queryCoverJobListResponse.setRequestId(context.stringValue("QueryCoverJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryCoverJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryCoverJobListResponse.NonExistIds["+ i +"]"));
		}
		queryCoverJobListResponse.setNonExistIds(nonExistIds);

		List<CoverJob> coverJobList = new ArrayList<CoverJob>();
		for (int i = 0; i < context.lengthValue("QueryCoverJobListResponse.CoverJobList.Length"); i++) {
			CoverJob coverJob = new CoverJob();
			coverJob.setId(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Id"));
			coverJob.setUserData(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].UserData"));
			coverJob.setPipelineId(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].PipelineId"));
			coverJob.setState(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].State"));
			coverJob.setCode(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Code"));
			coverJob.setMessage(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Message"));
			coverJob.setCreationTime(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Input.Object"));
			coverJob.setInput(input);

			CoverConfig coverConfig = new CoverConfig();

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverConfig.OutputFile.Object"));
			coverConfig.setOutputFile(outputFile);
			coverJob.setCoverConfig(coverConfig);

			List<CoverImage> coverImageList = new ArrayList<CoverImage>();
			for (int j = 0; j < context.lengthValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList.Length"); j++) {
				CoverImage coverImage = new CoverImage();
				coverImage.setScore(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList["+ j +"].Score"));
				coverImage.setUrl(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList["+ j +"].Url"));
				coverImage.setTime(context.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList["+ j +"].Time"));

				coverImageList.add(coverImage);
			}
			coverJob.setCoverImageList(coverImageList);

			coverJobList.add(coverJob);
		}
		queryCoverJobListResponse.setCoverJobList(coverJobList);
	 
	 	return queryCoverJobListResponse;
	}
}