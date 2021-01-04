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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.DeleteAlgorithmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAlgorithmResponseUnmarshaller {

	public static DeleteAlgorithmResponse unmarshall(DeleteAlgorithmResponse deleteAlgorithmResponse, UnmarshallerContext _ctx) {
		
		deleteAlgorithmResponse.setRequestId(_ctx.stringValue("DeleteAlgorithmResponse.RequestId"));
		deleteAlgorithmResponse.setSuccess(_ctx.booleanValue("DeleteAlgorithmResponse.Success"));
		deleteAlgorithmResponse.setCode(_ctx.stringValue("DeleteAlgorithmResponse.Code"));
		deleteAlgorithmResponse.setErrorMessage(_ctx.stringValue("DeleteAlgorithmResponse.ErrorMessage"));
	 
	 	return deleteAlgorithmResponse;
	}
}