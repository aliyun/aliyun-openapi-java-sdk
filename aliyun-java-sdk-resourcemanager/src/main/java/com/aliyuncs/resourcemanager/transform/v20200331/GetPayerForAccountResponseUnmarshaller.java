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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.GetPayerForAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPayerForAccountResponseUnmarshaller {

	public static GetPayerForAccountResponse unmarshall(GetPayerForAccountResponse getPayerForAccountResponse, UnmarshallerContext _ctx) {
		
		getPayerForAccountResponse.setRequestId(_ctx.stringValue("GetPayerForAccountResponse.RequestId"));
		getPayerForAccountResponse.setPayerAccountId(_ctx.stringValue("GetPayerForAccountResponse.PayerAccountId"));
		getPayerForAccountResponse.setPayerAccountName(_ctx.stringValue("GetPayerForAccountResponse.PayerAccountName"));
	 
	 	return getPayerForAccountResponse;
	}
}