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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.QueryScriptWaveformsResponse;
import com.aliyuncs.outboundbot.model.v20191226.QueryScriptWaveformsResponse.ScriptWaveform;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryScriptWaveformsResponseUnmarshaller {

	public static QueryScriptWaveformsResponse unmarshall(QueryScriptWaveformsResponse queryScriptWaveformsResponse, UnmarshallerContext _ctx) {
		
		queryScriptWaveformsResponse.setRequestId(_ctx.stringValue("QueryScriptWaveformsResponse.RequestId"));
		queryScriptWaveformsResponse.setSuccess(_ctx.booleanValue("QueryScriptWaveformsResponse.Success"));
		queryScriptWaveformsResponse.setCode(_ctx.stringValue("QueryScriptWaveformsResponse.Code"));
		queryScriptWaveformsResponse.setMessage(_ctx.stringValue("QueryScriptWaveformsResponse.Message"));
		queryScriptWaveformsResponse.setHttpStatusCode(_ctx.integerValue("QueryScriptWaveformsResponse.HttpStatusCode"));

		List<ScriptWaveform> scriptWaveforms = new ArrayList<ScriptWaveform>();
		for (int i = 0; i < _ctx.lengthValue("QueryScriptWaveformsResponse.ScriptWaveforms.Length"); i++) {
			ScriptWaveform scriptWaveform = new ScriptWaveform();
			scriptWaveform.setScriptWaveformId(_ctx.stringValue("QueryScriptWaveformsResponse.ScriptWaveforms["+ i +"].ScriptWaveformId"));
			scriptWaveform.setScriptId(_ctx.stringValue("QueryScriptWaveformsResponse.ScriptWaveforms["+ i +"].ScriptId"));
			scriptWaveform.setScriptContent(_ctx.stringValue("QueryScriptWaveformsResponse.ScriptWaveforms["+ i +"].ScriptContent"));
			scriptWaveform.setFileId(_ctx.stringValue("QueryScriptWaveformsResponse.ScriptWaveforms["+ i +"].FileId"));
			scriptWaveform.setFileName(_ctx.stringValue("QueryScriptWaveformsResponse.ScriptWaveforms["+ i +"].FileName"));

			scriptWaveforms.add(scriptWaveform);
		}
		queryScriptWaveformsResponse.setScriptWaveforms(scriptWaveforms);
	 
	 	return queryScriptWaveformsResponse;
	}
}