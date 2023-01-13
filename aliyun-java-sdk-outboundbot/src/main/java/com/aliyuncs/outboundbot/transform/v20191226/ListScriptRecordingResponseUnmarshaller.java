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

import com.aliyuncs.outboundbot.model.v20191226.ListScriptRecordingResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptRecordingResponse.ScriptRecording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScriptRecordingResponseUnmarshaller {

	public static ListScriptRecordingResponse unmarshall(ListScriptRecordingResponse listScriptRecordingResponse, UnmarshallerContext _ctx) {
		
		listScriptRecordingResponse.setRequestId(_ctx.stringValue("ListScriptRecordingResponse.RequestId"));
		listScriptRecordingResponse.setHttpStatusCode(_ctx.integerValue("ListScriptRecordingResponse.HttpStatusCode"));
		listScriptRecordingResponse.setSuccess(_ctx.booleanValue("ListScriptRecordingResponse.Success"));
		listScriptRecordingResponse.setCode(_ctx.stringValue("ListScriptRecordingResponse.Code"));
		listScriptRecordingResponse.setMessage(_ctx.stringValue("ListScriptRecordingResponse.Message"));
		listScriptRecordingResponse.setPageSize(_ctx.integerValue("ListScriptRecordingResponse.PageSize"));
		listScriptRecordingResponse.setPageNumber(_ctx.integerValue("ListScriptRecordingResponse.PageNumber"));
		listScriptRecordingResponse.setTotalCount(_ctx.longValue("ListScriptRecordingResponse.TotalCount"));

		List<ScriptRecording> scriptRecordings = new ArrayList<ScriptRecording>();
		for (int i = 0; i < _ctx.lengthValue("ListScriptRecordingResponse.ScriptRecordings.Length"); i++) {
			ScriptRecording scriptRecording = new ScriptRecording();
			scriptRecording.setRecordingContent(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].RecordingContent"));
			scriptRecording.setState(_ctx.integerValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].State"));
			scriptRecording.setStorageUuid(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].StorageUuid"));
			scriptRecording.setStateExtend(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].StateExtend"));
			scriptRecording.setInstanceId(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].InstanceId"));
			scriptRecording.setGmtModified(_ctx.longValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].GmtModified"));
			scriptRecording.setScriptId(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].ScriptId"));
			scriptRecording.setUuid(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].Uuid"));
			scriptRecording.setGmtUpload(_ctx.longValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].GmtUpload"));
			scriptRecording.setRecordingDuration(_ctx.integerValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].RecordingDuration"));
			scriptRecording.setRecordingName(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].RecordingName"));
			scriptRecording.setGmtCreate(_ctx.longValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].GmtCreate"));
			scriptRecording.setInnerId(_ctx.stringValue("ListScriptRecordingResponse.ScriptRecordings["+ i +"].InnerId"));

			scriptRecordings.add(scriptRecording);
		}
		listScriptRecordingResponse.setScriptRecordings(scriptRecordings);
	 
	 	return listScriptRecordingResponse;
	}
}