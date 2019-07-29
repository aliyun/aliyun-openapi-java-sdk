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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse.DBCluster;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAttributeResponseUnmarshaller {

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RequestId"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].RegionId"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ZoneId"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBClusterType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterType"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Category"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].LockMode"));
			dBCluster.setLockReason(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].LockReason"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].PayType"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBVersion"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setDBNodeStorage(_ctx.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBNodeStorage"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setDBNodeCount(_ctx.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBNodeCount"));
			dBCluster.setCreationTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].CreationTime"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Expired"));
			dBCluster.setMaintainTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].MaintainTime"));
			dBCluster.setEngine(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Engine"));
			dBCluster.setVPCId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VPCId"));
			dBCluster.setVSwitchId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VSwitchId"));
			dBCluster.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VPCCloudInstanceId"));
			dBCluster.setCommodityCode(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].CommodityCode"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterNetworkType"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeDBClusterAttributeResponse.setItems(items);
	 
	 	return describeDBClusterAttributeResponse;
	}
}