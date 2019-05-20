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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.BindAXNPrivacyNumberResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.BindAXNPrivacyNumberResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAXNPrivacyNumberResponseUnmarshaller {

	public static BindAXNPrivacyNumberResponse unmarshall(BindAXNPrivacyNumberResponse bindAXNPrivacyNumberResponse, UnmarshallerContext context) {
		
		bindAXNPrivacyNumberResponse.setRequestId(context.stringValue("BindAXNPrivacyNumberResponse.RequestId"));
		bindAXNPrivacyNumberResponse.setSuccess(context.booleanValue("BindAXNPrivacyNumberResponse.Success"));
		bindAXNPrivacyNumberResponse.setCode(context.stringValue("BindAXNPrivacyNumberResponse.Code"));
		bindAXNPrivacyNumberResponse.setMessage(context.stringValue("BindAXNPrivacyNumberResponse.Message"));
		bindAXNPrivacyNumberResponse.setHttpStatusCode(context.integerValue("BindAXNPrivacyNumberResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPoolId(context.stringValue("BindAXNPrivacyNumberResponse.Data.PoolId"));
		data.setType(context.stringValue("BindAXNPrivacyNumberResponse.Data.Type"));
		data.setTelX(context.stringValue("BindAXNPrivacyNumberResponse.Data.TelX"));
		data.setPoolName(context.stringValue("BindAXNPrivacyNumberResponse.Data.PoolName"));
		data.setPhoneNumber(context.stringValue("BindAXNPrivacyNumberResponse.Data.PhoneNumber"));
		data.setExtra(context.stringValue("BindAXNPrivacyNumberResponse.Data.Extra"));
		data.setBizId(context.stringValue("BindAXNPrivacyNumberResponse.Data.BizId"));
		data.setAreaCode(context.stringValue("BindAXNPrivacyNumberResponse.Data.AreaCode"));
		data.setSubId(context.stringValue("BindAXNPrivacyNumberResponse.Data.SubId"));
		bindAXNPrivacyNumberResponse.setData(data);
	 
	 	return bindAXNPrivacyNumberResponse;
	}
}