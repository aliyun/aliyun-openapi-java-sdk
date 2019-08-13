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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse.PoolInfo;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse.PoolInfo.EcmResourcePool;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse.PoolInfo.EcmResourcePoolConfig2;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse.PoolInfo.Queue;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse.PoolInfo.Queue.EcmResourcePoolConfig;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolForAdminResponse.PoolInfo.Queue.EcmResourceQueue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcePoolForAdminResponseUnmarshaller {

	public static ListResourcePoolForAdminResponse unmarshall(ListResourcePoolForAdminResponse listResourcePoolForAdminResponse, UnmarshallerContext _ctx) {
		
		listResourcePoolForAdminResponse.setRequestId(_ctx.stringValue("ListResourcePoolForAdminResponse.RequestId"));
		listResourcePoolForAdminResponse.setPageNumber(_ctx.integerValue("ListResourcePoolForAdminResponse.PageNumber"));
		listResourcePoolForAdminResponse.setPageSize(_ctx.integerValue("ListResourcePoolForAdminResponse.PageSize"));
		listResourcePoolForAdminResponse.setTotal(_ctx.integerValue("ListResourcePoolForAdminResponse.Total"));

		List<PoolInfo> poolInfoList = new ArrayList<PoolInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcePoolForAdminResponse.PoolInfoList.Length"); i++) {
			PoolInfo poolInfo = new PoolInfo();

			EcmResourcePool ecmResourcePool = new EcmResourcePool();
			ecmResourcePool.setId(_ctx.longValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.Id"));
			ecmResourcePool.setName(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.Name"));
			ecmResourcePool.setPoolType(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.PoolType"));
			ecmResourcePool.setActive(_ctx.booleanValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.Active"));
			ecmResourcePool.setNote(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.Note"));
			ecmResourcePool.setUserId(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.UserId"));
			ecmResourcePool.setYarnSiteConfig(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePool.YarnSiteConfig"));
			poolInfo.setEcmResourcePool(ecmResourcePool);

			List<Queue> queueList = new ArrayList<Queue>();
			for (int j = 0; j < _ctx.lengthValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList.Length"); j++) {
				Queue queue = new Queue();

				EcmResourceQueue ecmResourceQueue = new EcmResourceQueue();
				ecmResourceQueue.setId(_ctx.longValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Id"));
				ecmResourceQueue.setName(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Name"));
				ecmResourceQueue.setQualifiedName(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.QualifiedName"));
				ecmResourceQueue.setQueueType(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.QueueType"));
				ecmResourceQueue.setParentQueueId(_ctx.longValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.ParentQueueId"));
				ecmResourceQueue.setLeaf(_ctx.booleanValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Leaf"));
				ecmResourceQueue.setStatus(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Status"));
				ecmResourceQueue.setUserId(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.UserId"));
				ecmResourceQueue.setResourcePoolId(_ctx.longValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.ResourcePoolId"));
				queue.setEcmResourceQueue(ecmResourceQueue);

				List<EcmResourcePoolConfig> ecmResourcePoolConfigList1 = new ArrayList<EcmResourcePoolConfig>();
				for (int k = 0; k < _ctx.lengthValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList.Length"); k++) {
					EcmResourcePoolConfig ecmResourcePoolConfig = new EcmResourcePoolConfig();
					ecmResourcePoolConfig.setId(_ctx.longValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Id"));
					ecmResourcePoolConfig.setConfigKey(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].ConfigKey"));
					ecmResourcePoolConfig.setConfigValue(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].ConfigValue"));
					ecmResourcePoolConfig.setConfigType(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].ConfigType"));
					ecmResourcePoolConfig.setCategory(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Category"));
					ecmResourcePoolConfig.setStatus(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Status"));
					ecmResourcePoolConfig.setNote(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Note"));

					ecmResourcePoolConfigList1.add(ecmResourcePoolConfig);
				}
				queue.setEcmResourcePoolConfigList1(ecmResourcePoolConfigList1);

				queueList.add(queue);
			}
			poolInfo.setQueueList(queueList);

			List<EcmResourcePoolConfig2> ecmResourcePoolConfigList = new ArrayList<EcmResourcePoolConfig2>();
			for (int j = 0; j < _ctx.lengthValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList.Length"); j++) {
				EcmResourcePoolConfig2 ecmResourcePoolConfig2 = new EcmResourcePoolConfig2();
				ecmResourcePoolConfig2.setId(_ctx.longValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Id"));
				ecmResourcePoolConfig2.setConfigKey(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].ConfigKey"));
				ecmResourcePoolConfig2.setConfigValue(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].ConfigValue"));
				ecmResourcePoolConfig2.setConfigType(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].ConfigType"));
				ecmResourcePoolConfig2.setCategory(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Category"));
				ecmResourcePoolConfig2.setStatus(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Status"));
				ecmResourcePoolConfig2.setNote(_ctx.stringValue("ListResourcePoolForAdminResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Note"));

				ecmResourcePoolConfigList.add(ecmResourcePoolConfig2);
			}
			poolInfo.setEcmResourcePoolConfigList(ecmResourcePoolConfigList);

			poolInfoList.add(poolInfo);
		}
		listResourcePoolForAdminResponse.setPoolInfoList(poolInfoList);
	 
	 	return listResourcePoolForAdminResponse;
	}
}