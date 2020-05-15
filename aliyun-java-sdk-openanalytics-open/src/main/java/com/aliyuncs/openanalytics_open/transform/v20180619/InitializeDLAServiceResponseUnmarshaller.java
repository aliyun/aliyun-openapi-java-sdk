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

import com.aliyuncs.openanalytics_open.model.v20180619.InitializeDLAServiceResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.InitializeDLAServiceResponse.AccountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitializeDLAServiceResponseUnmarshaller {

	public static InitializeDLAServiceResponse unmarshall(InitializeDLAServiceResponse initializeDLAServiceResponse, UnmarshallerContext _ctx) {
		
		initializeDLAServiceResponse.setRequestId(_ctx.stringValue("InitializeDLAServiceResponse.RequestId"));
		initializeDLAServiceResponse.setRegionId(_ctx.stringValue("InitializeDLAServiceResponse.RegionId"));

		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setUserName(_ctx.stringValue("InitializeDLAServiceResponse.AccountInfo.UserName"));
		accountInfo.setPassword(_ctx.stringValue("InitializeDLAServiceResponse.AccountInfo.Password"));
		initializeDLAServiceResponse.setAccountInfo(accountInfo);
	 
	 	return initializeDLAServiceResponse;
	}
}