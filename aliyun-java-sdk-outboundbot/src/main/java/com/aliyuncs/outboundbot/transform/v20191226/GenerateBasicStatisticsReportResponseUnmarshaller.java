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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.GenerateBasicStatisticsReportResponse;
import com.aliyuncs.outboundbot.model.v20191226.GenerateBasicStatisticsReportResponse.BasicStatisticsReport;
import com.aliyuncs.outboundbot.model.v20191226.GenerateBasicStatisticsReportResponse.BasicStatisticsReport.BasicStatisticsReportItem;
import com.aliyuncs.outboundbot.model.v20191226.GenerateBasicStatisticsReportResponse.BasicStatisticsReport.BasicStatisticsReportItem.BasicStatisticsReportSubItem;
import com.aliyuncs.outboundbot.model.v20191226.GenerateBasicStatisticsReportResponse.BasicStatisticsReport.BasicStatisticsReportItem.BasicStatisticsReportSubItem.KeyValuePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateBasicStatisticsReportResponseUnmarshaller {

	public static GenerateBasicStatisticsReportResponse unmarshall(GenerateBasicStatisticsReportResponse generateBasicStatisticsReportResponse, UnmarshallerContext _ctx) {
		
		generateBasicStatisticsReportResponse.setRequestId(_ctx.stringValue("GenerateBasicStatisticsReportResponse.RequestId"));
		generateBasicStatisticsReportResponse.setSuccess(_ctx.booleanValue("GenerateBasicStatisticsReportResponse.Success"));
		generateBasicStatisticsReportResponse.setCode(_ctx.stringValue("GenerateBasicStatisticsReportResponse.Code"));
		generateBasicStatisticsReportResponse.setMessage(_ctx.stringValue("GenerateBasicStatisticsReportResponse.Message"));
		generateBasicStatisticsReportResponse.setHttpStatusCode(_ctx.integerValue("GenerateBasicStatisticsReportResponse.HttpStatusCode"));

		BasicStatisticsReport basicStatisticsReport = new BasicStatisticsReport();

		List<BasicStatisticsReportItem> items = new ArrayList<BasicStatisticsReportItem>();
		for (int i = 0; i < _ctx.lengthValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items.Length"); i++) {
			BasicStatisticsReportItem basicStatisticsReportItem = new BasicStatisticsReportItem();
			basicStatisticsReportItem.setTitle(_ctx.stringValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].Title"));
			basicStatisticsReportItem.setTotalCount(_ctx.integerValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].TotalCount"));
			basicStatisticsReportItem.setGraphType(_ctx.stringValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].GraphType"));

			List<BasicStatisticsReportSubItem> subItems = new ArrayList<BasicStatisticsReportSubItem>();
			for (int j = 0; j < _ctx.lengthValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems.Length"); j++) {
				BasicStatisticsReportSubItem basicStatisticsReportSubItem = new BasicStatisticsReportSubItem();
				basicStatisticsReportSubItem.setBasicStatisticsReportSubItemName(_ctx.stringValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].BasicStatisticsReportSubItemName"));
				basicStatisticsReportSubItem.setValue(_ctx.stringValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].Value"));
				basicStatisticsReportSubItem.setCount(_ctx.integerValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].Count"));
				basicStatisticsReportSubItem.setPercentage(_ctx.integerValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].Percentage"));

				List<KeyValuePair> details = new ArrayList<KeyValuePair>();
				for (int k = 0; k < _ctx.lengthValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].Details.Length"); k++) {
					KeyValuePair keyValuePair = new KeyValuePair();
					keyValuePair.setKey(_ctx.stringValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].Details["+ k +"].Key"));
					keyValuePair.setValue(_ctx.stringValue("GenerateBasicStatisticsReportResponse.BasicStatisticsReport.Items["+ i +"].SubItems["+ j +"].Details["+ k +"].Value"));

					details.add(keyValuePair);
				}
				basicStatisticsReportSubItem.setDetails(details);

				subItems.add(basicStatisticsReportSubItem);
			}
			basicStatisticsReportItem.setSubItems(subItems);

			items.add(basicStatisticsReportItem);
		}
		basicStatisticsReport.setItems(items);
		generateBasicStatisticsReportResponse.setBasicStatisticsReport(basicStatisticsReport);
	 
	 	return generateBasicStatisticsReportResponse;
	}
}