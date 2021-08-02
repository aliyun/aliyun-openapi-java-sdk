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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.GetMigrationWorkflowInstanceLogInfoResponse;
import com.aliyuncs.datalake.model.v20200710.GetMigrationWorkflowInstanceLogInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMigrationWorkflowInstanceLogInfoResponseUnmarshaller {

	public static GetMigrationWorkflowInstanceLogInfoResponse unmarshall(GetMigrationWorkflowInstanceLogInfoResponse getMigrationWorkflowInstanceLogInfoResponse, UnmarshallerContext _ctx) {
		
		getMigrationWorkflowInstanceLogInfoResponse.setRequestId(_ctx.stringValue("GetMigrationWorkflowInstanceLogInfoResponse.RequestId"));
		getMigrationWorkflowInstanceLogInfoResponse.setSuccess(_ctx.booleanValue("GetMigrationWorkflowInstanceLogInfoResponse.Success"));
		getMigrationWorkflowInstanceLogInfoResponse.setTotalCount(_ctx.integerValue("GetMigrationWorkflowInstanceLogInfoResponse.TotalCount"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetMigrationWorkflowInstanceLogInfoResponse.Data.InstanceId"));
		data.setLogContent(_ctx.stringValue("GetMigrationWorkflowInstanceLogInfoResponse.Data.LogContent"));
		getMigrationWorkflowInstanceLogInfoResponse.setData(data);
	 
	 	return getMigrationWorkflowInstanceLogInfoResponse;
	}
}