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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordRunCodeResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordRunCodeResponse.OperationLogCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationRecordRunCodeResponseUnmarshaller {

	public static GetOperationRecordRunCodeResponse unmarshall(GetOperationRecordRunCodeResponse getOperationRecordRunCodeResponse, UnmarshallerContext _ctx) {
		
		getOperationRecordRunCodeResponse.setRequestId(_ctx.stringValue("GetOperationRecordRunCodeResponse.RequestId"));
		getOperationRecordRunCodeResponse.setSuccess(_ctx.booleanValue("GetOperationRecordRunCodeResponse.Success"));
		getOperationRecordRunCodeResponse.setHttpStatusCode(_ctx.integerValue("GetOperationRecordRunCodeResponse.HttpStatusCode"));
		getOperationRecordRunCodeResponse.setCode(_ctx.stringValue("GetOperationRecordRunCodeResponse.Code"));
		getOperationRecordRunCodeResponse.setMessage(_ctx.stringValue("GetOperationRecordRunCodeResponse.Message"));

		OperationLogCodeResponse operationLogCodeResponse = new OperationLogCodeResponse();
		operationLogCodeResponse.setOperatorId(_ctx.integerValue("GetOperationRecordRunCodeResponse.OperationLogCodeResponse.OperatorId"));
		operationLogCodeResponse.setCode(_ctx.stringValue("GetOperationRecordRunCodeResponse.OperationLogCodeResponse.Code"));
		operationLogCodeResponse.setOperatorName(_ctx.stringValue("GetOperationRecordRunCodeResponse.OperationLogCodeResponse.OperatorName"));
		operationLogCodeResponse.setSqlNum(_ctx.integerValue("GetOperationRecordRunCodeResponse.OperationLogCodeResponse.SqlNum"));
		getOperationRecordRunCodeResponse.setOperationLogCodeResponse(operationLogCodeResponse);
	 
	 	return getOperationRecordRunCodeResponse;
	}
}