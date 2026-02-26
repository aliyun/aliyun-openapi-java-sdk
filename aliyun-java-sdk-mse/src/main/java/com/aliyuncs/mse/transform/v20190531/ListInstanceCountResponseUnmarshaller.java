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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListInstanceCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceCountResponseUnmarshaller {

	public static ListInstanceCountResponse unmarshall(ListInstanceCountResponse listInstanceCountResponse, UnmarshallerContext _ctx) {
		
		listInstanceCountResponse.setRequestId(_ctx.stringValue("ListInstanceCountResponse.RequestId"));
		listInstanceCountResponse.setSuccess(_ctx.booleanValue("ListInstanceCountResponse.Success"));
		listInstanceCountResponse.setCode(_ctx.integerValue("ListInstanceCountResponse.Code"));
		listInstanceCountResponse.setErrorCode(_ctx.stringValue("ListInstanceCountResponse.ErrorCode"));
		listInstanceCountResponse.setHttpStatusCode(_ctx.integerValue("ListInstanceCountResponse.HttpStatusCode"));
		listInstanceCountResponse.setMessage(_ctx.stringValue("ListInstanceCountResponse.Message"));
		listInstanceCountResponse.setDynamicCode(_ctx.stringValue("ListInstanceCountResponse.DynamicCode"));
		listInstanceCountResponse.setDynamicMessage(_ctx.stringValue("ListInstanceCountResponse.DynamicMessage"));

		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceCountResponse.Data.Length"); i++) {
			data.add(_ctx.integerValue("ListInstanceCountResponse.Data["+ i +"]"));
		}
		listInstanceCountResponse.setData(data);
	 
	 	return listInstanceCountResponse;
	}
}