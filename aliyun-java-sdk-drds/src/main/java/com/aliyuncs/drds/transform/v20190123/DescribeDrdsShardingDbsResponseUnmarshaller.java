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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsShardingDbsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsShardingDbsResponse.ShardingDb;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsShardingDbsResponseUnmarshaller {

	public static DescribeDrdsShardingDbsResponse unmarshall(DescribeDrdsShardingDbsResponse describeDrdsShardingDbsResponse, UnmarshallerContext context) {
		
		describeDrdsShardingDbsResponse.setRequestId(context.stringValue("DescribeDrdsShardingDbsResponse.RequestId"));
		describeDrdsShardingDbsResponse.setSuccess(context.booleanValue("DescribeDrdsShardingDbsResponse.Success"));

		List<ShardingDb> shardingDbs = new ArrayList<ShardingDb>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsShardingDbsResponse.ShardingDbs.Length"); i++) {
			ShardingDb shardingDb = new ShardingDb();
			shardingDb.setShardingDbName(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].ShardingDbName"));
			shardingDb.setDbInstanceId(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].DbInstanceId"));
			shardingDb.setGroupName(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].GroupName"));
			shardingDb.setDbStatus(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].DbStatus"));
			shardingDb.setDbType(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].DbType"));
			shardingDb.setMinPoolSize(context.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].MinPoolSize"));
			shardingDb.setMaxPoolSize(context.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].MaxPoolSize"));
			shardingDb.setIdleTimeOut(context.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].IdleTimeOut"));
			shardingDb.setBlockingTimeout(context.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].BlockingTimeout"));
			shardingDb.setConnectionProperties(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].ConnectionProperties"));
			shardingDb.setPreparedStatementCacheSize(context.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].PreparedStatementCacheSize"));
			shardingDb.setUserName(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].UserName"));
			shardingDb.setConnectUrl(context.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].ConnectUrl"));

			shardingDbs.add(shardingDb);
		}
		describeDrdsShardingDbsResponse.setShardingDbs(shardingDbs);
	 
	 	return describeDrdsShardingDbsResponse;
	}
}