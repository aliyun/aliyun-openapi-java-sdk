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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.MobileOnlineTimeResponse;
import com.aliyuncs.cloudauth.model.v20190307.MobileOnlineTimeResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class MobileOnlineTimeResponseUnmarshaller {

	public static MobileOnlineTimeResponse unmarshall(MobileOnlineTimeResponse mobileOnlineTimeResponse, UnmarshallerContext _ctx) {
		
		mobileOnlineTimeResponse.setRequestId(_ctx.stringValue("MobileOnlineTimeResponse.RequestId"));
		mobileOnlineTimeResponse.setCode(_ctx.stringValue("MobileOnlineTimeResponse.Code"));
		mobileOnlineTimeResponse.setMessage(_ctx.stringValue("MobileOnlineTimeResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("MobileOnlineTimeResponse.ResultObject.BizCode"));
		resultObject.setIspName(_ctx.stringValue("MobileOnlineTimeResponse.ResultObject.IspName"));
		resultObject.setTimeCode(_ctx.stringValue("MobileOnlineTimeResponse.ResultObject.TimeCode"));
		mobileOnlineTimeResponse.setResultObject(resultObject);
	 
	 	return mobileOnlineTimeResponse;
	}
}