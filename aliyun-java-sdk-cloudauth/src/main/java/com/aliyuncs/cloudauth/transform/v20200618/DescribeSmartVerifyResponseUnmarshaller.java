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

package com.aliyuncs.cloudauth.transform.v20200618;

import com.aliyuncs.cloudauth.model.v20200618.DescribeSmartVerifyResponse;
import com.aliyuncs.cloudauth.model.v20200618.DescribeSmartVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartVerifyResponseUnmarshaller {

	public static DescribeSmartVerifyResponse unmarshall(DescribeSmartVerifyResponse describeSmartVerifyResponse, UnmarshallerContext _ctx) {
		
		describeSmartVerifyResponse.setRequestId(_ctx.stringValue("DescribeSmartVerifyResponse.RequestId"));
		describeSmartVerifyResponse.setMessage(_ctx.stringValue("DescribeSmartVerifyResponse.Message"));
		describeSmartVerifyResponse.setCode(_ctx.stringValue("DescribeSmartVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setPassed(_ctx.stringValue("DescribeSmartVerifyResponse.ResultObject.Passed"));
		resultObject.setSubCode(_ctx.stringValue("DescribeSmartVerifyResponse.ResultObject.SubCode"));
		resultObject.setMaterialInfo(_ctx.stringValue("DescribeSmartVerifyResponse.ResultObject.MaterialInfo"));
		resultObject.setDeviceToken(_ctx.stringValue("DescribeSmartVerifyResponse.ResultObject.DeviceToken"));
		describeSmartVerifyResponse.setResultObject(resultObject);
	 
	 	return describeSmartVerifyResponse;
	}
}