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

import com.aliyuncs.mpserverless.model.v20190615.DeleteWechatOpenPlatformConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWechatOpenPlatformConfigResponseUnmarshaller {

	public static DeleteWechatOpenPlatformConfigResponse unmarshall(DeleteWechatOpenPlatformConfigResponse deleteWechatOpenPlatformConfigResponse, UnmarshallerContext _ctx) {
		
		deleteWechatOpenPlatformConfigResponse.setRequestId(_ctx.stringValue("DeleteWechatOpenPlatformConfigResponse.RequestId"));
		deleteWechatOpenPlatformConfigResponse.setHttpStatusCode(_ctx.stringValue("DeleteWechatOpenPlatformConfigResponse.HttpStatusCode"));
		deleteWechatOpenPlatformConfigResponse.setSuccess(_ctx.booleanValue("DeleteWechatOpenPlatformConfigResponse.Success"));
		deleteWechatOpenPlatformConfigResponse.setCode(_ctx.stringValue("DeleteWechatOpenPlatformConfigResponse.Code"));
		deleteWechatOpenPlatformConfigResponse.setMessage(_ctx.stringValue("DeleteWechatOpenPlatformConfigResponse.Message"));
	 
	 	return deleteWechatOpenPlatformConfigResponse;
	}
}