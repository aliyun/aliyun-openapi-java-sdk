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

import com.aliyuncs.vod.model.v20170321.GetWorkFlowResponse;
import com.aliyuncs.vod.model.v20170321.GetWorkFlowResponse.WorkFlowInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkFlowResponseUnmarshaller {

	public static GetWorkFlowResponse unmarshall(GetWorkFlowResponse getWorkFlowResponse, UnmarshallerContext context) {
		
		getWorkFlowResponse.setRequestId(context.stringValue("GetWorkFlowResponse.RequestId"));

		WorkFlowInfo workFlowInfo = new WorkFlowInfo();
		workFlowInfo.setWorkFlowId(context.stringValue("GetWorkFlowResponse.WorkFlowInfo.WorkFlowId"));
		workFlowInfo.setName(context.stringValue("GetWorkFlowResponse.WorkFlowInfo.Name"));
		workFlowInfo.setActionList(context.stringValue("GetWorkFlowResponse.WorkFlowInfo.ActionList"));
		workFlowInfo.setCreationTime(context.stringValue("GetWorkFlowResponse.WorkFlowInfo.CreationTime"));
		workFlowInfo.setModifyTime(context.stringValue("GetWorkFlowResponse.WorkFlowInfo.ModifyTime"));
		getWorkFlowResponse.setWorkFlowInfo(workFlowInfo);
	 
	 	return getWorkFlowResponse;
	}
}