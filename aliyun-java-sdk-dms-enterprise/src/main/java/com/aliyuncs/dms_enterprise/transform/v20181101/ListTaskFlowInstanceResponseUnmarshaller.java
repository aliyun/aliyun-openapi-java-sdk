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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowInstanceResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowInstanceResponse.DAGInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowInstanceResponseUnmarshaller {

	public static ListTaskFlowInstanceResponse unmarshall(ListTaskFlowInstanceResponse listTaskFlowInstanceResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowInstanceResponse.setRequestId(_ctx.stringValue("ListTaskFlowInstanceResponse.RequestId"));
		listTaskFlowInstanceResponse.setErrorCode(_ctx.stringValue("ListTaskFlowInstanceResponse.ErrorCode"));
		listTaskFlowInstanceResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowInstanceResponse.ErrorMessage"));
		listTaskFlowInstanceResponse.setSuccess(_ctx.booleanValue("ListTaskFlowInstanceResponse.Success"));
		listTaskFlowInstanceResponse.setTotalCount(_ctx.integerValue("ListTaskFlowInstanceResponse.TotalCount"));

		List<DAGInstance> dAGInstanceList = new ArrayList<DAGInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowInstanceResponse.DAGInstanceList.Length"); i++) {
			DAGInstance dAGInstance = new DAGInstance();
			dAGInstance.setId(_ctx.longValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].Id"));
			dAGInstance.setBusinessTime(_ctx.stringValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].BusinessTime"));
			dAGInstance.setEndTime(_ctx.stringValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].EndTime"));
			dAGInstance.setDagId(_ctx.stringValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].DagId"));
			dAGInstance.setTriggerType(_ctx.integerValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].TriggerType"));
			dAGInstance.setStatus(_ctx.integerValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].Status"));
			dAGInstance.setMessage(_ctx.stringValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].Message"));
			dAGInstance.setHistoryDagId(_ctx.longValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].HistoryDagId"));
			dAGInstance.setDagName(_ctx.stringValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].DagName"));
			dAGInstance.setOwnerName(_ctx.stringValue("ListTaskFlowInstanceResponse.DAGInstanceList["+ i +"].OwnerName"));

			dAGInstanceList.add(dAGInstance);
		}
		listTaskFlowInstanceResponse.setDAGInstanceList(dAGInstanceList);
	 
	 	return listTaskFlowInstanceResponse;
	}
}