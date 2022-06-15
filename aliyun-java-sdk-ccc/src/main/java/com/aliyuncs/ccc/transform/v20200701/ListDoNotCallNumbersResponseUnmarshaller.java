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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListDoNotCallNumbersResponse;
import com.aliyuncs.ccc.model.v20200701.ListDoNotCallNumbersResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListDoNotCallNumbersResponse.Data.BlockedNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDoNotCallNumbersResponseUnmarshaller {

	public static ListDoNotCallNumbersResponse unmarshall(ListDoNotCallNumbersResponse listDoNotCallNumbersResponse, UnmarshallerContext _ctx) {
		
		listDoNotCallNumbersResponse.setRequestId(_ctx.stringValue("ListDoNotCallNumbersResponse.RequestId"));
		listDoNotCallNumbersResponse.setCode(_ctx.stringValue("ListDoNotCallNumbersResponse.Code"));
		listDoNotCallNumbersResponse.setHttpStatusCode(_ctx.integerValue("ListDoNotCallNumbersResponse.HttpStatusCode"));
		listDoNotCallNumbersResponse.setMessage(_ctx.stringValue("ListDoNotCallNumbersResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDoNotCallNumbersResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListDoNotCallNumbersResponse.Params["+ i +"]"));
		}
		listDoNotCallNumbersResponse.setParams(params);

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDoNotCallNumbersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDoNotCallNumbersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDoNotCallNumbersResponse.Data.TotalCount"));

		List<BlockedNumber> list = new ArrayList<BlockedNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListDoNotCallNumbersResponse.Data.List.Length"); i++) {
			BlockedNumber blockedNumber = new BlockedNumber();
			blockedNumber.setNumber(_ctx.stringValue("ListDoNotCallNumbersResponse.Data.List["+ i +"].Number"));
			blockedNumber.setScope(_ctx.stringValue("ListDoNotCallNumbersResponse.Data.List["+ i +"].Scope"));
			blockedNumber.setRemark(_ctx.stringValue("ListDoNotCallNumbersResponse.Data.List["+ i +"].Remark"));
			blockedNumber.setCreateTime(_ctx.longValue("ListDoNotCallNumbersResponse.Data.List["+ i +"].CreateTime"));
			blockedNumber.setCreator(_ctx.stringValue("ListDoNotCallNumbersResponse.Data.List["+ i +"].Creator"));

			list.add(blockedNumber);
		}
		data.setList(list);
		listDoNotCallNumbersResponse.setData(data);
	 
	 	return listDoNotCallNumbersResponse;
	}
}