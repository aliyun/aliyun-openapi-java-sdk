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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackJobDegreeResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackJobDegreeResponse.JobDegree;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataTrackJobDegreeResponseUnmarshaller {

	public static GetDataTrackJobDegreeResponse unmarshall(GetDataTrackJobDegreeResponse getDataTrackJobDegreeResponse, UnmarshallerContext _ctx) {
		
		getDataTrackJobDegreeResponse.setRequestId(_ctx.stringValue("GetDataTrackJobDegreeResponse.RequestId"));
		getDataTrackJobDegreeResponse.setSuccess(_ctx.booleanValue("GetDataTrackJobDegreeResponse.Success"));
		getDataTrackJobDegreeResponse.setErrorMessage(_ctx.stringValue("GetDataTrackJobDegreeResponse.ErrorMessage"));
		getDataTrackJobDegreeResponse.setErrorCode(_ctx.stringValue("GetDataTrackJobDegreeResponse.ErrorCode"));

		JobDegree jobDegree = new JobDegree();
		jobDegree.setListCompletionDegree(_ctx.doubleValue("GetDataTrackJobDegreeResponse.JobDegree.ListCompletionDegree"));
		jobDegree.setDownloadCompletionDegree(_ctx.doubleValue("GetDataTrackJobDegreeResponse.JobDegree.DownloadCompletionDegree"));
		jobDegree.setFilterCompletionDegree(_ctx.doubleValue("GetDataTrackJobDegreeResponse.JobDegree.FilterCompletionDegree"));
		jobDegree.setJobStatus(_ctx.stringValue("GetDataTrackJobDegreeResponse.JobDegree.JobStatus"));
		jobDegree.setStatusDesc(_ctx.stringValue("GetDataTrackJobDegreeResponse.JobDegree.StatusDesc"));
		getDataTrackJobDegreeResponse.setJobDegree(jobDegree);
	 
	 	return getDataTrackJobDegreeResponse;
	}
}