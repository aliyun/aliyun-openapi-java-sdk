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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.DeleteAntOpenPlatformConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAntOpenPlatformConfigResponseUnmarshaller {

	public static DeleteAntOpenPlatformConfigResponse unmarshall(DeleteAntOpenPlatformConfigResponse deleteAntOpenPlatformConfigResponse, UnmarshallerContext _ctx) {
		
		deleteAntOpenPlatformConfigResponse.setRequestId(_ctx.stringValue("DeleteAntOpenPlatformConfigResponse.RequestId"));
		deleteAntOpenPlatformConfigResponse.setHttpStatusCode(_ctx.stringValue("DeleteAntOpenPlatformConfigResponse.HttpStatusCode"));
		deleteAntOpenPlatformConfigResponse.setSuccess(_ctx.booleanValue("DeleteAntOpenPlatformConfigResponse.Success"));
		deleteAntOpenPlatformConfigResponse.setCode(_ctx.stringValue("DeleteAntOpenPlatformConfigResponse.Code"));
		deleteAntOpenPlatformConfigResponse.setMessage(_ctx.stringValue("DeleteAntOpenPlatformConfigResponse.Message"));
	 
	 	return deleteAntOpenPlatformConfigResponse;
	}
}