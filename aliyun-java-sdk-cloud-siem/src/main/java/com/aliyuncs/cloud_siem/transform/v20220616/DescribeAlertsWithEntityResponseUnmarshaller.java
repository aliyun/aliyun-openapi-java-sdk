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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEntityResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEntityResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEntityResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEntityResponse.Data.ResponseDataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertsWithEntityResponse.Data.ResponseDataItem.AlertInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertsWithEntityResponseUnmarshaller {

	public static DescribeAlertsWithEntityResponse unmarshall(DescribeAlertsWithEntityResponse describeAlertsWithEntityResponse, UnmarshallerContext _ctx) {
		
		describeAlertsWithEntityResponse.setRequestId(_ctx.stringValue("DescribeAlertsWithEntityResponse.RequestId"));
		describeAlertsWithEntityResponse.setSuccess(_ctx.booleanValue("DescribeAlertsWithEntityResponse.Success"));
		describeAlertsWithEntityResponse.setCode(_ctx.integerValue("DescribeAlertsWithEntityResponse.Code"));
		describeAlertsWithEntityResponse.setMessage(_ctx.stringValue("DescribeAlertsWithEntityResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAlertsWithEntityResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAlertsWithEntityResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeAlertsWithEntityResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertsWithEntityResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setMainUserId(_ctx.longValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].MainUserId"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertUuid"));
			responseDataItem.setLogTime(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].LogTime"));
			responseDataItem.setAlertSrcProd(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertSrcProd"));
			responseDataItem.setAlertTitle(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertTitle"));
			responseDataItem.setAlertTitleEn(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertTitleEn"));
			responseDataItem.setAlertType(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertType"));
			responseDataItem.setAlertTypeEn(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertTypeEn"));
			responseDataItem.setAlertTypeCode(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertTypeCode"));
			responseDataItem.setAlertName(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertName"));
			responseDataItem.setAlertNameEn(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertNameEn"));
			responseDataItem.setAlertNameCode(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertNameCode"));
			responseDataItem.setAlertLevel(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertLevel"));
			responseDataItem.setAssetList(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AssetList"));
			responseDataItem.setOccurTime(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].OccurTime"));
			responseDataItem.setStartTime(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].StartTime"));
			responseDataItem.setEndTime(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].EndTime"));
			responseDataItem.setAlertSrcProdModule(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertSrcProdModule"));
			responseDataItem.setAlertDesc(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertDesc"));
			responseDataItem.setAlertDescEn(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertDescEn"));
			responseDataItem.setAlertDescCode(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertDescCode"));
			responseDataItem.setAlertDetail(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertDetail"));
			responseDataItem.setLogUuid(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].LogUuid"));
			responseDataItem.setEntityList(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].EntityList"));
			responseDataItem.setAttCk(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AttCk"));
			responseDataItem.setSubUserId(_ctx.longValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setSubUserName(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].SubUserName"));
			responseDataItem.setCloudCode(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].CloudCode"));
			responseDataItem.setIsDefend(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].IsDefend"));

			List<AlertInfoListItem> alertInfoList = new ArrayList<AlertInfoListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertInfoList.Length"); j++) {
				AlertInfoListItem alertInfoListItem = new AlertInfoListItem();
				alertInfoListItem.setKey(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].Key"));
				alertInfoListItem.setKeyName(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].KeyName"));
				alertInfoListItem.setValues(_ctx.stringValue("DescribeAlertsWithEntityResponse.Data.ResponseData["+ i +"].AlertInfoList["+ j +"].Values"));

				alertInfoList.add(alertInfoListItem);
			}
			responseDataItem.setAlertInfoList(alertInfoList);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeAlertsWithEntityResponse.setData(data);
	 
	 	return describeAlertsWithEntityResponse;
	}
}