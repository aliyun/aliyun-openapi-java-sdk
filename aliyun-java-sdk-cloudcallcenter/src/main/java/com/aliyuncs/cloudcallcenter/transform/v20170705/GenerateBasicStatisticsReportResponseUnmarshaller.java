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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateBasicStatisticsReportResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateBasicStatisticsReportResponse.Report;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateBasicStatisticsReportResponse.Report.BasicStatisticsReportItem;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateBasicStatisticsReportResponse.Report.BasicStatisticsReportItem.BasicStatisticsReportSubItem;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateBasicStatisticsReportResponse.Report.BasicStatisticsReportItem.BasicStatisticsReportSubItem.KeyValuePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateBasicStatisticsReportResponseUnmarshaller {

	public static GenerateBasicStatisticsReportResponse unmarshall(GenerateBasicStatisticsReportResponse generateBasicStatisticsReportResponse, UnmarshallerContext context) {
		
		generateBasicStatisticsReportResponse.setRequestId(context.stringValue("GenerateBasicStatisticsReportResponse.RequestId"));
		generateBasicStatisticsReportResponse.setSuccess(context.booleanValue("GenerateBasicStatisticsReportResponse.Success"));
		generateBasicStatisticsReportResponse.setCode(context.stringValue("GenerateBasicStatisticsReportResponse.Code"));
		generateBasicStatisticsReportResponse.setMessage(context.stringValue("GenerateBasicStatisticsReportResponse.Message"));
		generateBasicStatisticsReportResponse.setHttpStatusCode(context.integerValue("GenerateBasicStatisticsReportResponse.HttpStatusCode"));

		Report report = new Report();

		List<BasicStatisticsReportItem> items = new ArrayList<BasicStatisticsReportItem>();
		for (int i = 0; i < context.lengthValue("GenerateBasicStatisticsReportResponse.Report.Items.Length"); i++) {
			BasicStatisticsReportItem basicStatisticsReportItem = new BasicStatisticsReportItem();
			basicStatisticsReportItem.setTitle(context.stringValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].Title"));
			basicStatisticsReportItem.setTotalCount(context.integerValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].TotalCount"));
			basicStatisticsReportItem.setGraphType(context.stringValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].GraphType"));

			List<BasicStatisticsReportSubItem> subItems = new ArrayList<BasicStatisticsReportSubItem>();
			for (int j = 0; j < context.lengthValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems.Length"); j++) {
				BasicStatisticsReportSubItem basicStatisticsReportSubItem = new BasicStatisticsReportSubItem();
				basicStatisticsReportSubItem.setBasicStatisticsReportSubItemName(context.stringValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].BasicStatisticsReportSubItemName"));
				basicStatisticsReportSubItem.setValue(context.stringValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].Value"));
				basicStatisticsReportSubItem.setCount(context.integerValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].Count"));
				basicStatisticsReportSubItem.setPercentage(context.integerValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].Percentage"));

				List<KeyValuePair> row = new ArrayList<KeyValuePair>();
				for (int k = 0; k < context.lengthValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].Row.Length"); k++) {
					KeyValuePair keyValuePair = new KeyValuePair();
					keyValuePair.setKey(context.stringValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].Row["+ k +"].Key"));
					keyValuePair.setValue(context.stringValue("GenerateBasicStatisticsReportResponse.Report.Items["+ i +"].SubItems["+ j +"].Row["+ k +"].Value"));

					row.add(keyValuePair);
				}
				basicStatisticsReportSubItem.setRow(row);

				subItems.add(basicStatisticsReportSubItem);
			}
			basicStatisticsReportItem.setSubItems(subItems);

			items.add(basicStatisticsReportItem);
		}
		report.setItems(items);
		generateBasicStatisticsReportResponse.setReport(report);
	 
	 	return generateBasicStatisticsReportResponse;
	}
}