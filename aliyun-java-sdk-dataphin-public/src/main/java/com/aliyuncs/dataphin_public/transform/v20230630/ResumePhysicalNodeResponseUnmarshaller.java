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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ResumePhysicalNodeResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ResumePhysicalNodeResponse.NodeOperateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumePhysicalNodeResponseUnmarshaller {

	public static ResumePhysicalNodeResponse unmarshall(ResumePhysicalNodeResponse resumePhysicalNodeResponse, UnmarshallerContext _ctx) {
		
		resumePhysicalNodeResponse.setRequestId(_ctx.stringValue("ResumePhysicalNodeResponse.RequestId"));
		resumePhysicalNodeResponse.setSuccess(_ctx.booleanValue("ResumePhysicalNodeResponse.Success"));
		resumePhysicalNodeResponse.setHttpStatusCode(_ctx.integerValue("ResumePhysicalNodeResponse.HttpStatusCode"));
		resumePhysicalNodeResponse.setCode(_ctx.stringValue("ResumePhysicalNodeResponse.Code"));
		resumePhysicalNodeResponse.setMessage(_ctx.stringValue("ResumePhysicalNodeResponse.Message"));

		List<NodeOperateResult> nodeOperateResultList = new ArrayList<NodeOperateResult>();
		for (int i = 0; i < _ctx.lengthValue("ResumePhysicalNodeResponse.NodeOperateResultList.Length"); i++) {
			NodeOperateResult nodeOperateResult = new NodeOperateResult();
			nodeOperateResult.setNodeId(_ctx.stringValue("ResumePhysicalNodeResponse.NodeOperateResultList["+ i +"].NodeId"));
			nodeOperateResult.setStatus(_ctx.stringValue("ResumePhysicalNodeResponse.NodeOperateResultList["+ i +"].Status"));
			nodeOperateResult.setErrorMessage(_ctx.stringValue("ResumePhysicalNodeResponse.NodeOperateResultList["+ i +"].ErrorMessage"));

			nodeOperateResultList.add(nodeOperateResult);
		}
		resumePhysicalNodeResponse.setNodeOperateResultList(nodeOperateResultList);
	 
	 	return resumePhysicalNodeResponse;
	}
}