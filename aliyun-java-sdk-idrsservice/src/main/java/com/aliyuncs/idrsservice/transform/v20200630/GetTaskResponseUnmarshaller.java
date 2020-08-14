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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.GetTaskResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setCode(_ctx.stringValue("GetTaskResponse.Code"));
		getTaskResponse.setMessage(_ctx.stringValue("GetTaskResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("GetTaskResponse.Data.CreatedAt"));
		data.setId(_ctx.stringValue("GetTaskResponse.Data.Id"));
		data.setStatus(_ctx.stringValue("GetTaskResponse.Data.Status"));
		data.setVideoUrl(_ctx.stringValue("GetTaskResponse.Data.VideoUrl"));
		getTaskResponse.setData(data);
	 
	 	return getTaskResponse;
	}
}