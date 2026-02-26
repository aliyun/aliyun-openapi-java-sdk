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

import com.aliyuncs.cloud_siem.model.v20220616.ListCustomizeRuleTestResultResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListCustomizeRuleTestResultResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListCustomizeRuleTestResultResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.ListCustomizeRuleTestResultResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomizeRuleTestResultResponseUnmarshaller {

	public static ListCustomizeRuleTestResultResponse unmarshall(ListCustomizeRuleTestResultResponse listCustomizeRuleTestResultResponse, UnmarshallerContext _ctx) {
		
		listCustomizeRuleTestResultResponse.setRequestId(_ctx.stringValue("ListCustomizeRuleTestResultResponse.RequestId"));
		listCustomizeRuleTestResultResponse.setSuccess(_ctx.booleanValue("ListCustomizeRuleTestResultResponse.Success"));
		listCustomizeRuleTestResultResponse.setCode(_ctx.integerValue("ListCustomizeRuleTestResultResponse.Code"));
		listCustomizeRuleTestResultResponse.setMessage(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCustomizeRuleTestResultResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListCustomizeRuleTestResultResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("ListCustomizeRuleTestResultResponse.Data.PageInfo.TotalCount"));
		pageInfo.setVerifiedCount(_ctx.longValue("ListCustomizeRuleTestResultResponse.Data.PageInfo.VerifiedCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomizeRuleTestResultResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setUuid(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].Uuid"));
			responseDataItem.setMainUserId(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].MainUserId"));
			responseDataItem.setSubUserId(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setLogType(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].LogType"));
			responseDataItem.setLogSource(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].LogSource"));
			responseDataItem.setAlertSrcProd(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].AlertSrcProd"));
			responseDataItem.setAlertSrcProdModule(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].AlertSrcProdModule"));
			responseDataItem.setAttCk(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].AttCk"));
			responseDataItem.setAlertDesc(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].AlertDesc"));
			responseDataItem.setOnlineStatus(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].OnlineStatus"));
			responseDataItem.setEventName(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].EventName"));
			responseDataItem.setLevel(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].Level"));
			responseDataItem.setEventType(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].EventType"));
			responseDataItem.setAlertDetail(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].AlertDetail"));
			responseDataItem.setLogTime(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].LogTime"));
			responseDataItem.setVerifyType(_ctx.stringValue("ListCustomizeRuleTestResultResponse.Data.ResponseData["+ i +"].VerifyType"));

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		listCustomizeRuleTestResultResponse.setData(data);
	 
	 	return listCustomizeRuleTestResultResponse;
	}
}