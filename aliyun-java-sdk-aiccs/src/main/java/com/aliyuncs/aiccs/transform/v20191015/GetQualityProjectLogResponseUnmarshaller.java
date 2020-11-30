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

import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectLogResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityProjectLogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityProjectLogResponseUnmarshaller {

	public static GetQualityProjectLogResponse unmarshall(GetQualityProjectLogResponse getQualityProjectLogResponse, UnmarshallerContext _ctx) {
		
		getQualityProjectLogResponse.setRequestId(_ctx.stringValue("GetQualityProjectLogResponse.RequestId"));
		getQualityProjectLogResponse.setCode(_ctx.stringValue("GetQualityProjectLogResponse.Code"));
		getQualityProjectLogResponse.setMessage(_ctx.stringValue("GetQualityProjectLogResponse.Message"));
		getQualityProjectLogResponse.setSuccess(_ctx.booleanValue("GetQualityProjectLogResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityProjectLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProjectId(_ctx.longValue("GetQualityProjectLogResponse.Data["+ i +"].ProjectId"));
			dataItem.setProjectCreateTime(_ctx.stringValue("GetQualityProjectLogResponse.Data["+ i +"].ProjectCreateTime"));
			dataItem.setActionTime(_ctx.stringValue("GetQualityProjectLogResponse.Data["+ i +"].ActionTime"));
			dataItem.setActionType(_ctx.stringValue("GetQualityProjectLogResponse.Data["+ i +"].ActionType"));
			dataItem.setActionData(_ctx.stringValue("GetQualityProjectLogResponse.Data["+ i +"].ActionData"));

			data.add(dataItem);
		}
		getQualityProjectLogResponse.setData(data);
	 
	 	return getQualityProjectLogResponse;
	}
}