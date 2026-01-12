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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListHdrResponse;
import com.aliyuncs.xrengine.model.v20221111.ListHdrResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHdrResponseUnmarshaller {

	public static ListHdrResponse unmarshall(ListHdrResponse listHdrResponse, UnmarshallerContext _ctx) {
		
		listHdrResponse.setRequestId(_ctx.stringValue("ListHdrResponse.RequestId"));
		listHdrResponse.setSuccess(_ctx.booleanValue("ListHdrResponse.Success"));
		listHdrResponse.setCode(_ctx.stringValue("ListHdrResponse.Code"));
		listHdrResponse.setMessage(_ctx.stringValue("ListHdrResponse.Message"));
		listHdrResponse.setErrorName(_ctx.stringValue("ListHdrResponse.ErrorName"));
		listHdrResponse.setHttpCode(_ctx.integerValue("ListHdrResponse.HttpCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHdrResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("ListHdrResponse.Data["+ i +"].Name"));
			dataItem.setPath(_ctx.stringValue("ListHdrResponse.Data["+ i +"].Path"));

			data.add(dataItem);
		}
		listHdrResponse.setData(data);
	 
	 	return listHdrResponse;
	}
}