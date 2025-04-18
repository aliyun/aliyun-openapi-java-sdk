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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersWithBackupsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersWithBackupsResponse.DBCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersWithBackupsResponseUnmarshaller {

	public static DescribeDBClustersWithBackupsResponse unmarshall(DescribeDBClustersWithBackupsResponse describeDBClustersWithBackupsResponse, UnmarshallerContext _ctx) {
		
		describeDBClustersWithBackupsResponse.setRequestId(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.RequestId"));
		describeDBClustersWithBackupsResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersWithBackupsResponse.PageNumber"));
		describeDBClustersWithBackupsResponse.setPageRecordCount(_ctx.integerValue("DescribeDBClustersWithBackupsResponse.PageRecordCount"));
		describeDBClustersWithBackupsResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBClustersWithBackupsResponse.TotalRecordCount"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersWithBackupsResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDeletedTime(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DeletedTime"));
			dBCluster.setVpcId(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].VpcId"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].Expired"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].CreateTime"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].PayType"));
			dBCluster.setDBType(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBType"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].LockMode"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].RegionId"));
			dBCluster.setDeletionLock(_ctx.integerValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DeletionLock"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBVersion"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setIsDeleted(_ctx.integerValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].IsDeleted"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBClusterNetworkType"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].ZoneId"));
			dBCluster.setEngine(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].Engine"));
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].Category"));
			dBCluster.setCnClass(_ctx.stringValue("DescribeDBClustersWithBackupsResponse.Items["+ i +"].CnClass"));

			items.add(dBCluster);
		}
		describeDBClustersWithBackupsResponse.setItems(items);
	 
	 	return describeDBClustersWithBackupsResponse;
	}
}