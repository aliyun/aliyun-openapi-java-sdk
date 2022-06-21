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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetDomainDnsRecordsResponse;
import com.aliyuncs.swas.model.v20170810.GetDomainDnsRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainDnsRecordsResponseUnmarshaller {

	public static GetDomainDnsRecordsResponse unmarshall(GetDomainDnsRecordsResponse getDomainDnsRecordsResponse, UnmarshallerContext _ctx) {
		
		getDomainDnsRecordsResponse.setRequestId(_ctx.stringValue("GetDomainDnsRecordsResponse.RequestId"));
		getDomainDnsRecordsResponse.setIsSuccess(_ctx.booleanValue("GetDomainDnsRecordsResponse.IsSuccess"));
		getDomainDnsRecordsResponse.setCode(_ctx.stringValue("GetDomainDnsRecordsResponse.Code"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("GetDomainDnsRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setType(_ctx.stringValue("GetDomainDnsRecordsResponse.Records["+ i +"].Type"));
			record.setValue(_ctx.stringValue("GetDomainDnsRecordsResponse.Records["+ i +"].Value"));
			record.setDomain(_ctx.stringValue("GetDomainDnsRecordsResponse.Records["+ i +"].Domain"));
			record.setRecordId(_ctx.stringValue("GetDomainDnsRecordsResponse.Records["+ i +"].RecordId"));

			records.add(record);
		}
		getDomainDnsRecordsResponse.setRecords(records);
	 
	 	return getDomainDnsRecordsResponse;
	}
}