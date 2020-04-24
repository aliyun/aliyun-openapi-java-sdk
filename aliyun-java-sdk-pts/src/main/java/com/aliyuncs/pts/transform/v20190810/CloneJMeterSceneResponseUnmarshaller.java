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

import com.aliyuncs.pts.model.v20190810.CloneJMeterSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloneJMeterSceneResponseUnmarshaller {

	public static CloneJMeterSceneResponse unmarshall(CloneJMeterSceneResponse cloneJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		cloneJMeterSceneResponse.setRequestId(_ctx.stringValue("CloneJMeterSceneResponse.RequestId"));
		cloneJMeterSceneResponse.setSceneId(_ctx.stringValue("CloneJMeterSceneResponse.SceneId"));
		cloneJMeterSceneResponse.setCode(_ctx.stringValue("CloneJMeterSceneResponse.Code"));
		cloneJMeterSceneResponse.setMessage(_ctx.stringValue("CloneJMeterSceneResponse.Message"));
		cloneJMeterSceneResponse.setSuccess(_ctx.booleanValue("CloneJMeterSceneResponse.Success"));
		cloneJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("CloneJMeterSceneResponse.HttpStatusCode"));
	 
	 	return cloneJMeterSceneResponse;
	}
}