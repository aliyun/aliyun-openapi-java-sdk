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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetDocIndexTaskResponse;
import com.aliyuncs.imm.model.v20170906.GetDocIndexTaskResponse.FailDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocIndexTaskResponseUnmarshaller {

	public static GetDocIndexTaskResponse unmarshall(GetDocIndexTaskResponse getDocIndexTaskResponse, UnmarshallerContext context) {
		
		getDocIndexTaskResponse.setRequestId(context.stringValue("GetDocIndexTaskResponse.RequestId"));
		getDocIndexTaskResponse.setStatus(context.stringValue("GetDocIndexTaskResponse.Status"));
		getDocIndexTaskResponse.setTaskId(context.stringValue("GetDocIndexTaskResponse.TaskId"));
		getDocIndexTaskResponse.setCreateTime(context.stringValue("GetDocIndexTaskResponse.CreateTime"));
		getDocIndexTaskResponse.setFinishTime(context.stringValue("GetDocIndexTaskResponse.FinishTime"));

		FailDetail failDetail = new FailDetail();
		failDetail.setCode(context.stringValue("GetDocIndexTaskResponse.FailDetail.Code"));
		getDocIndexTaskResponse.setFailDetail(failDetail);
	 
	 	return getDocIndexTaskResponse;
	}
}