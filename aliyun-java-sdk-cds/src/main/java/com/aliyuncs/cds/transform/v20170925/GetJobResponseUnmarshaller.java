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

package com.aliyuncs.cds.transform.v20170925;

import com.aliyuncs.cds.model.v20170925.GetJobResponse;
import com.aliyuncs.cds.model.v20170925.GetJobResponse.LastFailedBuild;
import com.aliyuncs.cds.model.v20170925.GetJobResponse.LastSuccessfulBuild;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext context) {
		
		getJobResponse.setRequestId(context.stringValue("GetJobResponse.RequestId"));
		getJobResponse.setJobName(context.stringValue("GetJobResponse.JobName"));
		getJobResponse.setSuccessRate(context.floatValue("GetJobResponse.SuccessRate"));
		getJobResponse.setTotalBuilds(context.integerValue("GetJobResponse.TotalBuilds"));

		LastSuccessfulBuild lastSuccessfulBuild = new LastSuccessfulBuild();
		lastSuccessfulBuild.setBuildEnv(context.stringValue("GetJobResponse.LastSuccessfulBuild.BuildEnv"));
		lastSuccessfulBuild.setBuildNumber(context.stringValue("GetJobResponse.LastSuccessfulBuild.BuildNumber"));
		lastSuccessfulBuild.setDuration(context.integerValue("GetJobResponse.LastSuccessfulBuild.Duration"));
		lastSuccessfulBuild.setLog(context.stringValue("GetJobResponse.LastSuccessfulBuild.Log"));
		lastSuccessfulBuild.setStartTime(context.longValue("GetJobResponse.LastSuccessfulBuild.StartTime"));
		getJobResponse.setLastSuccessfulBuild(lastSuccessfulBuild);

		LastFailedBuild lastFailedBuild = new LastFailedBuild();
		lastFailedBuild.setBuildEnv(context.stringValue("GetJobResponse.LastFailedBuild.BuildEnv"));
		lastFailedBuild.setBuildNumber(context.stringValue("GetJobResponse.LastFailedBuild.BuildNumber"));
		lastFailedBuild.setDuration(context.integerValue("GetJobResponse.LastFailedBuild.Duration"));
		lastFailedBuild.setLog(context.stringValue("GetJobResponse.LastFailedBuild.Log"));
		lastFailedBuild.setStartTime(context.longValue("GetJobResponse.LastFailedBuild.StartTime"));
		getJobResponse.setLastFailedBuild(lastFailedBuild);
	 
	 	return getJobResponse;
	}
}