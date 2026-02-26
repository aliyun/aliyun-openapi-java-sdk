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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllProductKeyResponse;
import com.aliyuncs.lto.model.v20210707.ListAllProductKeyResponse.ProductKeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllProductKeyResponseUnmarshaller {

	public static ListAllProductKeyResponse unmarshall(ListAllProductKeyResponse listAllProductKeyResponse, UnmarshallerContext _ctx) {
		
		listAllProductKeyResponse.setRequestId(_ctx.stringValue("ListAllProductKeyResponse.RequestId"));
		listAllProductKeyResponse.setCode(_ctx.stringValue("ListAllProductKeyResponse.Code"));
		listAllProductKeyResponse.setHttpStatusCode(_ctx.integerValue("ListAllProductKeyResponse.HttpStatusCode"));
		listAllProductKeyResponse.setMessage(_ctx.stringValue("ListAllProductKeyResponse.Message"));
		listAllProductKeyResponse.setSuccess(_ctx.booleanValue("ListAllProductKeyResponse.Success"));

		List<ProductKeyInfo> data = new ArrayList<ProductKeyInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllProductKeyResponse.Data.Length"); i++) {
			ProductKeyInfo productKeyInfo = new ProductKeyInfo();
			productKeyInfo.setName(_ctx.stringValue("ListAllProductKeyResponse.Data["+ i +"].Name"));
			productKeyInfo.setProductKey(_ctx.stringValue("ListAllProductKeyResponse.Data["+ i +"].ProductKey"));

			data.add(productKeyInfo);
		}
		listAllProductKeyResponse.setData(data);
	 
	 	return listAllProductKeyResponse;
	}
}