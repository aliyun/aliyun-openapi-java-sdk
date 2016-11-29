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
package com.aliyuncs.jaq.transform.v20161123;

import com.aliyuncs.jaq.model.v20161123.CheckAccountAndPasswordRiskResponse;
import com.aliyuncs.jaq.model.v20161123.CheckAccountAndPasswordRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckAccountAndPasswordRiskResponseUnmarshaller {

	public static CheckAccountAndPasswordRiskResponse unmarshall(CheckAccountAndPasswordRiskResponse checkAccountAndPasswordRiskResponse, UnmarshallerContext context) {
		
		checkAccountAndPasswordRiskResponse.setErrorCode(context.integerValue("CheckAccountAndPasswordRiskResponse.ErrorCode"));
		checkAccountAndPasswordRiskResponse.setErrorMsg(context.stringValue("CheckAccountAndPasswordRiskResponse.ErrorMsg"));

		Data data = new Data();
		data.setFnalDecision(context.integerValue("CheckAccountAndPasswordRiskResponse.Data.FnalDecision"));
		data.setEventId(context.stringValue("CheckAccountAndPasswordRiskResponse.Data.EventId"));
		data.setUserId(context.stringValue("CheckAccountAndPasswordRiskResponse.Data.UserId"));
		data.setFinalScore(context.integerValue("CheckAccountAndPasswordRiskResponse.Data.FinalScore"));
		data.setFinalDesc(context.stringValue("CheckAccountAndPasswordRiskResponse.Data.FinalDesc"));
		data.setDetail(context.stringValue("CheckAccountAndPasswordRiskResponse.Data.Detail"));
		data.setCaptchaCheckData(context.stringValue("CheckAccountAndPasswordRiskResponse.Data.CaptchaCheckData"));
		checkAccountAndPasswordRiskResponse.setData(data);
	 
	 	return checkAccountAndPasswordRiskResponse;
	}
}