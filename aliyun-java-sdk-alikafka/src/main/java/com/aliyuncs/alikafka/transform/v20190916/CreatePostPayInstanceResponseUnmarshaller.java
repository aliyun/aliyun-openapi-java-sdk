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

import com.aliyuncs.alikafka.model.v20190916.CreatePostPayInstanceResponse;
import com.aliyuncs.alikafka.model.v20190916.CreatePostPayInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePostPayInstanceResponseUnmarshaller {

	public static CreatePostPayInstanceResponse unmarshall(CreatePostPayInstanceResponse createPostPayInstanceResponse, UnmarshallerContext _ctx) {
		
		createPostPayInstanceResponse.setRequestId(_ctx.stringValue("CreatePostPayInstanceResponse.RequestId"));
		createPostPayInstanceResponse.setCode(_ctx.integerValue("CreatePostPayInstanceResponse.Code"));
		createPostPayInstanceResponse.setMessage(_ctx.stringValue("CreatePostPayInstanceResponse.Message"));
		createPostPayInstanceResponse.setSuccess(_ctx.booleanValue("CreatePostPayInstanceResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("CreatePostPayInstanceResponse.Data.OrderId"));
		data.setInstanceId(_ctx.stringValue("CreatePostPayInstanceResponse.Data.InstanceId"));
		createPostPayInstanceResponse.setData(data);
	 
	 	return createPostPayInstanceResponse;
	}
}