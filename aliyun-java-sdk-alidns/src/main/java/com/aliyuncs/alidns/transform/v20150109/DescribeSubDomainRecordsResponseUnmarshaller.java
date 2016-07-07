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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeSubDomainRecordsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeSubDomainRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubDomainRecordsResponseUnmarshaller {

	public static DescribeSubDomainRecordsResponse unmarshall(DescribeSubDomainRecordsResponse describeSubDomainRecordsResponse, UnmarshallerContext context) {
		
		describeSubDomainRecordsResponse.setRequestId(context.stringValue("DescribeSubDomainRecordsResponse.RequestId"));
		describeSubDomainRecordsResponse.setTotalCount(context.longValue("DescribeSubDomainRecordsResponse.TotalCount"));
		describeSubDomainRecordsResponse.setPageNumber(context.longValue("DescribeSubDomainRecordsResponse.PageNumber"));
		describeSubDomainRecordsResponse.setPageSize(context.longValue("DescribeSubDomainRecordsResponse.PageSize"));

		List<Record> domainRecords = new ArrayList<Record>();
		for (int i = 0; i < context.lengthValue("DescribeSubDomainRecordsResponse.DomainRecords.Length"); i++) {
			Record record = new Record();
			record.setDomainName(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].DomainName"));
			record.setRecordId(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].RecordId"));
			record.setRR(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].RR"));
			record.setType(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Type"));
			record.setValue(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Value"));
			record.setTTL(context.longValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].TTL"));
			record.setPriority(context.longValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Priority"));
			record.setLine(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Line"));
			record.setStatus(context.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Status"));
			record.setLocked(context.booleanValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Locked"));
			record.setWeight(context.integerValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Weight"));

			domainRecords.add(record);
		}
		describeSubDomainRecordsResponse.setDomainRecords(domainRecords);
	 
	 	return describeSubDomainRecordsResponse;
	}
}