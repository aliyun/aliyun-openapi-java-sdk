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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.GetUserEmailReportResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetUserEmailReportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserEmailReportResponseUnmarshaller {

	public static GetUserEmailReportResponse unmarshall(GetUserEmailReportResponse getUserEmailReportResponse, UnmarshallerContext _ctx) {
		
		getUserEmailReportResponse.setRequestId(_ctx.stringValue("GetUserEmailReportResponse.RequestId"));

		Data data = new Data();
		data.setReportExist(_ctx.booleanValue("GetUserEmailReportResponse.Data.ReportExist"));
		data.setExcelReportUrl(_ctx.stringValue("GetUserEmailReportResponse.Data.ExcelReportUrl"));
		data.setReportGenerateTime(_ctx.stringValue("GetUserEmailReportResponse.Data.ReportGenerateTime"));
		data.setPdfReportUrl(_ctx.stringValue("GetUserEmailReportResponse.Data.PdfReportUrl"));
		data.setWeeklyReportUrl(_ctx.stringValue("GetUserEmailReportResponse.Data.WeeklyReportUrl"));
		data.setWeeklyGenerateTime(_ctx.stringValue("GetUserEmailReportResponse.Data.WeeklyGenerateTime"));
		getUserEmailReportResponse.setData(data);
	 
	 	return getUserEmailReportResponse;
	}
}