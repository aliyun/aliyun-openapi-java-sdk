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
package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRecordInfoResponseUnmarshaller {

	public static DescribeDomainRecordInfoResponse unmarshall(DescribeDomainRecordInfoResponse describeDomainRecordInfoResponse, UnmarshallerContext context) {
		
		describeDomainRecordInfoResponse.setRequestId(context.stringValue("DescribeDomainRecordInfoResponse.RequestId"));
		describeDomainRecordInfoResponse.setDomainId(context.stringValue("DescribeDomainRecordInfoResponse.DomainId"));
		describeDomainRecordInfoResponse.setDomainName(context.stringValue("DescribeDomainRecordInfoResponse.DomainName"));
		describeDomainRecordInfoResponse.setPunyCode(context.stringValue("DescribeDomainRecordInfoResponse.PunyCode"));
		describeDomainRecordInfoResponse.setGroupId(context.stringValue("DescribeDomainRecordInfoResponse.GroupId"));
		describeDomainRecordInfoResponse.setGroupName(context.stringValue("DescribeDomainRecordInfoResponse.GroupName"));
		describeDomainRecordInfoResponse.setRecordId(context.stringValue("DescribeDomainRecordInfoResponse.RecordId"));
		describeDomainRecordInfoResponse.setRR(context.stringValue("DescribeDomainRecordInfoResponse.RR"));
		describeDomainRecordInfoResponse.setType(context.stringValue("DescribeDomainRecordInfoResponse.Type"));
		describeDomainRecordInfoResponse.setValue(context.stringValue("DescribeDomainRecordInfoResponse.Value"));
		describeDomainRecordInfoResponse.setTTL(context.longValue("DescribeDomainRecordInfoResponse.TTL"));
		describeDomainRecordInfoResponse.setPriority(context.longValue("DescribeDomainRecordInfoResponse.Priority"));
		describeDomainRecordInfoResponse.setLine(context.stringValue("DescribeDomainRecordInfoResponse.Line"));
		describeDomainRecordInfoResponse.setStatus(context.stringValue("DescribeDomainRecordInfoResponse.Status"));
		describeDomainRecordInfoResponse.setLocked(context.booleanValue("DescribeDomainRecordInfoResponse.Locked"));
	 
	 	return describeDomainRecordInfoResponse;
	}
}