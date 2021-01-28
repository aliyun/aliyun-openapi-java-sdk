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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.ExecuteNodeResponse;
import com.aliyuncs.linkedmall.model.v20180116.ExecuteNodeResponse.Model;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteNodeResponseUnmarshaller {

	public static ExecuteNodeResponse unmarshall(ExecuteNodeResponse executeNodeResponse, UnmarshallerContext _ctx) {
		
		executeNodeResponse.setRequestId(_ctx.stringValue("ExecuteNodeResponse.RequestId"));
		executeNodeResponse.setCode(_ctx.stringValue("ExecuteNodeResponse.Code"));
		executeNodeResponse.setMessage(_ctx.stringValue("ExecuteNodeResponse.Message"));
		executeNodeResponse.setSubCode(_ctx.stringValue("ExecuteNodeResponse.SubCode"));
		executeNodeResponse.setSubMessage(_ctx.stringValue("ExecuteNodeResponse.SubMessage"));
		executeNodeResponse.setLogsId(_ctx.stringValue("ExecuteNodeResponse.LogsId"));
		executeNodeResponse.setSuccess(_ctx.booleanValue("ExecuteNodeResponse.Success"));
		executeNodeResponse.setTotalCount(_ctx.longValue("ExecuteNodeResponse.TotalCount"));

		Model model = new Model();
		model.setProcessInstanceId(_ctx.stringValue("ExecuteNodeResponse.Model.ProcessInstanceId"));
		model.setResponseData(_ctx.mapValue("ExecuteNodeResponse.Model.ResponseData"));
		executeNodeResponse.setModel(model);
	 
	 	return executeNodeResponse;
	}
}