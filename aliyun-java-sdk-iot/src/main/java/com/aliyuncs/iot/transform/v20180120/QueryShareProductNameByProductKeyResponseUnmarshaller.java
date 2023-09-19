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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryShareProductNameByProductKeyResponse;
import com.aliyuncs.iot.model.v20180120.QueryShareProductNameByProductKeyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryShareProductNameByProductKeyResponseUnmarshaller {

	public static QueryShareProductNameByProductKeyResponse unmarshall(QueryShareProductNameByProductKeyResponse queryShareProductNameByProductKeyResponse, UnmarshallerContext _ctx) {
		
		queryShareProductNameByProductKeyResponse.setRequestId(_ctx.stringValue("QueryShareProductNameByProductKeyResponse.RequestId"));
		queryShareProductNameByProductKeyResponse.setSuccess(_ctx.booleanValue("QueryShareProductNameByProductKeyResponse.Success"));
		queryShareProductNameByProductKeyResponse.setCode(_ctx.stringValue("QueryShareProductNameByProductKeyResponse.Code"));
		queryShareProductNameByProductKeyResponse.setErrorMessage(_ctx.stringValue("QueryShareProductNameByProductKeyResponse.ErrorMessage"));

		Data data = new Data();
		data.setProductName(_ctx.stringValue("QueryShareProductNameByProductKeyResponse.Data.ProductName"));
		queryShareProductNameByProductKeyResponse.setData(data);
	 
	 	return queryShareProductNameByProductKeyResponse;
	}
}