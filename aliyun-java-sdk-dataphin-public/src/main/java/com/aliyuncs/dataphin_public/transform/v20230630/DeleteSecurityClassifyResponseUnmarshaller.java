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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.DeleteSecurityClassifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSecurityClassifyResponseUnmarshaller {

	public static DeleteSecurityClassifyResponse unmarshall(DeleteSecurityClassifyResponse deleteSecurityClassifyResponse, UnmarshallerContext _ctx) {
		
		deleteSecurityClassifyResponse.setRequestId(_ctx.stringValue("DeleteSecurityClassifyResponse.RequestId"));
		deleteSecurityClassifyResponse.setSuccess(_ctx.booleanValue("DeleteSecurityClassifyResponse.Success"));
		deleteSecurityClassifyResponse.setHttpStatusCode(_ctx.integerValue("DeleteSecurityClassifyResponse.HttpStatusCode"));
		deleteSecurityClassifyResponse.setCode(_ctx.stringValue("DeleteSecurityClassifyResponse.Code"));
		deleteSecurityClassifyResponse.setMessage(_ctx.stringValue("DeleteSecurityClassifyResponse.Message"));
		deleteSecurityClassifyResponse.setData(_ctx.booleanValue("DeleteSecurityClassifyResponse.Data"));
	 
	 	return deleteSecurityClassifyResponse;
	}
}