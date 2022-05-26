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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.FindAllContacterResponse;
import com.aliyuncs.account_crm.model.v20160606.FindAllContacterResponse.ContacterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindAllContacterResponseUnmarshaller {

	public static FindAllContacterResponse unmarshall(FindAllContacterResponse findAllContacterResponse, UnmarshallerContext _ctx) {
		
		findAllContacterResponse.setRequestId(_ctx.stringValue("FindAllContacterResponse.RequestId"));
		findAllContacterResponse.setCode(_ctx.stringValue("FindAllContacterResponse.Code"));
		findAllContacterResponse.setMessage(_ctx.stringValue("FindAllContacterResponse.Message"));
		findAllContacterResponse.setSuccess(_ctx.booleanValue("FindAllContacterResponse.Success"));

		List<ContacterInfo> data = new ArrayList<ContacterInfo>();
		for (int i = 0; i < _ctx.lengthValue("FindAllContacterResponse.Data.Length"); i++) {
			ContacterInfo contacterInfo = new ContacterInfo();
			contacterInfo.setContacterId(_ctx.longValue("FindAllContacterResponse.Data["+ i +"].ContacterId"));
			contacterInfo.setContacterMobile(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterMobile"));
			contacterInfo.setContacterType(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterType"));
			contacterInfo.setContacterName(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterName"));
			contacterInfo.setContacterPosition(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterPosition"));
			contacterInfo.setMobileConfirmed(_ctx.booleanValue("FindAllContacterResponse.Data["+ i +"].MobileConfirmed"));
			contacterInfo.setEmailConfirmed(_ctx.booleanValue("FindAllContacterResponse.Data["+ i +"].EmailConfirmed"));
			contacterInfo.setContacterStaffNo(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterStaffNo"));
			contacterInfo.setContacterDingding(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterDingding"));
			contacterInfo.setContacterAddress(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterAddress"));
			contacterInfo.setContacterWangwang(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterWangwang"));
			contacterInfo.setContacterEmail(_ctx.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterEmail"));

			data.add(contacterInfo);
		}
		findAllContacterResponse.setData(data);
	 
	 	return findAllContacterResponse;
	}
}