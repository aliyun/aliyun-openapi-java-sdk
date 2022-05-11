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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.ReleaseInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.ReleaseInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseInstanceResponseUnmarshaller {

	public static ReleaseInstanceResponse unmarshall(ReleaseInstanceResponse releaseInstanceResponse, UnmarshallerContext _ctx) {
		
		releaseInstanceResponse.setRequestId(_ctx.stringValue("ReleaseInstanceResponse.RequestId"));
		releaseInstanceResponse.setMessage(_ctx.stringValue("ReleaseInstanceResponse.Message"));
		releaseInstanceResponse.setCode(_ctx.stringValue("ReleaseInstanceResponse.Code"));
		releaseInstanceResponse.setSuccess(_ctx.booleanValue("ReleaseInstanceResponse.Success"));

		Data data = new Data();
		data.setReleaseResult(_ctx.booleanValue("ReleaseInstanceResponse.Data.ReleaseResult"));
		data.setHostId(_ctx.stringValue("ReleaseInstanceResponse.Data.HostId"));
		releaseInstanceResponse.setData(data);
	 
	 	return releaseInstanceResponse;
	}
}