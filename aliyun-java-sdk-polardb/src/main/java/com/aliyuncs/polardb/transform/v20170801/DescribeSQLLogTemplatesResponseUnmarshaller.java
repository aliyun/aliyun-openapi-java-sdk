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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeSQLLogTemplatesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeSQLLogTemplatesResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogTemplatesResponseUnmarshaller {

	public static DescribeSQLLogTemplatesResponse unmarshall(DescribeSQLLogTemplatesResponse describeSQLLogTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogTemplatesResponse.setRequestId(_ctx.stringValue("DescribeSQLLogTemplatesResponse.RequestId"));
		describeSQLLogTemplatesResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeSQLLogTemplatesResponse.MaxRecordsPerPage"));
		describeSQLLogTemplatesResponse.setItemsNumbers(_ctx.integerValue("DescribeSQLLogTemplatesResponse.ItemsNumbers"));
		describeSQLLogTemplatesResponse.setEndTime(_ctx.stringValue("DescribeSQLLogTemplatesResponse.EndTime"));
		describeSQLLogTemplatesResponse.setDBInstanceID(_ctx.integerValue("DescribeSQLLogTemplatesResponse.DBInstanceID"));
		describeSQLLogTemplatesResponse.setStartTime(_ctx.stringValue("DescribeSQLLogTemplatesResponse.StartTime"));
		describeSQLLogTemplatesResponse.setTotalRecords(_ctx.integerValue("DescribeSQLLogTemplatesResponse.TotalRecords"));
		describeSQLLogTemplatesResponse.setFinish(_ctx.stringValue("DescribeSQLLogTemplatesResponse.Finish"));
		describeSQLLogTemplatesResponse.setPageNumbers(_ctx.integerValue("DescribeSQLLogTemplatesResponse.PageNumbers"));
		describeSQLLogTemplatesResponse.setJobId(_ctx.stringValue("DescribeSQLLogTemplatesResponse.JobId"));
		describeSQLLogTemplatesResponse.setPagingID(_ctx.stringValue("DescribeSQLLogTemplatesResponse.PagingID"));
		describeSQLLogTemplatesResponse.setDBInstanceName(_ctx.stringValue("DescribeSQLLogTemplatesResponse.DBInstanceName"));

		List<Template> items = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogTemplatesResponse.Items.Length"); i++) {
			Template template = new Template();
			template.setAvgScanRows(_ctx.floatValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].AvgScanRows"));
			template.setTemplateHash(_ctx.stringValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].TemplateHash"));
			template.setAvgConsume(_ctx.floatValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].AvgConsume"));
			template.setTotalScanRows(_ctx.longValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].TotalScanRows"));
			template.setTotalUpdateRows(_ctx.longValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].TotalUpdateRows"));
			template.setTotalCounts(_ctx.longValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].TotalCounts"));
			template.setSqlType(_ctx.stringValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].SqlType"));
			template.setAvgUpdateRows(_ctx.floatValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].AvgUpdateRows"));
			template.setItemID(_ctx.integerValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].ItemID"));
			template.setTemplate(_ctx.stringValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].Template"));
			template.setTotalConsume(_ctx.longValue("DescribeSQLLogTemplatesResponse.Items["+ i +"].TotalConsume"));

			items.add(template);
		}
		describeSQLLogTemplatesResponse.setItems(items);
	 
	 	return describeSQLLogTemplatesResponse;
	}
}