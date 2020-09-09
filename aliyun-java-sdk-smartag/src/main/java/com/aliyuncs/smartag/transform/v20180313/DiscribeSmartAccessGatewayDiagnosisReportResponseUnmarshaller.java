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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Detail;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Detail.Item;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Detail.Item.CN;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Detail.Item.EN;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Detail.Statistics1;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Level;
import com.aliyuncs.smartag.model.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DiscribeSmartAccessGatewayDiagnosisReportResponseUnmarshaller {

	public static DiscribeSmartAccessGatewayDiagnosisReportResponse unmarshall(DiscribeSmartAccessGatewayDiagnosisReportResponse discribeSmartAccessGatewayDiagnosisReportResponse, UnmarshallerContext _ctx) {
		
		discribeSmartAccessGatewayDiagnosisReportResponse.setRequestId(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.RequestId"));

		DiagnoseResult diagnoseResult = new DiagnoseResult();
		diagnoseResult.setTotalNumber(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.TotalNumber"));
		diagnoseResult.setStoreType(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.StoreType"));
		diagnoseResult.setMonitorVersion(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.MonitorVersion"));
		diagnoseResult.setDiagnoseId(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.DiagnoseId"));
		diagnoseResult.setEndTime(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.EndTime"));
		diagnoseResult.setFinishedNumber(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.FinishedNumber"));
		diagnoseResult.setReportSLSSuccess(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.ReportSLSSuccess"));
		diagnoseResult.setParameters(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Parameters"));
		diagnoseResult.setPercent(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Percent"));
		diagnoseResult.setUId(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.UId"));
		diagnoseResult.setStartTime(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.StartTime"));
		diagnoseResult.setUserLevel(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.UserLevel"));
		diagnoseResult.setInstanceId(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.InstanceId"));
		diagnoseResult.setBoxType(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.BoxType"));
		diagnoseResult.setBoxVersion(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.BoxVersion"));
		diagnoseResult.setSN(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.SN"));
		diagnoseResult.setState(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.State"));

		Level level = new Level();
		level.setTotal(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Level.Total"));
		level.setBiz(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Level.Biz"));
		level.setConfiguration(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Level.Configuration"));
		diagnoseResult.setLevel(level);

		Statistics statistics = new Statistics();
		statistics.setTotal(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Statistics.Total"));
		statistics.setWarning(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Statistics.Warning"));
		statistics.setError(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Statistics.Error"));
		statistics.setInfo(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Statistics.Info"));
		diagnoseResult.setStatistics(statistics);

		List<Detail> details = new ArrayList<Detail>();
		for (int i = 0; i < _ctx.lengthValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details.Length"); i++) {
			Detail detail = new Detail();
			detail.setType(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Type"));

			Statistics1 statistics1 = new Statistics1();
			statistics1.setTotal(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Statistics.Total"));
			statistics1.setWarning(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Statistics.Warning"));
			statistics1.setError(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Statistics.Error"));
			statistics1.setInfo(_ctx.integerValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Statistics.Info"));
			detail.setStatistics1(statistics1);

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setStartTime(_ctx.longValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].StartTime"));
				item.setLevel(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].Level"));
				item.setEndTime(_ctx.longValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EndTime"));
				item.setItemName(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].ItemName"));
				item.setType(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].Type"));

				EN eN = new EN();
				eN.setItemLevel(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.ItemLevel"));
				eN.setItemType(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.ItemType"));
				eN.setItemName(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.ItemName"));

				List<String> advice = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.Advice.Length"); k++) {
					advice.add(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.Advice["+ k +"]"));
				}
				eN.setAdvice(advice);

				List<String> details2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.Details.Length"); k++) {
					details2.add(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].EN.Details["+ k +"]"));
				}
				eN.setDetails2(details2);
				item.setEN(eN);

				CN cN = new CN();
				cN.setItemLevel(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.ItemLevel"));
				cN.setItemType(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.ItemType"));
				cN.setItemName(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.ItemName"));

				List<String> advice3 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.Advice.Length"); k++) {
					advice3.add(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.Advice["+ k +"]"));
				}
				cN.setAdvice3(advice3);

				List<String> details4 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.Details.Length"); k++) {
					details4.add(_ctx.stringValue("DiscribeSmartAccessGatewayDiagnosisReportResponse.DiagnoseResult.Details["+ i +"].Items["+ j +"].CN.Details["+ k +"]"));
				}
				cN.setDetails4(details4);
				item.setCN(cN);

				items.add(item);
			}
			detail.setItems(items);

			details.add(detail);
		}
		diagnoseResult.setDetails(details);
		discribeSmartAccessGatewayDiagnosisReportResponse.setDiagnoseResult(diagnoseResult);
	 
	 	return discribeSmartAccessGatewayDiagnosisReportResponse;
	}
}