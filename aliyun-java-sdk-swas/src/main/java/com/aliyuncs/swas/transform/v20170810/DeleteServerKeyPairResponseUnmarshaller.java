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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.DeleteServerKeyPairResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteServerKeyPairResponseUnmarshaller {

	public static DeleteServerKeyPairResponse unmarshall(DeleteServerKeyPairResponse deleteServerKeyPairResponse, UnmarshallerContext _ctx) {
		
		deleteServerKeyPairResponse.setRequestId(_ctx.stringValue("DeleteServerKeyPairResponse.RequestId"));
		deleteServerKeyPairResponse.setIsSuccess(_ctx.booleanValue("DeleteServerKeyPairResponse.IsSuccess"));
		deleteServerKeyPairResponse.setData(_ctx.booleanValue("DeleteServerKeyPairResponse.Data"));
		deleteServerKeyPairResponse.setCode(_ctx.stringValue("DeleteServerKeyPairResponse.Code"));
	 
	 	return deleteServerKeyPairResponse;
	}
}