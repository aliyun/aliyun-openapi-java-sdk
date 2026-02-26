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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.GetFlowJSONAssestResponse;
import com.aliyuncs.cams.model.v20200606.GetFlowJSONAssestResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowJSONAssestResponseUnmarshaller {

	public static GetFlowJSONAssestResponse unmarshall(GetFlowJSONAssestResponse getFlowJSONAssestResponse, UnmarshallerContext _ctx) {
		
		getFlowJSONAssestResponse.setRequestId(_ctx.stringValue("GetFlowJSONAssestResponse.RequestId"));
		getFlowJSONAssestResponse.setCode(_ctx.stringValue("GetFlowJSONAssestResponse.Code"));
		getFlowJSONAssestResponse.setMessage(_ctx.stringValue("GetFlowJSONAssestResponse.Message"));

		Data data = new Data();
		data.setFlowId(_ctx.stringValue("GetFlowJSONAssestResponse.Data.FlowId"));
		data.setFilePath(_ctx.stringValue("GetFlowJSONAssestResponse.Data.FilePath"));
		getFlowJSONAssestResponse.setData(data);
	 
	 	return getFlowJSONAssestResponse;
	}
}