/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.rds.model.v20140815.DescribeModifyParameterLogResponse;
import com.aliyuncs.rds.model.v20140815.DescribeModifyParameterLogResponse.ParameterChangeLog;
import com.aliyuncs.rds.model.v20140815.DescribeModifyParameterLogResponse.ParameterChangeLog.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModifyParameterLogResponseUnmarshaller {

	public static DescribeModifyParameterLogResponse unmarshall(DescribeModifyParameterLogResponse describeModifyParameterLogResponse, UnmarshallerContext context) {
		
		describeModifyParameterLogResponse.setRequestId(context.stringValue("DescribeModifyParameterLogResponse.RequestId"));
		describeModifyParameterLogResponse.setEngine(context.stringValue("DescribeModifyParameterLogResponse.Engine"));
		describeModifyParameterLogResponse.setDBInstanceId(context.stringValue("DescribeModifyParameterLogResponse.DBInstanceId"));
		describeModifyParameterLogResponse.setEngineVersion(context.stringValue("DescribeModifyParameterLogResponse.EngineVersion"));
		describeModifyParameterLogResponse.setTotalRecordCount(context.integerValue("DescribeModifyParameterLogResponse.TotalRecordCount"));
		describeModifyParameterLogResponse.setPageNumber(context.integerValue("DescribeModifyParameterLogResponse.PageNumber"));
		describeModifyParameterLogResponse.setPageRecordCount(context.integerValue("DescribeModifyParameterLogResponse.PageRecordCount"));

		List<ParameterChangeLog> items = new ArrayList<ParameterChangeLog>();
		for (int i = 0; i < context.lengthValue("DescribeModifyParameterLogResponse.Items.Length"); i++) {
			ParameterChangeLog  parameterChangeLog = new ParameterChangeLog();
			parameterChangeLog.setModifyTime(context.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].ModifyTime"));
			parameterChangeLog.setOldParameterValue(context.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].OldParameterValue"));
			parameterChangeLog.setNewParameterValue(context.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].NewParameterValue"));
			parameterChangeLog.setParameterName(context.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].ParameterName"));
			parameterChangeLog.setStatus(Status.getEnum(context.stringValue("DescribeModifyParameterLogResponse.Items["+ i +"].Status")));

			items.add(parameterChangeLog);
		}
		describeModifyParameterLogResponse.setItems(items);
	 
	 	return describeModifyParameterLogResponse;
	}
}