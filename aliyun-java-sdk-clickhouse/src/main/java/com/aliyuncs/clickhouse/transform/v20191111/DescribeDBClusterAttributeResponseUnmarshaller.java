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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterAttributeResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterAttributeResponse.DBCluster;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterAttributeResponse.DBCluster.ScaleOutStatus;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterAttributeResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAttributeResponseUnmarshaller {

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RequestId"));

		DBCluster dBCluster = new DBCluster();
		dBCluster.setRegionId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.RegionId"));
		dBCluster.setZoneId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.ZoneId"));
		dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.DBClusterId"));
		dBCluster.setDBClusterType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.DBClusterType"));
		dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.DBClusterDescription"));
		dBCluster.setCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.Category"));
		dBCluster.setLockMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.LockMode"));
		dBCluster.setLockReason(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.LockReason"));
		dBCluster.setPayType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.PayType"));
		dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.DBClusterStatus"));
		dBCluster.setDBNodeStorage(_ctx.longValue("DescribeDBClusterAttributeResponse.DBCluster.DBNodeStorage"));
		dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.DBNodeClass"));
		dBCluster.setDBNodeCount(_ctx.longValue("DescribeDBClusterAttributeResponse.DBCluster.DBNodeCount"));
		dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.CreateTime"));
		dBCluster.setEngine(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.Engine"));
		dBCluster.setEngineVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.EngineVersion"));
		dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.ExpireTime"));
		dBCluster.setIsExpired(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.IsExpired"));
		dBCluster.setMaintainTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.MaintainTime"));
		dBCluster.setVpcId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.VpcId"));
		dBCluster.setVSwitchId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.VSwitchId"));
		dBCluster.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.VpcCloudInstanceId"));
		dBCluster.setCommodityCode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.CommodityCode"));
		dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.DBClusterNetworkType"));
		dBCluster.setStorageType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.StorageType"));
		dBCluster.setVpcId1(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.VpcId"));
		dBCluster.setVSwitchId2(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.VSwitchId"));
		dBCluster.setVpcCloudInstanceId3(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.VpcCloudInstanceId"));
		dBCluster.setPublicConnectionString(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.PublicConnectionString"));
		dBCluster.setPublicPort(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.PublicPort"));
		dBCluster.setConnectionString(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.ConnectionString"));
		dBCluster.setPort(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBCluster.Port"));
		dBCluster.setAliUid(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.AliUid"));
		dBCluster.setBid(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.Bid"));

		ScaleOutStatus scaleOutStatus = new ScaleOutStatus();
		scaleOutStatus.setProgress(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.ScaleOutStatus.Progress"));
		scaleOutStatus.setRatio(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.ScaleOutStatus.Ratio"));
		dBCluster.setScaleOutStatus(scaleOutStatus);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.DBCluster.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBCluster.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		dBCluster.setTags(tags);
		describeDBClusterAttributeResponse.setDBCluster(dBCluster);
	 
	 	return describeDBClusterAttributeResponse;
	}
}