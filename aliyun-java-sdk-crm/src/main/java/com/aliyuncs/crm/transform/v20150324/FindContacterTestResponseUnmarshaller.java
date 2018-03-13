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
package com.aliyuncs.crm.transform.v20150324;

import com.aliyuncs.crm.model.v20150324.FindContacterTestResponse;
import com.aliyuncs.crm.model.v20150324.FindContacterTestResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindContacterTestResponseUnmarshaller {

	public static FindContacterTestResponse unmarshall(FindContacterTestResponse findContacterTestResponse, UnmarshallerContext context) {
		
		findContacterTestResponse.setSuccess(context.booleanValue("FindContacterTestResponse.Success"));
		findContacterTestResponse.setResultCode(context.stringValue("FindContacterTestResponse.ResultCode"));
		findContacterTestResponse.setResultMessage(context.stringValue("FindContacterTestResponse.ResultMessage"));

		Data  data = new Data();
		data.setContacterId(context.longValue("FindContacterTestResponse.Data.ContacterId"));
		data.setKpId(context.longValue("FindContacterTestResponse.Data.KpId"));
		data.setCustomerId(context.longValue("FindContacterTestResponse.Data.CustomerId"));
		data.setContacterName(context.stringValue("FindContacterTestResponse.Data.ContacterName"));
		data.setContacterEmail(context.stringValue("FindContacterTestResponse.Data.ContacterEmail"));
		data.setContacterMobile(context.stringValue("FindContacterTestResponse.Data.ContacterMobile"));
		data.setContacterPosition(context.stringValue("FindContacterTestResponse.Data.ContacterPosition"));
		findContacterTestResponse.setData(data);
	 
	 	return findContacterTestResponse;
	}
}