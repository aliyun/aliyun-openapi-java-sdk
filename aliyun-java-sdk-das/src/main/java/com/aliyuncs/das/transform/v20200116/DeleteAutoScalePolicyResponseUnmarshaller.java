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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DeleteAutoScalePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAutoScalePolicyResponseUnmarshaller {

	public static DeleteAutoScalePolicyResponse unmarshall(DeleteAutoScalePolicyResponse deleteAutoScalePolicyResponse, UnmarshallerContext _ctx) {
		
		deleteAutoScalePolicyResponse.setRequestId(_ctx.stringValue("DeleteAutoScalePolicyResponse.RequestId"));
		deleteAutoScalePolicyResponse.setCode(_ctx.stringValue("DeleteAutoScalePolicyResponse.Code"));
		deleteAutoScalePolicyResponse.setMessage(_ctx.stringValue("DeleteAutoScalePolicyResponse.Message"));
		deleteAutoScalePolicyResponse.setData(_ctx.stringValue("DeleteAutoScalePolicyResponse.Data"));
		deleteAutoScalePolicyResponse.setSuccess(_ctx.stringValue("DeleteAutoScalePolicyResponse.Success"));
	 
	 	return deleteAutoScalePolicyResponse;
	}
}