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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemCustomizeRulesResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemCustomizeRulesResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemCustomizeRulesResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemCustomizeRulesResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudSiemCustomizeRulesResponseUnmarshaller {

	public static ListCloudSiemCustomizeRulesResponse unmarshall(ListCloudSiemCustomizeRulesResponse listCloudSiemCustomizeRulesResponse, UnmarshallerContext _ctx) {
		
		listCloudSiemCustomizeRulesResponse.setRequestId(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.RequestId"));
		listCloudSiemCustomizeRulesResponse.setSuccess(_ctx.booleanValue("ListCloudSiemCustomizeRulesResponse.Success"));
		listCloudSiemCustomizeRulesResponse.setCode(_ctx.integerValue("ListCloudSiemCustomizeRulesResponse.Code"));
		listCloudSiemCustomizeRulesResponse.setMessage(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCloudSiemCustomizeRulesResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListCloudSiemCustomizeRulesResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("ListCloudSiemCustomizeRulesResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setRuleName(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].RuleName"));
			responseDataItem.setRuleDesc(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].RuleDesc"));
			responseDataItem.setRuleType(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].RuleType"));
			responseDataItem.setThreatLevel(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].ThreatLevel"));
			responseDataItem.setAlertType(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].AlertType"));
			responseDataItem.setAlertTypeMds(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].AlertTypeMds"));
			responseDataItem.setLogType(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].LogType"));
			responseDataItem.setLogTypeMds(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].LogTypeMds"));
			responseDataItem.setLogSource(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].LogSource"));
			responseDataItem.setLogSourceMds(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].LogSourceMds"));
			responseDataItem.setRuleCondition(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].RuleCondition"));
			responseDataItem.setRuleGroup(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].RuleGroup"));
			responseDataItem.setRuleThreshold(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].RuleThreshold"));
			responseDataItem.setQueryCycle(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].QueryCycle"));
			responseDataItem.setAttCk(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].AttCk"));
			responseDataItem.setEventTransferSwitch(_ctx.integerValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].EventTransferSwitch"));
			responseDataItem.setEventTransferType(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].EventTransferType"));
			responseDataItem.setEventTransferExt(_ctx.stringValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].EventTransferExt"));
			responseDataItem.setStatus(_ctx.integerValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].Status"));
			responseDataItem.setDataType(_ctx.integerValue("ListCloudSiemCustomizeRulesResponse.Data.ResponseData["+ i +"].DataType"));

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		listCloudSiemCustomizeRulesResponse.setData(data);
	 
	 	return listCloudSiemCustomizeRulesResponse;
	}
}