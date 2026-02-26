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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.QueryJenkinsImageRegistryPersistenceDayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJenkinsImageRegistryPersistenceDayResponseUnmarshaller {

	public static QueryJenkinsImageRegistryPersistenceDayResponse unmarshall(QueryJenkinsImageRegistryPersistenceDayResponse queryJenkinsImageRegistryPersistenceDayResponse, UnmarshallerContext _ctx) {
		
		queryJenkinsImageRegistryPersistenceDayResponse.setRequestId(_ctx.stringValue("QueryJenkinsImageRegistryPersistenceDayResponse.RequestId"));
		queryJenkinsImageRegistryPersistenceDayResponse.setData(_ctx.integerValue("QueryJenkinsImageRegistryPersistenceDayResponse.Data"));
		queryJenkinsImageRegistryPersistenceDayResponse.setSuccess(_ctx.booleanValue("QueryJenkinsImageRegistryPersistenceDayResponse.Success"));
		queryJenkinsImageRegistryPersistenceDayResponse.setCode(_ctx.stringValue("QueryJenkinsImageRegistryPersistenceDayResponse.Code"));
		queryJenkinsImageRegistryPersistenceDayResponse.setMessage(_ctx.stringValue("QueryJenkinsImageRegistryPersistenceDayResponse.Message"));
		queryJenkinsImageRegistryPersistenceDayResponse.setHttpStatusCode(_ctx.integerValue("QueryJenkinsImageRegistryPersistenceDayResponse.HttpStatusCode"));
		queryJenkinsImageRegistryPersistenceDayResponse.setTimeCost(_ctx.longValue("QueryJenkinsImageRegistryPersistenceDayResponse.TimeCost"));
	 
	 	return queryJenkinsImageRegistryPersistenceDayResponse;
	}
}