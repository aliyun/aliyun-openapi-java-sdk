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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.AddCustomInfoResponse;
import com.aliyuncs.finmall.model.v20180723.AddCustomInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCustomInfoResponseUnmarshaller {

	public static AddCustomInfoResponse unmarshall(AddCustomInfoResponse addCustomInfoResponse, UnmarshallerContext context) {
		
		addCustomInfoResponse.setRequestId(context.stringValue("AddCustomInfoResponse.RequestId"));
		addCustomInfoResponse.setCode(context.stringValue("AddCustomInfoResponse.Code"));
		addCustomInfoResponse.setMessage(context.stringValue("AddCustomInfoResponse.Message"));

		Data data = new Data();
		data.setCustomId(context.stringValue("AddCustomInfoResponse.Data.CustomId"));
		data.setValidateState(context.stringValue("AddCustomInfoResponse.Data.ValidateState"));
		data.setValidateTime(context.stringValue("AddCustomInfoResponse.Data.ValidateTime"));
		data.setUserState(context.stringValue("AddCustomInfoResponse.Data.UserState"));
		addCustomInfoResponse.setData(data);
	 
	 	return addCustomInfoResponse;
	}
}