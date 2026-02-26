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

import com.aliyuncs.dataworks_public.model.v20200518.DsgSceneAddOrUpdateSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgSceneAddOrUpdateSceneResponseUnmarshaller {

	public static DsgSceneAddOrUpdateSceneResponse unmarshall(DsgSceneAddOrUpdateSceneResponse dsgSceneAddOrUpdateSceneResponse, UnmarshallerContext _ctx) {
		
		dsgSceneAddOrUpdateSceneResponse.setRequestId(_ctx.stringValue("DsgSceneAddOrUpdateSceneResponse.RequestId"));
		dsgSceneAddOrUpdateSceneResponse.setSuccess(_ctx.booleanValue("DsgSceneAddOrUpdateSceneResponse.Success"));
		dsgSceneAddOrUpdateSceneResponse.setErrorCode(_ctx.stringValue("DsgSceneAddOrUpdateSceneResponse.ErrorCode"));
		dsgSceneAddOrUpdateSceneResponse.setErrorMessage(_ctx.stringValue("DsgSceneAddOrUpdateSceneResponse.ErrorMessage"));
		dsgSceneAddOrUpdateSceneResponse.setHttpStatusCode(_ctx.integerValue("DsgSceneAddOrUpdateSceneResponse.HttpStatusCode"));
		dsgSceneAddOrUpdateSceneResponse.setData(_ctx.booleanValue("DsgSceneAddOrUpdateSceneResponse.Data"));
	 
	 	return dsgSceneAddOrUpdateSceneResponse;
	}
}