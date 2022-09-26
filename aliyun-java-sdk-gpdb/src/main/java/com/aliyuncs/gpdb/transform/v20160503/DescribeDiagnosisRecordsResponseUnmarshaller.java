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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDiagnosisRecordsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDiagnosisRecordsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisRecordsResponseUnmarshaller {

	public static DescribeDiagnosisRecordsResponse unmarshall(DescribeDiagnosisRecordsResponse describeDiagnosisRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisRecordsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisRecordsResponse.RequestId"));
		describeDiagnosisRecordsResponse.setTotalCount(_ctx.integerValue("DescribeDiagnosisRecordsResponse.TotalCount"));
		describeDiagnosisRecordsResponse.setPageNumber(_ctx.integerValue("DescribeDiagnosisRecordsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisRecordsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setQueryID(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].QueryID"));
			item.setSessionID(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].SessionID"));
			item.setStartTime(_ctx.longValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].StartTime"));
			item.setDuration(_ctx.integerValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].Duration"));
			item.setStatus(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].Status"));
			item.setSQLStmt(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].SQLStmt"));
			item.setUser(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].User"));
			item.setDatabase(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].Database"));
			item.setSQLTruncated(_ctx.booleanValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].SQLTruncated"));
			item.setSQLTruncatedThreshold(_ctx.integerValue("DescribeDiagnosisRecordsResponse.Items["+ i +"].SQLTruncatedThreshold"));

			items.add(item);
		}
		describeDiagnosisRecordsResponse.setItems(items);
	 
	 	return describeDiagnosisRecordsResponse;
	}
}