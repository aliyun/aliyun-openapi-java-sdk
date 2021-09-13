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

import com.aliyuncs.mts.model.v20140618.QuerySmarttagJobListResponse;
import com.aliyuncs.mts.model.v20140618.QuerySmarttagJobListResponse.SmarttagJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmarttagJobListResponseUnmarshaller {

	public static QuerySmarttagJobListResponse unmarshall(QuerySmarttagJobListResponse querySmarttagJobListResponse, UnmarshallerContext _ctx) {
		
		querySmarttagJobListResponse.setRequestId(_ctx.stringValue("QuerySmarttagJobListResponse.RequestId"));
		querySmarttagJobListResponse.setNextPageToken(_ctx.stringValue("QuerySmarttagJobListResponse.NextPageToken"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmarttagJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("QuerySmarttagJobListResponse.NonExistJobIds["+ i +"]"));
		}
		querySmarttagJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<SmarttagJob> smarttagJobs = new ArrayList<SmarttagJob>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmarttagJobListResponse.SmarttagJobs.Length"); i++) {
			SmarttagJob smarttagJob = new SmarttagJob();
			smarttagJob.setStatus(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].Status"));
			smarttagJob.setCreationTime(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].CreationTime"));
			smarttagJob.setFinishTime(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].FinishTime"));
			smarttagJob.setJobId(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].JobId"));
			smarttagJob.setPipelineId(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].PipelineId"));
			smarttagJob.setTemplateId(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].TemplateId"));
			smarttagJob.setInput(_ctx.stringValue("QuerySmarttagJobListResponse.SmarttagJobs["+ i +"].Input"));

			smarttagJobs.add(smarttagJob);
		}
		querySmarttagJobListResponse.setSmarttagJobs(smarttagJobs);
	 
	 	return querySmarttagJobListResponse;
	}
}