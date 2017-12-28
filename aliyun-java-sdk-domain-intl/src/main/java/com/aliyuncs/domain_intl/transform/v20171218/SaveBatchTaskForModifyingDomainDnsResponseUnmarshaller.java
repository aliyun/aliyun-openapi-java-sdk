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
package com.aliyuncs.domain_intl.transform.v20171218;

import com.aliyuncs.domain_intl.model.v20171218.SaveBatchTaskForModifyingDomainDnsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveBatchTaskForModifyingDomainDnsResponseUnmarshaller {

	public static SaveBatchTaskForModifyingDomainDnsResponse unmarshall(SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDnsResponse, UnmarshallerContext context) {
		
		saveBatchTaskForModifyingDomainDnsResponse.setRequestId(context.stringValue("SaveBatchTaskForModifyingDomainDnsResponse.RequestId"));
		saveBatchTaskForModifyingDomainDnsResponse.setTaskNo(context.stringValue("SaveBatchTaskForModifyingDomainDnsResponse.TaskNo"));
	 
	 	return saveBatchTaskForModifyingDomainDnsResponse;
	}
}