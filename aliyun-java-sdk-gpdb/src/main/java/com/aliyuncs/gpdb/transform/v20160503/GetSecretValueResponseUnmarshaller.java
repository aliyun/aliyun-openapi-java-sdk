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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.GetSecretValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretValueResponseUnmarshaller {

	public static GetSecretValueResponse unmarshall(GetSecretValueResponse getSecretValueResponse, UnmarshallerContext _ctx) {
		
		getSecretValueResponse.setRequestId(_ctx.stringValue("GetSecretValueResponse.RequestId"));
		getSecretValueResponse.setMessage(_ctx.stringValue("GetSecretValueResponse.Message"));
		getSecretValueResponse.setStatus(_ctx.stringValue("GetSecretValueResponse.Status"));
		getSecretValueResponse.setSecretArn(_ctx.stringValue("GetSecretValueResponse.SecretArn"));
		getSecretValueResponse.setSecretName(_ctx.stringValue("GetSecretValueResponse.SecretName"));
		getSecretValueResponse.setDBInstanceId(_ctx.stringValue("GetSecretValueResponse.DBInstanceId"));
		getSecretValueResponse.setUsername(_ctx.stringValue("GetSecretValueResponse.Username"));
		getSecretValueResponse.setPassword(_ctx.stringValue("GetSecretValueResponse.Password"));
		getSecretValueResponse.setDescription(_ctx.stringValue("GetSecretValueResponse.Description"));
		getSecretValueResponse.setCode(_ctx.stringValue("GetSecretValueResponse.Code"));
	 
	 	return getSecretValueResponse;
	}
}