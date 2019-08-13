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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListOpsOperationResponse;
import com.aliyuncs.emr.model.v20160408.ListOpsOperationResponse.OpsOperationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpsOperationResponseUnmarshaller {

	public static ListOpsOperationResponse unmarshall(ListOpsOperationResponse listOpsOperationResponse, UnmarshallerContext _ctx) {
		
		listOpsOperationResponse.setRequestId(_ctx.stringValue("ListOpsOperationResponse.RequestId"));
		listOpsOperationResponse.setTotal(_ctx.integerValue("ListOpsOperationResponse.Total"));
		listOpsOperationResponse.setPageNumber(_ctx.integerValue("ListOpsOperationResponse.PageNumber"));
		listOpsOperationResponse.setPageSize(_ctx.integerValue("ListOpsOperationResponse.PageSize"));

		List<OpsOperationListItem> opsOperationList = new ArrayList<OpsOperationListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOpsOperationResponse.OpsOperationList.Length"); i++) {
			OpsOperationListItem opsOperationListItem = new OpsOperationListItem();
			opsOperationListItem.setId(_ctx.longValue("ListOpsOperationResponse.OpsOperationList["+ i +"].Id"));
			opsOperationListItem.setStartTime(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].StartTime"));
			opsOperationListItem.setEndTime(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].EndTime"));
			opsOperationListItem.setOpsCommandId(_ctx.longValue("ListOpsOperationResponse.OpsOperationList["+ i +"].OpsCommandId"));
			opsOperationListItem.setOpsCommandName(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].OpsCommandName"));
			opsOperationListItem.setStatus(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].Status"));
			opsOperationListItem.setTotalTaskNum(_ctx.longValue("ListOpsOperationResponse.OpsOperationList["+ i +"].TotalTaskNum"));
			opsOperationListItem.setFailedTaskNum(_ctx.longValue("ListOpsOperationResponse.OpsOperationList["+ i +"].FailedTaskNum"));
			opsOperationListItem.setFinishedTaskNum(_ctx.longValue("ListOpsOperationResponse.OpsOperationList["+ i +"].FinishedTaskNum"));
			opsOperationListItem.setClusterId(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].ClusterId"));
			opsOperationListItem.setRegionId(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].RegionId"));
			opsOperationListItem.setParams(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].Params"));
			opsOperationListItem.setRemark(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].Remark"));
			opsOperationListItem.setRunningTime(_ctx.longValue("ListOpsOperationResponse.OpsOperationList["+ i +"].RunningTime"));
			opsOperationListItem.setCategory(_ctx.stringValue("ListOpsOperationResponse.OpsOperationList["+ i +"].Category"));

			opsOperationList.add(opsOperationListItem);
		}
		listOpsOperationResponse.setOpsOperationList(opsOperationList);
	 
	 	return listOpsOperationResponse;
	}
}