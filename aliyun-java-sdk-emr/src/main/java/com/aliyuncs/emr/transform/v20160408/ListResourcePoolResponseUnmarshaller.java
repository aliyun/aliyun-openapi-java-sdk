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

import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse.PoolInfo;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse.PoolInfo.EcmResourcePool;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse.PoolInfo.EcmResourcePoolConfig2;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse.PoolInfo.Queue;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse.PoolInfo.Queue.EcmResourcePoolConfig;
import com.aliyuncs.emr.model.v20160408.ListResourcePoolResponse.PoolInfo.Queue.EcmResourceQueue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcePoolResponseUnmarshaller {

	public static ListResourcePoolResponse unmarshall(ListResourcePoolResponse listResourcePoolResponse, UnmarshallerContext context) {
		
		listResourcePoolResponse.setRequestId(context.stringValue("ListResourcePoolResponse.RequestId"));
		listResourcePoolResponse.setPageNumber(context.integerValue("ListResourcePoolResponse.PageNumber"));
		listResourcePoolResponse.setPageSize(context.integerValue("ListResourcePoolResponse.PageSize"));
		listResourcePoolResponse.setTotal(context.integerValue("ListResourcePoolResponse.Total"));

		List<PoolInfo> poolInfoList = new ArrayList<PoolInfo>();
		for (int i = 0; i < context.lengthValue("ListResourcePoolResponse.PoolInfoList.Length"); i++) {
			PoolInfo poolInfo = new PoolInfo();

			EcmResourcePool ecmResourcePool = new EcmResourcePool();
			ecmResourcePool.setId(context.longValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.Id"));
			ecmResourcePool.setName(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.Name"));
			ecmResourcePool.setPoolType(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.PoolType"));
			ecmResourcePool.setActive(context.booleanValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.Active"));
			ecmResourcePool.setNote(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.Note"));
			ecmResourcePool.setUserId(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.UserId"));
			ecmResourcePool.setYarnSiteConfig(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePool.YarnSiteConfig"));
			poolInfo.setEcmResourcePool(ecmResourcePool);

			List<Queue> queueList = new ArrayList<Queue>();
			for (int j = 0; j < context.lengthValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList.Length"); j++) {
				Queue queue = new Queue();

				EcmResourceQueue ecmResourceQueue = new EcmResourceQueue();
				ecmResourceQueue.setId(context.longValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Id"));
				ecmResourceQueue.setName(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Name"));
				ecmResourceQueue.setQualifiedName(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.QualifiedName"));
				ecmResourceQueue.setQueueType(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.QueueType"));
				ecmResourceQueue.setParentQueueId(context.longValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.ParentQueueId"));
				ecmResourceQueue.setLeaf(context.booleanValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Leaf"));
				ecmResourceQueue.setStatus(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.Status"));
				ecmResourceQueue.setUserId(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.UserId"));
				ecmResourceQueue.setResourcePoolId(context.longValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourceQueue.ResourcePoolId"));
				queue.setEcmResourceQueue(ecmResourceQueue);

				List<EcmResourcePoolConfig> ecmResourcePoolConfigList1 = new ArrayList<EcmResourcePoolConfig>();
				for (int k = 0; k < context.lengthValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList.Length"); k++) {
					EcmResourcePoolConfig ecmResourcePoolConfig = new EcmResourcePoolConfig();
					ecmResourcePoolConfig.setId(context.longValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Id"));
					ecmResourcePoolConfig.setConfigKey(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].ConfigKey"));
					ecmResourcePoolConfig.setConfigValue(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].ConfigValue"));
					ecmResourcePoolConfig.setConfigType(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].ConfigType"));
					ecmResourcePoolConfig.setCategory(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Category"));
					ecmResourcePoolConfig.setStatus(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Status"));
					ecmResourcePoolConfig.setNote(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].QueueList["+ j +"].EcmResourcePoolConfigList["+ k +"].Note"));

					ecmResourcePoolConfigList1.add(ecmResourcePoolConfig);
				}
				queue.setEcmResourcePoolConfigList1(ecmResourcePoolConfigList1);

				queueList.add(queue);
			}
			poolInfo.setQueueList(queueList);

			List<EcmResourcePoolConfig2> ecmResourcePoolConfigList = new ArrayList<EcmResourcePoolConfig2>();
			for (int j = 0; j < context.lengthValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList.Length"); j++) {
				EcmResourcePoolConfig2 ecmResourcePoolConfig2 = new EcmResourcePoolConfig2();
				ecmResourcePoolConfig2.setId(context.longValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Id"));
				ecmResourcePoolConfig2.setConfigKey(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].ConfigKey"));
				ecmResourcePoolConfig2.setConfigValue(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].ConfigValue"));
				ecmResourcePoolConfig2.setConfigType(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].ConfigType"));
				ecmResourcePoolConfig2.setCategory(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Category"));
				ecmResourcePoolConfig2.setStatus(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Status"));
				ecmResourcePoolConfig2.setNote(context.stringValue("ListResourcePoolResponse.PoolInfoList["+ i +"].EcmResourcePoolConfigList["+ j +"].Note"));

				ecmResourcePoolConfigList.add(ecmResourcePoolConfig2);
			}
			poolInfo.setEcmResourcePoolConfigList(ecmResourcePoolConfigList);

			poolInfoList.add(poolInfo);
		}
		listResourcePoolResponse.setPoolInfoList(poolInfoList);
	 
	 	return listResourcePoolResponse;
	}
}