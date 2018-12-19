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

import com.aliyuncs.edas.model.v20170801.ListEcsNotInClusterResponse;
import com.aliyuncs.edas.model.v20170801.ListEcsNotInClusterResponse.EcsEntity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEcsNotInClusterResponseUnmarshaller {

	public static ListEcsNotInClusterResponse unmarshall(ListEcsNotInClusterResponse listEcsNotInClusterResponse, UnmarshallerContext context) {
		
		listEcsNotInClusterResponse.setRequestId(context.stringValue("ListEcsNotInClusterResponse.RequestId"));
		listEcsNotInClusterResponse.setCode(context.integerValue("ListEcsNotInClusterResponse.Code"));
		listEcsNotInClusterResponse.setMessage(context.stringValue("ListEcsNotInClusterResponse.Message"));

		List<EcsEntity> ecsEntityList = new ArrayList<EcsEntity>();
		for (int i = 0; i < context.lengthValue("ListEcsNotInClusterResponse.EcsEntityList.Length"); i++) {
			EcsEntity ecsEntity = new EcsEntity();
			ecsEntity.setInstanceId(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].InstanceId"));
			ecsEntity.setInstanceName(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].InstanceName"));
			ecsEntity.setVpcId(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].VpcId"));
			ecsEntity.setVpcName(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].VpcName"));
			ecsEntity.setExpired(context.booleanValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].Expired"));
			ecsEntity.setStatus(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].Status"));
			ecsEntity.setRegionId(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].RegionId"));
			ecsEntity.setCpu(context.integerValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].Cpu"));
			ecsEntity.setMem(context.integerValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].Mem"));
			ecsEntity.setPublicIp(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].PublicIp"));
			ecsEntity.setInnerIp(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].InnerIp"));
			ecsEntity.setPrivateIp(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].PrivateIp"));
			ecsEntity.setEip(context.stringValue("ListEcsNotInClusterResponse.EcsEntityList["+ i +"].Eip"));

			ecsEntityList.add(ecsEntity);
		}
		listEcsNotInClusterResponse.setEcsEntityList(ecsEntityList);
	 
	 	return listEcsNotInClusterResponse;
	}
}