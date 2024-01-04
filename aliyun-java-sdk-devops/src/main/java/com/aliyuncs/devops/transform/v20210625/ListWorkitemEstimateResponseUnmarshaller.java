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

import com.aliyuncs.devops.model.v20210625.ListWorkitemEstimateResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkitemEstimateResponse.WorkitemTimeEstimateItem;
import com.aliyuncs.devops.model.v20210625.ListWorkitemEstimateResponse.WorkitemTimeEstimateItem.RecordUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkitemEstimateResponseUnmarshaller {

	public static ListWorkitemEstimateResponse unmarshall(ListWorkitemEstimateResponse listWorkitemEstimateResponse, UnmarshallerContext _ctx) {
		
		listWorkitemEstimateResponse.setRequestId(_ctx.stringValue("ListWorkitemEstimateResponse.requestId"));
		listWorkitemEstimateResponse.setErrorMsg(_ctx.stringValue("ListWorkitemEstimateResponse.errorMsg"));
		listWorkitemEstimateResponse.setErrorCode(_ctx.stringValue("ListWorkitemEstimateResponse.errorCode"));
		listWorkitemEstimateResponse.setSuccess(_ctx.booleanValue("ListWorkitemEstimateResponse.success"));
		listWorkitemEstimateResponse.setCode(_ctx.longValue("ListWorkitemEstimateResponse.code"));

		List<WorkitemTimeEstimateItem> workitemTimeEstimate = new ArrayList<WorkitemTimeEstimateItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkitemEstimateResponse.workitemTimeEstimate.Length"); i++) {
			WorkitemTimeEstimateItem workitemTimeEstimateItem = new WorkitemTimeEstimateItem();
			workitemTimeEstimateItem.setWorkitemIdentifier(_ctx.stringValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].workitemIdentifier"));
			workitemTimeEstimateItem.setIdentifier(_ctx.stringValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].identifier"));
			workitemTimeEstimateItem.setGmtStart(_ctx.longValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].gmtStart"));
			workitemTimeEstimateItem.setGmtEnd(_ctx.longValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].gmtEnd"));
			workitemTimeEstimateItem.setSpentTime(_ctx.floatValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].spentTime"));
			workitemTimeEstimateItem.setType(_ctx.stringValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].type"));
			workitemTimeEstimateItem.setDescription(_ctx.stringValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].description"));
			workitemTimeEstimateItem.setGmtCreate(_ctx.longValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].gmtCreate"));
			workitemTimeEstimateItem.setGmtModified(_ctx.longValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].gmtModified"));

			RecordUser recordUser = new RecordUser();
			recordUser.setIdentifier(_ctx.stringValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].recordUser.identifier"));
			recordUser.setName(_ctx.stringValue("ListWorkitemEstimateResponse.workitemTimeEstimate["+ i +"].recordUser.name"));
			workitemTimeEstimateItem.setRecordUser(recordUser);

			workitemTimeEstimate.add(workitemTimeEstimateItem);
		}
		listWorkitemEstimateResponse.setWorkitemTimeEstimate(workitemTimeEstimate);
	 
	 	return listWorkitemEstimateResponse;
	}
}