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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetRequestDiagnosisResultResponse;
import com.aliyuncs.das.model.v20200116.GetRequestDiagnosisResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRequestDiagnosisResultResponseUnmarshaller {

	public static GetRequestDiagnosisResultResponse unmarshall(GetRequestDiagnosisResultResponse getRequestDiagnosisResultResponse, UnmarshallerContext _ctx) {
		
		getRequestDiagnosisResultResponse.setRequestId(_ctx.stringValue("GetRequestDiagnosisResultResponse.RequestId"));
		getRequestDiagnosisResultResponse.setMessage(_ctx.stringValue("GetRequestDiagnosisResultResponse.Message"));
		getRequestDiagnosisResultResponse.setCode(_ctx.stringValue("GetRequestDiagnosisResultResponse.Code"));
		getRequestDiagnosisResultResponse.setSuccess(_ctx.stringValue("GetRequestDiagnosisResultResponse.Success"));

		Data data = new Data();
		data.setMessageId(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.messageId"));
		data.setUuid(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.uuid"));
		data.setAccountId(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.accountId"));
		data.setSqlId(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.sqlId"));
		data.setEngine(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.engine"));
		data.setDbSchema(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.dbSchema"));
		data.setParam(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.param"));
		data.setState(_ctx.integerValue("GetRequestDiagnosisResultResponse.Data.state"));
		data.setResult(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.result"));
		data.setGmtCreate(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.gmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetRequestDiagnosisResultResponse.Data.gmtModified"));
		getRequestDiagnosisResultResponse.setData(data);
	 
	 	return getRequestDiagnosisResultResponse;
	}
}