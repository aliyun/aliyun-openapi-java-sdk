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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.ListEmailVerificationResponse;
import com.aliyuncs.domain_intl.model.v20171218.ListEmailVerificationResponse.EmailVerification;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmailVerificationResponseUnmarshaller {

	public static ListEmailVerificationResponse unmarshall(ListEmailVerificationResponse listEmailVerificationResponse, UnmarshallerContext _ctx) {
		
		listEmailVerificationResponse.setRequestId(_ctx.stringValue("ListEmailVerificationResponse.RequestId"));
		listEmailVerificationResponse.setPrePage(_ctx.booleanValue("ListEmailVerificationResponse.PrePage"));
		listEmailVerificationResponse.setCurrentPageNum(_ctx.integerValue("ListEmailVerificationResponse.CurrentPageNum"));
		listEmailVerificationResponse.setPageSize(_ctx.integerValue("ListEmailVerificationResponse.PageSize"));
		listEmailVerificationResponse.setTotalPageNum(_ctx.integerValue("ListEmailVerificationResponse.TotalPageNum"));
		listEmailVerificationResponse.setTotalItemNum(_ctx.integerValue("ListEmailVerificationResponse.TotalItemNum"));
		listEmailVerificationResponse.setNextPage(_ctx.booleanValue("ListEmailVerificationResponse.NextPage"));

		List<EmailVerification> data = new ArrayList<EmailVerification>();
		for (int i = 0; i < _ctx.lengthValue("ListEmailVerificationResponse.Data.Length"); i++) {
			EmailVerification emailVerification = new EmailVerification();
			emailVerification.setVerificationTime(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].VerificationTime"));
			emailVerification.setEmail(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].Email"));
			emailVerification.setEmailVerificationNo(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].EmailVerificationNo"));
			emailVerification.setUserId(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].UserId"));
			emailVerification.setGmtCreate(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].GmtCreate"));
			emailVerification.setVerificationStatus(_ctx.integerValue("ListEmailVerificationResponse.Data["+ i +"].VerificationStatus"));
			emailVerification.setTokenSendTime(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].TokenSendTime"));
			emailVerification.setSendIp(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].SendIp"));
			emailVerification.setGmtModified(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].GmtModified"));
			emailVerification.setConfirmIp(_ctx.stringValue("ListEmailVerificationResponse.Data["+ i +"].ConfirmIp"));

			data.add(emailVerification);
		}
		listEmailVerificationResponse.setData(data);
	 
	 	return listEmailVerificationResponse;
	}
}