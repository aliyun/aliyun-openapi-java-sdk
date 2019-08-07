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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.ListZnodeChildrenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListZnodeChildrenResponseUnmarshaller {

	public static ListZnodeChildrenResponse unmarshall(ListZnodeChildrenResponse listZnodeChildrenResponse, UnmarshallerContext _ctx) {
		
		listZnodeChildrenResponse.setRequestId(_ctx.stringValue("ListZnodeChildrenResponse.RequestId"));
		listZnodeChildrenResponse.setSuccess(_ctx.booleanValue("ListZnodeChildrenResponse.Success"));
		listZnodeChildrenResponse.setMessage(_ctx.stringValue("ListZnodeChildrenResponse.Message"));
		listZnodeChildrenResponse.setErrorCode(_ctx.stringValue("ListZnodeChildrenResponse.ErrorCode"));
		listZnodeChildrenResponse.setData(_ctx.stringValue("ListZnodeChildrenResponse.Data"));
	 
	 	return listZnodeChildrenResponse;
	}
}