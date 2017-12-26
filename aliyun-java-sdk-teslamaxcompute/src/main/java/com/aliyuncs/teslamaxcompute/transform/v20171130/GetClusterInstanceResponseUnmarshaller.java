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

import com.aliyuncs.teslamaxcompute.model.v20171130.GetClusterInstanceResponse;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetClusterInstanceResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetClusterInstanceResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterInstanceResponseUnmarshaller {

	public static GetClusterInstanceResponse unmarshall(GetClusterInstanceResponse getClusterInstanceResponse, UnmarshallerContext context) {
		
		getClusterInstanceResponse.setRequestId(context.stringValue("GetClusterInstanceResponse.RequestId"));
		getClusterInstanceResponse.setCode(context.integerValue("GetClusterInstanceResponse.Code"));
		getClusterInstanceResponse.setMessage(context.stringValue("GetClusterInstanceResponse.Message"));

		Data data = new Data();
		data.setTotal(context.integerValue("GetClusterInstanceResponse.Data.Total"));

		List<Instance> detail = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("GetClusterInstanceResponse.Data.Detail.Length"); i++) {
			Instance instance = new Instance();
			instance.setProject(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].Project"));
			instance.setInstanceId(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].Status"));
			instance.setUserAccount(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].UserAccount"));
			instance.setNickName(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].NickName"));
			instance.setCluster(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].Cluster"));
			instance.setRunTime(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].RunTime"));
			instance.setCpuUsed(context.longValue("GetClusterInstanceResponse.Data.Detail["+ i +"].CpuUsed"));
			instance.setCpuRequest(context.longValue("GetClusterInstanceResponse.Data.Detail["+ i +"].CpuRequest"));
			instance.setCpuUsedTotal(context.longValue("GetClusterInstanceResponse.Data.Detail["+ i +"].CpuUsedTotal"));
			instance.setCpuUsedRatioMax(context.floatValue("GetClusterInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMax"));
			instance.setCpuUsedRatioMin(context.floatValue("GetClusterInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMin"));
			instance.setMemUsed(context.longValue("GetClusterInstanceResponse.Data.Detail["+ i +"].MemUsed"));
			instance.setMemRequest(context.longValue("GetClusterInstanceResponse.Data.Detail["+ i +"].MemRequest"));
			instance.setMemUsedTotal(context.longValue("GetClusterInstanceResponse.Data.Detail["+ i +"].MemUsedTotal"));
			instance.setMemUsedRatioMax(context.floatValue("GetClusterInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMax"));
			instance.setMemUsedRatioMin(context.floatValue("GetClusterInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMin"));
			instance.setTaskType(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].TaskType"));
			instance.setSkynetId(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].SkynetId"));
			instance.setQuotaName(context.stringValue("GetClusterInstanceResponse.Data.Detail["+ i +"].QuotaName"));
			instance.setQuotaId(context.integerValue("GetClusterInstanceResponse.Data.Detail["+ i +"].QuotaId"));

			detail.add(instance);
		}
		data.setDetail(detail);
		getClusterInstanceResponse.setData(data);
	 
	 	return getClusterInstanceResponse;
	}
}