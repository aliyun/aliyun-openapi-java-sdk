/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.ListEmailVerificationResponse;
import com.aliyuncs.domain.model.v20180129.ListEmailVerificationResponse.EmailVerification;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmailVerificationResponseUnmarshaller {

	public static ListEmailVerificationResponse unmarshall(ListEmailVerificationResponse listEmailVerificationResponse, UnmarshallerContext context) {
		
		listEmailVerificationResponse.setRequestId(context.stringValue("ListEmailVerificationResponse.RequestId"));
		listEmailVerificationResponse.setTotalItemNum(context.integerValue("ListEmailVerificationResponse.TotalItemNum"));
		listEmailVerificationResponse.setCurrentPageNum(context.integerValue("ListEmailVerificationResponse.CurrentPageNum"));
		listEmailVerificationResponse.setTotalPageNum(context.integerValue("ListEmailVerificationResponse.TotalPageNum"));
		listEmailVerificationResponse.setPageSize(context.integerValue("ListEmailVerificationResponse.PageSize"));
		listEmailVerificationResponse.setPrePage(context.booleanValue("ListEmailVerificationResponse.PrePage"));
		listEmailVerificationResponse.setNextPage(context.booleanValue("ListEmailVerificationResponse.NextPage"));

		List<EmailVerification> data = new ArrayList<EmailVerification>();
		for (int i = 0; i < context.lengthValue("ListEmailVerificationResponse.Data.Length"); i++) {
			EmailVerification emailVerification = new EmailVerification();
			emailVerification.setGmtCreate(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].GmtCreate"));
			emailVerification.setGmtModified(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].GmtModified"));
			emailVerification.setEmail(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].Email"));
			emailVerification.setUserId(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].UserId"));
			emailVerification.setEmailVerificationNo(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].EmailVerificationNo"));
			emailVerification.setTokenSendTime(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].TokenSendTime"));
			emailVerification.setVerificationStatus(context.integerValue("ListEmailVerificationResponse.Data["+ i +"].VerificationStatus"));
			emailVerification.setVerificationTime(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].VerificationTime"));
			emailVerification.setSendIp(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].SendIp"));
			emailVerification.setConfirmIp(context.stringValue("ListEmailVerificationResponse.Data["+ i +"].ConfirmIp"));

			data.add(emailVerification);
		}
		listEmailVerificationResponse.setData(data);
	 
	 	return listEmailVerificationResponse;
	}
}