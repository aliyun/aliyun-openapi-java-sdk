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

import com.aliyuncs.pts.model.v20201020.DeletePtsScenesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePtsScenesResponseUnmarshaller {

	public static DeletePtsScenesResponse unmarshall(DeletePtsScenesResponse deletePtsScenesResponse, UnmarshallerContext _ctx) {
		
		deletePtsScenesResponse.setRequestId(_ctx.stringValue("DeletePtsScenesResponse.RequestId"));
		deletePtsScenesResponse.setSuccess(_ctx.booleanValue("DeletePtsScenesResponse.Success"));
		deletePtsScenesResponse.setCode(_ctx.stringValue("DeletePtsScenesResponse.Code"));
		deletePtsScenesResponse.setMessage(_ctx.stringValue("DeletePtsScenesResponse.Message"));
		deletePtsScenesResponse.setHttpStatusCode(_ctx.integerValue("DeletePtsScenesResponse.HttpStatusCode"));
	 
	 	return deletePtsScenesResponse;
	}
}