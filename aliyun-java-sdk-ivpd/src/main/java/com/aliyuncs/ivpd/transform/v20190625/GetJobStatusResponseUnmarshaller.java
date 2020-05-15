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

package com.aliyuncs.ivpd.transform.v20190625;

import com.aliyuncs.ivpd.model.v20190625.GetJobStatusResponse;
import com.aliyuncs.ivpd.model.v20190625.GetJobStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobStatusResponseUnmarshaller {

	public static GetJobStatusResponse unmarshall(GetJobStatusResponse getJobStatusResponse, UnmarshallerContext _ctx) {
		
		getJobStatusResponse.setRequestId(_ctx.stringValue("GetJobStatusResponse.RequestId"));
		getJobStatusResponse.setCode(_ctx.stringValue("GetJobStatusResponse.Code"));
		getJobStatusResponse.setMessage(_ctx.stringValue("GetJobStatusResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetJobStatusResponse.Data.Status"));
		data.setBatchSize(_ctx.stringValue("GetJobStatusResponse.Data.BatchSize"));
		data.setFinish(_ctx.booleanValue("GetJobStatusResponse.Data.Finish"));
		data.setProgress(_ctx.floatValue("GetJobStatusResponse.Data.Progress"));
		data.setMessage(_ctx.stringValue("GetJobStatusResponse.Data.Message"));
		data.setCompleted(_ctx.booleanValue("GetJobStatusResponse.Data.Completed"));
		data.setTimeToLive(_ctx.integerValue("GetJobStatusResponse.Data.TimeToLive"));
		data.setTotalUsedTime(_ctx.longValue("GetJobStatusResponse.Data.TotalUsedTime"));
		getJobStatusResponse.setData(data);
	 
	 	return getJobStatusResponse;
	}
}