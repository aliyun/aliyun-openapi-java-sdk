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

import com.aliyuncs.sas.model.v20181203.DescribeAssetsSecurityEventSummaryResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAssetsSecurityEventSummaryResponse.RiskAssetCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssetsSecurityEventSummaryResponseUnmarshaller {

	public static DescribeAssetsSecurityEventSummaryResponse unmarshall(DescribeAssetsSecurityEventSummaryResponse describeAssetsSecurityEventSummaryResponse, UnmarshallerContext _ctx) {
		
		describeAssetsSecurityEventSummaryResponse.setRequestId(_ctx.stringValue("DescribeAssetsSecurityEventSummaryResponse.RequestId"));

		List<RiskAssetCount> assets = new ArrayList<RiskAssetCount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAssetsSecurityEventSummaryResponse.Assets.Length"); i++) {
			RiskAssetCount riskAssetCount = new RiskAssetCount();
			riskAssetCount.setRiskCount(_ctx.longValue("DescribeAssetsSecurityEventSummaryResponse.Assets["+ i +"].RiskCount"));
			riskAssetCount.setTotalCount(_ctx.longValue("DescribeAssetsSecurityEventSummaryResponse.Assets["+ i +"].TotalCount"));
			riskAssetCount.setAssetType(_ctx.stringValue("DescribeAssetsSecurityEventSummaryResponse.Assets["+ i +"].AssetType"));

			assets.add(riskAssetCount);
		}
		describeAssetsSecurityEventSummaryResponse.setAssets(assets);
	 
	 	return describeAssetsSecurityEventSummaryResponse;
	}
}