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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktWorkitemreviewsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktWorkitemreviewsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktWorkitemreviewsResponseUnmarshaller {

	public static GetLinkeLinktWorkitemreviewsResponse unmarshall(GetLinkeLinktWorkitemreviewsResponse getLinkeLinktWorkitemreviewsResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktWorkitemreviewsResponse.setRequestId(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.RequestId"));
		getLinkeLinktWorkitemreviewsResponse.setResultCode(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.ResultCode"));
		getLinkeLinktWorkitemreviewsResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.ResultMessage"));
		getLinkeLinktWorkitemreviewsResponse.setErrorCode(_ctx.longValue("GetLinkeLinktWorkitemreviewsResponse.ErrorCode"));
		getLinkeLinktWorkitemreviewsResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.ErrorMessage"));
		getLinkeLinktWorkitemreviewsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktWorkitemreviewsResponse.ResponseStatusCode"));
		getLinkeLinktWorkitemreviewsResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktWorkitemreviewsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktWorkitemreviewsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Description"));
			dataItem.setEndDate(_ctx.longValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].EndDate"));
			dataItem.setId(_ctx.longValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Id"));
			dataItem.setStatus(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Status"));
			dataItem.setTheme(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Theme"));
			dataItem.setUpdatedAt(_ctx.longValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setVersion(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].Version"));

			List<String> workItemReviewRecordVOS = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].WorkItemReviewRecordVOS.Length"); j++) {
				workItemReviewRecordVOS.add(_ctx.stringValue("GetLinkeLinktWorkitemreviewsResponse.Data["+ i +"].WorkItemReviewRecordVOS["+ j +"]"));
			}
			dataItem.setWorkItemReviewRecordVOS(workItemReviewRecordVOS);

			data.add(dataItem);
		}
		getLinkeLinktWorkitemreviewsResponse.setData(data);
	 
	 	return getLinkeLinktWorkitemreviewsResponse;
	}
}