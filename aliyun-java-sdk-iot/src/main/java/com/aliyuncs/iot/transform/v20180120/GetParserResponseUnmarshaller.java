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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetParserResponse;
import com.aliyuncs.iot.model.v20180120.GetParserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetParserResponseUnmarshaller {

	public static GetParserResponse unmarshall(GetParserResponse getParserResponse, UnmarshallerContext _ctx) {
		
		getParserResponse.setRequestId(_ctx.stringValue("GetParserResponse.RequestId"));
		getParserResponse.setSuccess(_ctx.booleanValue("GetParserResponse.Success"));
		getParserResponse.setCode(_ctx.stringValue("GetParserResponse.Code"));
		getParserResponse.setErrorMessage(_ctx.stringValue("GetParserResponse.ErrorMessage"));

		Data data = new Data();
		data.setParserId(_ctx.longValue("GetParserResponse.Data.ParserId"));
		data.setName(_ctx.stringValue("GetParserResponse.Data.Name"));
		data.setDataSourceId(_ctx.longValue("GetParserResponse.Data.DataSourceId"));
		data.setStatus(_ctx.stringValue("GetParserResponse.Data.Status"));
		data.setUtcCreated(_ctx.stringValue("GetParserResponse.Data.UtcCreated"));
		data.setUtcModified(_ctx.stringValue("GetParserResponse.Data.UtcModified"));
		data.setScriptDraft(_ctx.stringValue("GetParserResponse.Data.ScriptDraft"));
		data.setScript(_ctx.stringValue("GetParserResponse.Data.Script"));
		data.setDescription(_ctx.stringValue("GetParserResponse.Data.Description"));
		getParserResponse.setData(data);
	 
	 	return getParserResponse;
	}
}