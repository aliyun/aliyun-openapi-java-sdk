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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApiTestResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApiTestResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceApiTestResponseUnmarshaller {

	public static ListDataServiceApiTestResponse unmarshall(ListDataServiceApiTestResponse listDataServiceApiTestResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApiTestResponse.setRequestId(_ctx.stringValue("ListDataServiceApiTestResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApiTestResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTestId(_ctx.longValue("ListDataServiceApiTestResponse.Data["+ i +"].TestId"));
			dataItem.setApiId(_ctx.longValue("ListDataServiceApiTestResponse.Data["+ i +"].ApiId"));
			dataItem.setParamMap(_ctx.stringValue("ListDataServiceApiTestResponse.Data["+ i +"].ParamMap"));
			dataItem.setRetCode(_ctx.longValue("ListDataServiceApiTestResponse.Data["+ i +"].RetCode"));
			dataItem.setRetResult(_ctx.stringValue("ListDataServiceApiTestResponse.Data["+ i +"].RetResult"));
			dataItem.setCostTime(_ctx.integerValue("ListDataServiceApiTestResponse.Data["+ i +"].CostTime"));
			dataItem.setStatus(_ctx.stringValue("ListDataServiceApiTestResponse.Data["+ i +"].Status"));
			dataItem.setCreateTime(_ctx.longValue("ListDataServiceApiTestResponse.Data["+ i +"].CreateTime"));

			data.add(dataItem);
		}
		listDataServiceApiTestResponse.setData(data);
	 
	 	return listDataServiceApiTestResponse;
	}
}