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

import com.aliyuncs.aegis.model.v20161111.DescribeAssetDetailByUuidResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeAssetDetailByUuidResponse.AssetDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssetDetailByUuidResponseUnmarshaller {

	public static DescribeAssetDetailByUuidResponse unmarshall(DescribeAssetDetailByUuidResponse describeAssetDetailByUuidResponse, UnmarshallerContext context) {
		
		describeAssetDetailByUuidResponse.setRequestId(context.stringValue("DescribeAssetDetailByUuidResponse.RequestId"));

		AssetDetail assetDetail = new AssetDetail();
		assetDetail.setInternetIp(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.InternetIp"));
		assetDetail.setIntranetIp(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.IntranetIp"));
		assetDetail.setInstanceName(context.integerValue("DescribeAssetDetailByUuidResponse.AssetDetail.InstanceName"));
		assetDetail.setInstanceId(context.integerValue("DescribeAssetDetailByUuidResponse.AssetDetail.InstanceId"));
		assetDetail.setIp(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Ip"));
		assetDetail.setUuid(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Uuid"));
		assetDetail.setAssetType(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.AssetType"));
		assetDetail.setOs(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Os"));
		assetDetail.setClientStatus(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.ClientStatus"));
		assetDetail.setRegion(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Region"));
		assetDetail.setRegionName(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.RegionName"));
		assetDetail.setTag(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Tag"));
		assetDetail.setGroupTrace(context.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.GroupTrace"));
		describeAssetDetailByUuidResponse.setAssetDetail(assetDetail);
	 
	 	return describeAssetDetailByUuidResponse;
	}
}