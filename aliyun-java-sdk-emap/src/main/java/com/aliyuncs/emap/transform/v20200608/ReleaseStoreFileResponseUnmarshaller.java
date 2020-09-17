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

import com.aliyuncs.emap.model.v20200608.ReleaseStoreFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseStoreFileResponseUnmarshaller {

	public static ReleaseStoreFileResponse unmarshall(ReleaseStoreFileResponse releaseStoreFileResponse, UnmarshallerContext _ctx) {
		
		releaseStoreFileResponse.setRequestId(_ctx.stringValue("ReleaseStoreFileResponse.RequestId"));
		releaseStoreFileResponse.setMessage(_ctx.stringValue("ReleaseStoreFileResponse.Message"));
		releaseStoreFileResponse.setErrorCode(_ctx.stringValue("ReleaseStoreFileResponse.ErrorCode"));
		releaseStoreFileResponse.setErrorMessage(_ctx.stringValue("ReleaseStoreFileResponse.ErrorMessage"));
		releaseStoreFileResponse.setDynamicMessage(_ctx.stringValue("ReleaseStoreFileResponse.DynamicMessage"));
		releaseStoreFileResponse.setSuccess(_ctx.booleanValue("ReleaseStoreFileResponse.Success"));
		releaseStoreFileResponse.setDynamicCode(_ctx.stringValue("ReleaseStoreFileResponse.DynamicCode"));
		releaseStoreFileResponse.setCode(_ctx.stringValue("ReleaseStoreFileResponse.Code"));
	 
	 	return releaseStoreFileResponse;
	}
}