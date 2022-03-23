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

import com.aliyuncs.copyright.model.v20190123.BatchPatentAddResponse;
import com.aliyuncs.copyright.model.v20190123.BatchPatentAddResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchPatentAddResponseUnmarshaller {

	public static BatchPatentAddResponse unmarshall(BatchPatentAddResponse batchPatentAddResponse, UnmarshallerContext _ctx) {
		
		batchPatentAddResponse.setRequestId(_ctx.stringValue("BatchPatentAddResponse.RequestId"));
		batchPatentAddResponse.setSuccess(_ctx.booleanValue("BatchPatentAddResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchPatentAddResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMessage(_ctx.stringValue("BatchPatentAddResponse.Data["+ i +"].Message"));
			dataItem.setSuccess(_ctx.booleanValue("BatchPatentAddResponse.Data["+ i +"].Success"));
			dataItem.setApplyNumber(_ctx.stringValue("BatchPatentAddResponse.Data["+ i +"].ApplyNumber"));

			data.add(dataItem);
		}
		batchPatentAddResponse.setData(data);
	 
	 	return batchPatentAddResponse;
	}
}