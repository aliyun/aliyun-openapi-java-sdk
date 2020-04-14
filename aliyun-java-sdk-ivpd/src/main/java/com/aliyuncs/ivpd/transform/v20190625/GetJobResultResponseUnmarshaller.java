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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.GetJobResultResponse;
import com.aliyuncs.ivpd.model.v20190625.GetJobResultResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResultResponseUnmarshaller {

	public static GetJobResultResponse unmarshall(GetJobResultResponse getJobResultResponse, UnmarshallerContext _ctx) {
		
		getJobResultResponse.setRequestId(_ctx.stringValue("GetJobResultResponse.RequestId"));
		getJobResultResponse.setCode(_ctx.stringValue("GetJobResultResponse.Code"));
		getJobResultResponse.setMessage(_ctx.stringValue("GetJobResultResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetJobResultResponse.Data.Status"));
		data.setBatchSize(_ctx.stringValue("GetJobResultResponse.Data.BatchSize"));
		data.setFinish(_ctx.booleanValue("GetJobResultResponse.Data.Finish"));
		data.setProgress(_ctx.floatValue("GetJobResultResponse.Data.Progress"));
		data.setMessage(_ctx.stringValue("GetJobResultResponse.Data.Message"));
		data.setCompleted(_ctx.booleanValue("GetJobResultResponse.Data.Completed"));
		data.setTotalUsedTime(_ctx.longValue("GetJobResultResponse.Data.TotalUsedTime"));

		List<Map<Object, Object>> resultList = _ctx.listMapValue("GetJobResultResponse.Data.ResultList");
		data.setResultList(resultList);
		getJobResultResponse.setData(data);
	 
	 	return getJobResultResponse;
	}
}