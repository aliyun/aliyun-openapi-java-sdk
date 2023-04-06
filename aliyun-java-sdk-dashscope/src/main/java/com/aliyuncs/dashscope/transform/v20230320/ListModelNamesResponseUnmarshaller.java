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

package com.aliyuncs.dashscope.transform.v20230320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dashscope.model.v20230320.ListModelNamesResponse;
import com.aliyuncs.dashscope.model.v20230320.ListModelNamesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelNamesResponseUnmarshaller {

	public static ListModelNamesResponse unmarshall(ListModelNamesResponse listModelNamesResponse, UnmarshallerContext _ctx) {
		
		listModelNamesResponse.setRequestId(_ctx.stringValue("ListModelNamesResponse.RequestId"));
		listModelNamesResponse.setSuccess(_ctx.booleanValue("ListModelNamesResponse.Success"));
		listModelNamesResponse.setHttpCode(_ctx.stringValue("ListModelNamesResponse.HttpCode"));
		listModelNamesResponse.setErrorCode(_ctx.stringValue("ListModelNamesResponse.ErrorCode"));
		listModelNamesResponse.setErrorMessage(_ctx.stringValue("ListModelNamesResponse.ErrorMessage"));
		listModelNamesResponse.setAccessDeniedDetail(_ctx.stringValue("ListModelNamesResponse.AccessDeniedDetail"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModelNamesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setModelDesc(_ctx.stringValue("ListModelNamesResponse.Data["+ i +"].ModelDesc"));
			dataItem.setModelName(_ctx.stringValue("ListModelNamesResponse.Data["+ i +"].ModelName"));

			data.add(dataItem);
		}
		listModelNamesResponse.setData(data);
	 
	 	return listModelNamesResponse;
	}
}