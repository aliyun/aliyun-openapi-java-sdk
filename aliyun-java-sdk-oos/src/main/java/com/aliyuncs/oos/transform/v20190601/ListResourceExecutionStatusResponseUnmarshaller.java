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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListResourceExecutionStatusResponse;
import com.aliyuncs.oos.model.v20190601.ListResourceExecutionStatusResponse.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceExecutionStatusResponseUnmarshaller {

	public static ListResourceExecutionStatusResponse unmarshall(ListResourceExecutionStatusResponse listResourceExecutionStatusResponse, UnmarshallerContext _ctx) {
		
		listResourceExecutionStatusResponse.setRequestId(_ctx.stringValue("ListResourceExecutionStatusResponse.RequestId"));
		listResourceExecutionStatusResponse.setMaxResults(_ctx.integerValue("ListResourceExecutionStatusResponse.MaxResults"));
		listResourceExecutionStatusResponse.setNextToken(_ctx.stringValue("ListResourceExecutionStatusResponse.NextToken"));

		List<Status> resourceExecutionStatus = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceExecutionStatusResponse.ResourceExecutionStatus.Length"); i++) {
			Status status = new Status();
			status.setResourceId(_ctx.stringValue("ListResourceExecutionStatusResponse.ResourceExecutionStatus["+ i +"].ResourceId"));
			status.setExecutionTime(_ctx.stringValue("ListResourceExecutionStatusResponse.ResourceExecutionStatus["+ i +"].ExecutionTime"));
			status.setStatus(_ctx.stringValue("ListResourceExecutionStatusResponse.ResourceExecutionStatus["+ i +"].Status"));
			status.setOutputs(_ctx.stringValue("ListResourceExecutionStatusResponse.ResourceExecutionStatus["+ i +"].Outputs"));
			status.setExecutionId(_ctx.stringValue("ListResourceExecutionStatusResponse.ResourceExecutionStatus["+ i +"].ExecutionId"));

			resourceExecutionStatus.add(status);
		}
		listResourceExecutionStatusResponse.setResourceExecutionStatus(resourceExecutionStatus);
	 
	 	return listResourceExecutionStatusResponse;
	}
}