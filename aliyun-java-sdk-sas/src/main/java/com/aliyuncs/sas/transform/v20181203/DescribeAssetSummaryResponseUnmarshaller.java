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

import com.aliyuncs.sas.model.v20181203.DescribeAssetSummaryResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAssetSummaryResponse.AssetsSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssetSummaryResponseUnmarshaller {

	public static DescribeAssetSummaryResponse unmarshall(DescribeAssetSummaryResponse describeAssetSummaryResponse, UnmarshallerContext _ctx) {
		
		describeAssetSummaryResponse.setRequestId(_ctx.stringValue("DescribeAssetSummaryResponse.RequestId"));

		AssetsSummary assetsSummary = new AssetsSummary();
		assetsSummary.setTotalCoreNum(_ctx.integerValue("DescribeAssetSummaryResponse.AssetsSummary.TotalCoreNum"));
		assetsSummary.setTotalAssetAllRegion(_ctx.integerValue("DescribeAssetSummaryResponse.AssetsSummary.TotalAssetAllRegion"));
		assetsSummary.setTotalCoreAllRegion(_ctx.integerValue("DescribeAssetSummaryResponse.AssetsSummary.TotalCoreAllRegion"));
		describeAssetSummaryResponse.setAssetsSummary(assetsSummary);
	 
	 	return describeAssetSummaryResponse;
	}
}