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

package com.aliyuncs.resellertrade.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resellertrade.model.v20191227.GetCustomerListResponse;
import com.aliyuncs.resellertrade.model.v20191227.GetCustomerListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerListResponseUnmarshaller {

	public static GetCustomerListResponse unmarshall(GetCustomerListResponse getCustomerListResponse, UnmarshallerContext _ctx) {
		
		getCustomerListResponse.setRequestId(_ctx.stringValue("GetCustomerListResponse.RequestId"));
		getCustomerListResponse.setSuccess(_ctx.booleanValue("GetCustomerListResponse.Success"));
		getCustomerListResponse.setCode(_ctx.stringValue("GetCustomerListResponse.Code"));
		getCustomerListResponse.setMessage(_ctx.stringValue("GetCustomerListResponse.Message"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("GetCustomerListResponse.Data.TotalSize"));

		List<String> uidList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomerListResponse.Data.UidList.Length"); i++) {
			uidList.add(_ctx.stringValue("GetCustomerListResponse.Data.UidList["+ i +"]"));
		}
		data.setUidList(uidList);
		getCustomerListResponse.setData(data);
	 
	 	return getCustomerListResponse;
	}
}