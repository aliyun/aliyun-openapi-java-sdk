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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemAssetsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemAssetsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemAssetsResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemAssetsResponse.Data.ResponseDataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCloudSiemAssetsResponse.Data.ResponseDataItem.AssetInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudSiemAssetsResponseUnmarshaller {

	public static DescribeCloudSiemAssetsResponse unmarshall(DescribeCloudSiemAssetsResponse describeCloudSiemAssetsResponse, UnmarshallerContext _ctx) {
		
		describeCloudSiemAssetsResponse.setRequestId(_ctx.stringValue("DescribeCloudSiemAssetsResponse.RequestId"));
		describeCloudSiemAssetsResponse.setSuccess(_ctx.booleanValue("DescribeCloudSiemAssetsResponse.Success"));
		describeCloudSiemAssetsResponse.setCode(_ctx.integerValue("DescribeCloudSiemAssetsResponse.Code"));
		describeCloudSiemAssetsResponse.setMessage(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeCloudSiemAssetsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeCloudSiemAssetsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeCloudSiemAssetsResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudSiemAssetsResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setSubUserId(_ctx.longValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AlertUuid"));
			responseDataItem.setAssetName(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetName"));
			responseDataItem.setAssetType(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetType"));
			responseDataItem.setAssetId(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetId"));
			responseDataItem.setCloudCode(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].CloudCode"));

			List<AssetInfoItem> assetInfo = new ArrayList<AssetInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetInfo.Length"); j++) {
				AssetInfoItem assetInfoItem = new AssetInfoItem();
				assetInfoItem.setKey(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetInfo["+ j +"].Key"));
				assetInfoItem.setKeyName(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetInfo["+ j +"].KeyName"));
				assetInfoItem.setValues(_ctx.stringValue("DescribeCloudSiemAssetsResponse.Data.ResponseData["+ i +"].AssetInfo["+ j +"].Values"));

				assetInfo.add(assetInfoItem);
			}
			responseDataItem.setAssetInfo(assetInfo);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeCloudSiemAssetsResponse.setData(data);
	 
	 	return describeCloudSiemAssetsResponse;
	}
}