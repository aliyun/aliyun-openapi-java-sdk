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

import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceResponse;
import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeInstanceResponseUnmarshaller {

	public static GetEdgeInstanceResponse unmarshall(GetEdgeInstanceResponse getEdgeInstanceResponse, UnmarshallerContext _ctx) {
		
		getEdgeInstanceResponse.setRequestId(_ctx.stringValue("GetEdgeInstanceResponse.RequestId"));
		getEdgeInstanceResponse.setCode(_ctx.stringValue("GetEdgeInstanceResponse.Code"));
		getEdgeInstanceResponse.setErrorMessage(_ctx.stringValue("GetEdgeInstanceResponse.ErrorMessage"));
		getEdgeInstanceResponse.setSuccess(_ctx.booleanValue("GetEdgeInstanceResponse.Success"));

		Data data = new Data();
		data.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceResponse.Data.GmtCreateTimestamp"));
		data.setType(_ctx.stringValue("GetEdgeInstanceResponse.Data.Type"));
		data.setRoleArn(_ctx.stringValue("GetEdgeInstanceResponse.Data.RoleArn"));
		data.setSpec(_ctx.integerValue("GetEdgeInstanceResponse.Data.Spec"));
		data.setRoleAttachTime(_ctx.stringValue("GetEdgeInstanceResponse.Data.RoleAttachTime"));
		data.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceResponse.Data.GmtModifiedTimestamp"));
		data.setTags(_ctx.stringValue("GetEdgeInstanceResponse.Data.Tags"));
		data.setInstanceId(_ctx.stringValue("GetEdgeInstanceResponse.Data.InstanceId"));
		data.setRoleName(_ctx.stringValue("GetEdgeInstanceResponse.Data.RoleName"));
		data.setRoleAttachTimestamp(_ctx.longValue("GetEdgeInstanceResponse.Data.RoleAttachTimestamp"));
		data.setGmtModified(_ctx.stringValue("GetEdgeInstanceResponse.Data.GmtModified"));
		data.setLatestDeploymentType(_ctx.stringValue("GetEdgeInstanceResponse.Data.LatestDeploymentType"));
		data.setLatestDeploymentStatus(_ctx.integerValue("GetEdgeInstanceResponse.Data.LatestDeploymentStatus"));
		data.setBizEnable(_ctx.booleanValue("GetEdgeInstanceResponse.Data.BizEnable"));
		data.setGmtCreate(_ctx.stringValue("GetEdgeInstanceResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("GetEdgeInstanceResponse.Data.Name"));
		getEdgeInstanceResponse.setData(data);
	 
	 	return getEdgeInstanceResponse;
	}
}