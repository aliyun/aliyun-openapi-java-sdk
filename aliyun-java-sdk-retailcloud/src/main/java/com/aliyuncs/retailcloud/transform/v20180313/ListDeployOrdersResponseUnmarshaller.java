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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListDeployOrdersResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListDeployOrdersResponse.DeployOrderInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeployOrdersResponseUnmarshaller {

	public static ListDeployOrdersResponse unmarshall(ListDeployOrdersResponse listDeployOrdersResponse, UnmarshallerContext _ctx) {
		
		listDeployOrdersResponse.setRequestId(_ctx.stringValue("ListDeployOrdersResponse.RequestId"));
		listDeployOrdersResponse.setCode(_ctx.integerValue("ListDeployOrdersResponse.Code"));
		listDeployOrdersResponse.setErrorMsg(_ctx.stringValue("ListDeployOrdersResponse.ErrorMsg"));
		listDeployOrdersResponse.setPageNumber(_ctx.integerValue("ListDeployOrdersResponse.PageNumber"));
		listDeployOrdersResponse.setPageSize(_ctx.integerValue("ListDeployOrdersResponse.PageSize"));
		listDeployOrdersResponse.setTotalCount(_ctx.longValue("ListDeployOrdersResponse.TotalCount"));

		List<DeployOrderInstance> data = new ArrayList<DeployOrderInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListDeployOrdersResponse.Data.Length"); i++) {
			DeployOrderInstance deployOrderInstance = new DeployOrderInstance();
			deployOrderInstance.setStatus(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].Status"));
			deployOrderInstance.setAppInstanceType(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].AppInstanceType"));
			deployOrderInstance.setDeployType(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].DeployType"));
			deployOrderInstance.setUserId(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].UserId"));
			deployOrderInstance.setPartitionTypeName(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].PartitionTypeName"));
			deployOrderInstance.setStatusName(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].StatusName"));
			deployOrderInstance.setEnvType(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].EnvType"));
			deployOrderInstance.setTotalAppInstanceCt(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].TotalAppInstanceCt"));
			deployOrderInstance.setElapsedTime(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].ElapsedTime"));
			deployOrderInstance.setDescription(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].Description"));
			deployOrderInstance.setName(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].Name"));
			deployOrderInstance.setDeployTypeName(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].DeployTypeName"));
			deployOrderInstance.setFinishAppInstanceCt(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].FinishAppInstanceCt"));
			deployOrderInstance.setSchemaId(_ctx.longValue("ListDeployOrdersResponse.Data["+ i +"].SchemaId"));
			deployOrderInstance.setDeployPauseType(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].DeployPauseType"));
			deployOrderInstance.setResult(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].Result"));
			deployOrderInstance.setFailureRate(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].FailureRate"));
			deployOrderInstance.setTotalPartitions(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].TotalPartitions"));
			deployOrderInstance.setUserNick(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].UserNick"));
			deployOrderInstance.setEndTime(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].EndTime"));
			deployOrderInstance.setStartTime(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].StartTime"));
			deployOrderInstance.setDeployOrderId(_ctx.longValue("ListDeployOrdersResponse.Data["+ i +"].DeployOrderId"));
			deployOrderInstance.setDeployPauseTypeName(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].DeployPauseTypeName"));
			deployOrderInstance.setResultName(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].ResultName"));
			deployOrderInstance.setCurrentPartitionNum(_ctx.integerValue("ListDeployOrdersResponse.Data["+ i +"].CurrentPartitionNum"));
			deployOrderInstance.setPartitionType(_ctx.stringValue("ListDeployOrdersResponse.Data["+ i +"].PartitionType"));
			deployOrderInstance.setEnvId(_ctx.longValue("ListDeployOrdersResponse.Data["+ i +"].EnvId"));

			data.add(deployOrderInstance);
		}
		listDeployOrdersResponse.setData(data);
	 
	 	return listDeployOrdersResponse;
	}
}