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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktReqchangesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktReqchangesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktReqchangesResponseUnmarshaller {

	public static GetLinkeLinktReqchangesResponse unmarshall(GetLinkeLinktReqchangesResponse getLinkeLinktReqchangesResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktReqchangesResponse.setRequestId(_ctx.stringValue("GetLinkeLinktReqchangesResponse.RequestId"));
		getLinkeLinktReqchangesResponse.setResultCode(_ctx.stringValue("GetLinkeLinktReqchangesResponse.ResultCode"));
		getLinkeLinktReqchangesResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktReqchangesResponse.ResultMessage"));
		getLinkeLinktReqchangesResponse.setErrorCode(_ctx.longValue("GetLinkeLinktReqchangesResponse.ErrorCode"));
		getLinkeLinktReqchangesResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktReqchangesResponse.ErrorMessage"));
		getLinkeLinktReqchangesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktReqchangesResponse.ResponseStatusCode"));
		getLinkeLinktReqchangesResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktReqchangesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktReqchangesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setContent(_ctx.stringValue("GetLinkeLinktReqchangesResponse.Data["+ i +"].Content"));
			dataItem.setUpdatedAt(_ctx.longValue("GetLinkeLinktReqchangesResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setUser(_ctx.stringValue("GetLinkeLinktReqchangesResponse.Data["+ i +"].User"));
			dataItem.setVersion(_ctx.stringValue("GetLinkeLinktReqchangesResponse.Data["+ i +"].Version"));

			data.add(dataItem);
		}
		getLinkeLinktReqchangesResponse.setData(data);
	 
	 	return getLinkeLinktReqchangesResponse;
	}
}