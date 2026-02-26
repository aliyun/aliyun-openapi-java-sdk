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

import com.aliyuncs.polardb.model.v20170801.DescribeUpgradeReportResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeUpgradeReportResponse.Report;
import com.aliyuncs.polardb.model.v20170801.DescribeUpgradeReportResponse.SQLReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpgradeReportResponseUnmarshaller {

	public static DescribeUpgradeReportResponse unmarshall(DescribeUpgradeReportResponse describeUpgradeReportResponse, UnmarshallerContext _ctx) {
		
		describeUpgradeReportResponse.setRequestId(_ctx.stringValue("DescribeUpgradeReportResponse.RequestId"));
		describeUpgradeReportResponse.setSourceDBClusterId(_ctx.stringValue("DescribeUpgradeReportResponse.SourceDBClusterId"));
		describeUpgradeReportResponse.setTotalSize(_ctx.longValue("DescribeUpgradeReportResponse.TotalSize"));
		describeUpgradeReportResponse.setItemsSize(_ctx.longValue("DescribeUpgradeReportResponse.ItemsSize"));
		describeUpgradeReportResponse.setDetails(_ctx.stringValue("DescribeUpgradeReportResponse.Details"));
		describeUpgradeReportResponse.setSrcDBType(_ctx.stringValue("DescribeUpgradeReportResponse.SrcDBType"));
		describeUpgradeReportResponse.setDstDBType(_ctx.stringValue("DescribeUpgradeReportResponse.DstDBType"));
		describeUpgradeReportResponse.setSrcDeleted(_ctx.stringValue("DescribeUpgradeReportResponse.SrcDeleted"));
		describeUpgradeReportResponse.setType(_ctx.stringValue("DescribeUpgradeReportResponse.Type"));

		List<Report> upgradeReportList = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpgradeReportResponse.UpgradeReportList.Length"); i++) {
			Report report = new Report();
			report.setTaskId(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].TaskId"));
			report.setCheckTime(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].CheckTime"));
			report.setDstVersion(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].DstVersion"));
			report.setSrcInsName(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].SrcInsName"));
			report.setSrcVersion(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].SrcVersion"));
			report.setUpgradeMode(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].UpgradeMode"));
			report.setResult(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].Result"));
			report.setEffectiveTime(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].EffectiveTime"));
			report.setStartTime(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].StartTime"));
			report.setEndTime(_ctx.stringValue("DescribeUpgradeReportResponse.UpgradeReportList["+ i +"].EndTime"));

			upgradeReportList.add(report);
		}
		describeUpgradeReportResponse.setUpgradeReportList(upgradeReportList);

		List<SQLReport> items = new ArrayList<SQLReport>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpgradeReportResponse.Items.Length"); i++) {
			SQLReport sQLReport = new SQLReport();
			sQLReport.setSchema(_ctx.stringValue("DescribeUpgradeReportResponse.Items["+ i +"].Schema"));
			sQLReport.setType(_ctx.stringValue("DescribeUpgradeReportResponse.Items["+ i +"].Type"));
			sQLReport.setName(_ctx.stringValue("DescribeUpgradeReportResponse.Items["+ i +"].Name"));
			sQLReport.setStatus(_ctx.stringValue("DescribeUpgradeReportResponse.Items["+ i +"].Status"));
			sQLReport.setDDL(_ctx.stringValue("DescribeUpgradeReportResponse.Items["+ i +"].DDL"));

			items.add(sQLReport);
		}
		describeUpgradeReportResponse.setItems(items);
	 
	 	return describeUpgradeReportResponse;
	}
}