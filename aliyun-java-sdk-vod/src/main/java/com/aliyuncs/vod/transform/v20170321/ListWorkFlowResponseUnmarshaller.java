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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListWorkFlowResponse;
import com.aliyuncs.vod.model.v20170321.ListWorkFlowResponse.WorkFlowInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkFlowResponseUnmarshaller {

	public static ListWorkFlowResponse unmarshall(ListWorkFlowResponse listWorkFlowResponse, UnmarshallerContext context) {
		
		listWorkFlowResponse.setRequestId(context.stringValue("ListWorkFlowResponse.RequestId"));

		List<WorkFlowInfo> workFlowInfoList = new ArrayList<WorkFlowInfo>();
		for (int i = 0; i < context.lengthValue("ListWorkFlowResponse.WorkFlowInfoList.Length"); i++) {
			WorkFlowInfo workFlowInfo = new WorkFlowInfo();
			workFlowInfo.setWorkFlowId(context.stringValue("ListWorkFlowResponse.WorkFlowInfoList["+ i +"].WorkFlowId"));
			workFlowInfo.setName(context.stringValue("ListWorkFlowResponse.WorkFlowInfoList["+ i +"].Name"));
			workFlowInfo.setActionList(context.stringValue("ListWorkFlowResponse.WorkFlowInfoList["+ i +"].ActionList"));
			workFlowInfo.setCreationTime(context.stringValue("ListWorkFlowResponse.WorkFlowInfoList["+ i +"].CreationTime"));
			workFlowInfo.setModifyTime(context.stringValue("ListWorkFlowResponse.WorkFlowInfoList["+ i +"].ModifyTime"));

			workFlowInfoList.add(workFlowInfo);
		}
		listWorkFlowResponse.setWorkFlowInfoList(workFlowInfoList);
	 
	 	return listWorkFlowResponse;
	}
}