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

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowConstantsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowConstantsResponse.DagConstant;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowConstantsResponseUnmarshaller {

	public static ListTaskFlowConstantsResponse unmarshall(ListTaskFlowConstantsResponse listTaskFlowConstantsResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowConstantsResponse.setRequestId(_ctx.stringValue("ListTaskFlowConstantsResponse.RequestId"));
		listTaskFlowConstantsResponse.setErrorCode(_ctx.stringValue("ListTaskFlowConstantsResponse.ErrorCode"));
		listTaskFlowConstantsResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowConstantsResponse.ErrorMessage"));
		listTaskFlowConstantsResponse.setSuccess(_ctx.booleanValue("ListTaskFlowConstantsResponse.Success"));

		List<DagConstant> dagConstants = new ArrayList<DagConstant>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowConstantsResponse.DagConstants.Length"); i++) {
			DagConstant dagConstant = new DagConstant();
			dagConstant.setKey(_ctx.stringValue("ListTaskFlowConstantsResponse.DagConstants["+ i +"].Key"));
			dagConstant.setValue(_ctx.stringValue("ListTaskFlowConstantsResponse.DagConstants["+ i +"].Value"));

			dagConstants.add(dagConstant);
		}
		listTaskFlowConstantsResponse.setDagConstants(dagConstants);
	 
	 	return listTaskFlowConstantsResponse;
	}
}