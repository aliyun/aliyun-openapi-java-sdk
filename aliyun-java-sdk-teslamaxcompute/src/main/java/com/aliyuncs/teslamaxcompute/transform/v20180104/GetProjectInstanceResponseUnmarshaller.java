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
package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.GetProjectInstanceResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetProjectInstanceResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetProjectInstanceResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInstanceResponseUnmarshaller {

	public static GetProjectInstanceResponse unmarshall(GetProjectInstanceResponse getProjectInstanceResponse, UnmarshallerContext context) {
		
		getProjectInstanceResponse.setRequestId(context.stringValue("GetProjectInstanceResponse.RequestId"));
		getProjectInstanceResponse.setCode(context.integerValue("GetProjectInstanceResponse.Code"));
		getProjectInstanceResponse.setMessage(context.stringValue("GetProjectInstanceResponse.Message"));

		Data data = new Data();
		data.setTotal(context.integerValue("GetProjectInstanceResponse.Data.Total"));

		List<Instance> detail = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("GetProjectInstanceResponse.Data.Detail.Length"); i++) {
			Instance instance = new Instance();
			instance.setProject(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].Project"));
			instance.setInstanceId(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].Status"));
			instance.setUserAccount(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].UserAccount"));
			instance.setNickName(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].NickName"));
			instance.setCluster(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].Cluster"));
			instance.setRunTime(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].RunTime"));
			instance.setCpuUsed(context.longValue("GetProjectInstanceResponse.Data.Detail["+ i +"].CpuUsed"));
			instance.setCpuRequest(context.longValue("GetProjectInstanceResponse.Data.Detail["+ i +"].CpuRequest"));
			instance.setCpuUsedTotal(context.longValue("GetProjectInstanceResponse.Data.Detail["+ i +"].CpuUsedTotal"));
			instance.setCpuUsedRatioMax(context.floatValue("GetProjectInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMax"));
			instance.setCpuUsedRatioMin(context.floatValue("GetProjectInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMin"));
			instance.setMemUsed(context.longValue("GetProjectInstanceResponse.Data.Detail["+ i +"].MemUsed"));
			instance.setMemRequest(context.longValue("GetProjectInstanceResponse.Data.Detail["+ i +"].MemRequest"));
			instance.setMemUsedTotal(context.longValue("GetProjectInstanceResponse.Data.Detail["+ i +"].MemUsedTotal"));
			instance.setMemUsedRatioMax(context.floatValue("GetProjectInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMax"));
			instance.setMemUsedRatioMin(context.floatValue("GetProjectInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMin"));
			instance.setTaskType(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].TaskType"));
			instance.setSkynetId(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].SkynetId"));
			instance.setQuotaName(context.stringValue("GetProjectInstanceResponse.Data.Detail["+ i +"].QuotaName"));
			instance.setQuotaId(context.integerValue("GetProjectInstanceResponse.Data.Detail["+ i +"].QuotaId"));

			detail.add(instance);
		}
		data.setDetail(detail);
		getProjectInstanceResponse.setData(data);
	 
	 	return getProjectInstanceResponse;
	}
}