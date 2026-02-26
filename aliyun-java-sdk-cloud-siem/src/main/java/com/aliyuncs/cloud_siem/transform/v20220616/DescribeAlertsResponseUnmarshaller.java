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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsResponse.Data.ResponseDataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsResponse.Data.ResponseDataItem.AlertInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertsResponseUnmarshaller {

	public static DescribeAlertsResponse unmarshall(DescribeAlertsResponse describeAlertsResponse, UnmarshallerContext _ctx) {
		
		describeAlertsResponse.setRequestId(_ctx.stringValue("DescribeAlertsResponse.RequestId"));
		describeAlertsResponse.setSuccess(_ctx.booleanValue("DescribeAlertsResponse.Success"));
		describeAlertsResponse.setCode(_ctx.integerValue("DescribeAlertsResponse.Code"));
		describeAlertsResponse.setMessage(_ctx.stringValue("DescribeAlertsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAlertsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAlertsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeAlertsResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertsResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setMainUserId(_ctx.longValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].MainUserId"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertUuid"));
			responseDataItem.setLogTime(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].LogTime"));
			responseDataItem.setAlertSrcProd(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertSrcProd"));
			responseDataItem.setAlertTitle(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertTitle"));
			responseDataItem.setAlertTitleEn(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertTitleEn"));
			responseDataItem.setAlertType(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertType"));
			responseDataItem.setAlertTypeEn(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertTypeEn"));
			responseDataItem.setAlertTypeCode(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertTypeCode"));
			responseDataItem.setAlertName(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertName"));
			responseDataItem.setAlertNameEn(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertNameEn"));
			responseDataItem.setAlertNameCode(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertNameCode"));
			responseDataItem.setAlertLevel(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertLevel"));
			responseDataItem.setAssetList(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AssetList"));
			responseDataItem.setOccurTime(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].OccurTime"));
			responseDataItem.setStartTime(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].StartTime"));
			responseDataItem.setEndTime(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].EndTime"));
			responseDataItem.setAlertSrcProdModule(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertSrcProdModule"));
			responseDataItem.setAlertDesc(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertDesc"));
			responseDataItem.setAlertDescEn(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertDescEn"));
			responseDataItem.setAlertDescCode(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertDescCode"));
			responseDataItem.setAlertDetail(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertDetail"));
			responseDataItem.setLogUuid(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].LogUuid"));
			responseDataItem.setEntityList(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].EntityList"));
			responseDataItem.setAttCk(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AttCk"));
			responseDataItem.setSubUserId(_ctx.longValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setSubUserName(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].SubUserName"));
			responseDataItem.setVendorId(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].VendorId"));
			responseDataItem.setIsDefend(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].IsDefend"));
			responseDataItem.setExtendContent(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].ExtendContent"));
			responseDataItem.setProductId(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].ProductId"));
			responseDataItem.setCloudCode(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].CloudCode"));
			responseDataItem.setDetectionRuleId(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].DetectionRuleId"));
			responseDataItem.setAlertStatus(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertStatus"));

			List<AlertInfoListItem> alertInfoList = new ArrayList<AlertInfoListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertInfoList.Length"); j++) {
				AlertInfoListItem alertInfoListItem = new AlertInfoListItem();
				alertInfoListItem.setKey(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].Key"));
				alertInfoListItem.setKeyName(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].KeyName"));
				alertInfoListItem.setValues(_ctx.stringValue("DescribeAlertsResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].Values"));

				alertInfoList.add(alertInfoListItem);
			}
			responseDataItem.setAlertInfoList(alertInfoList);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeAlertsResponse.setData(data);
	 
	 	return describeAlertsResponse;
	}
}