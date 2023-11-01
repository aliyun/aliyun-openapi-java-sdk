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

import com.aliyuncs.cloud_siem.model.v20220616.ListAutomateResponseConfigsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListAutomateResponseConfigsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListAutomateResponseConfigsResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.ListAutomateResponseConfigsResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutomateResponseConfigsResponseUnmarshaller {

	public static ListAutomateResponseConfigsResponse unmarshall(ListAutomateResponseConfigsResponse listAutomateResponseConfigsResponse, UnmarshallerContext _ctx) {
		
		listAutomateResponseConfigsResponse.setRequestId(_ctx.stringValue("ListAutomateResponseConfigsResponse.RequestId"));
		listAutomateResponseConfigsResponse.setSuccess(_ctx.booleanValue("ListAutomateResponseConfigsResponse.Success"));
		listAutomateResponseConfigsResponse.setCode(_ctx.integerValue("ListAutomateResponseConfigsResponse.Code"));
		listAutomateResponseConfigsResponse.setMessage(_ctx.stringValue("ListAutomateResponseConfigsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListAutomateResponseConfigsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListAutomateResponseConfigsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("ListAutomateResponseConfigsResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAutomateResponseConfigsResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setSubUserId(_ctx.longValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setRuleName(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].RuleName"));
			responseDataItem.setAutoResponseType(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].AutoResponseType"));
			responseDataItem.setExecutionCondition(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].ExecutionCondition"));
			responseDataItem.setActionType(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].ActionType"));
			responseDataItem.setActionConfig(_ctx.stringValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].ActionConfig"));
			responseDataItem.setStatus(_ctx.integerValue("ListAutomateResponseConfigsResponse.Data.ResponseData["+ i +"].Status"));

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		listAutomateResponseConfigsResponse.setData(data);
	 
	 	return listAutomateResponseConfigsResponse;
	}
}