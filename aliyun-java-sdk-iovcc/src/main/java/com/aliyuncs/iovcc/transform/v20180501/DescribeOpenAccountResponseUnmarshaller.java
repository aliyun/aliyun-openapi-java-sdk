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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeOpenAccountResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeOpenAccountResponse.OpenAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOpenAccountResponseUnmarshaller {

	public static DescribeOpenAccountResponse unmarshall(DescribeOpenAccountResponse describeOpenAccountResponse, UnmarshallerContext _ctx) {
		
		describeOpenAccountResponse.setRequestId(_ctx.stringValue("DescribeOpenAccountResponse.RequestId"));

		OpenAccount openAccount = new OpenAccount();
		openAccount.setIdentityId(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.IdentityId"));
		openAccount.setAliyunId(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.AliyunId"));
		openAccount.setDisplayName(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.DisplayName"));
		openAccount.setLoginId(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.LoginId"));
		openAccount.setIdp(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.Idp"));
		openAccount.setOpenId(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.OpenId"));
		openAccount.setMobile(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.Mobile"));
		openAccount.setType(_ctx.integerValue("DescribeOpenAccountResponse.OpenAccount.Type"));
		openAccount.setStatus(_ctx.integerValue("DescribeOpenAccountResponse.OpenAccount.Status"));
		openAccount.setRegion(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.Region"));
		openAccount.setCreateAccessKey(_ctx.stringValue("DescribeOpenAccountResponse.OpenAccount.CreateAccessKey"));
		describeOpenAccountResponse.setOpenAccount(openAccount);
	 
	 	return describeOpenAccountResponse;
	}
}