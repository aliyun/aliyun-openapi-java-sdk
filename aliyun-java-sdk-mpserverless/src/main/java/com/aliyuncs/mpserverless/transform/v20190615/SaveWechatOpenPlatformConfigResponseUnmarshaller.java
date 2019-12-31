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

import com.aliyuncs.mpserverless.model.v20190615.SaveWechatOpenPlatformConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveWechatOpenPlatformConfigResponseUnmarshaller {

	public static SaveWechatOpenPlatformConfigResponse unmarshall(SaveWechatOpenPlatformConfigResponse saveWechatOpenPlatformConfigResponse, UnmarshallerContext _ctx) {
		
		saveWechatOpenPlatformConfigResponse.setRequestId(_ctx.stringValue("SaveWechatOpenPlatformConfigResponse.RequestId"));
		saveWechatOpenPlatformConfigResponse.setHttpStatusCode(_ctx.stringValue("SaveWechatOpenPlatformConfigResponse.HttpStatusCode"));
		saveWechatOpenPlatformConfigResponse.setSuccess(_ctx.booleanValue("SaveWechatOpenPlatformConfigResponse.Success"));
		saveWechatOpenPlatformConfigResponse.setCode(_ctx.stringValue("SaveWechatOpenPlatformConfigResponse.Code"));
		saveWechatOpenPlatformConfigResponse.setMessage(_ctx.stringValue("SaveWechatOpenPlatformConfigResponse.Message"));
	 
	 	return saveWechatOpenPlatformConfigResponse;
	}
}