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

import com.aliyuncs.mts.model.v20140618.SubmitImageQualityJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitImageQualityJobResponse.ImageQualityJob;
import com.aliyuncs.mts.model.v20140618.SubmitImageQualityJobResponse.ImageQualityJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitImageQualityJobResponse.ImageQualityJob.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitImageQualityJobResponseUnmarshaller {

	public static SubmitImageQualityJobResponse unmarshall(SubmitImageQualityJobResponse submitImageQualityJobResponse, UnmarshallerContext context) {
		
		submitImageQualityJobResponse.setRequestId(context.stringValue("SubmitImageQualityJobResponse.RequestId"));

		ImageQualityJob imageQualityJob = new ImageQualityJob();
		imageQualityJob.setJobId(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.JobId"));
		imageQualityJob.setUserData(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.UserData"));
		imageQualityJob.setPipelineId(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.PipelineId"));
		imageQualityJob.setState(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.State"));
		imageQualityJob.setCreationTime(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.CreationTime"));

		Input input = new Input();
		input.setBucket(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Input.Bucket"));
		input.setLocation(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Input.Location"));
		input.setObject(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Input.Object"));
		input.setUrl(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Input.Url"));
		imageQualityJob.setInput(input);

		Result result = new Result();
		result.setCode(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Result.Code"));
		result.setMessage(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Result.Message"));
		result.setScore(context.stringValue("SubmitImageQualityJobResponse.ImageQualityJob.Result.Score"));
		imageQualityJob.setResult(result);
		submitImageQualityJobResponse.setImageQualityJob(imageQualityJob);
	 
	 	return submitImageQualityJobResponse;
	}
}