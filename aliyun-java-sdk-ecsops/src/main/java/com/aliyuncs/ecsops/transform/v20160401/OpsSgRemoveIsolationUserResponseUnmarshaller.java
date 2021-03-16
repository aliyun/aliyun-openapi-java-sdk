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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsSgRemoveIsolationUserResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSgRemoveIsolationUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSgRemoveIsolationUserResponseUnmarshaller {

	public static OpsSgRemoveIsolationUserResponse unmarshall(OpsSgRemoveIsolationUserResponse opsSgRemoveIsolationUserResponse, UnmarshallerContext _ctx) {
		
		opsSgRemoveIsolationUserResponse.setRequestId(_ctx.stringValue("OpsSgRemoveIsolationUserResponse.RequestId"));
		opsSgRemoveIsolationUserResponse.setCode(_ctx.stringValue("OpsSgRemoveIsolationUserResponse.Code"));
		opsSgRemoveIsolationUserResponse.setMessage(_ctx.stringValue("OpsSgRemoveIsolationUserResponse.Message"));
		opsSgRemoveIsolationUserResponse.setSuccess(_ctx.booleanValue("OpsSgRemoveIsolationUserResponse.Success"));

		Data data = new Data();
		data.setResultInfoStr(_ctx.stringValue("OpsSgRemoveIsolationUserResponse.Data.ResultInfoStr"));
		opsSgRemoveIsolationUserResponse.setData(data);
	 
	 	return opsSgRemoveIsolationUserResponse;
	}
}