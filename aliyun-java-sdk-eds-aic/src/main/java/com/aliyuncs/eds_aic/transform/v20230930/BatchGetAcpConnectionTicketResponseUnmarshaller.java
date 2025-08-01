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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.BatchGetAcpConnectionTicketResponse;
import com.aliyuncs.eds_aic.model.v20230930.BatchGetAcpConnectionTicketResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetAcpConnectionTicketResponseUnmarshaller {

	public static BatchGetAcpConnectionTicketResponse unmarshall(BatchGetAcpConnectionTicketResponse batchGetAcpConnectionTicketResponse, UnmarshallerContext _ctx) {
		
		batchGetAcpConnectionTicketResponse.setRequestId(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.RequestId"));

		List<Data> instanceConnectionModels = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels.Length"); i++) {
			Data data = new Data();
			data.setAppInstanceGroupId(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].AppInstanceGroupId"));
			data.setInstanceId(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].InstanceId"));
			data.setTaskStatus(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].TaskStatus"));
			data.setTaskId(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].TaskId"));
			data.setTicket(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].Ticket"));
			data.setErrorCode(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].ErrorCode"));
			data.setPersistentAppInstanceId(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].PersistentAppInstanceId"));
			data.setAppInstanceId(_ctx.stringValue("BatchGetAcpConnectionTicketResponse.InstanceConnectionModels["+ i +"].AppInstanceId"));

			instanceConnectionModels.add(data);
		}
		batchGetAcpConnectionTicketResponse.setInstanceConnectionModels(instanceConnectionModels);
	 
	 	return batchGetAcpConnectionTicketResponse;
	}
}