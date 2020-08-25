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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CountLinkeBahamutMonitoruserstatisticsmonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountLinkeBahamutMonitoruserstatisticsmonitorResponseUnmarshaller {

	public static CountLinkeBahamutMonitoruserstatisticsmonitorResponse unmarshall(CountLinkeBahamutMonitoruserstatisticsmonitorResponse countLinkeBahamutMonitoruserstatisticsmonitorResponse, UnmarshallerContext _ctx) {
		
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setRequestId(_ctx.stringValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.RequestId"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setResultCode(_ctx.stringValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.ResultCode"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setResultMessage(_ctx.stringValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.ResultMessage"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setErrorMessage(_ctx.stringValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.ErrorMessage"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setErrorMsgParamsMap(_ctx.stringValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.ErrorMsgParamsMap"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setMessage(_ctx.stringValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.Message"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setResponseStatusCode(_ctx.longValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.ResponseStatusCode"));
		countLinkeBahamutMonitoruserstatisticsmonitorResponse.setSuccess(_ctx.booleanValue("CountLinkeBahamutMonitoruserstatisticsmonitorResponse.Success"));
	 
	 	return countLinkeBahamutMonitoruserstatisticsmonitorResponse;
	}
}