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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.DeleteClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteClusterResponseUnmarshaller {

	public static DeleteClusterResponse unmarshall(DeleteClusterResponse deleteClusterResponse, UnmarshallerContext _ctx) {
		
		deleteClusterResponse.setRequestId(_ctx.stringValue("DeleteClusterResponse.RequestId"));
		deleteClusterResponse.setSuccess(_ctx.booleanValue("DeleteClusterResponse.Success"));
		deleteClusterResponse.setMessage(_ctx.stringValue("DeleteClusterResponse.Message"));
		deleteClusterResponse.setErrorCode(_ctx.stringValue("DeleteClusterResponse.ErrorCode"));
		deleteClusterResponse.setData(_ctx.stringValue("DeleteClusterResponse.Data"));
		deleteClusterResponse.setHttpCode(_ctx.stringValue("DeleteClusterResponse.HttpCode"));
		deleteClusterResponse.setClusterId(_ctx.stringValue("DeleteClusterResponse.ClusterId"));
	 
	 	return deleteClusterResponse;
	}
}