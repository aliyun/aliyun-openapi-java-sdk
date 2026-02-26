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

import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarTaskAndActionsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarTaskAndActionsResponse.Details;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarTaskAndActionsResponse.Details.Action;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarTaskAndActionsResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSoarTaskAndActionsResponseUnmarshaller {

	public static DescribeSoarTaskAndActionsResponse unmarshall(DescribeSoarTaskAndActionsResponse describeSoarTaskAndActionsResponse, UnmarshallerContext _ctx) {
		
		describeSoarTaskAndActionsResponse.setRequestId(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.RequestId"));

		Details details = new Details();
		details.setTriggerType(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.TriggerType"));
		details.setTaskName(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.TaskName"));
		details.setStartTime(_ctx.longValue("DescribeSoarTaskAndActionsResponse.Details.StartTime"));
		details.setEndTime(_ctx.longValue("DescribeSoarTaskAndActionsResponse.Details.EndTime"));
		details.setStatus(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Status"));
		details.setRequestUuid(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.RequestUuid"));
		details.setTaskUuid(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.TaskUuid"));
		details.setTriggerUser(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.TriggerUser"));
		details.setErrorMsg(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.ErrorMsg"));
		details.setRawEventReq(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.RawEventReq"));
		details.setTaskFlowMd5(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.TaskFlowMd5"));
		details.setActionLogNum(_ctx.integerValue("DescribeSoarTaskAndActionsResponse.Details.ActionLogNum"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSoarTaskAndActionsResponse.Details.Actions.Length"); i++) {
			Action action = new Action();
			action.setComponent(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].Component"));
			action.setAction(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].Action"));
			action.setStartTime(_ctx.longValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].StartTime"));
			action.setEndTime(_ctx.longValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].EndTime"));
			action.setStatus(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].Status"));
			action.setActionUuid(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].ActionUuid"));
			action.setAssetName(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].AssetName"));
			action.setNodeName(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].NodeName"));
			action.setNodeId(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].NodeId"));
			action.setNodeType(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Details.Actions["+ i +"].NodeType"));

			actions.add(action);
		}
		details.setActions(actions);
		describeSoarTaskAndActionsResponse.setDetails(details);

		Page page = new Page();
		page.setTotalCount(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Page.PageNumber"));
		page.setPageSize(_ctx.stringValue("DescribeSoarTaskAndActionsResponse.Page.PageSize"));
		describeSoarTaskAndActionsResponse.setPage(page);
	 
	 	return describeSoarTaskAndActionsResponse;
	}
}