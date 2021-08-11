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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetHotlineMessageLogResponse;
import com.aliyuncs.aiccs.model.v20191015.GetHotlineMessageLogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineMessageLogResponseUnmarshaller {

	public static GetHotlineMessageLogResponse unmarshall(GetHotlineMessageLogResponse getHotlineMessageLogResponse, UnmarshallerContext _ctx) {
		
		getHotlineMessageLogResponse.setRequestId(_ctx.stringValue("GetHotlineMessageLogResponse.RequestId"));
		getHotlineMessageLogResponse.setSuccess(_ctx.booleanValue("GetHotlineMessageLogResponse.Success"));
		getHotlineMessageLogResponse.setCode(_ctx.stringValue("GetHotlineMessageLogResponse.Code"));
		getHotlineMessageLogResponse.setMessage(_ctx.stringValue("GetHotlineMessageLogResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHotlineMessageLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAcid(_ctx.stringValue("GetHotlineMessageLogResponse.Data["+ i +"].Acid"));
			dataItem.setSenderType(_ctx.integerValue("GetHotlineMessageLogResponse.Data["+ i +"].SenderType"));
			dataItem.setStartTime(_ctx.longValue("GetHotlineMessageLogResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.longValue("GetHotlineMessageLogResponse.Data["+ i +"].EndTime"));
			dataItem.setMid(_ctx.stringValue("GetHotlineMessageLogResponse.Data["+ i +"].Mid"));
			dataItem.setContent(_ctx.stringValue("GetHotlineMessageLogResponse.Data["+ i +"].Content"));

			data.add(dataItem);
		}
		getHotlineMessageLogResponse.setData(data);
	 
	 	return getHotlineMessageLogResponse;
	}
}