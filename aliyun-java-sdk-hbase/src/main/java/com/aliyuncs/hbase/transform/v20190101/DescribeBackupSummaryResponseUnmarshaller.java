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

import com.aliyuncs.hbase.model.v20190101.DescribeBackupSummaryResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeBackupSummaryResponse.Full;
import com.aliyuncs.hbase.model.v20190101.DescribeBackupSummaryResponse.Full.Record;
import com.aliyuncs.hbase.model.v20190101.DescribeBackupSummaryResponse.Incr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSummaryResponseUnmarshaller {

	public static DescribeBackupSummaryResponse unmarshall(DescribeBackupSummaryResponse describeBackupSummaryResponse, UnmarshallerContext _ctx) {
		
		describeBackupSummaryResponse.setRequestId(_ctx.stringValue("DescribeBackupSummaryResponse.RequestId"));

		Incr incr = new Incr();
		incr.setPos(_ctx.stringValue("DescribeBackupSummaryResponse.Incr.Pos"));
		incr.setQueueLogNum(_ctx.stringValue("DescribeBackupSummaryResponse.Incr.QueueLogNum"));
		incr.setSpeed(_ctx.stringValue("DescribeBackupSummaryResponse.Incr.Speed"));
		incr.setStatus(_ctx.stringValue("DescribeBackupSummaryResponse.Incr.Status"));
		incr.setRunningLogNum(_ctx.stringValue("DescribeBackupSummaryResponse.Incr.RunningLogNum"));
		incr.setBackupLogSize(_ctx.stringValue("DescribeBackupSummaryResponse.Incr.BackupLogSize"));
		describeBackupSummaryResponse.setIncr(incr);

		Full full = new Full();
		full.setHasMore(_ctx.stringValue("DescribeBackupSummaryResponse.Full.HasMore"));
		full.setNextFullBackupDate(_ctx.stringValue("DescribeBackupSummaryResponse.Full.NextFullBackupDate"));
		full.setPageNumber(_ctx.integerValue("DescribeBackupSummaryResponse.Full.PageNumber"));
		full.setPageSize(_ctx.integerValue("DescribeBackupSummaryResponse.Full.PageSize"));
		full.setTotal(_ctx.integerValue("DescribeBackupSummaryResponse.Full.Total"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupSummaryResponse.Full.Records.Length"); i++) {
			Record record = new Record();
			record.setRecordId(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].RecordId"));
			record.setFinishTime(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].FinishTime"));
			record.setProcess(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].Process"));
			record.setCreateTime(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].CreateTime"));
			record.setDataSize(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].DataSize"));
			record.setSpeed(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].Speed"));
			record.setStatus(_ctx.stringValue("DescribeBackupSummaryResponse.Full.Records["+ i +"].Status"));

			records.add(record);
		}
		full.setRecords(records);
		describeBackupSummaryResponse.setFull(full);
	 
	 	return describeBackupSummaryResponse;
	}
}