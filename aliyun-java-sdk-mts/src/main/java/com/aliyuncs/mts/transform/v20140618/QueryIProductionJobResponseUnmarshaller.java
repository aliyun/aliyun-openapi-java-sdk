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

import com.aliyuncs.mts.model.v20140618.QueryIProductionJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIProductionJobResponseUnmarshaller {

	public static QueryIProductionJobResponse unmarshall(QueryIProductionJobResponse queryIProductionJobResponse, UnmarshallerContext _ctx) {
		
		queryIProductionJobResponse.setRequestId(_ctx.stringValue("QueryIProductionJobResponse.RequestId"));
		queryIProductionJobResponse.setFunctionName(_ctx.stringValue("QueryIProductionJobResponse.FunctionName"));
		queryIProductionJobResponse.setInput(_ctx.stringValue("QueryIProductionJobResponse.Input"));
		queryIProductionJobResponse.setUserData(_ctx.stringValue("QueryIProductionJobResponse.UserData"));
		queryIProductionJobResponse.setState(_ctx.stringValue("QueryIProductionJobResponse.State"));
		queryIProductionJobResponse.setOutput(_ctx.stringValue("QueryIProductionJobResponse.Output"));
		queryIProductionJobResponse.setPipelineId(_ctx.stringValue("QueryIProductionJobResponse.PipelineId"));
		queryIProductionJobResponse.setJobParams(_ctx.stringValue("QueryIProductionJobResponse.JobParams"));
		queryIProductionJobResponse.setJobId(_ctx.stringValue("QueryIProductionJobResponse.JobId"));
		queryIProductionJobResponse.setResult(_ctx.stringValue("QueryIProductionJobResponse.Result"));
	 
	 	return queryIProductionJobResponse;
	}
}