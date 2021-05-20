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

import com.aliyuncs.mts.model.v20140618.ListInferenceJobResponse;
import com.aliyuncs.mts.model.v20140618.ListInferenceJobResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInferenceJobResponseUnmarshaller {

	public static ListInferenceJobResponse unmarshall(ListInferenceJobResponse listInferenceJobResponse, UnmarshallerContext _ctx) {
		
		listInferenceJobResponse.setRequestId(_ctx.stringValue("ListInferenceJobResponse.RequestId"));
		listInferenceJobResponse.setMessage(_ctx.stringValue("ListInferenceJobResponse.Message"));
		listInferenceJobResponse.setCode(_ctx.stringValue("ListInferenceJobResponse.Code"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInferenceJobResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setStatus(_ctx.stringValue("ListInferenceJobResponse.Jobs["+ i +"].Status"));
			jobsItem.setResult(_ctx.stringValue("ListInferenceJobResponse.Jobs["+ i +"].Result"));
			jobsItem.setJobId(_ctx.stringValue("ListInferenceJobResponse.Jobs["+ i +"].JobId"));
			jobsItem.setUserId(_ctx.longValue("ListInferenceJobResponse.Jobs["+ i +"].UserId"));
			jobsItem.setMessage(_ctx.stringValue("ListInferenceJobResponse.Jobs["+ i +"].Message"));
			jobsItem.setJobTime(_ctx.longValue("ListInferenceJobResponse.Jobs["+ i +"].JobTime"));

			jobs.add(jobsItem);
		}
		listInferenceJobResponse.setJobs(jobs);
	 
	 	return listInferenceJobResponse;
	}
}