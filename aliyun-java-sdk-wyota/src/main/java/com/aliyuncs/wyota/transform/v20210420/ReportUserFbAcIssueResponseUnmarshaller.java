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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.ReportUserFbAcIssueResponse;
import com.aliyuncs.wyota.model.v20210420.ReportUserFbAcIssueResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportUserFbAcIssueResponseUnmarshaller {

	public static ReportUserFbAcIssueResponse unmarshall(ReportUserFbAcIssueResponse reportUserFbAcIssueResponse, UnmarshallerContext _ctx) {
		
		reportUserFbAcIssueResponse.setRequestId(_ctx.stringValue("ReportUserFbAcIssueResponse.RequestId"));
		reportUserFbAcIssueResponse.setCode(_ctx.stringValue("ReportUserFbAcIssueResponse.Code"));
		reportUserFbAcIssueResponse.setMessage(_ctx.stringValue("ReportUserFbAcIssueResponse.Message"));

		Data data = new Data();
		data.setIssueId(_ctx.longValue("ReportUserFbAcIssueResponse.Data.IssueId"));
		reportUserFbAcIssueResponse.setData(data);
	 
	 	return reportUserFbAcIssueResponse;
	}
}