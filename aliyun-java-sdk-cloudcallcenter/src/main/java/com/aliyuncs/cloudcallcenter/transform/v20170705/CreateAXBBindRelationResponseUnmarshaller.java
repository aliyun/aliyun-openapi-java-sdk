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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateAXBBindRelationResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateAXBBindRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAXBBindRelationResponseUnmarshaller {

	public static CreateAXBBindRelationResponse unmarshall(CreateAXBBindRelationResponse createAXBBindRelationResponse, UnmarshallerContext context) {
		
		createAXBBindRelationResponse.setRequestId(context.stringValue("CreateAXBBindRelationResponse.RequestId"));
		createAXBBindRelationResponse.setSuccess(context.booleanValue("CreateAXBBindRelationResponse.Success"));
		createAXBBindRelationResponse.setCode(context.stringValue("CreateAXBBindRelationResponse.Code"));
		createAXBBindRelationResponse.setMessage(context.stringValue("CreateAXBBindRelationResponse.Message"));
		createAXBBindRelationResponse.setHttpStatusCode(context.integerValue("CreateAXBBindRelationResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPoolId(context.stringValue("CreateAXBBindRelationResponse.Data.PoolId"));
		data.setType(context.stringValue("CreateAXBBindRelationResponse.Data.Type"));
		data.setPoolName(context.stringValue("CreateAXBBindRelationResponse.Data.PoolName"));
		data.setPhoneNumber(context.stringValue("CreateAXBBindRelationResponse.Data.PhoneNumber"));
		data.setExtra(context.stringValue("CreateAXBBindRelationResponse.Data.Extra"));
		data.setBizId(context.stringValue("CreateAXBBindRelationResponse.Data.BizId"));
		createAXBBindRelationResponse.setData(data);
	 
	 	return createAXBBindRelationResponse;
	}
}