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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetServerStatusAndActionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerStatusAndActionResponseUnmarshaller {

	public static GetServerStatusAndActionResponse unmarshall(GetServerStatusAndActionResponse getServerStatusAndActionResponse, UnmarshallerContext _ctx) {
		
		getServerStatusAndActionResponse.setRequestId(_ctx.stringValue("GetServerStatusAndActionResponse.RequestId"));
		getServerStatusAndActionResponse.setIsSuccess(_ctx.booleanValue("GetServerStatusAndActionResponse.IsSuccess"));
		getServerStatusAndActionResponse.setActions(_ctx.stringValue("GetServerStatusAndActionResponse.Actions"));
		getServerStatusAndActionResponse.setCode(_ctx.stringValue("GetServerStatusAndActionResponse.Code"));
	 
	 	return getServerStatusAndActionResponse;
	}
}