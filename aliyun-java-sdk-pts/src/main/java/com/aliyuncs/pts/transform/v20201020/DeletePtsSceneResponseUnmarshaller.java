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

import com.aliyuncs.pts.model.v20201020.DeletePtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePtsSceneResponseUnmarshaller {

	public static DeletePtsSceneResponse unmarshall(DeletePtsSceneResponse deletePtsSceneResponse, UnmarshallerContext _ctx) {
		
		deletePtsSceneResponse.setRequestId(_ctx.stringValue("DeletePtsSceneResponse.RequestId"));
		deletePtsSceneResponse.setMessage(_ctx.stringValue("DeletePtsSceneResponse.Message"));
		deletePtsSceneResponse.setHttpStatusCode(_ctx.integerValue("DeletePtsSceneResponse.HttpStatusCode"));
		deletePtsSceneResponse.setCode(_ctx.stringValue("DeletePtsSceneResponse.Code"));
		deletePtsSceneResponse.setSuccess(_ctx.booleanValue("DeletePtsSceneResponse.Success"));
	 
	 	return deletePtsSceneResponse;
	}
}