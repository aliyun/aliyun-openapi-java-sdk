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

import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListEffectiveAssetsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListEffectiveAssetsResponse.Asset;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhiteListEffectiveAssetsResponseUnmarshaller {

	public static DescribeWhiteListEffectiveAssetsResponse unmarshall(DescribeWhiteListEffectiveAssetsResponse describeWhiteListEffectiveAssetsResponse, UnmarshallerContext context) {
		
		describeWhiteListEffectiveAssetsResponse.setRequestId(context.stringValue("DescribeWhiteListEffectiveAssetsResponse.RequestId"));
		describeWhiteListEffectiveAssetsResponse.setCount(context.integerValue("DescribeWhiteListEffectiveAssetsResponse.Count"));
		describeWhiteListEffectiveAssetsResponse.setPageSize(context.integerValue("DescribeWhiteListEffectiveAssetsResponse.PageSize"));
		describeWhiteListEffectiveAssetsResponse.setTotalCount(context.integerValue("DescribeWhiteListEffectiveAssetsResponse.TotalCount"));
		describeWhiteListEffectiveAssetsResponse.setCurrentPage(context.integerValue("DescribeWhiteListEffectiveAssetsResponse.CurrentPage"));

		List<Asset> assets = new ArrayList<Asset>();
		for (int i = 0; i < context.lengthValue("DescribeWhiteListEffectiveAssetsResponse.Assets.Length"); i++) {
			Asset asset = new Asset();
			asset.setUuid(context.stringValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].Uuid"));
			asset.setMachineName(context.stringValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].MachineName"));
			asset.setInternetIp(context.stringValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].InternetIp"));
			asset.setIntranetIp(context.stringValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].IntranetIp"));
			asset.setStrategyId(context.longValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].StrategyId"));
			asset.setStrategyName(context.stringValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].StrategyName"));
			asset.setSuspiciousEventCount(context.integerValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].SuspiciousEventCount"));
			asset.setProcessMethod(context.integerValue("DescribeWhiteListEffectiveAssetsResponse.Assets["+ i +"].ProcessMethod"));

			assets.add(asset);
		}
		describeWhiteListEffectiveAssetsResponse.setAssets(assets);
	 
	 	return describeWhiteListEffectiveAssetsResponse;
	}
}