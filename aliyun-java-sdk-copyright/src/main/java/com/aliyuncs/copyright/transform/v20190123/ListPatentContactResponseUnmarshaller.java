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

import com.aliyuncs.copyright.model.v20190123.ListPatentContactResponse;
import com.aliyuncs.copyright.model.v20190123.ListPatentContactResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPatentContactResponseUnmarshaller {

	public static ListPatentContactResponse unmarshall(ListPatentContactResponse listPatentContactResponse, UnmarshallerContext _ctx) {
		
		listPatentContactResponse.setRequestId(_ctx.stringValue("ListPatentContactResponse.RequestId"));
		listPatentContactResponse.setPageNum(_ctx.integerValue("ListPatentContactResponse.PageNum"));
		listPatentContactResponse.setPageSize(_ctx.integerValue("ListPatentContactResponse.PageSize"));
		listPatentContactResponse.setSuccess(_ctx.booleanValue("ListPatentContactResponse.Success"));
		listPatentContactResponse.setTotalItemNum(_ctx.integerValue("ListPatentContactResponse.TotalItemNum"));
		listPatentContactResponse.setTotalPageNum(_ctx.integerValue("ListPatentContactResponse.TotalPageNum"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("ListPatentContactResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setId(_ctx.longValue("ListPatentContactResponse.Data["+ i +"].Id"));
			produces.setName(_ctx.stringValue("ListPatentContactResponse.Data["+ i +"].Name"));
			produces.setEmail(_ctx.stringValue("ListPatentContactResponse.Data["+ i +"].Email"));
			produces.setMobile(_ctx.stringValue("ListPatentContactResponse.Data["+ i +"].Mobile"));

			data.add(produces);
		}
		listPatentContactResponse.setData(data);
	 
	 	return listPatentContactResponse;
	}
}