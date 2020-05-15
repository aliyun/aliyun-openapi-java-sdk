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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinktDeleteworkflowstatusResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinktDeleteworkflowstatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeLinktDeleteworkflowstatusResponseUnmarshaller {

	public static CheckLinkeLinktDeleteworkflowstatusResponse unmarshall(CheckLinkeLinktDeleteworkflowstatusResponse checkLinkeLinktDeleteworkflowstatusResponse, UnmarshallerContext _ctx) {
		
		checkLinkeLinktDeleteworkflowstatusResponse.setRequestId(_ctx.stringValue("CheckLinkeLinktDeleteworkflowstatusResponse.RequestId"));
		checkLinkeLinktDeleteworkflowstatusResponse.setResultCode(_ctx.stringValue("CheckLinkeLinktDeleteworkflowstatusResponse.ResultCode"));
		checkLinkeLinktDeleteworkflowstatusResponse.setResultMessage(_ctx.stringValue("CheckLinkeLinktDeleteworkflowstatusResponse.ResultMessage"));
		checkLinkeLinktDeleteworkflowstatusResponse.setErrorCode(_ctx.longValue("CheckLinkeLinktDeleteworkflowstatusResponse.ErrorCode"));
		checkLinkeLinktDeleteworkflowstatusResponse.setErrorMessage(_ctx.stringValue("CheckLinkeLinktDeleteworkflowstatusResponse.ErrorMessage"));
		checkLinkeLinktDeleteworkflowstatusResponse.setSuccess(_ctx.booleanValue("CheckLinkeLinktDeleteworkflowstatusResponse.Success"));

		Data data = new Data();
		data.setCheckSuccess(_ctx.booleanValue("CheckLinkeLinktDeleteworkflowstatusResponse.Data.CheckSuccess"));
		data.setErrorCode(_ctx.longValue("CheckLinkeLinktDeleteworkflowstatusResponse.Data.ErrorCode"));
		data.setWorkItemCount(_ctx.longValue("CheckLinkeLinktDeleteworkflowstatusResponse.Data.WorkItemCount"));
		checkLinkeLinktDeleteworkflowstatusResponse.setData(data);
	 
	 	return checkLinkeLinktDeleteworkflowstatusResponse;
	}
}