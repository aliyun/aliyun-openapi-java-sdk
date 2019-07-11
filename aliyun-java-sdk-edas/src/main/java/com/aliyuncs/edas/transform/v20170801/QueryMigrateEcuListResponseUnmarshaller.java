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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.QueryMigrateEcuListResponse;
import com.aliyuncs.edas.model.v20170801.QueryMigrateEcuListResponse.EcuEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMigrateEcuListResponseUnmarshaller {

	public static QueryMigrateEcuListResponse unmarshall(QueryMigrateEcuListResponse queryMigrateEcuListResponse, UnmarshallerContext _ctx) {
		
		queryMigrateEcuListResponse.setRequestId(_ctx.stringValue("QueryMigrateEcuListResponse.RequestId"));
		queryMigrateEcuListResponse.setCode(_ctx.integerValue("QueryMigrateEcuListResponse.Code"));
		queryMigrateEcuListResponse.setMessage(_ctx.stringValue("QueryMigrateEcuListResponse.Message"));

		List<EcuEntity> ecuEntityList = new ArrayList<EcuEntity>();
		for (int i = 0; i < _ctx.lengthValue("QueryMigrateEcuListResponse.EcuEntityList.Length"); i++) {
			EcuEntity ecuEntity = new EcuEntity();
			ecuEntity.setEcuId(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].EcuId"));
			ecuEntity.setOnline(_ctx.booleanValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].Online"));
			ecuEntity.setDockerEnv(_ctx.booleanValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].DockerEnv"));
			ecuEntity.setCreateTime(_ctx.longValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].CreateTime"));
			ecuEntity.setUpdateTime(_ctx.longValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].UpdateTime"));
			ecuEntity.setIpAddr(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].IpAddr"));
			ecuEntity.setHeartbeatTime(_ctx.longValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].HeartbeatTime"));
			ecuEntity.setUserId(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].UserId"));
			ecuEntity.setName(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].Name"));
			ecuEntity.setZoneId(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].ZoneId"));
			ecuEntity.setRegionId(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].RegionId"));
			ecuEntity.setInstanceId(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].InstanceId"));
			ecuEntity.setVpcId(_ctx.stringValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].VpcId"));
			ecuEntity.setAvailableCpu(_ctx.integerValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].AvailableCpu"));
			ecuEntity.setAvailableMem(_ctx.integerValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].AvailableMem"));
			ecuEntity.setCpu(_ctx.integerValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].Cpu"));
			ecuEntity.setMem(_ctx.integerValue("QueryMigrateEcuListResponse.EcuEntityList["+ i +"].Mem"));

			ecuEntityList.add(ecuEntity);
		}
		queryMigrateEcuListResponse.setEcuEntityList(ecuEntityList);
	 
	 	return queryMigrateEcuListResponse;
	}
}