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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.CreateTagTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CreateTagTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTagTaskResponseUnmarshaller {

	public static CreateTagTaskResponse unmarshall(CreateTagTaskResponse createTagTaskResponse, UnmarshallerContext _ctx) {
		
		createTagTaskResponse.setRequestId(_ctx.stringValue("CreateTagTaskResponse.RequestId"));
		createTagTaskResponse.setMessage(_ctx.stringValue("CreateTagTaskResponse.Message"));
		createTagTaskResponse.setCode(_ctx.stringValue("CreateTagTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateTagTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("CreateTagTaskResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("CreateTagTaskResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("CreateTagTaskResponse.Data.Description"));
		data.setLabelType(_ctx.stringValue("CreateTagTaskResponse.Data.LabelType"));
		data.setStatus(_ctx.stringValue("CreateTagTaskResponse.Data.Status"));
		createTagTaskResponse.setData(data);
	 
	 	return createTagTaskResponse;
	}
}