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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.GetJobResponse;
import com.aliyuncs.paistudio.model.v20201123.GetJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext _ctx) {
		
		getJobResponse.setRequestId(_ctx.stringValue("GetJobResponse.RequestId"));
		getJobResponse.setMessage(_ctx.stringValue("GetJobResponse.Message"));
		getJobResponse.setCode(_ctx.stringValue("GetJobResponse.Code"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("GetJobResponse.Data.JobId"));
		data.setExperimentId(_ctx.stringValue("GetJobResponse.Data.ExperimentId"));
		data.setCreator(_ctx.stringValue("GetJobResponse.Data.Creator"));
		data.setCreateTime(_ctx.stringValue("GetJobResponse.Data.CreateTime"));
		data.setExecuteType(_ctx.stringValue("GetJobResponse.Data.ExecuteType"));
		data.setAnchorNodeId(_ctx.stringValue("GetJobResponse.Data.AnchorNodeId"));
		data.setRunId(_ctx.stringValue("GetJobResponse.Data.RunId"));
		data.setStatus(_ctx.stringValue("GetJobResponse.Data.Status"));
		data.setSnapshot(_ctx.stringValue("GetJobResponse.Data.Snapshot"));
		getJobResponse.setData(data);
	 
	 	return getJobResponse;
	}
}