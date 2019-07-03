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

import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRecordsResponseUnmarshaller {

	public static DescribeDomainRecordsResponse unmarshall(DescribeDomainRecordsResponse describeDomainRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDomainRecordsResponse.setRequestId(_ctx.stringValue("DescribeDomainRecordsResponse.RequestId"));
		describeDomainRecordsResponse.setTotalCount(_ctx.longValue("DescribeDomainRecordsResponse.TotalCount"));
		describeDomainRecordsResponse.setPageNumber(_ctx.longValue("DescribeDomainRecordsResponse.PageNumber"));
		describeDomainRecordsResponse.setPageSize(_ctx.longValue("DescribeDomainRecordsResponse.PageSize"));

		List<Record> domainRecords = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRecordsResponse.DomainRecords.Length"); i++) {
			Record record = new Record();
			record.setDomainName(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].DomainName"));
			record.setRecordId(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].RecordId"));
			record.setRR(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].RR"));
			record.setType(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Type"));
			record.setValue(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Value"));
			record.setTTL(_ctx.longValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].TTL"));
			record.setPriority(_ctx.longValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Priority"));
			record.setLine(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Line"));
			record.setStatus(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Status"));
			record.setLocked(_ctx.booleanValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Locked"));
			record.setWeight(_ctx.integerValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Weight"));
			record.setRemark(_ctx.stringValue("DescribeDomainRecordsResponse.DomainRecords["+ i +"].Remark"));

			domainRecords.add(record);
		}
		describeDomainRecordsResponse.setDomainRecords(domainRecords);
	 
	 	return describeDomainRecordsResponse;
	}
}