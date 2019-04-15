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

import com.aliyuncs.aegis.model.v20161111.DescribeTopRiskyAssetsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeTopRiskyAssetsResponse.TopRiskyAsset;
import com.aliyuncs.aegis.model.v20161111.DescribeTopRiskyAssetsResponse.TopRiskyAsset.AssetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopRiskyAssetsResponseUnmarshaller {

	public static DescribeTopRiskyAssetsResponse unmarshall(DescribeTopRiskyAssetsResponse describeTopRiskyAssetsResponse, UnmarshallerContext context) {
		
		describeTopRiskyAssetsResponse.setRequestId(context.stringValue("DescribeTopRiskyAssetsResponse.RequestId"));
		describeTopRiskyAssetsResponse.setTotalCount(context.integerValue("DescribeTopRiskyAssetsResponse.TotalCount"));

		List<TopRiskyAsset> topRiskyAssets = new ArrayList<TopRiskyAsset>();
		for (int i = 0; i < context.lengthValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets.Length"); i++) {
			TopRiskyAsset topRiskyAsset = new TopRiskyAsset();
			topRiskyAsset.setType(context.stringValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets["+ i +"].Type"));

			List<AssetInfo> assetInfos = new ArrayList<AssetInfo>();
			for (int j = 0; j < context.lengthValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets["+ i +"].AssetInfos.Length"); j++) {
				AssetInfo assetInfo = new AssetInfo();
				assetInfo.setUuid(context.stringValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets["+ i +"].AssetInfos["+ j +"].Uuid"));
				assetInfo.setIp(context.stringValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets["+ i +"].AssetInfos["+ j +"].Ip"));
				assetInfo.setInstanceName(context.stringValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets["+ i +"].AssetInfos["+ j +"].InstanceName"));
				assetInfo.setCount(context.stringValue("DescribeTopRiskyAssetsResponse.TopRiskyAssets["+ i +"].AssetInfos["+ j +"].Count"));

				assetInfos.add(assetInfo);
			}
			topRiskyAsset.setAssetInfos(assetInfos);

			topRiskyAssets.add(topRiskyAsset);
		}
		describeTopRiskyAssetsResponse.setTopRiskyAssets(topRiskyAssets);
	 
	 	return describeTopRiskyAssetsResponse;
	}
}