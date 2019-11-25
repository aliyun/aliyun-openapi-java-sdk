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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import com.aliyuncs.cloudwifi_pop.model.v20191118.RegisterApAssetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterApAssetResponseUnmarshaller {

	public static RegisterApAssetResponse unmarshall(RegisterApAssetResponse registerApAssetResponse, UnmarshallerContext _ctx) {
		
		registerApAssetResponse.setData(_ctx.stringValue("RegisterApAssetResponse.Data"));
		registerApAssetResponse.setIsSuccess(_ctx.booleanValue("RegisterApAssetResponse.IsSuccess"));
		registerApAssetResponse.setErrorCode(_ctx.integerValue("RegisterApAssetResponse.ErrorCode"));
		registerApAssetResponse.setErrorMessage(_ctx.stringValue("RegisterApAssetResponse.ErrorMessage"));
	 
	 	return registerApAssetResponse;
	}
}