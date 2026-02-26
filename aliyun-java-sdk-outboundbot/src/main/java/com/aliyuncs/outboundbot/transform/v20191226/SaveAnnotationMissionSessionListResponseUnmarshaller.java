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

import com.aliyuncs.outboundbot.model.v20191226.SaveAnnotationMissionSessionListResponse;
import com.aliyuncs.outboundbot.model.v20191226.SaveAnnotationMissionSessionListResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.SaveAnnotationMissionSessionListResponse.Data.SaveAnnotationMissionSessionListRequest;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveAnnotationMissionSessionListResponseUnmarshaller {

	public static SaveAnnotationMissionSessionListResponse unmarshall(SaveAnnotationMissionSessionListResponse saveAnnotationMissionSessionListResponse, UnmarshallerContext _ctx) {
		
		saveAnnotationMissionSessionListResponse.setRequestId(_ctx.stringValue("SaveAnnotationMissionSessionListResponse.RequestId"));
		saveAnnotationMissionSessionListResponse.setSuccess(_ctx.booleanValue("SaveAnnotationMissionSessionListResponse.Success"));
		saveAnnotationMissionSessionListResponse.setCode(_ctx.stringValue("SaveAnnotationMissionSessionListResponse.Code"));
		saveAnnotationMissionSessionListResponse.setMessage(_ctx.stringValue("SaveAnnotationMissionSessionListResponse.Message"));
		saveAnnotationMissionSessionListResponse.setHttpStatusCode(_ctx.integerValue("SaveAnnotationMissionSessionListResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("SaveAnnotationMissionSessionListResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("SaveAnnotationMissionSessionListResponse.Data.Message"));

		List<String> messageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveAnnotationMissionSessionListResponse.Data.MessageList.Length"); i++) {
			messageList.add(_ctx.stringValue("SaveAnnotationMissionSessionListResponse.Data.MessageList["+ i +"]"));
		}
		data.setMessageList(messageList);

		SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest = new SaveAnnotationMissionSessionListRequest();
		saveAnnotationMissionSessionListRequest.setAnnotationMissionSessionListJsonString(_ctx.stringValue("SaveAnnotationMissionSessionListResponse.Data.SaveAnnotationMissionSessionListRequest.AnnotationMissionSessionListJsonString"));
		data.setSaveAnnotationMissionSessionListRequest(saveAnnotationMissionSessionListRequest);
		saveAnnotationMissionSessionListResponse.setData(data);
	 
	 	return saveAnnotationMissionSessionListResponse;
	}
}