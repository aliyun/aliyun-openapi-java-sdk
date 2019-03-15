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

import com.aliyuncs.mts.model.v20140618.QueryMediaFpDeleteJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaFpDeleteJobListResponse.MediaFpDeleteJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaFpDeleteJobListResponseUnmarshaller {

	public static QueryMediaFpDeleteJobListResponse unmarshall(QueryMediaFpDeleteJobListResponse queryMediaFpDeleteJobListResponse, UnmarshallerContext context) {
		
		queryMediaFpDeleteJobListResponse.setRequestId(context.stringValue("QueryMediaFpDeleteJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaFpDeleteJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryMediaFpDeleteJobListResponse.NonExistIds["+ i +"]"));
		}
		queryMediaFpDeleteJobListResponse.setNonExistIds(nonExistIds);

		List<MediaFpDeleteJob> mediaFpDeleteJobList = new ArrayList<MediaFpDeleteJob>();
		for (int i = 0; i < context.lengthValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList.Length"); i++) {
			MediaFpDeleteJob mediaFpDeleteJob = new MediaFpDeleteJob();
			mediaFpDeleteJob.setId(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].Id"));
			mediaFpDeleteJob.setUserData(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].UserData"));
			mediaFpDeleteJob.setPipelineId(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].PipelineId"));
			mediaFpDeleteJob.setState(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].State"));
			mediaFpDeleteJob.setCode(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].Code"));
			mediaFpDeleteJob.setMessage(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].Message"));
			mediaFpDeleteJob.setCreationTime(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].CreationTime"));
			mediaFpDeleteJob.setFinishTime(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].FinishTime"));
			mediaFpDeleteJob.setPrimaryKey(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].PrimaryKey"));
			mediaFpDeleteJob.setFpDBId(context.stringValue("QueryMediaFpDeleteJobListResponse.MediaFpDeleteJobList["+ i +"].FpDBId"));

			mediaFpDeleteJobList.add(mediaFpDeleteJob);
		}
		queryMediaFpDeleteJobListResponse.setMediaFpDeleteJobList(mediaFpDeleteJobList);
	 
	 	return queryMediaFpDeleteJobListResponse;
	}
}