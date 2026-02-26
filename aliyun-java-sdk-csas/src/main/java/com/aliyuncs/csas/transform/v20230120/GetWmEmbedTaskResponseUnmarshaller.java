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

import com.aliyuncs.csas.model.v20230120.GetWmEmbedTaskResponse;
import com.aliyuncs.csas.model.v20230120.GetWmEmbedTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWmEmbedTaskResponseUnmarshaller {

	public static GetWmEmbedTaskResponse unmarshall(GetWmEmbedTaskResponse getWmEmbedTaskResponse, UnmarshallerContext _ctx) {
		
		getWmEmbedTaskResponse.setRequestId(_ctx.stringValue("GetWmEmbedTaskResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("GetWmEmbedTaskResponse.Data.TaskId"));
		data.setTaskStatus(_ctx.stringValue("GetWmEmbedTaskResponse.Data.TaskStatus"));
		data.setFileUrl(_ctx.stringValue("GetWmEmbedTaskResponse.Data.FileUrl"));
		data.setFileUrlExp(_ctx.stringValue("GetWmEmbedTaskResponse.Data.FileUrlExp"));
		data.setFilename(_ctx.stringValue("GetWmEmbedTaskResponse.Data.Filename"));
		data.setOutFileHashMd5(_ctx.stringValue("GetWmEmbedTaskResponse.Data.OutFileHashMd5"));
		data.setOutFileSize(_ctx.longValue("GetWmEmbedTaskResponse.Data.OutFileSize"));
		getWmEmbedTaskResponse.setData(data);
	 
	 	return getWmEmbedTaskResponse;
	}
}