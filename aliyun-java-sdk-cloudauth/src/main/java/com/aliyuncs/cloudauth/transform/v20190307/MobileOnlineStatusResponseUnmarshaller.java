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

import com.aliyuncs.cloudauth.model.v20190307.MobileOnlineStatusResponse;
import com.aliyuncs.cloudauth.model.v20190307.MobileOnlineStatusResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class MobileOnlineStatusResponseUnmarshaller {

	public static MobileOnlineStatusResponse unmarshall(MobileOnlineStatusResponse mobileOnlineStatusResponse, UnmarshallerContext _ctx) {
		
		mobileOnlineStatusResponse.setRequestId(_ctx.stringValue("MobileOnlineStatusResponse.RequestId"));
		mobileOnlineStatusResponse.setCode(_ctx.stringValue("MobileOnlineStatusResponse.Code"));
		mobileOnlineStatusResponse.setMessage(_ctx.stringValue("MobileOnlineStatusResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("MobileOnlineStatusResponse.ResultObject.BizCode"));
		resultObject.setIspName(_ctx.stringValue("MobileOnlineStatusResponse.ResultObject.IspName"));
		resultObject.setSubCode(_ctx.stringValue("MobileOnlineStatusResponse.ResultObject.SubCode"));
		mobileOnlineStatusResponse.setResultObject(resultObject);
	 
	 	return mobileOnlineStatusResponse;
	}
}