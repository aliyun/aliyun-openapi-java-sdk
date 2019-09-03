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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeModifyParameterLogResponse;
import com.aliyuncs.rds.model.v20140815.DescribeModifyParameterLogResponse.ParameterChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModifyParameterLogResponseUnmarshaller {

	public static DescribeModifyParameterLogResponse unmarshall(DescribeModifyParameterLogResponse describeModifyParameterLogResponse, UnmarshallerContext _ctx) {
		
		describeModifyParameterLogResponse.setRequestId(_ctx.stringValue("DescribeModifyParameterLogResponse.RequestId"));
		describeModifyParameterLogResponse.setEngine(_ctx.stringValue("DescribeModifyParameterLogResponse.Engine"));
		describeModifyParameterLogResponse.setDBInstanceId(_ctx.stringValue("DescribeModifyParameterLogResponse.DBInstanceId"));
		describeModifyParameterLogResponse.setEngineVersion(_ctx.stringValue("DescribeModifyParameterLogResponse.EngineVersion"));
		describeModifyParameterLogResponse.setTotalRecordCount(_ctx.integerValue("DescribeModifyParameterLogResponse.TotalRecordCount"));
		describeModifyParameterLogResponse.setPageNumber(_ctx.integerValue("DescribeModifyParameterLogResponse.PageNumber"));
		describeModifyParameterLogResponse.setPageRecordCount(_ctx.integerValue("DescribeModifyParameterLogResponse.PageRecordCount"));

		List<ParameterChangeLog> items = new ArrayList<ParameterChangeLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModifyParameterLogResponse.Items.Length"); i++) {
			ParameterChangeLog parameterChangeLog = new ParameterChangeLog();
			parameterChangeLog.setModifyTime(_ctx.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].ModifyTime"));
			parameterChangeLog.setOldParameterValue(_ctx.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].OldParameterValue"));
			parameterChangeLog.setNewParameterValue(_ctx.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].NewParameterValue"));
			parameterChangeLog.setParameterName(_ctx.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].ParameterName"));
			parameterChangeLog.setStatus(_ctx.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].Status"));

			items.add(parameterChangeLog);
		}
		describeModifyParameterLogResponse.setItems(items);
	 
	 	return describeModifyParameterLogResponse;
	}
}