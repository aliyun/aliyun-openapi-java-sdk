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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeAIInstanceResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeAIInstanceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeAIInstanceResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAIInstanceResponseUnmarshaller {

	public static DescribeAIInstanceResponse unmarshall(DescribeAIInstanceResponse describeAIInstanceResponse, UnmarshallerContext _ctx) {
		
		describeAIInstanceResponse.setRequestId(_ctx.stringValue("DescribeAIInstanceResponse.RequestId"));
		describeAIInstanceResponse.setCode(_ctx.stringValue("DescribeAIInstanceResponse.Code"));
		describeAIInstanceResponse.setMessage(_ctx.stringValue("DescribeAIInstanceResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeAIInstanceResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("DescribeAIInstanceResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("DescribeAIInstanceResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIInstanceResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setInstanceId(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].InstanceId"));
			recordsItem.setInstanceName(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].InstanceName"));
			recordsItem.setAlgorithmId(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].AlgorithmId"));
			recordsItem.setAlgorithmName(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].AlgorithmName"));
			recordsItem.setComputeType(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].ComputeType"));
			recordsItem.setDataSource(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].DataSource"));
			recordsItem.setDataType(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].DataType"));
			recordsItem.setScheduleType(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].ScheduleType"));
			recordsItem.setScheduleCycleDates(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].ScheduleCycleDates"));
			recordsItem.setScheduleTimes(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].ScheduleTimes"));
			recordsItem.setSpf(_ctx.longValue("DescribeAIInstanceResponse.Data.Records["+ i +"].Spf"));
			recordsItem.setStatus(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].Status"));
			recordsItem.setCreateDateTime(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].CreateDateTime"));
			recordsItem.setAcuUsed(_ctx.longValue("DescribeAIInstanceResponse.Data.Records["+ i +"].AcuUsed"));
			recordsItem.setCameraNumber(_ctx.longValue("DescribeAIInstanceResponse.Data.Records["+ i +"].CameraNumber"));
			recordsItem.setStorage(_ctx.doubleValue("DescribeAIInstanceResponse.Data.Records["+ i +"].Storage"));
			recordsItem.setInstanceType(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].InstanceType"));
			recordsItem.setDataSourceTimes(_ctx.stringValue("DescribeAIInstanceResponse.Data.Records["+ i +"].DataSourceTimes"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		describeAIInstanceResponse.setData(data);
	 
	 	return describeAIInstanceResponse;
	}
}