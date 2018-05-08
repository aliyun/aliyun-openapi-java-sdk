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

package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaInstanceResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaInstanceResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaInstanceResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaInstanceResponseUnmarshaller {

	public static GetQuotaInstanceResponse unmarshall(GetQuotaInstanceResponse getQuotaInstanceResponse, UnmarshallerContext context) {
		
		getQuotaInstanceResponse.setRequestId(context.stringValue("GetQuotaInstanceResponse.RequestId"));
		getQuotaInstanceResponse.setCode(context.integerValue("GetQuotaInstanceResponse.Code"));
		getQuotaInstanceResponse.setMessage(context.stringValue("GetQuotaInstanceResponse.Message"));

		Data data = new Data();
		data.setTotal(context.integerValue("GetQuotaInstanceResponse.Data.Total"));

		List<Instance> detail = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("GetQuotaInstanceResponse.Data.Detail.Length"); i++) {
			Instance instance = new Instance();
			instance.setProject(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].Project"));
			instance.setInstanceId(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].Status"));
			instance.setUserAccount(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].UserAccount"));
			instance.setNickName(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].NickName"));
			instance.setCluster(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].Cluster"));
			instance.setRunTime(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].RunTime"));
			instance.setCpuUsed(context.longValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].CpuUsed"));
			instance.setCpuRequest(context.longValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].CpuRequest"));
			instance.setCpuUsedTotal(context.longValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].CpuUsedTotal"));
			instance.setCpuUsedRatioMax(context.floatValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMax"));
			instance.setCpuUsedRatioMin(context.floatValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].CpuUsedRatioMin"));
			instance.setMemUsed(context.longValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].MemUsed"));
			instance.setMemRequest(context.longValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].MemRequest"));
			instance.setMemUsedTotal(context.longValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].MemUsedTotal"));
			instance.setMemUsedRatioMax(context.floatValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMax"));
			instance.setMemUsedRatioMin(context.floatValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].MemUsedRatioMin"));
			instance.setTaskType(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].TaskType"));
			instance.setSkynetId(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].SkynetId"));
			instance.setQuotaName(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].QuotaName"));
			instance.setQuotaId(context.integerValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].QuotaId"));
			instance.setUser(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].User"));
			instance.setIsRealOwner(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].IsRealOwner"));
			instance.setProjectOwner(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].ProjectOwner"));
			instance.setCollectTime(context.stringValue("GetQuotaInstanceResponse.Data.Detail["+ i +"].CollectTime"));

			detail.add(instance);
		}
		data.setDetail(detail);
		getQuotaInstanceResponse.setData(data);
	 
	 	return getQuotaInstanceResponse;
	}
}