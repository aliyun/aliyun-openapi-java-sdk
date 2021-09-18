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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import com.aliyuncs.computenestsupplier.model.v20210521.DeployApplicationsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.DeployApplicationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployApplicationsResponseUnmarshaller {

	public static DeployApplicationsResponse unmarshall(DeployApplicationsResponse deployApplicationsResponse, UnmarshallerContext _ctx) {
		
		deployApplicationsResponse.setRequestId(_ctx.stringValue("DeployApplicationsResponse.RequestId"));

		Data data = new Data();
		data.setExecutionId(_ctx.stringValue("DeployApplicationsResponse.Data.ExecutionId"));
		deployApplicationsResponse.setData(data);
	 
	 	return deployApplicationsResponse;
	}
}