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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainRecordDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainRecordDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainRecordDataResponseUnmarshaller {

	public static DescribeVsDomainRecordDataResponse unmarshall(DescribeVsDomainRecordDataResponse describeVsDomainRecordDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainRecordDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainRecordDataResponse.RequestId"));
		describeVsDomainRecordDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainRecordDataResponse.DomainName"));
		describeVsDomainRecordDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainRecordDataResponse.StartTime"));
		describeVsDomainRecordDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainRecordDataResponse.EndTime"));

		List<DataModule> recordDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainRecordDataResponse.RecordDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDomainRecordDataResponse.RecordDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setRecordValue(_ctx.stringValue("DescribeVsDomainRecordDataResponse.RecordDataPerInterval["+ i +"].RecordValue"));

			recordDataPerInterval.add(dataModule);
		}
		describeVsDomainRecordDataResponse.setRecordDataPerInterval(recordDataPerInterval);
	 
	 	return describeVsDomainRecordDataResponse;
	}
}