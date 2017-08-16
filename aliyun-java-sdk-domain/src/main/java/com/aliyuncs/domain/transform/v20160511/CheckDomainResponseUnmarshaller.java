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
package com.aliyuncs.domain.transform.v20160511;

import com.aliyuncs.domain.model.v20160511.CheckDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDomainResponseUnmarshaller {

	public static CheckDomainResponse unmarshall(CheckDomainResponse checkDomainResponse, UnmarshallerContext context) {
		
		checkDomainResponse.setRequestId(context.stringValue("CheckDomainResponse.RequestId"));
		checkDomainResponse.setName(context.stringValue("CheckDomainResponse.Name"));
		checkDomainResponse.setAvail(context.integerValue("CheckDomainResponse.Avail"));
		checkDomainResponse.setReason(context.stringValue("CheckDomainResponse.Reason"));
		checkDomainResponse.setFeeCurrency(context.stringValue("CheckDomainResponse.FeeCurrency"));
		checkDomainResponse.setFeePeriod(context.integerValue("CheckDomainResponse.FeePeriod"));
		checkDomainResponse.setFeeFee(context.stringValue("CheckDomainResponse.FeeFee"));
		checkDomainResponse.setRmbFee(context.stringValue("CheckDomainResponse.RmbFee"));
		checkDomainResponse.setFeeCommand(context.stringValue("CheckDomainResponse.FeeCommand"));
	 
	 	return checkDomainResponse;
	}
}