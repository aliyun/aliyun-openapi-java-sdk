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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.DsgScenedDeleteSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgScenedDeleteSceneResponseUnmarshaller {

	public static DsgScenedDeleteSceneResponse unmarshall(DsgScenedDeleteSceneResponse dsgScenedDeleteSceneResponse, UnmarshallerContext _ctx) {
		
		dsgScenedDeleteSceneResponse.setRequestId(_ctx.stringValue("DsgScenedDeleteSceneResponse.RequestId"));
		dsgScenedDeleteSceneResponse.setSuccess(_ctx.booleanValue("DsgScenedDeleteSceneResponse.Success"));
		dsgScenedDeleteSceneResponse.setErrorCode(_ctx.stringValue("DsgScenedDeleteSceneResponse.ErrorCode"));
		dsgScenedDeleteSceneResponse.setErrorMessage(_ctx.stringValue("DsgScenedDeleteSceneResponse.ErrorMessage"));
		dsgScenedDeleteSceneResponse.setHttpStatusCode(_ctx.integerValue("DsgScenedDeleteSceneResponse.HttpStatusCode"));
		dsgScenedDeleteSceneResponse.setData(_ctx.booleanValue("DsgScenedDeleteSceneResponse.Data"));
	 
	 	return dsgScenedDeleteSceneResponse;
	}
}