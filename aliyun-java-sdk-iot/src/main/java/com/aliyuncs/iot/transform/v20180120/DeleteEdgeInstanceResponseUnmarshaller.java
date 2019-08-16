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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DeleteEdgeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteEdgeInstanceResponseUnmarshaller {

	public static DeleteEdgeInstanceResponse unmarshall(DeleteEdgeInstanceResponse deleteEdgeInstanceResponse, UnmarshallerContext _ctx) {
		
		deleteEdgeInstanceResponse.setRequestId(_ctx.stringValue("DeleteEdgeInstanceResponse.RequestId"));
		deleteEdgeInstanceResponse.setSuccess(_ctx.booleanValue("DeleteEdgeInstanceResponse.Success"));
		deleteEdgeInstanceResponse.setCode(_ctx.stringValue("DeleteEdgeInstanceResponse.Code"));
		deleteEdgeInstanceResponse.setErrorMessage(_ctx.stringValue("DeleteEdgeInstanceResponse.ErrorMessage"));
	 
	 	return deleteEdgeInstanceResponse;
	}
}