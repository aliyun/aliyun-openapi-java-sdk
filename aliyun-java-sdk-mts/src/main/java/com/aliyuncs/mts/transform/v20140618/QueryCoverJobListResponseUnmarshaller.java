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

	public static QueryCoverJobListResponse unmarshall(QueryCoverJobListResponse queryCoverJobListResponse, UnmarshallerContext _ctx) {
		
		queryCoverJobListResponse.setRequestId(_ctx.stringValue("QueryCoverJobListResponse.RequestId"));
		queryCoverJobListResponse.setNextPageToken(_ctx.stringValue("QueryCoverJobListResponse.NextPageToken"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCoverJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryCoverJobListResponse.NonExistIds["+ i +"]"));
		}
		queryCoverJobListResponse.setNonExistIds(nonExistIds);

		List<CoverJob> coverJobList = new ArrayList<CoverJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryCoverJobListResponse.CoverJobList.Length"); i++) {
			CoverJob coverJob = new CoverJob();
			coverJob.setCreationTime(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CreationTime"));
			coverJob.setState(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].State"));
			coverJob.setUserData(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].UserData"));
			coverJob.setCode(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Code"));
			coverJob.setMessage(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Message"));
			coverJob.setPipelineId(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].PipelineId"));
			coverJob.setId(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Id"));

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].Input.Bucket"));
			coverJob.setInput(input);

			CoverConfig coverConfig = new CoverConfig();

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverConfig.OutputFile.Bucket"));
			coverConfig.setOutputFile(outputFile);
			coverJob.setCoverConfig(coverConfig);

			List<CoverImage> coverImageList = new ArrayList<CoverImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList.Length"); j++) {
				CoverImage coverImage = new CoverImage();
				coverImage.setTime(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList["+ j +"].Time"));
				coverImage.setScore(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList["+ j +"].Score"));
				coverImage.setUrl(_ctx.stringValue("QueryCoverJobListResponse.CoverJobList["+ i +"].CoverImageList["+ j +"].Url"));

				coverImageList.add(coverImage);
			}
			coverJob.setCoverImageList(coverImageList);

			coverJobList.add(coverJob);
		}
		queryCoverJobListResponse.setCoverJobList(coverJobList);
	 
	 	return queryCoverJobListResponse;
	}
}