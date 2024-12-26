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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.ListExecutorsResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListExecutorsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutorsResponseUnmarshaller {

	public static ListExecutorsResponse unmarshall(ListExecutorsResponse listExecutorsResponse, UnmarshallerContext _ctx) {
		
		listExecutorsResponse.setRequestId(_ctx.stringValue("ListExecutorsResponse.RequestId"));
		listExecutorsResponse.setCode(_ctx.integerValue("ListExecutorsResponse.Code"));
		listExecutorsResponse.setMessage(_ctx.stringValue("ListExecutorsResponse.Message"));
		listExecutorsResponse.setSuccess(_ctx.booleanValue("ListExecutorsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutorsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAddress(_ctx.stringValue("ListExecutorsResponse.Data["+ i +"].Address"));
			dataItem.setIp(_ctx.stringValue("ListExecutorsResponse.Data["+ i +"].Ip"));
			dataItem.setPort(_ctx.integerValue("ListExecutorsResponse.Data["+ i +"].Port"));
			dataItem.setLabel(_ctx.stringValue("ListExecutorsResponse.Data["+ i +"].Label"));
			dataItem.setVersion(_ctx.stringValue("ListExecutorsResponse.Data["+ i +"].Version"));
			dataItem.setOnline(_ctx.booleanValue("ListExecutorsResponse.Data["+ i +"].Online"));
			dataItem.setIsDesignated(_ctx.booleanValue("ListExecutorsResponse.Data["+ i +"].IsDesignated"));

			data.add(dataItem);
		}
		listExecutorsResponse.setData(data);
	 
	 	return listExecutorsResponse;
	}
}