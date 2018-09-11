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

import com.aliyuncs.rds.model.v20140815.DescribeTemplateSqlDetailResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTemplateSqlDetailResponse.TemplateSqlDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplateSqlDetailResponseUnmarshaller {

	public static DescribeTemplateSqlDetailResponse unmarshall(DescribeTemplateSqlDetailResponse describeTemplateSqlDetailResponse, UnmarshallerContext context) {
		
		describeTemplateSqlDetailResponse.setRequestId(context.stringValue("DescribeTemplateSqlDetailResponse.RequestId"));
		describeTemplateSqlDetailResponse.setDBInstanceID(context.integerValue("DescribeTemplateSqlDetailResponse.DBInstanceID"));
		describeTemplateSqlDetailResponse.setDBInstanceName(context.stringValue("DescribeTemplateSqlDetailResponse.DBInstanceName"));
		describeTemplateSqlDetailResponse.setStartTime(context.stringValue("DescribeTemplateSqlDetailResponse.StartTime"));
		describeTemplateSqlDetailResponse.setEndTime(context.stringValue("DescribeTemplateSqlDetailResponse.EndTime"));
		describeTemplateSqlDetailResponse.setTotalRecords(context.integerValue("DescribeTemplateSqlDetailResponse.TotalRecords"));
		describeTemplateSqlDetailResponse.setPagingID(context.stringValue("DescribeTemplateSqlDetailResponse.PagingID"));
		describeTemplateSqlDetailResponse.setMaxRecordsPerPage(context.integerValue("DescribeTemplateSqlDetailResponse.MaxRecordsPerPage"));
		describeTemplateSqlDetailResponse.setPageNumbers(context.integerValue("DescribeTemplateSqlDetailResponse.PageNumbers"));
		describeTemplateSqlDetailResponse.setItemsNumbers(context.integerValue("DescribeTemplateSqlDetailResponse.ItemsNumbers"));

		List<TemplateSqlDetail> items = new ArrayList<TemplateSqlDetail>();
		for (int i = 0; i < context.lengthValue("DescribeTemplateSqlDetailResponse.Items.Length"); i++) {
			TemplateSqlDetail templateSqlDetail = new TemplateSqlDetail();
			templateSqlDetail.setDBName(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].DBName"));
			templateSqlDetail.setAccountName(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].AccountName"));
			templateSqlDetail.setHostAddress(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].HostAddress"));
			templateSqlDetail.setSQLText(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].SQLText"));
			templateSqlDetail.setConsume(context.longValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].Consume"));
			templateSqlDetail.setScanRows(context.longValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].ScanRows"));
			templateSqlDetail.setUpdateRows(context.longValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].UpdateRows"));
			templateSqlDetail.setState(context.integerValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].State"));
			templateSqlDetail.setExecuteTime(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].ExecuteTime"));
			templateSqlDetail.setThreadID(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].ThreadID"));
			templateSqlDetail.setSqlType(context.stringValue("DescribeTemplateSqlDetailResponse.Items["+ i +"].SqlType"));

			items.add(templateSqlDetail);
		}
		describeTemplateSqlDetailResponse.setItems(items);
	 
	 	return describeTemplateSqlDetailResponse;
	}
}