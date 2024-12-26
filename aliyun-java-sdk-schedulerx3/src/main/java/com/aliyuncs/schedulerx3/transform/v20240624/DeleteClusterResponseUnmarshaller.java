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

package com.aliyuncs.schedulerx3.transform.v20240624;

import com.aliyuncs.schedulerx3.model.v20240624.DeleteClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteClusterResponseUnmarshaller {

	public static DeleteClusterResponse unmarshall(DeleteClusterResponse deleteClusterResponse, UnmarshallerContext _ctx) {
		
		deleteClusterResponse.setRequestId(_ctx.stringValue("DeleteClusterResponse.RequestId"));
		deleteClusterResponse.setCode(_ctx.integerValue("DeleteClusterResponse.Code"));
		deleteClusterResponse.setMessage(_ctx.stringValue("DeleteClusterResponse.Message"));
		deleteClusterResponse.setSuccess(_ctx.booleanValue("DeleteClusterResponse.Success"));
	 
	 	return deleteClusterResponse;
	}
}