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

import com.aliyuncs.pts.model.v20201020.SaveOpenJMeterSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveOpenJMeterSceneResponseUnmarshaller {

	public static SaveOpenJMeterSceneResponse unmarshall(SaveOpenJMeterSceneResponse saveOpenJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		saveOpenJMeterSceneResponse.setRequestId(_ctx.stringValue("SaveOpenJMeterSceneResponse.RequestId"));
		saveOpenJMeterSceneResponse.setSceneId(_ctx.stringValue("SaveOpenJMeterSceneResponse.SceneId"));
		saveOpenJMeterSceneResponse.setMessage(_ctx.stringValue("SaveOpenJMeterSceneResponse.Message"));
		saveOpenJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("SaveOpenJMeterSceneResponse.HttpStatusCode"));
		saveOpenJMeterSceneResponse.setCode(_ctx.stringValue("SaveOpenJMeterSceneResponse.Code"));
		saveOpenJMeterSceneResponse.setSuccess(_ctx.booleanValue("SaveOpenJMeterSceneResponse.Success"));
	 
	 	return saveOpenJMeterSceneResponse;
	}
}