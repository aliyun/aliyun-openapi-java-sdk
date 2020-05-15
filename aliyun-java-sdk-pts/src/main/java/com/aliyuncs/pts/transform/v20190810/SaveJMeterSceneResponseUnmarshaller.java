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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.SaveJMeterSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveJMeterSceneResponseUnmarshaller {

	public static SaveJMeterSceneResponse unmarshall(SaveJMeterSceneResponse saveJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		saveJMeterSceneResponse.setRequestId(_ctx.stringValue("SaveJMeterSceneResponse.RequestId"));
		saveJMeterSceneResponse.setMessage(_ctx.stringValue("SaveJMeterSceneResponse.Message"));
		saveJMeterSceneResponse.setCode(_ctx.stringValue("SaveJMeterSceneResponse.Code"));
		saveJMeterSceneResponse.setSuccess(_ctx.booleanValue("SaveJMeterSceneResponse.Success"));
		saveJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("SaveJMeterSceneResponse.HttpStatusCode"));
	 
	 	return saveJMeterSceneResponse;
	}
}