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

import com.aliyuncs.account_crm.model.v20160606.FindContacterResponse;
import com.aliyuncs.account_crm.model.v20160606.FindContacterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindContacterResponseUnmarshaller {

	public static FindContacterResponse unmarshall(FindContacterResponse findContacterResponse, UnmarshallerContext _ctx) {
		
		findContacterResponse.setRequestId(_ctx.stringValue("FindContacterResponse.RequestId"));
		findContacterResponse.setCode(_ctx.stringValue("FindContacterResponse.Code"));
		findContacterResponse.setMessage(_ctx.stringValue("FindContacterResponse.Message"));
		findContacterResponse.setSuccess(_ctx.booleanValue("FindContacterResponse.Success"));

		Data data = new Data();
		data.setContacterId(_ctx.longValue("FindContacterResponse.Data.ContacterId"));
		data.setContacterMobile(_ctx.stringValue("FindContacterResponse.Data.ContacterMobile"));
		data.setContacterType(_ctx.stringValue("FindContacterResponse.Data.ContacterType"));
		data.setContacterName(_ctx.stringValue("FindContacterResponse.Data.ContacterName"));
		data.setContacterPosition(_ctx.stringValue("FindContacterResponse.Data.ContacterPosition"));
		data.setMobileConfirmed(_ctx.booleanValue("FindContacterResponse.Data.MobileConfirmed"));
		data.setEmailConfirmed(_ctx.booleanValue("FindContacterResponse.Data.EmailConfirmed"));
		data.setContacterStaffNo(_ctx.stringValue("FindContacterResponse.Data.ContacterStaffNo"));
		data.setContacterDingding(_ctx.stringValue("FindContacterResponse.Data.ContacterDingding"));
		data.setContacterAddress(_ctx.stringValue("FindContacterResponse.Data.ContacterAddress"));
		data.setContacterWangwang(_ctx.stringValue("FindContacterResponse.Data.ContacterWangwang"));
		data.setContacterEmail(_ctx.stringValue("FindContacterResponse.Data.ContacterEmail"));
		findContacterResponse.setData(data);
	 
	 	return findContacterResponse;
	}
}