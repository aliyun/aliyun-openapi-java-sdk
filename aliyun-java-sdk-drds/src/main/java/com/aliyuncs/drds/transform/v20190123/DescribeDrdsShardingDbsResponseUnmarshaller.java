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

	public static DescribeDrdsShardingDbsResponse unmarshall(DescribeDrdsShardingDbsResponse describeDrdsShardingDbsResponse, UnmarshallerContext _ctx) {
		
		describeDrdsShardingDbsResponse.setRequestId(_ctx.stringValue("DescribeDrdsShardingDbsResponse.RequestId"));
		describeDrdsShardingDbsResponse.setSuccess(_ctx.booleanValue("DescribeDrdsShardingDbsResponse.Success"));

		List<ShardingDb> shardingDbs = new ArrayList<ShardingDb>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsShardingDbsResponse.ShardingDbs.Length"); i++) {
			ShardingDb shardingDb = new ShardingDb();
			shardingDb.setShardingDbName(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].ShardingDbName"));
			shardingDb.setDbInstanceId(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].DbInstanceId"));
			shardingDb.setGroupName(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].GroupName"));
			shardingDb.setDbStatus(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].DbStatus"));
			shardingDb.setDbType(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].DbType"));
			shardingDb.setMinPoolSize(_ctx.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].MinPoolSize"));
			shardingDb.setMaxPoolSize(_ctx.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].MaxPoolSize"));
			shardingDb.setIdleTimeOut(_ctx.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].IdleTimeOut"));
			shardingDb.setBlockingTimeout(_ctx.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].BlockingTimeout"));
			shardingDb.setConnectionProperties(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].ConnectionProperties"));
			shardingDb.setPreparedStatementCacheSize(_ctx.integerValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].PreparedStatementCacheSize"));
			shardingDb.setUserName(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].UserName"));
			shardingDb.setConnectUrl(_ctx.stringValue("DescribeDrdsShardingDbsResponse.ShardingDbs["+ i +"].ConnectUrl"));

			shardingDbs.add(shardingDb);
		}
		describeDrdsShardingDbsResponse.setShardingDbs(shardingDbs);
	 
	 	return describeDrdsShardingDbsResponse;
	}
}