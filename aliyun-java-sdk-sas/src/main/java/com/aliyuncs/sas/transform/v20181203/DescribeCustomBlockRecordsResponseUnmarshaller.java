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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeCustomBlockRecordsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCustomBlockRecordsResponse.CustomRecord;
import com.aliyuncs.sas.model.v20181203.DescribeCustomBlockRecordsResponse.CustomRecord.Target;
import com.aliyuncs.sas.model.v20181203.DescribeCustomBlockRecordsResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomBlockRecordsResponseUnmarshaller {

	public static DescribeCustomBlockRecordsResponse unmarshall(DescribeCustomBlockRecordsResponse describeCustomBlockRecordsResponse, UnmarshallerContext _ctx) {
		
		describeCustomBlockRecordsResponse.setRequestId(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeCustomBlockRecordsResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeCustomBlockRecordsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeCustomBlockRecordsResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeCustomBlockRecordsResponse.PageInfo.Count"));
		describeCustomBlockRecordsResponse.setPageInfo(pageInfo);

		List<CustomRecord> recordList = new ArrayList<CustomRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomBlockRecordsResponse.RecordList.Length"); i++) {
			CustomRecord customRecord = new CustomRecord();
			customRecord.setStatus(_ctx.integerValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].Status"));
			customRecord.setBlockExpireDate(_ctx.longValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].BlockExpireDate"));
			customRecord.setEnableCount(_ctx.integerValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].EnableCount"));
			customRecord.setServerCount(_ctx.integerValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].ServerCount"));
			customRecord.setBlockIp(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].BlockIp"));
			customRecord.setBound(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].Bound"));
			customRecord.setSource(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].Source"));
			customRecord.setId(_ctx.longValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].Id"));

			List<Target> targetList = new ArrayList<Target>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].TargetList.Length"); j++) {
				Target target = new Target();
				target.setTarget(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].TargetList["+ j +"].Target"));
				target.setTargetType(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].TargetList["+ j +"].TargetType"));
				target.setTargetResult(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].TargetList["+ j +"].TargetResult"));
				target.setSuccessInfo(_ctx.stringValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].TargetList["+ j +"].SuccessInfo"));
				target.setStatus(_ctx.integerValue("DescribeCustomBlockRecordsResponse.RecordList["+ i +"].TargetList["+ j +"].Status"));

				targetList.add(target);
			}
			customRecord.setTargetList(targetList);

			recordList.add(customRecord);
		}
		describeCustomBlockRecordsResponse.setRecordList(recordList);
	 
	 	return describeCustomBlockRecordsResponse;
	}
}