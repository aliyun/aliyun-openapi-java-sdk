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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetTSMiddlewareInstanceResponse;
import com.aliyuncs.sofa.model.v20190815.GetTSMiddlewareInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTSMiddlewareInstanceResponseUnmarshaller {

	public static GetTSMiddlewareInstanceResponse unmarshall(GetTSMiddlewareInstanceResponse getTSMiddlewareInstanceResponse, UnmarshallerContext _ctx) {
		
		getTSMiddlewareInstanceResponse.setRequestId(_ctx.stringValue("GetTSMiddlewareInstanceResponse.RequestId"));
		getTSMiddlewareInstanceResponse.setResultCode(_ctx.stringValue("GetTSMiddlewareInstanceResponse.ResultCode"));
		getTSMiddlewareInstanceResponse.setResultMessage(_ctx.stringValue("GetTSMiddlewareInstanceResponse.ResultMessage"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetTSMiddlewareInstanceResponse.Data.InstanceId"));
		data.setProjectName(_ctx.stringValue("GetTSMiddlewareInstanceResponse.Data.ProjectName"));
		data.setWorkspaceName(_ctx.stringValue("GetTSMiddlewareInstanceResponse.Data.WorkspaceName"));
		getTSMiddlewareInstanceResponse.setData(data);
	 
	 	return getTSMiddlewareInstanceResponse;
	}
}