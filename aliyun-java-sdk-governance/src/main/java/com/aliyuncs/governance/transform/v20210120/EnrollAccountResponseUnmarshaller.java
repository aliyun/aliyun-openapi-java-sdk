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

package com.aliyuncs.governance.transform.v20210120;

import com.aliyuncs.governance.model.v20210120.EnrollAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnrollAccountResponseUnmarshaller {

	public static EnrollAccountResponse unmarshall(EnrollAccountResponse enrollAccountResponse, UnmarshallerContext _ctx) {
		
		enrollAccountResponse.setRequestId(_ctx.stringValue("EnrollAccountResponse.RequestId"));
		enrollAccountResponse.setAccountUid(_ctx.longValue("EnrollAccountResponse.AccountUid"));
	 
	 	return enrollAccountResponse;
	}
}