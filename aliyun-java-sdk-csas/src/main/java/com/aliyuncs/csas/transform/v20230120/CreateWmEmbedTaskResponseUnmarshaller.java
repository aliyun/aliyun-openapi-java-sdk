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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.CreateWmEmbedTaskResponse;
import com.aliyuncs.csas.model.v20230120.CreateWmEmbedTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWmEmbedTaskResponseUnmarshaller {

	public static CreateWmEmbedTaskResponse unmarshall(CreateWmEmbedTaskResponse createWmEmbedTaskResponse, UnmarshallerContext _ctx) {
		
		createWmEmbedTaskResponse.setRequestId(_ctx.stringValue("CreateWmEmbedTaskResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("CreateWmEmbedTaskResponse.Data.TaskId"));
		data.setInFileHashMd5(_ctx.stringValue("CreateWmEmbedTaskResponse.Data.InFileHashMd5"));
		data.setInFileSize(_ctx.stringValue("CreateWmEmbedTaskResponse.Data.InFileSize"));
		createWmEmbedTaskResponse.setData(data);
	 
	 	return createWmEmbedTaskResponse;
	}
}