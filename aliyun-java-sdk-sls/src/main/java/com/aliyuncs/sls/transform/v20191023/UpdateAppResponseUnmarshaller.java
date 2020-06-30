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

package com.aliyuncs.sls.transform.v20191023;

import com.aliyuncs.sls.model.v20191023.UpdateAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppResponseUnmarshaller {

	public static UpdateAppResponse unmarshall(UpdateAppResponse updateAppResponse, UnmarshallerContext _ctx) {
		
		updateAppResponse.setRequestId(_ctx.stringValue("UpdateAppResponse.RequestId"));
		updateAppResponse.setCode(_ctx.stringValue("UpdateAppResponse.Code"));
		updateAppResponse.setSuccess(_ctx.stringValue("UpdateAppResponse.Success"));
		updateAppResponse.setMessage(_ctx.stringValue("UpdateAppResponse.Message"));
	 
	 	return updateAppResponse;
	}
}