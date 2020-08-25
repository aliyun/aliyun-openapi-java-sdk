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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktProjectcreatedstatusesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktProjectcreatedstatusesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktProjectcreatedstatusesResponseUnmarshaller {

	public static GetLinkeLinktProjectcreatedstatusesResponse unmarshall(GetLinkeLinktProjectcreatedstatusesResponse getLinkeLinktProjectcreatedstatusesResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktProjectcreatedstatusesResponse.setRequestId(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.RequestId"));
		getLinkeLinktProjectcreatedstatusesResponse.setResultCode(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.ResultCode"));
		getLinkeLinktProjectcreatedstatusesResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.ResultMessage"));
		getLinkeLinktProjectcreatedstatusesResponse.setErrorCode(_ctx.longValue("GetLinkeLinktProjectcreatedstatusesResponse.ErrorCode"));
		getLinkeLinktProjectcreatedstatusesResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.ErrorMessage"));
		getLinkeLinktProjectcreatedstatusesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktProjectcreatedstatusesResponse.ResponseStatusCode"));
		getLinkeLinktProjectcreatedstatusesResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktProjectcreatedstatusesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktProjectcreatedstatusesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].Region"));
			dataItem.setStage(_ctx.longValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].Stage"));
			dataItem.setStageName(_ctx.stringValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].StageName"));
			dataItem.setUpdatedAt(_ctx.longValue("GetLinkeLinktProjectcreatedstatusesResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		getLinkeLinktProjectcreatedstatusesResponse.setData(data);
	 
	 	return getLinkeLinktProjectcreatedstatusesResponse;
	}
}