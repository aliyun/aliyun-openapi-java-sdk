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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktTemplatestatusesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktTemplatestatusesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktTemplatestatusesResponseUnmarshaller {

	public static GetLinkeLinktTemplatestatusesResponse unmarshall(GetLinkeLinktTemplatestatusesResponse getLinkeLinktTemplatestatusesResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktTemplatestatusesResponse.setRequestId(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.RequestId"));
		getLinkeLinktTemplatestatusesResponse.setResultCode(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.ResultCode"));
		getLinkeLinktTemplatestatusesResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.ResultMessage"));
		getLinkeLinktTemplatestatusesResponse.setErrorCode(_ctx.longValue("GetLinkeLinktTemplatestatusesResponse.ErrorCode"));
		getLinkeLinktTemplatestatusesResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.ErrorMessage"));
		getLinkeLinktTemplatestatusesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktTemplatestatusesResponse.ResponseStatusCode"));
		getLinkeLinktTemplatestatusesResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktTemplatestatusesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktTemplatestatusesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].Region"));
			dataItem.setStage(_ctx.longValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].Stage"));
			dataItem.setStageName(_ctx.stringValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].StageName"));
			dataItem.setUpdatedAt(_ctx.longValue("GetLinkeLinktTemplatestatusesResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		getLinkeLinktTemplatestatusesResponse.setData(data);
	 
	 	return getLinkeLinktTemplatestatusesResponse;
	}
}