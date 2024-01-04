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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListWorkitemsResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkitemsResponse.Workitem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkitemsResponseUnmarshaller {

	public static ListWorkitemsResponse unmarshall(ListWorkitemsResponse listWorkitemsResponse, UnmarshallerContext _ctx) {
		
		listWorkitemsResponse.setTotalCount(_ctx.longValue("ListWorkitemsResponse.totalCount"));
		listWorkitemsResponse.setNextToken(_ctx.stringValue("ListWorkitemsResponse.nextToken"));
		listWorkitemsResponse.setMaxResults(_ctx.longValue("ListWorkitemsResponse.maxResults"));
		listWorkitemsResponse.setRequestId(_ctx.stringValue("ListWorkitemsResponse.requestId"));
		listWorkitemsResponse.setErrorMsg(_ctx.stringValue("ListWorkitemsResponse.errorMsg"));
		listWorkitemsResponse.setErrorCode(_ctx.stringValue("ListWorkitemsResponse.errorCode"));
		listWorkitemsResponse.setSuccess(_ctx.booleanValue("ListWorkitemsResponse.success"));

		List<Workitem> workitems = new ArrayList<Workitem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkitemsResponse.workitems.Length"); i++) {
			Workitem workitem = new Workitem();
			workitem.setIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].identifier"));
			workitem.setSubject(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].subject"));
			workitem.setDocument(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].document"));
			workitem.setAssignedTo(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].assignedTo"));
			workitem.setStatus(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].status"));
			workitem.setStatusStageIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].statusStageIdentifier"));
			workitem.setSpaceIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].spaceIdentifier"));
			workitem.setSpaceName(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].spaceName"));
			workitem.setSpaceType(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].spaceType"));
			workitem.setLogicalStatus(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].logicalStatus"));
			workitem.setCategoryIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].categoryIdentifier"));
			workitem.setParentIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].parentIdentifier"));
			workitem.setWorkitemTypeIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].workitemTypeIdentifier"));
			workitem.setUpdateStatusAt(_ctx.longValue("ListWorkitemsResponse.workitems["+ i +"].updateStatusAt"));
			workitem.setSerialNumber(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].serialNumber"));
			workitem.setGmtCreate(_ctx.longValue("ListWorkitemsResponse.workitems["+ i +"].gmtCreate"));
			workitem.setGmtModified(_ctx.longValue("ListWorkitemsResponse.workitems["+ i +"].gmtModified"));
			workitem.setCreator(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].creator"));
			workitem.setModifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].modifier"));
			workitem.setStatusIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].statusIdentifier"));
			workitem.setSprintIdentifier(_ctx.stringValue("ListWorkitemsResponse.workitems["+ i +"].sprintIdentifier"));
			workitem.setFinishTime(_ctx.longValue("ListWorkitemsResponse.workitems["+ i +"].finishTime"));

			workitems.add(workitem);
		}
		listWorkitemsResponse.setWorkitems(workitems);
	 
	 	return listWorkitemsResponse;
	}
}