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

import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse.DBCluster;
import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersResponseUnmarshaller {

	public static DescribeDBClustersResponse unmarshall(DescribeDBClustersResponse describeDBClustersResponse, UnmarshallerContext _ctx) {
		
		describeDBClustersResponse.setRequestId(_ctx.stringValue("DescribeDBClustersResponse.RequestId"));
		describeDBClustersResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersResponse.PageNumber"));
		describeDBClustersResponse.setTotalCount(_ctx.integerValue("DescribeDBClustersResponse.TotalCount"));
		describeDBClustersResponse.setPageSize(_ctx.integerValue("DescribeDBClustersResponse.PageSize"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBClusterType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterType"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].PayType"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].RegionId"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Expired"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBVersion"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockMode"));
			dBCluster.setLockReason(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockReason"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CreateTime"));
			dBCluster.setDBNodeStorage(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeStorage"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setDBNodeCount(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeCount"));
			dBCluster.setCommodityCode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CommodityCode"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeDBClustersResponse.setItems(items);
	 
	 	return describeDBClustersResponse;
	}
}