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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryProductQuotaResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryProductQuotaResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryProductQuotaResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageQueryProductQuotaResponseUnmarshaller {

	public static InnerImageQueryProductQuotaResponse unmarshall(InnerImageQueryProductQuotaResponse innerImageQueryProductQuotaResponse, UnmarshallerContext context) {
		
		innerImageQueryProductQuotaResponse.setRequestId(context.stringValue("InnerImageQueryProductQuotaResponse.RequestId"));
		innerImageQueryProductQuotaResponse.setCount(context.integerValue("InnerImageQueryProductQuotaResponse.count"));
		innerImageQueryProductQuotaResponse.setPageNo(context.integerValue("InnerImageQueryProductQuotaResponse.pageNo"));
		innerImageQueryProductQuotaResponse.setPageSize(context.integerValue("InnerImageQueryProductQuotaResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageQueryProductQuotaResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageQueryProductQuotaResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageQueryProductQuotaResponse.errorCode.isSuccess"));
		innerImageQueryProductQuotaResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerImageQueryProductQuotaResponse.data.Length"); i++) {
			Item item = new Item();
			item.setUsed(context.longValue("InnerImageQueryProductQuotaResponse.data["+ i +"].used"));
			item.setImageProductCode(context.stringValue("InnerImageQueryProductQuotaResponse.data["+ i +"].imageProductCode"));
			item.setCapacity(context.longValue("InnerImageQueryProductQuotaResponse.data["+ i +"].capacity"));
			item.setQuota(context.longValue("InnerImageQueryProductQuotaResponse.data["+ i +"].quota"));

			data.add(item);
		}
		innerImageQueryProductQuotaResponse.setData(data);
	 
	 	return innerImageQueryProductQuotaResponse;
	}
}