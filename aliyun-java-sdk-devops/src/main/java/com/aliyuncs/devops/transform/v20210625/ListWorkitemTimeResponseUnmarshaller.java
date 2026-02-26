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

import com.aliyuncs.devops.model.v20210625.ListWorkitemTimeResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkitemTimeResponse.WorkitemTimeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkitemTimeResponseUnmarshaller {

	public static ListWorkitemTimeResponse unmarshall(ListWorkitemTimeResponse listWorkitemTimeResponse, UnmarshallerContext _ctx) {
		
		listWorkitemTimeResponse.setRequestId(_ctx.stringValue("ListWorkitemTimeResponse.requestId"));
		listWorkitemTimeResponse.setErrorMsg(_ctx.stringValue("ListWorkitemTimeResponse.errorMsg"));
		listWorkitemTimeResponse.setErrorCode(_ctx.stringValue("ListWorkitemTimeResponse.errorCode"));
		listWorkitemTimeResponse.setSuccess(_ctx.booleanValue("ListWorkitemTimeResponse.success"));
		listWorkitemTimeResponse.setCode(_ctx.longValue("ListWorkitemTimeResponse.code"));

		List<WorkitemTimeItem> workitemTime = new ArrayList<WorkitemTimeItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkitemTimeResponse.workitemTime.Length"); i++) {
			WorkitemTimeItem workitemTimeItem = new WorkitemTimeItem();
			workitemTimeItem.setWorkitemIdentifier(_ctx.stringValue("ListWorkitemTimeResponse.workitemTime["+ i +"].workitemIdentifier"));
			workitemTimeItem.setIdentifier(_ctx.stringValue("ListWorkitemTimeResponse.workitemTime["+ i +"].identifier"));
			workitemTimeItem.setGmtStart(_ctx.longValue("ListWorkitemTimeResponse.workitemTime["+ i +"].gmtStart"));
			workitemTimeItem.setGmtEnd(_ctx.longValue("ListWorkitemTimeResponse.workitemTime["+ i +"].gmtEnd"));
			workitemTimeItem.setActualTime(_ctx.floatValue("ListWorkitemTimeResponse.workitemTime["+ i +"].actualTime"));
			workitemTimeItem.setType(_ctx.stringValue("ListWorkitemTimeResponse.workitemTime["+ i +"].type"));
			workitemTimeItem.setDescription(_ctx.stringValue("ListWorkitemTimeResponse.workitemTime["+ i +"].description"));
			workitemTimeItem.setRecordUser(_ctx.stringValue("ListWorkitemTimeResponse.workitemTime["+ i +"].recordUser"));
			workitemTimeItem.setGmtCreate(_ctx.longValue("ListWorkitemTimeResponse.workitemTime["+ i +"].gmtCreate"));
			workitemTimeItem.setGmtModified(_ctx.longValue("ListWorkitemTimeResponse.workitemTime["+ i +"].gmtModified"));

			workitemTime.add(workitemTimeItem);
		}
		listWorkitemTimeResponse.setWorkitemTime(workitemTime);
	 
	 	return listWorkitemTimeResponse;
	}
}