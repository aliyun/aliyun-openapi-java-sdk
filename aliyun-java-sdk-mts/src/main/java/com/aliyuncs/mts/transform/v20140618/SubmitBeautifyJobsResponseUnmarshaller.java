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

	public static SubmitBeautifyJobsResponse unmarshall(SubmitBeautifyJobsResponse submitBeautifyJobsResponse, UnmarshallerContext context) {
		
		submitBeautifyJobsResponse.setRequestId(context.stringValue("SubmitBeautifyJobsResponse.RequestId"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("SubmitBeautifyJobsResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setId(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Id"));
			job.setUserData(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].UserData"));
			job.setPipelineId(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].PipelineId"));
			job.setState(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].State"));
			job.setCode(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Code"));
			job.setMessage(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Message"));
			job.setCreationTime(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.Object"));
			input.setRoleArn(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].Input.RoleArn"));
			job.setInput(input);

			BeautifyConfig beautifyConfig = new BeautifyConfig();

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.Object"));
			outputFile.setRoleArn(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].BeautifyConfig.OutputFile.RoleArn"));
			beautifyConfig.setOutputFile(outputFile);
			job.setBeautifyConfig(beautifyConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("SubmitBeautifyJobsResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			jobList.add(job);
		}
		submitBeautifyJobsResponse.setJobList(jobList);
	 
	 	return submitBeautifyJobsResponse;
	}
}