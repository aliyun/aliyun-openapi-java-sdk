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

import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeContentResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeContentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalNodeContentResponseUnmarshaller {

	public static GetPhysicalNodeContentResponse unmarshall(GetPhysicalNodeContentResponse getPhysicalNodeContentResponse, UnmarshallerContext _ctx) {
		
		getPhysicalNodeContentResponse.setRequestId(_ctx.stringValue("GetPhysicalNodeContentResponse.RequestId"));
		getPhysicalNodeContentResponse.setSuccess(_ctx.booleanValue("GetPhysicalNodeContentResponse.Success"));
		getPhysicalNodeContentResponse.setHttpStatusCode(_ctx.integerValue("GetPhysicalNodeContentResponse.HttpStatusCode"));
		getPhysicalNodeContentResponse.setCode(_ctx.stringValue("GetPhysicalNodeContentResponse.Code"));
		getPhysicalNodeContentResponse.setMessage(_ctx.stringValue("GetPhysicalNodeContentResponse.Message"));

		Data data = new Data();
		data.setNodeId(_ctx.stringValue("GetPhysicalNodeContentResponse.Data.NodeId"));
		data.setNodeName(_ctx.stringValue("GetPhysicalNodeContentResponse.Data.NodeName"));
		data.setCodeContent(_ctx.stringValue("GetPhysicalNodeContentResponse.Data.CodeContent"));
		getPhysicalNodeContentResponse.setData(data);
	 
	 	return getPhysicalNodeContentResponse;
	}
}