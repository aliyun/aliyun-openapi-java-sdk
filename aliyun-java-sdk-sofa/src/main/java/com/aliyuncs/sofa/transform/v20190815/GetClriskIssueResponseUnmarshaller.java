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

import com.aliyuncs.sofa.model.v20190815.GetClriskIssueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskIssueResponseUnmarshaller {

	public static GetClriskIssueResponse unmarshall(GetClriskIssueResponse getClriskIssueResponse, UnmarshallerContext _ctx) {
		
		getClriskIssueResponse.setRequestId(_ctx.stringValue("GetClriskIssueResponse.RequestId"));
		getClriskIssueResponse.setResultCode(_ctx.stringValue("GetClriskIssueResponse.ResultCode"));
		getClriskIssueResponse.setResultMessage(_ctx.stringValue("GetClriskIssueResponse.ResultMessage"));
		getClriskIssueResponse.setCloseTime(_ctx.stringValue("GetClriskIssueResponse.CloseTime"));
		getClriskIssueResponse.setCurrentUserOwner(_ctx.booleanValue("GetClriskIssueResponse.CurrentUserOwner"));
		getClriskIssueResponse.setDataSize(_ctx.longValue("GetClriskIssueResponse.DataSize"));
		getClriskIssueResponse.setFalseAlarm(_ctx.booleanValue("GetClriskIssueResponse.FalseAlarm"));
		getClriskIssueResponse.setFundLoss(_ctx.booleanValue("GetClriskIssueResponse.FundLoss"));
		getClriskIssueResponse.setGmtCreate(_ctx.stringValue("GetClriskIssueResponse.GmtCreate"));
		getClriskIssueResponse.setGmtModified(_ctx.stringValue("GetClriskIssueResponse.GmtModified"));
		getClriskIssueResponse.setIssueCode(_ctx.stringValue("GetClriskIssueResponse.IssueCode"));
		getClriskIssueResponse.setIssueId(_ctx.longValue("GetClriskIssueResponse.IssueId"));
		getClriskIssueResponse.setMemo(_ctx.stringValue("GetClriskIssueResponse.Memo"));
		getClriskIssueResponse.setModelCode(_ctx.stringValue("GetClriskIssueResponse.ModelCode"));
		getClriskIssueResponse.setModelName(_ctx.stringValue("GetClriskIssueResponse.ModelName"));
		getClriskIssueResponse.setProcessor(_ctx.stringValue("GetClriskIssueResponse.Processor"));
		getClriskIssueResponse.setProcessDuration(_ctx.stringValue("GetClriskIssueResponse.ProcessDuration"));
		getClriskIssueResponse.setProductId(_ctx.longValue("GetClriskIssueResponse.ProductId"));
		getClriskIssueResponse.setProductName(_ctx.stringValue("GetClriskIssueResponse.ProductName"));
		getClriskIssueResponse.setRuleCode(_ctx.stringValue("GetClriskIssueResponse.RuleCode"));
		getClriskIssueResponse.setRuleName(_ctx.stringValue("GetClriskIssueResponse.RuleName"));
		getClriskIssueResponse.setStatus(_ctx.stringValue("GetClriskIssueResponse.Status"));
		getClriskIssueResponse.setTriggerMode(_ctx.stringValue("GetClriskIssueResponse.TriggerMode"));
	 
	 	return getClriskIssueResponse;
	}
}