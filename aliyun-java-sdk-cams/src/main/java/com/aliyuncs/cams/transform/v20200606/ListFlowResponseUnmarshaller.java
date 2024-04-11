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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.ListFlowResponse;
import com.aliyuncs.cams.model.v20200606.ListFlowResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowResponseUnmarshaller {

	public static ListFlowResponse unmarshall(ListFlowResponse listFlowResponse, UnmarshallerContext _ctx) {
		
		listFlowResponse.setResponse(_ctx.mapValue("ListFlowResponse.Response"));
		listFlowResponse.setAccessDeniedDetail(_ctx.stringValue("ListFlowResponse.AccessDeniedDetail"));
		listFlowResponse.setMessage(_ctx.stringValue("ListFlowResponse.Message"));
		listFlowResponse.setCode(_ctx.stringValue("ListFlowResponse.Code"));
		listFlowResponse.setSuccess(_ctx.booleanValue("ListFlowResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("ListFlowResponse.Data["+ i +"].Status"));
			dataItem.setGmtCreate(_ctx.stringValue("ListFlowResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListFlowResponse.Data["+ i +"].GmtModified"));
			dataItem.setTitle(_ctx.stringValue("ListFlowResponse.Data["+ i +"].Title"));
			dataItem.setPartnerId(_ctx.stringValue("ListFlowResponse.Data["+ i +"].PartnerId"));
			dataItem.setId(_ctx.stringValue("ListFlowResponse.Data["+ i +"].Id"));
			dataItem.setCode(_ctx.stringValue("ListFlowResponse.Data["+ i +"].Code"));
			dataItem.setBizCode(_ctx.stringValue("ListFlowResponse.Data["+ i +"].BizCode"));
			dataItem.setRemark(_ctx.stringValue("ListFlowResponse.Data["+ i +"].Remark"));

			data.add(dataItem);
		}
		listFlowResponse.setData(data);
	 
	 	return listFlowResponse;
	}
}