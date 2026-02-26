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

import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemPredefinedRulesResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemPredefinedRulesResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemPredefinedRulesResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.ListCloudSiemPredefinedRulesResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudSiemPredefinedRulesResponseUnmarshaller {

	public static ListCloudSiemPredefinedRulesResponse unmarshall(ListCloudSiemPredefinedRulesResponse listCloudSiemPredefinedRulesResponse, UnmarshallerContext _ctx) {
		
		listCloudSiemPredefinedRulesResponse.setRequestId(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.RequestId"));
		listCloudSiemPredefinedRulesResponse.setSuccess(_ctx.booleanValue("ListCloudSiemPredefinedRulesResponse.Success"));
		listCloudSiemPredefinedRulesResponse.setCode(_ctx.integerValue("ListCloudSiemPredefinedRulesResponse.Code"));
		listCloudSiemPredefinedRulesResponse.setMessage(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCloudSiemPredefinedRulesResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListCloudSiemPredefinedRulesResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("ListCloudSiemPredefinedRulesResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setRuleName(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].RuleName"));
			responseDataItem.setRuleNameCn(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].RuleNameCn"));
			responseDataItem.setRuleNameEn(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].RuleNameEn"));
			responseDataItem.setRuleNameMds(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].RuleNameMds"));
			responseDataItem.setRuleDescMds(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].RuleDescMds"));
			responseDataItem.setThreatLevel(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].ThreatLevel"));
			responseDataItem.setAlertType(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].AlertType"));
			responseDataItem.setSource(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].Source"));
			responseDataItem.setEventTransferType(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].EventTransferType"));
			responseDataItem.setAttCk(_ctx.stringValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].AttCk"));
			responseDataItem.setStatus(_ctx.integerValue("ListCloudSiemPredefinedRulesResponse.Data.ResponseData["+ i +"].Status"));

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		listCloudSiemPredefinedRulesResponse.setData(data);
	 
	 	return listCloudSiemPredefinedRulesResponse;
	}
}