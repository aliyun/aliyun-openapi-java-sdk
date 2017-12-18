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
package com.aliyuncs.cf.transform.v20151127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cf.model.v20151127.CfAccountQueryResponse;
import com.aliyuncs.cf.model.v20151127.CfAccountQueryResponse.AccountQueryResponse;
import com.aliyuncs.cf.model.v20151127.CfAccountQueryResponse.AccountQueryResponse.AccountRiskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class CfAccountQueryResponseUnmarshaller {

	public static CfAccountQueryResponse unmarshall(CfAccountQueryResponse cfAccountQueryResponse, UnmarshallerContext context) {
		
		cfAccountQueryResponse.setRequestId(context.stringValue("CfAccountQueryResponse.RequestId"));
		cfAccountQueryResponse.setSuccess(context.booleanValue("CfAccountQueryResponse.Success"));
		cfAccountQueryResponse.setMessage(context.stringValue("CfAccountQueryResponse.Message"));
		cfAccountQueryResponse.setDetailMessage(context.stringValue("CfAccountQueryResponse.DetailMessage"));

		AccountQueryResponse accountQueryResponse = new AccountQueryResponse();
		accountQueryResponse.setRiskLevel(context.stringValue("CfAccountQueryResponse.AccountQueryResponse.RiskLevel"));
		accountQueryResponse.setScore(context.stringValue("CfAccountQueryResponse.AccountQueryResponse.Score"));
		accountQueryResponse.setEventId(context.stringValue("CfAccountQueryResponse.AccountQueryResponse.EventId"));

		List<AccountRiskDetail> detail = new ArrayList<AccountRiskDetail>();
		for (int i = 0; i < context.lengthValue("CfAccountQueryResponse.AccountQueryResponse.Detail.Length"); i++) {
			AccountRiskDetail accountRiskDetail = new AccountRiskDetail();
			accountRiskDetail.setName(context.stringValue("CfAccountQueryResponse.AccountQueryResponse.Detail["+ i +"].Name"));

			detail.add(accountRiskDetail);
		}
		accountQueryResponse.setDetail(detail);
		cfAccountQueryResponse.setAccountQueryResponse(accountQueryResponse);
	 
	 	return cfAccountQueryResponse;
	}
}