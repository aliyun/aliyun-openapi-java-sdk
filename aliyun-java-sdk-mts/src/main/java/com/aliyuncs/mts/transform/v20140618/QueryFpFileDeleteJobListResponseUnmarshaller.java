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

import com.aliyuncs.mts.model.v20140618.QueryFpFileDeleteJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryFpFileDeleteJobListResponse.FpFileDeleteJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFpFileDeleteJobListResponseUnmarshaller {

	public static QueryFpFileDeleteJobListResponse unmarshall(QueryFpFileDeleteJobListResponse queryFpFileDeleteJobListResponse, UnmarshallerContext _ctx) {
		
		queryFpFileDeleteJobListResponse.setRequestId(_ctx.stringValue("QueryFpFileDeleteJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpFileDeleteJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryFpFileDeleteJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFpFileDeleteJobListResponse.setNonExistIds(nonExistIds);

		List<FpFileDeleteJob> fpFileDeleteJobList = new ArrayList<FpFileDeleteJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList.Length"); i++) {
			FpFileDeleteJob fpFileDeleteJob = new FpFileDeleteJob();
			fpFileDeleteJob.setCreationTime(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].CreationTime"));
			fpFileDeleteJob.setStatus(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].Status"));
			fpFileDeleteJob.setFinishTime(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].FinishTime"));
			fpFileDeleteJob.setUserData(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].UserData"));
			fpFileDeleteJob.setCode(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].Code"));
			fpFileDeleteJob.setMessage(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].Message"));
			fpFileDeleteJob.setPipelineId(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].PipelineId"));
			fpFileDeleteJob.setFpDBId(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].FpDBId"));
			fpFileDeleteJob.setId(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].Id"));
			fpFileDeleteJob.setFileIds(_ctx.stringValue("QueryFpFileDeleteJobListResponse.FpFileDeleteJobList["+ i +"].FileIds"));

			fpFileDeleteJobList.add(fpFileDeleteJob);
		}
		queryFpFileDeleteJobListResponse.setFpFileDeleteJobList(fpFileDeleteJobList);
	 
	 	return queryFpFileDeleteJobListResponse;
	}
}