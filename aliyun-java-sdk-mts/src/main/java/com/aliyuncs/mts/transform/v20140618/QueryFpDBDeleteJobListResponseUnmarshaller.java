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

import com.aliyuncs.mts.model.v20140618.QueryFpDBDeleteJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryFpDBDeleteJobListResponse.FpDBDeleteJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFpDBDeleteJobListResponseUnmarshaller {

	public static QueryFpDBDeleteJobListResponse unmarshall(QueryFpDBDeleteJobListResponse queryFpDBDeleteJobListResponse, UnmarshallerContext _ctx) {
		
		queryFpDBDeleteJobListResponse.setRequestId(_ctx.stringValue("QueryFpDBDeleteJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpDBDeleteJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryFpDBDeleteJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFpDBDeleteJobListResponse.setNonExistIds(nonExistIds);

		List<FpDBDeleteJob> fpDBDeleteJobList = new ArrayList<FpDBDeleteJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList.Length"); i++) {
			FpDBDeleteJob fpDBDeleteJob = new FpDBDeleteJob();
			fpDBDeleteJob.setId(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].Id"));
			fpDBDeleteJob.setUserData(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].UserData"));
			fpDBDeleteJob.setPipelineId(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].PipelineId"));
			fpDBDeleteJob.setStatus(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].Status"));
			fpDBDeleteJob.setCode(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].Code"));
			fpDBDeleteJob.setMessage(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].Message"));
			fpDBDeleteJob.setDelType(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].DelType"));
			fpDBDeleteJob.setFpDBId(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].FpDBId"));
			fpDBDeleteJob.setCreationTime(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].CreationTime"));
			fpDBDeleteJob.setFinishTime(_ctx.stringValue("QueryFpDBDeleteJobListResponse.FpDBDeleteJobList["+ i +"].FinishTime"));

			fpDBDeleteJobList.add(fpDBDeleteJob);
		}
		queryFpDBDeleteJobListResponse.setFpDBDeleteJobList(fpDBDeleteJobList);
	 
	 	return queryFpDBDeleteJobListResponse;
	}
}