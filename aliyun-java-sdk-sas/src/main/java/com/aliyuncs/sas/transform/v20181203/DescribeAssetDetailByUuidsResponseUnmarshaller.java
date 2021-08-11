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

import com.aliyuncs.sas.model.v20181203.DescribeAssetDetailByUuidsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAssetDetailByUuidsResponse.Asset;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssetDetailByUuidsResponseUnmarshaller {

	public static DescribeAssetDetailByUuidsResponse unmarshall(DescribeAssetDetailByUuidsResponse describeAssetDetailByUuidsResponse, UnmarshallerContext _ctx) {
		
		describeAssetDetailByUuidsResponse.setRequestId(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.RequestId"));

		List<Asset> assetList = new ArrayList<Asset>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAssetDetailByUuidsResponse.AssetList.Length"); i++) {
			Asset asset = new Asset();
			asset.setInternetIp(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].InternetIp"));
			asset.setIntranetIp(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].IntranetIp"));
			asset.setInstanceName(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].InstanceName"));
			asset.setInstanceId(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].InstanceId"));
			asset.setIp(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].Ip"));
			asset.setUuid(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].Uuid"));
			asset.setAssetType(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].AssetType"));
			asset.setOs(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].Os"));
			asset.setClientStatus(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].ClientStatus"));
			asset.setRegionId(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].RegionId"));
			asset.setRegion(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].Region"));
			asset.setRegionName(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].RegionName"));
			asset.setVpcInstanceId(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].VpcInstanceId"));
			asset.setOsName(_ctx.stringValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].OsName"));
			asset.setFlag(_ctx.integerValue("DescribeAssetDetailByUuidsResponse.AssetList["+ i +"].Flag"));

			assetList.add(asset);
		}
		describeAssetDetailByUuidsResponse.setAssetList(assetList);
	 
	 	return describeAssetDetailByUuidsResponse;
	}
}