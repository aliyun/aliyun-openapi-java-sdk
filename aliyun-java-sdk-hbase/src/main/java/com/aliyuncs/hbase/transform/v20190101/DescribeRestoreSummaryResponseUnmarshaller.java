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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeRestoreSummaryResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreSummaryResponse.Rescord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreSummaryResponseUnmarshaller {

	public static DescribeRestoreSummaryResponse unmarshall(DescribeRestoreSummaryResponse describeRestoreSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRestoreSummaryResponse.setRequestId(_ctx.stringValue("DescribeRestoreSummaryResponse.RequestId"));
		describeRestoreSummaryResponse.setRestoreRecordSize(_ctx.integerValue("DescribeRestoreSummaryResponse.RestoreRecordSize"));
		describeRestoreSummaryResponse.setHasMoreRestoreRecord(_ctx.integerValue("DescribeRestoreSummaryResponse.HasMoreRestoreRecord"));

		List<Rescord> rescords = new ArrayList<Rescord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreSummaryResponse.Rescords.Length"); i++) {
			Rescord rescord = new Rescord();
			rescord.setRecordId(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].RecordId"));
			rescord.setFinishTime(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].FinishTime"));
			rescord.setSchemaProcess(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].SchemaProcess"));
			rescord.setHfileRestoreProcess(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].HfileRestoreProcess"));
			rescord.setCreateTime(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].CreateTime"));
			rescord.setBulkLoadProcess(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].BulkLoadProcess"));
			rescord.setStatus(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].Status"));
			rescord.setLogProcess(_ctx.stringValue("DescribeRestoreSummaryResponse.Rescords["+ i +"].LogProcess"));

			rescords.add(rescord);
		}
		describeRestoreSummaryResponse.setRescords(rescords);
	 
	 	return describeRestoreSummaryResponse;
	}
}