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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsSreDescribeOwnerProductResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSreDescribeOwnerProductResponse.OwnerProducts;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSreDescribeOwnerProductResponseUnmarshaller {

	public static OpsSreDescribeOwnerProductResponse unmarshall(OpsSreDescribeOwnerProductResponse opsSreDescribeOwnerProductResponse, UnmarshallerContext _ctx) {
		
		opsSreDescribeOwnerProductResponse.setRequestId(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.RequestId"));
		opsSreDescribeOwnerProductResponse.setMessage(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Message"));
		opsSreDescribeOwnerProductResponse.setPageSize(_ctx.integerValue("OpsSreDescribeOwnerProductResponse.PageSize"));
		opsSreDescribeOwnerProductResponse.setTotal(_ctx.integerValue("OpsSreDescribeOwnerProductResponse.Total"));
		opsSreDescribeOwnerProductResponse.setPageNo(_ctx.integerValue("OpsSreDescribeOwnerProductResponse.PageNo"));
		opsSreDescribeOwnerProductResponse.setCode(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Code"));
		opsSreDescribeOwnerProductResponse.setSuccess(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Success"));

		List<OwnerProducts> data = new ArrayList<OwnerProducts>();
		for (int i = 0; i < _ctx.lengthValue("OpsSreDescribeOwnerProductResponse.Data.Length"); i++) {
			OwnerProducts ownerProducts = new OwnerProducts();
			ownerProducts.setGmtCreate(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Data["+ i +"].GmtCreate"));
			ownerProducts.setGmtModified(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Data["+ i +"].GmtModified"));
			ownerProducts.setOwnerProductTagName(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Data["+ i +"].OwnerProductTagName"));
			ownerProducts.setOwnerProduct(_ctx.stringValue("OpsSreDescribeOwnerProductResponse.Data["+ i +"].OwnerProduct"));
			ownerProducts.setId(_ctx.longValue("OpsSreDescribeOwnerProductResponse.Data["+ i +"].Id"));

			data.add(ownerProducts);
		}
		opsSreDescribeOwnerProductResponse.setData(data);
	 
	 	return opsSreDescribeOwnerProductResponse;
	}
}