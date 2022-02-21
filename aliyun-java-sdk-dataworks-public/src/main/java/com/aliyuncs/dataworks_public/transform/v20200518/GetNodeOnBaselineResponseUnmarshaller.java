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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetNodeOnBaselineResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeOnBaselineResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeOnBaselineResponseUnmarshaller {

	public static GetNodeOnBaselineResponse unmarshall(GetNodeOnBaselineResponse getNodeOnBaselineResponse, UnmarshallerContext _ctx) {
		
		getNodeOnBaselineResponse.setRequestId(_ctx.stringValue("GetNodeOnBaselineResponse.RequestId"));
		getNodeOnBaselineResponse.setHttpStatusCode(_ctx.integerValue("GetNodeOnBaselineResponse.HttpStatusCode"));
		getNodeOnBaselineResponse.setErrorMessage(_ctx.stringValue("GetNodeOnBaselineResponse.ErrorMessage"));
		getNodeOnBaselineResponse.setErrorCode(_ctx.stringValue("GetNodeOnBaselineResponse.ErrorCode"));
		getNodeOnBaselineResponse.setSuccess(_ctx.stringValue("GetNodeOnBaselineResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeOnBaselineResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOwner(_ctx.stringValue("GetNodeOnBaselineResponse.Data["+ i +"].Owner"));
			dataItem.setNodeName(_ctx.stringValue("GetNodeOnBaselineResponse.Data["+ i +"].NodeName"));
			dataItem.setNodeId(_ctx.longValue("GetNodeOnBaselineResponse.Data["+ i +"].NodeId"));
			dataItem.setProjectId(_ctx.longValue("GetNodeOnBaselineResponse.Data["+ i +"].ProjectId"));

			data.add(dataItem);
		}
		getNodeOnBaselineResponse.setData(data);
	 
	 	return getNodeOnBaselineResponse;
	}
}