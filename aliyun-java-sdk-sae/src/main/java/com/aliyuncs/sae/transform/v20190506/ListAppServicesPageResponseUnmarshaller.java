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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListAppServicesPageResponse;
import com.aliyuncs.sae.model.v20190506.ListAppServicesPageResponse.DataItem;
import com.aliyuncs.sae.model.v20190506.ListAppServicesPageResponse.DataItem.MscAgentServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppServicesPageResponseUnmarshaller {

	public static ListAppServicesPageResponse unmarshall(ListAppServicesPageResponse listAppServicesPageResponse, UnmarshallerContext _ctx) {
		
		listAppServicesPageResponse.setRequestId(_ctx.stringValue("ListAppServicesPageResponse.RequestId"));
		listAppServicesPageResponse.setMessage(_ctx.stringValue("ListAppServicesPageResponse.Message"));
		listAppServicesPageResponse.setTraceId(_ctx.stringValue("ListAppServicesPageResponse.TraceId"));
		listAppServicesPageResponse.setErrorCode(_ctx.stringValue("ListAppServicesPageResponse.ErrorCode"));
		listAppServicesPageResponse.setCode(_ctx.stringValue("ListAppServicesPageResponse.Code"));
		listAppServicesPageResponse.setSuccess(_ctx.booleanValue("ListAppServicesPageResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppServicesPageResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCurrentPage(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].CurrentPage"));
			dataItem.setTotalSize(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].TotalSize"));
			dataItem.setPageNumber(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].PageNumber"));
			dataItem.setPageSize(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].PageSize"));

			List<MscAgentServiceResponse> result = new ArrayList<MscAgentServiceResponse>();
			for (int j = 0; j < _ctx.lengthValue("ListAppServicesPageResponse.Data["+ i +"].Result.Length"); j++) {
				MscAgentServiceResponse mscAgentServiceResponse = new MscAgentServiceResponse();
				mscAgentServiceResponse.setEdasAppName(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].Result["+ j +"].EdasAppName"));
				mscAgentServiceResponse.setVersion(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].Result["+ j +"].Version"));
				mscAgentServiceResponse.setInstanceNum(_ctx.longValue("ListAppServicesPageResponse.Data["+ i +"].Result["+ j +"].InstanceNum"));
				mscAgentServiceResponse.setEdasAppId(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].Result["+ j +"].EdasAppId"));
				mscAgentServiceResponse.setServiceName(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].Result["+ j +"].ServiceName"));
				mscAgentServiceResponse.setGroup(_ctx.stringValue("ListAppServicesPageResponse.Data["+ i +"].Result["+ j +"].Group"));

				result.add(mscAgentServiceResponse);
			}
			dataItem.setResult(result);

			data.add(dataItem);
		}
		listAppServicesPageResponse.setData(data);
	 
	 	return listAppServicesPageResponse;
	}
}