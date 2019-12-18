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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.DeleteSaslUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSaslUserResponseUnmarshaller {

	public static DeleteSaslUserResponse unmarshall(DeleteSaslUserResponse deleteSaslUserResponse, UnmarshallerContext _ctx) {
		
		deleteSaslUserResponse.setRequestId(_ctx.stringValue("DeleteSaslUserResponse.RequestId"));
		deleteSaslUserResponse.setSuccess(_ctx.booleanValue("DeleteSaslUserResponse.Success"));
		deleteSaslUserResponse.setCode(_ctx.integerValue("DeleteSaslUserResponse.Code"));
		deleteSaslUserResponse.setMessage(_ctx.stringValue("DeleteSaslUserResponse.Message"));
	 
	 	return deleteSaslUserResponse;
	}
}