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

import com.aliyuncs.aegis.model.v20161111.DescribeSasAssetStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSasAssetStatisticsResponse.Asset;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSasAssetStatisticsResponseUnmarshaller {

	public static DescribeSasAssetStatisticsResponse unmarshall(DescribeSasAssetStatisticsResponse describeSasAssetStatisticsResponse, UnmarshallerContext context) {
		
		describeSasAssetStatisticsResponse.setRequestId(context.stringValue("DescribeSasAssetStatisticsResponse.RequestId"));
		describeSasAssetStatisticsResponse.setPageSize(context.integerValue("DescribeSasAssetStatisticsResponse.PageSize"));
		describeSasAssetStatisticsResponse.setCurrentPage(context.integerValue("DescribeSasAssetStatisticsResponse.CurrentPage"));
		describeSasAssetStatisticsResponse.setTotalCount(context.integerValue("DescribeSasAssetStatisticsResponse.TotalCount"));

		List<Asset> assetList = new ArrayList<Asset>();
		for (int i = 0; i < context.lengthValue("DescribeSasAssetStatisticsResponse.AssetList.Length"); i++) {
			Asset asset = new Asset();
			asset.setHealthCheckCount(context.integerValue("DescribeSasAssetStatisticsResponse.AssetList["+ i +"].HealthCheckCount"));
			asset.setVulCount(context.integerValue("DescribeSasAssetStatisticsResponse.AssetList["+ i +"].VulCount"));
			asset.setSafeEventCount(context.integerValue("DescribeSasAssetStatisticsResponse.AssetList["+ i +"].SafeEventCount"));
			asset.setUuid(context.stringValue("DescribeSasAssetStatisticsResponse.AssetList["+ i +"].Uuid"));

			assetList.add(asset);
		}
		describeSasAssetStatisticsResponse.setAssetList(assetList);
	 
	 	return describeSasAssetStatisticsResponse;
	}
}