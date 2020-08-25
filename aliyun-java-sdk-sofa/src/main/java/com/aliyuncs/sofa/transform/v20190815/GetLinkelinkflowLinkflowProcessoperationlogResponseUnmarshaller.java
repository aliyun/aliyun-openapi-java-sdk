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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessoperationlogResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessoperationlogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowProcessoperationlogResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowProcessoperationlogResponse unmarshall(GetLinkelinkflowLinkflowProcessoperationlogResponse getLinkelinkflowLinkflowProcessoperationlogResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowProcessoperationlogResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.RequestId"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.ResultCode"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.ResultMessage"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Current"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.ErrorCode"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.ErrorMsg"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.PageSize"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Success"));
		getLinkelinkflowLinkflowProcessoperationlogResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActivityId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].ActivityId"));
			dataItem.setActivityName(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].ActivityName"));
			dataItem.setActivityType(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].ActivityType"));
			dataItem.setAssignee(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].Assignee"));
			dataItem.setComment(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].Comment"));
			dataItem.setDuration(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].Duration"));
			dataItem.setEndTime(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].EndTime"));
			dataItem.setId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].Id"));
			dataItem.setProcessDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].ProcessDefinitionId"));
			dataItem.setProcessInstanceId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].ProcessInstanceId"));
			dataItem.setStartTime(_ctx.longValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].StartTime"));
			dataItem.setTaskId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessoperationlogResponse.Data["+ i +"].TaskId"));

			data.add(dataItem);
		}
		getLinkelinkflowLinkflowProcessoperationlogResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowProcessoperationlogResponse;
	}
}