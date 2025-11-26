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

import com.aliyuncs.outboundbot.model.v20191226.GetRealtimeConcurrencyReportResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetRealtimeConcurrencyReportResponse.Reports;
import com.aliyuncs.outboundbot.model.v20191226.GetRealtimeConcurrencyReportResponse.Reports.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealtimeConcurrencyReportResponseUnmarshaller {

	public static GetRealtimeConcurrencyReportResponse unmarshall(GetRealtimeConcurrencyReportResponse getRealtimeConcurrencyReportResponse, UnmarshallerContext _ctx) {
		
		getRealtimeConcurrencyReportResponse.setRequestId(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.RequestId"));
		getRealtimeConcurrencyReportResponse.setHttpStatusCode(_ctx.integerValue("GetRealtimeConcurrencyReportResponse.HttpStatusCode"));
		getRealtimeConcurrencyReportResponse.setSuccess(_ctx.booleanValue("GetRealtimeConcurrencyReportResponse.Success"));
		getRealtimeConcurrencyReportResponse.setCode(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.Code"));
		getRealtimeConcurrencyReportResponse.setMessage(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.Message"));
		getRealtimeConcurrencyReportResponse.setReportDate(_ctx.longValue("GetRealtimeConcurrencyReportResponse.ReportDate"));

		Reports reports = new Reports();
		reports.setTotalCount(_ctx.integerValue("GetRealtimeConcurrencyReportResponse.Reports.TotalCount"));
		reports.setPageNumber(_ctx.integerValue("GetRealtimeConcurrencyReportResponse.Reports.PageNumber"));
		reports.setPageSize(_ctx.integerValue("GetRealtimeConcurrencyReportResponse.Reports.PageSize"));

		List<Item> list = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetRealtimeConcurrencyReportResponse.Reports.List.Length"); i++) {
			Item item = new Item();
			item.setReportDate(_ctx.longValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].ReportDate"));
			item.setInstanceId(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].InstanceId"));
			item.setInstanceName(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].InstanceName"));
			item.setJobGroupId(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].JobGroupId"));
			item.setJobGroupName(_ctx.stringValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].JobGroupName"));
			item.setOccupiedConcurrencyCount(_ctx.longValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].OccupiedConcurrencyCount"));
			item.setMaxConcurrencyLimit(_ctx.longValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].MaxConcurrencyLimit"));
			item.setMinConcurrencyLimit(_ctx.longValue("GetRealtimeConcurrencyReportResponse.Reports.List["+ i +"].MinConcurrencyLimit"));

			list.add(item);
		}
		reports.setList(list);
		getRealtimeConcurrencyReportResponse.setReports(reports);
	 
	 	return getRealtimeConcurrencyReportResponse;
	}
}