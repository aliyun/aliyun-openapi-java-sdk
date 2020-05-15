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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.CreateJobsResponse;
import com.aliyuncs.hbr.model.v20170908.CreateJobsResponse.ClientIdStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobsResponseUnmarshaller {

	public static CreateJobsResponse unmarshall(CreateJobsResponse createJobsResponse, UnmarshallerContext _ctx) {
		
		createJobsResponse.setRequestId(_ctx.stringValue("CreateJobsResponse.RequestId"));
		createJobsResponse.setSuccess(_ctx.booleanValue("CreateJobsResponse.Success"));
		createJobsResponse.setCode(_ctx.stringValue("CreateJobsResponse.Code"));
		createJobsResponse.setMessage(_ctx.stringValue("CreateJobsResponse.Message"));

		List<ClientIdStatus> clientIdStatuses = new ArrayList<ClientIdStatus>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobsResponse.ClientIdStatuses.Length"); i++) {
			ClientIdStatus clientIdStatus = new ClientIdStatus();
			clientIdStatus.setClientId(_ctx.stringValue("CreateJobsResponse.ClientIdStatuses["+ i +"].ClientId"));
			clientIdStatus.setValid(_ctx.booleanValue("CreateJobsResponse.ClientIdStatuses["+ i +"].Valid"));
			clientIdStatus.setJobId(_ctx.stringValue("CreateJobsResponse.ClientIdStatuses["+ i +"].JobId"));

			clientIdStatuses.add(clientIdStatus);
		}
		createJobsResponse.setClientIdStatuses(clientIdStatuses);
	 
	 	return createJobsResponse;
	}
}