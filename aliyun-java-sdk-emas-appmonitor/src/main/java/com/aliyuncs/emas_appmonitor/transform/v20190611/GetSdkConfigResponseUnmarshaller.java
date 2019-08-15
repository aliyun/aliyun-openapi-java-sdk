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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import com.aliyuncs.emas_appmonitor.model.v20190611.GetSdkConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSdkConfigResponseUnmarshaller {

	public static GetSdkConfigResponse unmarshall(GetSdkConfigResponse getSdkConfigResponse, UnmarshallerContext _ctx) {
		
		getSdkConfigResponse.setRequestId(_ctx.stringValue("GetSdkConfigResponse.RequestId"));
		getSdkConfigResponse.setSDKConfig(_ctx.mapValue("GetSdkConfigResponse.SDKConfig"));
	 
	 	return getSdkConfigResponse;
	}
}