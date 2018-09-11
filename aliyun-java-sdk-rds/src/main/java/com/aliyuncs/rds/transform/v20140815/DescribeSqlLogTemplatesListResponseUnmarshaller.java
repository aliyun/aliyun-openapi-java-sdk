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

import com.aliyuncs.rds.model.v20140815.DescribeSqlLogTemplatesListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlLogTemplatesListResponse.Template;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlLogTemplatesListResponseUnmarshaller {

	public static DescribeSqlLogTemplatesListResponse unmarshall(DescribeSqlLogTemplatesListResponse describeSqlLogTemplatesListResponse, UnmarshallerContext context) {
		
		describeSqlLogTemplatesListResponse.setRequestId(context.stringValue("DescribeSqlLogTemplatesListResponse.RequestId"));
		describeSqlLogTemplatesListResponse.setDBInstanceID(context.integerValue("DescribeSqlLogTemplatesListResponse.DBInstanceID"));
		describeSqlLogTemplatesListResponse.setDBInstanceName(context.stringValue("DescribeSqlLogTemplatesListResponse.DBInstanceName"));
		describeSqlLogTemplatesListResponse.setStartTime(context.stringValue("DescribeSqlLogTemplatesListResponse.StartTime"));
		describeSqlLogTemplatesListResponse.setEndTime(context.stringValue("DescribeSqlLogTemplatesListResponse.EndTime"));
		describeSqlLogTemplatesListResponse.setTotalRecords(context.integerValue("DescribeSqlLogTemplatesListResponse.TotalRecords"));
		describeSqlLogTemplatesListResponse.setPagingID(context.stringValue("DescribeSqlLogTemplatesListResponse.PagingID"));
		describeSqlLogTemplatesListResponse.setMaxRecordsPerPage(context.integerValue("DescribeSqlLogTemplatesListResponse.MaxRecordsPerPage"));
		describeSqlLogTemplatesListResponse.setPageNumbers(context.integerValue("DescribeSqlLogTemplatesListResponse.PageNumbers"));
		describeSqlLogTemplatesListResponse.setItemsNumbers(context.integerValue("DescribeSqlLogTemplatesListResponse.ItemsNumbers"));

		List<Template> items = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("DescribeSqlLogTemplatesListResponse.Items.Length"); i++) {
			Template template = new Template();
			template.setTemplate(context.stringValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].Template"));
			template.setTotalConsume(context.longValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].TotalConsume"));
			template.setAvgConsume(context.floatValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].AvgConsume"));
			template.setTotalCounts(context.longValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].TotalCounts"));
			template.setAvgScanRows(context.floatValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].AvgScanRows"));
			template.setTotalScanRows(context.longValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].TotalScanRows"));
			template.setTotalUpdateRows(context.longValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].TotalUpdateRows"));
			template.setAvgUpdateRows(context.floatValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].AvgUpdateRows"));
			template.setSqlType(context.stringValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].SqlType"));
			template.setTemplateHash(context.stringValue("DescribeSqlLogTemplatesListResponse.Items["+ i +"].TemplateHash"));

			items.add(template);
		}
		describeSqlLogTemplatesListResponse.setItems(items);
	 
	 	return describeSqlLogTemplatesListResponse;
	}
}