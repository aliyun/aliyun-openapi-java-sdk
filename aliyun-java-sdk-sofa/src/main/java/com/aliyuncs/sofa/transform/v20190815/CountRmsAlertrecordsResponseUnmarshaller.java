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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CountRmsAlertrecordsResponse;
import com.aliyuncs.sofa.model.v20190815.CountRmsAlertrecordsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.CountRmsAlertrecordsResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.CountRmsAlertrecordsResponse.Response.Entity.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountRmsAlertrecordsResponseUnmarshaller {

	public static CountRmsAlertrecordsResponse unmarshall(CountRmsAlertrecordsResponse countRmsAlertrecordsResponse, UnmarshallerContext _ctx) {
		
		countRmsAlertrecordsResponse.setRequestId(_ctx.stringValue("CountRmsAlertrecordsResponse.RequestId"));
		countRmsAlertrecordsResponse.setResultCode(_ctx.stringValue("CountRmsAlertrecordsResponse.ResultCode"));
		countRmsAlertrecordsResponse.setResultMessage(_ctx.stringValue("CountRmsAlertrecordsResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("CountRmsAlertrecordsResponse.Response.Layer"));

		Entity entity = new Entity();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CountRmsAlertrecordsResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCount(_ctx.longValue("CountRmsAlertrecordsResponse.Response.Entity.Data["+ i +"].Count"));
			dataItem.setTimestamp(_ctx.longValue("CountRmsAlertrecordsResponse.Response.Entity.Data["+ i +"].Timestamp"));

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		countRmsAlertrecordsResponse.setResponse(response);
	 
	 	return countRmsAlertrecordsResponse;
	}
}