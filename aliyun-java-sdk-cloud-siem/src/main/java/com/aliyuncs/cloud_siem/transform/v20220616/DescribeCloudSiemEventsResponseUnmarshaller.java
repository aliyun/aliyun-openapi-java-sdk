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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventsResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemEventsResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudSiemEventsResponseUnmarshaller {

	public static DescribeCloudSiemEventsResponse unmarshall(DescribeCloudSiemEventsResponse describeCloudSiemEventsResponse, UnmarshallerContext _ctx) {
		
		describeCloudSiemEventsResponse.setRequestId(_ctx.stringValue("DescribeCloudSiemEventsResponse.RequestId"));
		describeCloudSiemEventsResponse.setSuccess(_ctx.booleanValue("DescribeCloudSiemEventsResponse.Success"));
		describeCloudSiemEventsResponse.setCode(_ctx.integerValue("DescribeCloudSiemEventsResponse.Code"));
		describeCloudSiemEventsResponse.setMessage(_ctx.stringValue("DescribeCloudSiemEventsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeCloudSiemEventsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeCloudSiemEventsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeCloudSiemEventsResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudSiemEventsResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setGmtCreate(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setAlertNum(_ctx.integerValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].AlertNum"));
			responseDataItem.setAssetNum(_ctx.integerValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].AssetNum"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setIncidentName(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].IncidentName"));
			responseDataItem.setIncidentNameEn(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].IncidentNameEn"));
			responseDataItem.setDescription(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].Description"));
			responseDataItem.setDescriptionEn(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].DescriptionEn"));
			responseDataItem.setThreatLevel(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].ThreatLevel"));
			responseDataItem.setThreatScore(_ctx.floatValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].ThreatScore"));
			responseDataItem.setExtContent(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].ExtContent"));
			responseDataItem.setStatus(_ctx.integerValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].Status"));
			responseDataItem.setRemark(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].Remark"));

			List<String> dataSources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].DataSources.Length"); j++) {
				dataSources.add(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].DataSources["+ j +"]"));
			}
			responseDataItem.setDataSources(dataSources);

			List<String> attCkLabels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].AttCkLabels.Length"); j++) {
				attCkLabels.add(_ctx.stringValue("DescribeCloudSiemEventsResponse.Data.ResponseData["+ i +"].AttCkLabels["+ j +"]"));
			}
			responseDataItem.setAttCkLabels(attCkLabels);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeCloudSiemEventsResponse.setData(data);
	 
	 	return describeCloudSiemEventsResponse;
	}
}