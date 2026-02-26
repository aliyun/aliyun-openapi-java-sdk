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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeAffectedAssetsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAffectedAssetsResponse.AssetEvent;
import com.aliyuncs.sas.model.v20181203.DescribeAffectedAssetsResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAffectedAssetsResponseUnmarshaller {

	public static DescribeAffectedAssetsResponse unmarshall(DescribeAffectedAssetsResponse describeAffectedAssetsResponse, UnmarshallerContext _ctx) {
		
		describeAffectedAssetsResponse.setRequestId(_ctx.stringValue("DescribeAffectedAssetsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAffectedAssetsResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAffectedAssetsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeAffectedAssetsResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeAffectedAssetsResponse.PageInfo.Count"));
		describeAffectedAssetsResponse.setPageInfo(pageInfo);

		List<AssetEvent> assetList = new ArrayList<AssetEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAffectedAssetsResponse.AssetList.Length"); i++) {
			AssetEvent assetEvent = new AssetEvent();
			assetEvent.setUuid(_ctx.stringValue("DescribeAffectedAssetsResponse.AssetList["+ i +"].Uuid"));
			assetEvent.setInternetIp(_ctx.stringValue("DescribeAffectedAssetsResponse.AssetList["+ i +"].InternetIp"));
			assetEvent.setRiskNum(_ctx.integerValue("DescribeAffectedAssetsResponse.AssetList["+ i +"].RiskNum"));
			assetEvent.setInstanceName(_ctx.stringValue("DescribeAffectedAssetsResponse.AssetList["+ i +"].InstanceName"));
			assetEvent.setInstanceId(_ctx.stringValue("DescribeAffectedAssetsResponse.AssetList["+ i +"].InstanceId"));
			assetEvent.setIntranetIp(_ctx.stringValue("DescribeAffectedAssetsResponse.AssetList["+ i +"].IntranetIp"));

			assetList.add(assetEvent);
		}
		describeAffectedAssetsResponse.setAssetList(assetList);
	 
	 	return describeAffectedAssetsResponse;
	}
}