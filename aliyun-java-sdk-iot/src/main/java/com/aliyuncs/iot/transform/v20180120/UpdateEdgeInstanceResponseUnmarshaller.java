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

import com.aliyuncs.iot.model.v20180120.UpdateEdgeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEdgeInstanceResponseUnmarshaller {

	public static UpdateEdgeInstanceResponse unmarshall(UpdateEdgeInstanceResponse updateEdgeInstanceResponse, UnmarshallerContext _ctx) {
		
		updateEdgeInstanceResponse.setRequestId(_ctx.stringValue("UpdateEdgeInstanceResponse.RequestId"));
		updateEdgeInstanceResponse.setSuccess(_ctx.booleanValue("UpdateEdgeInstanceResponse.Success"));
		updateEdgeInstanceResponse.setCode(_ctx.stringValue("UpdateEdgeInstanceResponse.Code"));
		updateEdgeInstanceResponse.setErrorMessage(_ctx.stringValue("UpdateEdgeInstanceResponse.ErrorMessage"));
	 
	 	return updateEdgeInstanceResponse;
	}
}