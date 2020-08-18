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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.BuildSDKConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BuildSDKConfigResponseUnmarshaller {

	public static BuildSDKConfigResponse unmarshall(BuildSDKConfigResponse buildSDKConfigResponse, UnmarshallerContext _ctx) {
		
		buildSDKConfigResponse.setRequestId(_ctx.stringValue("BuildSDKConfigResponse.RequestId"));
		buildSDKConfigResponse.setContent(_ctx.stringValue("BuildSDKConfigResponse.Content"));
	 
	 	return buildSDKConfigResponse;
	}
}