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

import com.aliyuncs.copyright.model.v20190123.SavePatentContactResponse;
import com.aliyuncs.copyright.model.v20190123.SavePatentContactResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class SavePatentContactResponseUnmarshaller {

	public static SavePatentContactResponse unmarshall(SavePatentContactResponse savePatentContactResponse, UnmarshallerContext _ctx) {
		
		savePatentContactResponse.setRequestId(_ctx.stringValue("SavePatentContactResponse.RequestId"));
		savePatentContactResponse.setPageNum(_ctx.integerValue("SavePatentContactResponse.PageNum"));
		savePatentContactResponse.setPageSize(_ctx.integerValue("SavePatentContactResponse.PageSize"));
		savePatentContactResponse.setSuccess(_ctx.booleanValue("SavePatentContactResponse.Success"));
		savePatentContactResponse.setTotalItemNum(_ctx.integerValue("SavePatentContactResponse.TotalItemNum"));
		savePatentContactResponse.setTotalPageNum(_ctx.integerValue("SavePatentContactResponse.TotalPageNum"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("SavePatentContactResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setEmail(_ctx.stringValue("SavePatentContactResponse.Data["+ i +"].Email"));
			produces.setId(_ctx.longValue("SavePatentContactResponse.Data["+ i +"].Id"));
			produces.setMobile(_ctx.stringValue("SavePatentContactResponse.Data["+ i +"].Mobile"));
			produces.setName(_ctx.stringValue("SavePatentContactResponse.Data["+ i +"].Name"));

			data.add(produces);
		}
		savePatentContactResponse.setData(data);
	 
	 	return savePatentContactResponse;
	}
}