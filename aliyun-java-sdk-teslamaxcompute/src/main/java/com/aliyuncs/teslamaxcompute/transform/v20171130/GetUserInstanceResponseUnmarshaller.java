/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.teslamaxcompute.transform.v20171130;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20171130.GetUserInstanceResponse;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetUserInstanceResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetUserInstanceResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInstanceResponseUnmarshaller {

	public static GetUserInstanceResponse unmarshall(GetUserInstanceResponse getUserInstanceResponse, UnmarshallerContext context) {
		
		getUserInstanceResponse.setRequestId(context.stringValue("GetUserInstanceResponse.RequestId"));
		getUserInstanceResponse.setCode(context.integerValue("GetUserInstanceResponse.Code"));
		getUserInstanceResponse.setMessage(context.stringValue("GetUserInstanceResponse.Message"));

		Data data = new Data();
		data.setTotal(context.integerValue("GetUserInstanceResponse.Data.Total"));

		List<Instance> detail = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("GetUserInstanceResponse.Data.Detail.Length"); i++) {
			Instance instance = new Instance();
			instance.setProject(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].Project"));
			instance.setInstanceId(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].Status"));
			instance.setUserAccount(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].UserAccount"));
			instance.setNickName(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].NickName"));
			instance.setCluster(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].Cluster"));
			instance.setRunTime(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].RunTime"));
			instance.setCpuUsed(context.integerValue("GetUserInstanceResponse.Data.Detail["+ i +"].CpuUsed"));
			instance.setCpuRequest(context.integerValue("GetUserInstanceResponse.Data.Detail["+ i +"].CpuRequest"));
			instance.setCpuUsedTotal(context.integerValue("GetUserInstanceResponse.Data.Detail["+ i +"].CpuUsedTotal"));
			instance.setCpuUsedRatioMax(context.floatValue("GetUserInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMax"));
			instance.setCpuUsedRatioMin(context.floatValue("GetUserInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMin"));
			instance.setMemUsed(context.integerValue("GetUserInstanceResponse.Data.Detail["+ i +"].MemUsed"));
			instance.setMemRequest(context.integerValue("GetUserInstanceResponse.Data.Detail["+ i +"].MemRequest"));
			instance.setMemUsedTotal(context.integerValue("GetUserInstanceResponse.Data.Detail["+ i +"].MemUsedTotal"));
			instance.setMemUsedRatioMax(context.floatValue("GetUserInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMax"));
			instance.setMemUsedRatioMin(context.floatValue("GetUserInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMin"));
			instance.setTaskType(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].TaskType"));
			instance.setSkynetId(context.stringValue("GetUserInstanceResponse.Data.Detail["+ i +"].SkynetId"));

			detail.add(instance);
		}
		data.setDetail(detail);
		getUserInstanceResponse.setData(data);
	 
	 	return getUserInstanceResponse;
	}
}