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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.UpdateEnvironmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEnvironmentResponseUnmarshaller {

	public static UpdateEnvironmentResponse unmarshall(UpdateEnvironmentResponse updateEnvironmentResponse, UnmarshallerContext _ctx) {
		
		updateEnvironmentResponse.setRequestId(_ctx.stringValue("UpdateEnvironmentResponse.RequestId"));
		updateEnvironmentResponse.setCode(_ctx.integerValue("UpdateEnvironmentResponse.Code"));
		updateEnvironmentResponse.setData(_ctx.stringValue("UpdateEnvironmentResponse.Data"));
		updateEnvironmentResponse.setMessage(_ctx.stringValue("UpdateEnvironmentResponse.Message"));
	 
	 	return updateEnvironmentResponse;
	}
}