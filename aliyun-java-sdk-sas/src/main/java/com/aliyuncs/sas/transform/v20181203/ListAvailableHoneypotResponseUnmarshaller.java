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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListAvailableHoneypotResponse;
import com.aliyuncs.sas.model.v20181203.ListAvailableHoneypotResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableHoneypotResponseUnmarshaller {

	public static ListAvailableHoneypotResponse unmarshall(ListAvailableHoneypotResponse listAvailableHoneypotResponse, UnmarshallerContext _ctx) {
		
		listAvailableHoneypotResponse.setRequestId(_ctx.stringValue("ListAvailableHoneypotResponse.RequestId"));
		listAvailableHoneypotResponse.setCount(_ctx.integerValue("ListAvailableHoneypotResponse.Count"));
		listAvailableHoneypotResponse.setSuccess(_ctx.booleanValue("ListAvailableHoneypotResponse.Success"));
		listAvailableHoneypotResponse.setCode(_ctx.stringValue("ListAvailableHoneypotResponse.Code"));
		listAvailableHoneypotResponse.setMessage(_ctx.stringValue("ListAvailableHoneypotResponse.Message"));
		listAvailableHoneypotResponse.setHttpStatusCode(_ctx.integerValue("ListAvailableHoneypotResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAvailableHoneypotResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setHoneypotImageName(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].HoneypotImageName"));
			dataItem.setHoneypotImageDisplayName(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].HoneypotImageDisplayName"));
			dataItem.setHoneypotImageId(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].HoneypotImageId"));
			dataItem.setHoneypotImageVersion(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].HoneypotImageVersion"));
			dataItem.setHoneypotImageType(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].HoneypotImageType"));
			dataItem.setProto(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].Proto"));
			dataItem.setServicePort(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].ServicePort"));
			dataItem.setMultiports(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].Multiports"));
			dataItem.setTemplate(_ctx.stringValue("ListAvailableHoneypotResponse.Data["+ i +"].Template"));

			data.add(dataItem);
		}
		listAvailableHoneypotResponse.setData(data);
	 
	 	return listAvailableHoneypotResponse;
	}
}