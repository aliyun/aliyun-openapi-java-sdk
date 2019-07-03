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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeSubDomainRecordsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeSubDomainRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubDomainRecordsResponseUnmarshaller {

	public static DescribeSubDomainRecordsResponse unmarshall(DescribeSubDomainRecordsResponse describeSubDomainRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSubDomainRecordsResponse.setRequestId(_ctx.stringValue("DescribeSubDomainRecordsResponse.RequestId"));
		describeSubDomainRecordsResponse.setTotalCount(_ctx.longValue("DescribeSubDomainRecordsResponse.TotalCount"));
		describeSubDomainRecordsResponse.setPageNumber(_ctx.longValue("DescribeSubDomainRecordsResponse.PageNumber"));
		describeSubDomainRecordsResponse.setPageSize(_ctx.longValue("DescribeSubDomainRecordsResponse.PageSize"));

		List<Record> domainRecords = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSubDomainRecordsResponse.DomainRecords.Length"); i++) {
			Record record = new Record();
			record.setDomainName(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].DomainName"));
			record.setRecordId(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].RecordId"));
			record.setRR(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].RR"));
			record.setType(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Type"));
			record.setValue(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Value"));
			record.setTTL(_ctx.longValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].TTL"));
			record.setPriority(_ctx.longValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Priority"));
			record.setLine(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Line"));
			record.setStatus(_ctx.stringValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Status"));
			record.setLocked(_ctx.booleanValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Locked"));
			record.setWeight(_ctx.integerValue("DescribeSubDomainRecordsResponse.DomainRecords["+ i +"].Weight"));

			domainRecords.add(record);
		}
		describeSubDomainRecordsResponse.setDomainRecords(domainRecords);
	 
	 	return describeSubDomainRecordsResponse;
	}
}