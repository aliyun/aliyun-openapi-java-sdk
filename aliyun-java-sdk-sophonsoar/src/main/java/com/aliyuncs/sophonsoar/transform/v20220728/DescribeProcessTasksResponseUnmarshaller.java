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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeProcessTasksResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeProcessTasksResponse.Data;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeProcessTasksResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProcessTasksResponseUnmarshaller {

	public static DescribeProcessTasksResponse unmarshall(DescribeProcessTasksResponse describeProcessTasksResponse, UnmarshallerContext _ctx) {
		
		describeProcessTasksResponse.setRequestId(_ctx.stringValue("DescribeProcessTasksResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("DescribeProcessTasksResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("DescribeProcessTasksResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribeProcessTasksResponse.Page.PageSize"));
		describeProcessTasksResponse.setPage(page);

		List<Data> processTasks = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessTasksResponse.ProcessTasks.Length"); i++) {
			Data data = new Data();
			data.setTaskId(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].TaskId"));
			data.setCreator(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].Creator"));
			data.setGmtCreateMillis(_ctx.longValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].GmtCreateMillis"));
			data.setGmtModifiedMillis(_ctx.longValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].GmtModifiedMillis"));
			data.setTaskName(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].TaskName"));
			data.setYunCode(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].YunCode"));
			data.setEntityName(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].EntityName"));
			data.setEntityType(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].EntityType"));
			data.setEntityValue(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].EntityValue"));
			data.setEntityKey(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].EntityKey"));
			data.setTaskStatus(_ctx.integerValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].TaskStatus"));
			data.setScope(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].Scope"));
			data.setInputParams(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].InputParams"));
			data.setSceneCode(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].SceneCode"));
			data.setSceneName(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].SceneName"));
			data.setProcessTime(_ctx.longValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].ProcessTime"));
			data.setRemoveTime(_ctx.longValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].RemoveTime"));
			data.setProcessStrategyUuid(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].ProcessStrategyUuid"));
			data.setTenantId(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].TenantId"));
			data.setSource(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].Source"));
			data.setRemoveFlag(_ctx.integerValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].RemoveFlag"));
			data.setRetryFlag(_ctx.integerValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].RetryFlag"));
			data.setErrCode(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].ErrCode"));
			data.setErrMsg(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].ErrMsg"));
			data.setErrTip(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].ErrTip"));
			data.setEntityUuid(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].EntityUuid"));
			data.setEventUuid(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].EventUuid"));
			data.setReqUuid(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].ReqUuid"));
			data.setTriggerSource(_ctx.stringValue("DescribeProcessTasksResponse.ProcessTasks["+ i +"].TriggerSource"));

			processTasks.add(data);
		}
		describeProcessTasksResponse.setProcessTasks(processTasks);
	 
	 	return describeProcessTasksResponse;
	}
}