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

import com.aliyuncs.csas.model.v20230120.GetWmExtractTaskResponse;
import com.aliyuncs.csas.model.v20230120.GetWmExtractTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWmExtractTaskResponseUnmarshaller {

	public static GetWmExtractTaskResponse unmarshall(GetWmExtractTaskResponse getWmExtractTaskResponse, UnmarshallerContext _ctx) {
		
		getWmExtractTaskResponse.setRequestId(_ctx.stringValue("GetWmExtractTaskResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetWmExtractTaskResponse.Data.CreateTime"));
		data.setTaskId(_ctx.stringValue("GetWmExtractTaskResponse.Data.TaskId"));
		data.setStatus(_ctx.stringValue("GetWmExtractTaskResponse.Data.Status"));
		data.setFilename(_ctx.stringValue("GetWmExtractTaskResponse.Data.Filename"));
		data.setWmType(_ctx.stringValue("GetWmExtractTaskResponse.Data.WmType"));
		data.setWmInfoSize(_ctx.longValue("GetWmExtractTaskResponse.Data.WmInfoSize"));
		data.setWmInfoUint(_ctx.longValue("GetWmExtractTaskResponse.Data.WmInfoUint"));
		data.setWmInfoBytesB64(_ctx.stringValue("GetWmExtractTaskResponse.Data.WmInfoBytesB64"));
		getWmExtractTaskResponse.setData(data);
	 
	 	return getWmExtractTaskResponse;
	}
}