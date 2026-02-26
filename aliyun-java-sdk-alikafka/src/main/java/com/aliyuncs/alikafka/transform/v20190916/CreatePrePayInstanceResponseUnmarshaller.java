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

import com.aliyuncs.alikafka.model.v20190916.CreatePrePayInstanceResponse;
import com.aliyuncs.alikafka.model.v20190916.CreatePrePayInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePrePayInstanceResponseUnmarshaller {

	public static CreatePrePayInstanceResponse unmarshall(CreatePrePayInstanceResponse createPrePayInstanceResponse, UnmarshallerContext _ctx) {
		
		createPrePayInstanceResponse.setRequestId(_ctx.stringValue("CreatePrePayInstanceResponse.RequestId"));
		createPrePayInstanceResponse.setCode(_ctx.integerValue("CreatePrePayInstanceResponse.Code"));
		createPrePayInstanceResponse.setMessage(_ctx.stringValue("CreatePrePayInstanceResponse.Message"));
		createPrePayInstanceResponse.setSuccess(_ctx.booleanValue("CreatePrePayInstanceResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("CreatePrePayInstanceResponse.Data.OrderId"));
		data.setInstanceId(_ctx.stringValue("CreatePrePayInstanceResponse.Data.InstanceId"));
		createPrePayInstanceResponse.setData(data);
	 
	 	return createPrePayInstanceResponse;
	}
}