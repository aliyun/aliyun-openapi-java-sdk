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

import com.aliyuncs.mts.model.v20140618.QueryIProductionJobListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIProductionJobListResponseUnmarshaller {

	public static QueryIProductionJobListResponse unmarshall(QueryIProductionJobListResponse queryIProductionJobListResponse, UnmarshallerContext _ctx) {
		
		queryIProductionJobListResponse.setRequestId(_ctx.stringValue("QueryIProductionJobListResponse.RequestId"));
		queryIProductionJobListResponse.setNextPageToken(_ctx.stringValue("QueryIProductionJobListResponse.NextPageToken"));

		List<String> jobs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryIProductionJobListResponse.Jobs.Length"); i++) {
			jobs.add(_ctx.stringValue("QueryIProductionJobListResponse.Jobs["+ i +"]"));
		}
		queryIProductionJobListResponse.setJobs(jobs);

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryIProductionJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryIProductionJobListResponse.NonExistIds["+ i +"]"));
		}
		queryIProductionJobListResponse.setNonExistIds(nonExistIds);
	 
	 	return queryIProductionJobListResponse;
	}
}