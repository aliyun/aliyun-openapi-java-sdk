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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.DeleteClusterResponse;
import com.aliyuncs.retailcloud.model.v20180313.DeleteClusterResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteClusterResponseUnmarshaller {

	public static DeleteClusterResponse unmarshall(DeleteClusterResponse deleteClusterResponse, UnmarshallerContext _ctx) {
		
		deleteClusterResponse.setRequestId(_ctx.stringValue("DeleteClusterResponse.RequestId"));
		deleteClusterResponse.setCode(_ctx.integerValue("DeleteClusterResponse.Code"));
		deleteClusterResponse.setErrMsg(_ctx.stringValue("DeleteClusterResponse.ErrMsg"));
		deleteClusterResponse.setSuccess(_ctx.booleanValue("DeleteClusterResponse.Success"));

		Result result = new Result();
		result.setNonsense(_ctx.integerValue("DeleteClusterResponse.Result.Nonsense"));
		deleteClusterResponse.setResult(result);
	 
	 	return deleteClusterResponse;
	}
}