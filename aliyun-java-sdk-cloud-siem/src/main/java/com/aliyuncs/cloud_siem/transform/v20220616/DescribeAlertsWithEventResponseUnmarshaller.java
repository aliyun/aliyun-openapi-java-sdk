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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEventResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEventResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEventResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEventResponse.Data.ResponseDataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEventResponse.Data.ResponseDataItem.AlertInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertsWithEventResponseUnmarshaller {

	public static DescribeAlertsWithEventResponse unmarshall(DescribeAlertsWithEventResponse describeAlertsWithEventResponse, UnmarshallerContext _ctx) {
		
		describeAlertsWithEventResponse.setRequestId(_ctx.stringValue("DescribeAlertsWithEventResponse.RequestId"));
		describeAlertsWithEventResponse.setSuccess(_ctx.booleanValue("DescribeAlertsWithEventResponse.Success"));
		describeAlertsWithEventResponse.setCode(_ctx.integerValue("DescribeAlertsWithEventResponse.Code"));
		describeAlertsWithEventResponse.setMessage(_ctx.stringValue("DescribeAlertsWithEventResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAlertsWithEventResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAlertsWithEventResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeAlertsWithEventResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertsWithEventResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setMainUserId(_ctx.longValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].MainUserId"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertUuid"));
			responseDataItem.setLogTime(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].LogTime"));
			responseDataItem.setAlertSrcProd(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertSrcProd"));
			responseDataItem.setAlertTitle(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertTitle"));
			responseDataItem.setAlertTitleEn(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertTitleEn"));
			responseDataItem.setAlertType(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertType"));
			responseDataItem.setAlertTypeEn(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertTypeEn"));
			responseDataItem.setAlertTypeCode(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertTypeCode"));
			responseDataItem.setAlertName(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertName"));
			responseDataItem.setAlertNameEn(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertNameEn"));
			responseDataItem.setAlertNameCode(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertNameCode"));
			responseDataItem.setAlertLevel(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertLevel"));
			responseDataItem.setAssetList(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AssetList"));
			responseDataItem.setOccurTime(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].OccurTime"));
			responseDataItem.setStartTime(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].StartTime"));
			responseDataItem.setEndTime(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].EndTime"));
			responseDataItem.setAlertSrcProdModule(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertSrcProdModule"));
			responseDataItem.setAlertDesc(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertDesc"));
			responseDataItem.setAlertDescEn(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertDescEn"));
			responseDataItem.setAlertDescCode(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertDescCode"));
			responseDataItem.setAlertDetail(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertDetail"));
			responseDataItem.setLogUuid(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].LogUuid"));
			responseDataItem.setAttCk(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AttCk"));
			responseDataItem.setSubUserId(_ctx.longValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setCloudCode(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].CloudCode"));
			responseDataItem.setIsDefend(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].IsDefend"));

			List<AlertInfoListItem> alertInfoList = new ArrayList<AlertInfoListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertInfoList.Length"); j++) {
				AlertInfoListItem alertInfoListItem = new AlertInfoListItem();
				alertInfoListItem.setKey(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].Key"));
				alertInfoListItem.setKeyName(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].KeyName"));
				alertInfoListItem.setValues(_ctx.stringValue("DescribeAlertsWithEventResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].Values"));

				alertInfoList.add(alertInfoListItem);
			}
			responseDataItem.setAlertInfoList(alertInfoList);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeAlertsWithEventResponse.setData(data);
	 
	 	return describeAlertsWithEventResponse;
	}
}