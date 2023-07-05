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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectListResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdviceConfProjectListResponseUnmarshaller {

	public static GetAdviceConfProjectListResponse unmarshall(GetAdviceConfProjectListResponse getAdviceConfProjectListResponse, UnmarshallerContext _ctx) {
		
		getAdviceConfProjectListResponse.setRequestId(_ctx.stringValue("GetAdviceConfProjectListResponse.RequestId"));
		getAdviceConfProjectListResponse.setCode(_ctx.stringValue("GetAdviceConfProjectListResponse.Code"));
		getAdviceConfProjectListResponse.setMessage(_ctx.stringValue("GetAdviceConfProjectListResponse.Message"));
		getAdviceConfProjectListResponse.setSuccess(_ctx.booleanValue("GetAdviceConfProjectListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAdviceConfProjectListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("GetAdviceConfProjectListResponse.Data["+ i +"].Status"));
			dataItem.setGmtModified(_ctx.longValue("GetAdviceConfProjectListResponse.Data["+ i +"].GmtModified"));
			dataItem.setName(_ctx.stringValue("GetAdviceConfProjectListResponse.Data["+ i +"].Name"));
			dataItem.setValid(_ctx.booleanValue("GetAdviceConfProjectListResponse.Data["+ i +"].Valid"));
			dataItem.setId(_ctx.integerValue("GetAdviceConfProjectListResponse.Data["+ i +"].Id"));

			data.add(dataItem);
		}
		getAdviceConfProjectListResponse.setData(data);
	 
	 	return getAdviceConfProjectListResponse;
	}
}