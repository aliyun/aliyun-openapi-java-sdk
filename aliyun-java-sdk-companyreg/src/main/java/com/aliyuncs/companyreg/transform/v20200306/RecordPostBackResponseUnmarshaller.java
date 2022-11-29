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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.RecordPostBackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecordPostBackResponseUnmarshaller {

	public static RecordPostBackResponse unmarshall(RecordPostBackResponse recordPostBackResponse, UnmarshallerContext _ctx) {
		
		recordPostBackResponse.setRequestId(_ctx.stringValue("RecordPostBackResponse.RequestId"));
		recordPostBackResponse.setHttpStatusCode(_ctx.integerValue("RecordPostBackResponse.HttpStatusCode"));
		recordPostBackResponse.setDynamicCode(_ctx.stringValue("RecordPostBackResponse.DynamicCode"));
		recordPostBackResponse.setDynamicMessage(_ctx.stringValue("RecordPostBackResponse.DynamicMessage"));
		recordPostBackResponse.setErrorMsg(_ctx.stringValue("RecordPostBackResponse.ErrorMsg"));
		recordPostBackResponse.setErrorCode(_ctx.stringValue("RecordPostBackResponse.ErrorCode"));
		recordPostBackResponse.setSuccess(_ctx.booleanValue("RecordPostBackResponse.Success"));
		recordPostBackResponse.setModule(_ctx.booleanValue("RecordPostBackResponse.Module"));
		recordPostBackResponse.setAllowRetry(_ctx.booleanValue("RecordPostBackResponse.AllowRetry"));
		recordPostBackResponse.setAppName(_ctx.stringValue("RecordPostBackResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecordPostBackResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RecordPostBackResponse.ErrorArgs["+ i +"]"));
		}
		recordPostBackResponse.setErrorArgs(errorArgs);
	 
	 	return recordPostBackResponse;
	}
}