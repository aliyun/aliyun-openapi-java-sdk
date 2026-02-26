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

import com.aliyuncs.dataphin_public.model.v20230630.PausePhysicalNodeResponse;
import com.aliyuncs.dataphin_public.model.v20230630.PausePhysicalNodeResponse.NodeOperateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PausePhysicalNodeResponseUnmarshaller {

	public static PausePhysicalNodeResponse unmarshall(PausePhysicalNodeResponse pausePhysicalNodeResponse, UnmarshallerContext _ctx) {
		
		pausePhysicalNodeResponse.setRequestId(_ctx.stringValue("PausePhysicalNodeResponse.RequestId"));
		pausePhysicalNodeResponse.setSuccess(_ctx.booleanValue("PausePhysicalNodeResponse.Success"));
		pausePhysicalNodeResponse.setHttpStatusCode(_ctx.integerValue("PausePhysicalNodeResponse.HttpStatusCode"));
		pausePhysicalNodeResponse.setCode(_ctx.stringValue("PausePhysicalNodeResponse.Code"));
		pausePhysicalNodeResponse.setMessage(_ctx.stringValue("PausePhysicalNodeResponse.Message"));

		List<NodeOperateResult> nodeOperateResultList = new ArrayList<NodeOperateResult>();
		for (int i = 0; i < _ctx.lengthValue("PausePhysicalNodeResponse.NodeOperateResultList.Length"); i++) {
			NodeOperateResult nodeOperateResult = new NodeOperateResult();
			nodeOperateResult.setNodeId(_ctx.stringValue("PausePhysicalNodeResponse.NodeOperateResultList["+ i +"].NodeId"));
			nodeOperateResult.setStatus(_ctx.stringValue("PausePhysicalNodeResponse.NodeOperateResultList["+ i +"].Status"));
			nodeOperateResult.setErrorMessage(_ctx.stringValue("PausePhysicalNodeResponse.NodeOperateResultList["+ i +"].ErrorMessage"));

			nodeOperateResultList.add(nodeOperateResult);
		}
		pausePhysicalNodeResponse.setNodeOperateResultList(nodeOperateResultList);
	 
	 	return pausePhysicalNodeResponse;
	}
}