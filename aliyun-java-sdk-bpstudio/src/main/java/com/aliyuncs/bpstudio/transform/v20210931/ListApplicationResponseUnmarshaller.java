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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.ListApplicationResponse;
import com.aliyuncs.bpstudio.model.v20210931.ListApplicationResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationResponseUnmarshaller {

	public static ListApplicationResponse unmarshall(ListApplicationResponse listApplicationResponse, UnmarshallerContext _ctx) {
		
		listApplicationResponse.setRequestId(_ctx.stringValue("ListApplicationResponse.RequestId"));
		listApplicationResponse.setTotalCount(_ctx.integerValue("ListApplicationResponse.TotalCount"));
		listApplicationResponse.setMessage(_ctx.stringValue("ListApplicationResponse.Message"));
		listApplicationResponse.setNextToken(_ctx.integerValue("ListApplicationResponse.NextToken"));
		listApplicationResponse.setCode(_ctx.integerValue("ListApplicationResponse.Code"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationResponse.Data.Length"); i++) {
			Item item = new Item();
			item.setImageURL(_ctx.stringValue("ListApplicationResponse.Data["+ i +"].ImageURL"));
			item.setStatus(_ctx.stringValue("ListApplicationResponse.Data["+ i +"].Status"));
			item.setApplicationId(_ctx.stringValue("ListApplicationResponse.Data["+ i +"].ApplicationId"));
			item.setName(_ctx.stringValue("ListApplicationResponse.Data["+ i +"].Name"));
			item.setCreateTime(_ctx.stringValue("ListApplicationResponse.Data["+ i +"].CreateTime"));
			item.setResourceGroupId(_ctx.stringValue("ListApplicationResponse.Data["+ i +"].ResourceGroupId"));

			data.add(item);
		}
		listApplicationResponse.setData(data);
	 
	 	return listApplicationResponse;
	}
}