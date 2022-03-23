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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.ListPatentUserSearchCompanyResponse;
import com.aliyuncs.copyright.model.v20190123.ListPatentUserSearchCompanyResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPatentUserSearchCompanyResponseUnmarshaller {

	public static ListPatentUserSearchCompanyResponse unmarshall(ListPatentUserSearchCompanyResponse listPatentUserSearchCompanyResponse, UnmarshallerContext _ctx) {
		
		listPatentUserSearchCompanyResponse.setRequestId(_ctx.stringValue("ListPatentUserSearchCompanyResponse.RequestId"));
		listPatentUserSearchCompanyResponse.setSuccess(_ctx.booleanValue("ListPatentUserSearchCompanyResponse.Success"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("ListPatentUserSearchCompanyResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setType(_ctx.integerValue("ListPatentUserSearchCompanyResponse.Data["+ i +"].Type"));
			produces.setEnterpriseName(_ctx.stringValue("ListPatentUserSearchCompanyResponse.Data["+ i +"].EnterpriseName"));
			produces.setId(_ctx.longValue("ListPatentUserSearchCompanyResponse.Data["+ i +"].Id"));

			data.add(produces);
		}
		listPatentUserSearchCompanyResponse.setData(data);
	 
	 	return listPatentUserSearchCompanyResponse;
	}
}