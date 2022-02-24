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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.ListCompaniesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCompaniesResponseUnmarshaller {

	public static ListCompaniesResponse unmarshall(ListCompaniesResponse listCompaniesResponse, UnmarshallerContext _ctx) {
		
		listCompaniesResponse.setRequestId(_ctx.stringValue("ListCompaniesResponse.RequestId"));
		listCompaniesResponse.setCode(_ctx.integerValue("ListCompaniesResponse.Code"));
		listCompaniesResponse.setMessage(_ctx.stringValue("ListCompaniesResponse.Message"));
		listCompaniesResponse.setTotal(_ctx.integerValue("ListCompaniesResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCompaniesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListCompaniesResponse.Data["+ i +"]"));
		}
		listCompaniesResponse.setData(data);
	 
	 	return listCompaniesResponse;
	}
}