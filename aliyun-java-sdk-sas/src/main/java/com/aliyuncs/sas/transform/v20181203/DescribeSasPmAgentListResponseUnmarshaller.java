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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSasPmAgentListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSasPmAgentListResponse.ReportRecipient;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSasPmAgentListResponseUnmarshaller {

	public static DescribeSasPmAgentListResponse unmarshall(DescribeSasPmAgentListResponse describeSasPmAgentListResponse, UnmarshallerContext _ctx) {
		
		describeSasPmAgentListResponse.setRequestId(_ctx.stringValue("DescribeSasPmAgentListResponse.RequestId"));

		List<ReportRecipient> sasPmAgentList = new ArrayList<ReportRecipient>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSasPmAgentListResponse.SasPmAgentList.Length"); i++) {
			ReportRecipient reportRecipient = new ReportRecipient();
			reportRecipient.setAliyunAssistId(_ctx.stringValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].AliyunAssistId"));
			reportRecipient.setAliyunMonitorId(_ctx.stringValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].AliyunMonitorId"));
			reportRecipient.setAssistInstallStatus(_ctx.integerValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].AssistInstallStatus"));
			reportRecipient.setMonitorInstallStatus(_ctx.integerValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].MonitorInstallStatus"));
			reportRecipient.setAssistInstallResult(_ctx.integerValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].AssistInstallResult"));
			reportRecipient.setMonitorInstallResult(_ctx.integerValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].MonitorInstallResult"));
			reportRecipient.setUuid(_ctx.stringValue("DescribeSasPmAgentListResponse.SasPmAgentList["+ i +"].Uuid"));

			sasPmAgentList.add(reportRecipient);
		}
		describeSasPmAgentListResponse.setSasPmAgentList(sasPmAgentList);
	 
	 	return describeSasPmAgentListResponse;
	}
}