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

import com.aliyuncs.mpserverless.model.v20190615.SaveAntOpenPlatformConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveAntOpenPlatformConfigResponseUnmarshaller {

	public static SaveAntOpenPlatformConfigResponse unmarshall(SaveAntOpenPlatformConfigResponse saveAntOpenPlatformConfigResponse, UnmarshallerContext _ctx) {
		
		saveAntOpenPlatformConfigResponse.setRequestId(_ctx.stringValue("SaveAntOpenPlatformConfigResponse.RequestId"));
		saveAntOpenPlatformConfigResponse.setHttpStatusCode(_ctx.stringValue("SaveAntOpenPlatformConfigResponse.HttpStatusCode"));
		saveAntOpenPlatformConfigResponse.setSuccess(_ctx.booleanValue("SaveAntOpenPlatformConfigResponse.Success"));
		saveAntOpenPlatformConfigResponse.setCode(_ctx.stringValue("SaveAntOpenPlatformConfigResponse.Code"));
		saveAntOpenPlatformConfigResponse.setMessage(_ctx.stringValue("SaveAntOpenPlatformConfigResponse.Message"));
	 
	 	return saveAntOpenPlatformConfigResponse;
	}
}