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

package com.aliyuncs.pts.transform.v20201020;

import com.aliyuncs.pts.model.v20201020.SaveEnvResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveEnvResponseUnmarshaller {

	public static SaveEnvResponse unmarshall(SaveEnvResponse saveEnvResponse, UnmarshallerContext _ctx) {
		
		saveEnvResponse.setRequestId(_ctx.stringValue("SaveEnvResponse.RequestId"));
		saveEnvResponse.setMessage(_ctx.stringValue("SaveEnvResponse.Message"));
		saveEnvResponse.setHttpStatusCode(_ctx.integerValue("SaveEnvResponse.HttpStatusCode"));
		saveEnvResponse.setEnvId(_ctx.stringValue("SaveEnvResponse.EnvId"));
		saveEnvResponse.setCode(_ctx.stringValue("SaveEnvResponse.Code"));
		saveEnvResponse.setSuccess(_ctx.booleanValue("SaveEnvResponse.Success"));
	 
	 	return saveEnvResponse;
	}
}