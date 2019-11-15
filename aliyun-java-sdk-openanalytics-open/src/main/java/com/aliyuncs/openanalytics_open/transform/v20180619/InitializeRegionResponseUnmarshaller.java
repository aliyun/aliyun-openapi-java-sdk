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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.InitializeRegionResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.InitializeRegionResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitializeRegionResponseUnmarshaller {

	public static InitializeRegionResponse unmarshall(InitializeRegionResponse initializeRegionResponse, UnmarshallerContext _ctx) {
		
		initializeRegionResponse.setRequestId(_ctx.stringValue("InitializeRegionResponse.RequestId"));
		initializeRegionResponse.setRegionId(_ctx.stringValue("InitializeRegionResponse.RegionId"));

		Account account = new Account();
		account.setUserName(_ctx.stringValue("InitializeRegionResponse.Account.UserName"));
		account.setPassword(_ctx.stringValue("InitializeRegionResponse.Account.Password"));
		initializeRegionResponse.setAccount(account);
	 
	 	return initializeRegionResponse;
	}
}