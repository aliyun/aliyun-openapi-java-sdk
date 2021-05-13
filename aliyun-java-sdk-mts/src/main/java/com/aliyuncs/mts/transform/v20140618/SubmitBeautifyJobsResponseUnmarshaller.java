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

import com.aliyuncs.mts.model.v20140618.SubmitBeautifyJobsResponse;
import com.aliyuncs.mts.model.v20140618.SubmitBeautifyJobsResponse.Job;
import com.aliyuncs.mts.model.v20140618.SubmitBeautifyJobsResponse.Job.BeautifyConfig;
import com.aliyuncs.mts.model.v20140618.SubmitBeautifyJobsResponse.Job.BeautifyConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.SubmitBeautifyJobsResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.SubmitBeautifyJobsResponse.Job.MNSMessageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitBeautifyJobsResponseUnmarshaller {

	public static SubmitBeautifyJobsResponse unmarshall(SubmitBeautifyJobsResponse submitBeautifyJobsResponse, UnmarshallerContext _ctx) {
		
		submitBeautifyJobsResponse.setRequestId(_ctx.stringValue("SubmitBeautifyJobsResponse.RequestId"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("SubmitBeautifyJobsResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setCreationTime(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].CreationTime"));
			job.setState(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].State"));
			job.setUserData(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].UserData"));
			job.setCode(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Message"));
			job.setPipelineId(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].PipelineId"));
			job.setId(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Id"));

			BeautifyConfig beautifyConfig = new BeautifyConfig();

			OutputFile outputFile = new OutputFile();
			outputFile.setRoleArn(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.RoleArn"));
			outputFile.setObject(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.Bucket"));
			beautifyConfig.setOutputFile(outputFile);
			job.setBeautifyConfig(beautifyConfig);

			Input input = new Input();
			input.setRoleArn(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.RoleArn"));
			input.setObject(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.Bucket"));
			job.setInput(input);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			jobList.add(job);
		}
		submitBeautifyJobsResponse.setJobList(jobList);
	 
	 	return submitBeautifyJobsResponse;
	}
}