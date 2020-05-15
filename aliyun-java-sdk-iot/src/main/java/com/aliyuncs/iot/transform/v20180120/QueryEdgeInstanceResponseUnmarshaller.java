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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceResponseUnmarshaller {

	public static QueryEdgeInstanceResponse unmarshall(QueryEdgeInstanceResponse queryEdgeInstanceResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceResponse.RequestId"));
		queryEdgeInstanceResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceResponse.Success"));
		queryEdgeInstanceResponse.setCode(_ctx.stringValue("QueryEdgeInstanceResponse.Code"));
		queryEdgeInstanceResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceResponse.Data.CurrentPage"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceResponse.Data.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].InstanceId"));
			instance.setName(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].Name"));
			instance.setTags(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].Tags"));
			instance.setType(_ctx.integerValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].Type"));
			instance.setGmtCreate(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].GmtCreate"));
			instance.setGmtModified(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].GmtModified"));
			instance.setRoleArn(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].RoleArn"));
			instance.setRoleName(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].RoleName"));
			instance.setRoleAttachTime(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].RoleAttachTime"));
			instance.setSpec(_ctx.integerValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].Spec"));
			instance.setBizEnable(_ctx.booleanValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].BizEnable"));
			instance.setLatestDeploymentStatus(_ctx.integerValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].LatestDeploymentStatus"));
			instance.setLatestDeploymentType(_ctx.stringValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].LatestDeploymentType"));
			instance.setGmtCreateTimestamp(_ctx.longValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].GmtCreateTimestamp"));
			instance.setGmtModifiedTimestamp(_ctx.longValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].GmtModifiedTimestamp"));
			instance.setRoleAttachTimestamp(_ctx.longValue("QueryEdgeInstanceResponse.Data.InstanceList["+ i +"].RoleAttachTimestamp"));

			instanceList.add(instance);
		}
		data.setInstanceList(instanceList);
		queryEdgeInstanceResponse.setData(data);
	 
	 	return queryEdgeInstanceResponse;
	}
}