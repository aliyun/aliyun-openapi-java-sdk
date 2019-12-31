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

import com.aliyuncs.mpserverless.model.v20190615.DeleteDingtalkOpenPlatformConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDingtalkOpenPlatformConfigResponseUnmarshaller {

	public static DeleteDingtalkOpenPlatformConfigResponse unmarshall(DeleteDingtalkOpenPlatformConfigResponse deleteDingtalkOpenPlatformConfigResponse, UnmarshallerContext _ctx) {
		
		deleteDingtalkOpenPlatformConfigResponse.setRequestId(_ctx.stringValue("DeleteDingtalkOpenPlatformConfigResponse.RequestId"));
		deleteDingtalkOpenPlatformConfigResponse.setHttpStatusCode(_ctx.stringValue("DeleteDingtalkOpenPlatformConfigResponse.HttpStatusCode"));
		deleteDingtalkOpenPlatformConfigResponse.setSuccess(_ctx.booleanValue("DeleteDingtalkOpenPlatformConfigResponse.Success"));
		deleteDingtalkOpenPlatformConfigResponse.setCode(_ctx.stringValue("DeleteDingtalkOpenPlatformConfigResponse.Code"));
		deleteDingtalkOpenPlatformConfigResponse.setMessage(_ctx.stringValue("DeleteDingtalkOpenPlatformConfigResponse.Message"));
	 
	 	return deleteDingtalkOpenPlatformConfigResponse;
	}
}