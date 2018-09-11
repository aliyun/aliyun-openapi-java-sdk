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

import com.aliyuncs.rds.model.v20140815.DescribeSqlTemplatesConsumeAndScanRowsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlTemplatesConsumeAndScanRowsResponse.Template;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlTemplatesConsumeAndScanRowsResponseUnmarshaller {

	public static DescribeSqlTemplatesConsumeAndScanRowsResponse unmarshall(DescribeSqlTemplatesConsumeAndScanRowsResponse describeSqlTemplatesConsumeAndScanRowsResponse, UnmarshallerContext context) {
		
		describeSqlTemplatesConsumeAndScanRowsResponse.setRequestId(context.stringValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.RequestId"));
		describeSqlTemplatesConsumeAndScanRowsResponse.setDBInstanceID(context.integerValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.DBInstanceID"));
		describeSqlTemplatesConsumeAndScanRowsResponse.setItemsNumbers(context.integerValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.ItemsNumbers"));
		describeSqlTemplatesConsumeAndScanRowsResponse.setEndTime(context.stringValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.EndTime"));
		describeSqlTemplatesConsumeAndScanRowsResponse.setStartTime(context.stringValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.StartTime"));
		describeSqlTemplatesConsumeAndScanRowsResponse.setDBInstanceName(context.stringValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.DBInstanceName"));

		List<Template> items = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.Items.Length"); i++) {
			Template template = new Template();
			template.setAvgConsume(context.floatValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.Items["+ i +"].AvgConsume"));
			template.setAvgScanRows(context.floatValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.Items["+ i +"].AvgScanRows"));
			template.setSqlType(context.stringValue("DescribeSqlTemplatesConsumeAndScanRowsResponse.Items["+ i +"].SqlType"));

			items.add(template);
		}
		describeSqlTemplatesConsumeAndScanRowsResponse.setItems(items);
	 
	 	return describeSqlTemplatesConsumeAndScanRowsResponse;
	}
}