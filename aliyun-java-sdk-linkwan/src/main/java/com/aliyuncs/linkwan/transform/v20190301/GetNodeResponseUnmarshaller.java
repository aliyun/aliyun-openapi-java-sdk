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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.GetNodeResponse;
import com.aliyuncs.linkwan.model.v20190301.GetNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeResponseUnmarshaller {

	public static GetNodeResponse unmarshall(GetNodeResponse getNodeResponse, UnmarshallerContext _ctx) {
		
		getNodeResponse.setRequestId(_ctx.stringValue("GetNodeResponse.RequestId"));
		getNodeResponse.setSuccess(_ctx.booleanValue("GetNodeResponse.Success"));

		Data data = new Data();
		data.setDevEui(_ctx.stringValue("GetNodeResponse.Data.DevEui"));
		data.setDevAddr(_ctx.stringValue("GetNodeResponse.Data.DevAddr"));
		data.setClassMode(_ctx.stringValue("GetNodeResponse.Data.ClassMode"));
		data.setLastJoinMillis(_ctx.longValue("GetNodeResponse.Data.LastJoinMillis"));
		data.setBoundMillis(_ctx.longValue("GetNodeResponse.Data.BoundMillis"));
		data.setAuthTypes(_ctx.stringValue("GetNodeResponse.Data.AuthTypes"));
		getNodeResponse.setData(data);
	 
	 	return getNodeResponse;
	}
}