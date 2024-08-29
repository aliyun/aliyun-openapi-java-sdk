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

import com.aliyuncs.outboundbot.model.v20191226.SaveAnnotationMissionTagInfoListResponse;
import com.aliyuncs.outboundbot.model.v20191226.SaveAnnotationMissionTagInfoListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveAnnotationMissionTagInfoListResponseUnmarshaller {

	public static SaveAnnotationMissionTagInfoListResponse unmarshall(SaveAnnotationMissionTagInfoListResponse saveAnnotationMissionTagInfoListResponse, UnmarshallerContext _ctx) {
		
		saveAnnotationMissionTagInfoListResponse.setRequestId(_ctx.stringValue("SaveAnnotationMissionTagInfoListResponse.RequestId"));
		saveAnnotationMissionTagInfoListResponse.setSuccess(_ctx.booleanValue("SaveAnnotationMissionTagInfoListResponse.Success"));
		saveAnnotationMissionTagInfoListResponse.setCode(_ctx.stringValue("SaveAnnotationMissionTagInfoListResponse.Code"));
		saveAnnotationMissionTagInfoListResponse.setMessage(_ctx.stringValue("SaveAnnotationMissionTagInfoListResponse.Message"));
		saveAnnotationMissionTagInfoListResponse.setHttpStatusCode(_ctx.integerValue("SaveAnnotationMissionTagInfoListResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("SaveAnnotationMissionTagInfoListResponse.Data.Success"));
		data.setExecCount(_ctx.integerValue("SaveAnnotationMissionTagInfoListResponse.Data.ExecCount"));
		data.setMessage(_ctx.stringValue("SaveAnnotationMissionTagInfoListResponse.Data.Message"));
		saveAnnotationMissionTagInfoListResponse.setData(data);
	 
	 	return saveAnnotationMissionTagInfoListResponse;
	}
}