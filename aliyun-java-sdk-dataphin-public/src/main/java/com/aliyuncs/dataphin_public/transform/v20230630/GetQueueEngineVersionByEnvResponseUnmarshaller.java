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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetQueueEngineVersionByEnvResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueEngineVersionByEnvResponseUnmarshaller {

	public static GetQueueEngineVersionByEnvResponse unmarshall(GetQueueEngineVersionByEnvResponse getQueueEngineVersionByEnvResponse, UnmarshallerContext _ctx) {
		
		getQueueEngineVersionByEnvResponse.setRequestId(_ctx.stringValue("GetQueueEngineVersionByEnvResponse.RequestId"));
		getQueueEngineVersionByEnvResponse.setSuccess(_ctx.booleanValue("GetQueueEngineVersionByEnvResponse.Success"));
		getQueueEngineVersionByEnvResponse.setHttpStatusCode(_ctx.integerValue("GetQueueEngineVersionByEnvResponse.HttpStatusCode"));
		getQueueEngineVersionByEnvResponse.setCode(_ctx.stringValue("GetQueueEngineVersionByEnvResponse.Code"));
		getQueueEngineVersionByEnvResponse.setMessage(_ctx.stringValue("GetQueueEngineVersionByEnvResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQueueEngineVersionByEnvResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetQueueEngineVersionByEnvResponse.Data["+ i +"]"));
		}
		getQueueEngineVersionByEnvResponse.setData(data);
	 
	 	return getQueueEngineVersionByEnvResponse;
	}
}