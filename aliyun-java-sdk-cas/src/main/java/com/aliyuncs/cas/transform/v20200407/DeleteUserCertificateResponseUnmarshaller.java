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

package com.aliyuncs.cas.transform.v20200407;

import com.aliyuncs.cas.model.v20200407.DeleteUserCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserCertificateResponseUnmarshaller {

	public static DeleteUserCertificateResponse unmarshall(DeleteUserCertificateResponse deleteUserCertificateResponse, UnmarshallerContext _ctx) {
		
		deleteUserCertificateResponse.setRequestId(_ctx.stringValue("DeleteUserCertificateResponse.RequestId"));
	 
	 	return deleteUserCertificateResponse;
	}
}