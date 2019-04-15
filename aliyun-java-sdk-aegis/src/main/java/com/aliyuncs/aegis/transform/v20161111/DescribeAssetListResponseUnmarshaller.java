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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeAssetListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeAssetListResponse.Asset;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssetListResponseUnmarshaller {

	public static DescribeAssetListResponse unmarshall(DescribeAssetListResponse describeAssetListResponse, UnmarshallerContext context) {
		
		describeAssetListResponse.setRequestId(context.stringValue("DescribeAssetListResponse.RequestId"));
		describeAssetListResponse.setPageSize(context.integerValue("DescribeAssetListResponse.PageSize"));
		describeAssetListResponse.setCurrentPage(context.integerValue("DescribeAssetListResponse.CurrentPage"));
		describeAssetListResponse.setTotalCount(context.integerValue("DescribeAssetListResponse.TotalCount"));

		List<Asset> assetList = new ArrayList<Asset>();
		for (int i = 0; i < context.lengthValue("DescribeAssetListResponse.AssetList.Length"); i++) {
			Asset asset = new Asset();
			asset.setInternetIp(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].InternetIp"));
			asset.setIntranetIp(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].IntranetIp"));
			asset.setInstanceName(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].InstanceName"));
			asset.setIp(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].Ip"));
			asset.setUuid(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].Uuid"));
			asset.setAssetType(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].AssetType"));
			asset.setOs(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].Os"));
			asset.setClientStatus(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].ClientStatus"));
			asset.setRegion(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].Region"));
			asset.setRegionName(context.stringValue("DescribeAssetListResponse.AssetList["+ i +"].RegionName"));

			assetList.add(asset);
		}
		describeAssetListResponse.setAssetList(assetList);
	 
	 	return describeAssetListResponse;
	}
}