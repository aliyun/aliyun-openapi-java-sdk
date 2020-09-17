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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.ReleaseStoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseStoreResponseUnmarshaller {

	public static ReleaseStoreResponse unmarshall(ReleaseStoreResponse releaseStoreResponse, UnmarshallerContext _ctx) {
		
		releaseStoreResponse.setRequestId(_ctx.stringValue("ReleaseStoreResponse.RequestId"));
		releaseStoreResponse.setMessage(_ctx.stringValue("ReleaseStoreResponse.Message"));
		releaseStoreResponse.setErrorCode(_ctx.stringValue("ReleaseStoreResponse.ErrorCode"));
		releaseStoreResponse.setErrorMessage(_ctx.stringValue("ReleaseStoreResponse.ErrorMessage"));
		releaseStoreResponse.setDynamicMessage(_ctx.stringValue("ReleaseStoreResponse.DynamicMessage"));
		releaseStoreResponse.setSuccess(_ctx.booleanValue("ReleaseStoreResponse.Success"));
		releaseStoreResponse.setDynamicCode(_ctx.stringValue("ReleaseStoreResponse.DynamicCode"));
		releaseStoreResponse.setCode(_ctx.stringValue("ReleaseStoreResponse.Code"));
	 
	 	return releaseStoreResponse;
	}
}