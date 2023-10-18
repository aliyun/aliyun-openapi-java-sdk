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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListEdgeTranscodeJobResponse;
import com.aliyuncs.live.model.v20161101.ListEdgeTranscodeJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEdgeTranscodeJobResponseUnmarshaller {

	public static ListEdgeTranscodeJobResponse unmarshall(ListEdgeTranscodeJobResponse listEdgeTranscodeJobResponse, UnmarshallerContext _ctx) {
		
		listEdgeTranscodeJobResponse.setRequestId(_ctx.stringValue("ListEdgeTranscodeJobResponse.RequestId"));
		listEdgeTranscodeJobResponse.setTotalCount(_ctx.integerValue("ListEdgeTranscodeJobResponse.TotalCount"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListEdgeTranscodeJobResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setStatus(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].Status"));
			job.setType(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].Type"));
			job.setStreamInput(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].StreamInput"));
			job.setStreamOutput(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].StreamOutput"));
			job.setLastStopAt(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].LastStopAt"));
			job.setLastStartAt(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].LastStartAt"));
			job.setCreateTime(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].CreateTime"));
			job.setJobId(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].JobId"));
			job.setTemplateName(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].TemplateName"));
			job.setName(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].Name"));
			job.setTemplateId(_ctx.stringValue("ListEdgeTranscodeJobResponse.JobList["+ i +"].TemplateId"));

			jobList.add(job);
		}
		listEdgeTranscodeJobResponse.setJobList(jobList);
	 
	 	return listEdgeTranscodeJobResponse;
	}
}