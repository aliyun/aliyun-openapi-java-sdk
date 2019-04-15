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

import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListAssetResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListAssetResponse.Asset;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhiteListAssetResponseUnmarshaller {

	public static DescribeWhiteListAssetResponse unmarshall(DescribeWhiteListAssetResponse describeWhiteListAssetResponse, UnmarshallerContext context) {
		
		describeWhiteListAssetResponse.setRequestId(context.stringValue("DescribeWhiteListAssetResponse.RequestId"));

		List<Asset> assets = new ArrayList<Asset>();
		for (int i = 0; i < context.lengthValue("DescribeWhiteListAssetResponse.Assets.Length"); i++) {
			Asset asset = new Asset();
			asset.setId(context.longValue("DescribeWhiteListAssetResponse.Assets["+ i +"].Id"));
			asset.setUuid(context.stringValue("DescribeWhiteListAssetResponse.Assets["+ i +"].Uuid"));
			asset.setGroupId(context.longValue("DescribeWhiteListAssetResponse.Assets["+ i +"].GroupId"));
			asset.setMachineName(context.stringValue("DescribeWhiteListAssetResponse.Assets["+ i +"].MachineName"));
			asset.setMachineIp(context.stringValue("DescribeWhiteListAssetResponse.Assets["+ i +"].MachineIp"));
			asset.setSelected(context.integerValue("DescribeWhiteListAssetResponse.Assets["+ i +"].Selected"));
			asset.setAllowSelected(context.integerValue("DescribeWhiteListAssetResponse.Assets["+ i +"].AllowSelected"));

			assets.add(asset);
		}
		describeWhiteListAssetResponse.setAssets(assets);
	 
	 	return describeWhiteListAssetResponse;
	}
}