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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.FindPkByHidForLoginWithLegacyResponse;
import com.aliyuncs.account_crm.model.v20160606.FindPkByHidForLoginWithLegacyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindPkByHidForLoginWithLegacyResponseUnmarshaller {

	public static FindPkByHidForLoginWithLegacyResponse unmarshall(FindPkByHidForLoginWithLegacyResponse findPkByHidForLoginWithLegacyResponse, UnmarshallerContext _ctx) {
		
		findPkByHidForLoginWithLegacyResponse.setRequestId(_ctx.stringValue("FindPkByHidForLoginWithLegacyResponse.RequestId"));
		findPkByHidForLoginWithLegacyResponse.setMessage(_ctx.stringValue("FindPkByHidForLoginWithLegacyResponse.Message"));
		findPkByHidForLoginWithLegacyResponse.setCode(_ctx.stringValue("FindPkByHidForLoginWithLegacyResponse.Code"));
		findPkByHidForLoginWithLegacyResponse.setSuccess(_ctx.booleanValue("FindPkByHidForLoginWithLegacyResponse.Success"));

		Data data = new Data();
		data.setHid(_ctx.stringValue("FindPkByHidForLoginWithLegacyResponse.Data.Hid"));
		data.setPk(_ctx.stringValue("FindPkByHidForLoginWithLegacyResponse.Data.Pk"));
		findPkByHidForLoginWithLegacyResponse.setData(data);
	 
	 	return findPkByHidForLoginWithLegacyResponse;
	}
}