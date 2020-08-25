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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktSelectableworkflowstatusResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktSelectableworkflowstatusResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktSelectableworkflowstatusResponseUnmarshaller {

	public static GetLinkeLinktSelectableworkflowstatusResponse unmarshall(GetLinkeLinktSelectableworkflowstatusResponse getLinkeLinktSelectableworkflowstatusResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktSelectableworkflowstatusResponse.setRequestId(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.RequestId"));
		getLinkeLinktSelectableworkflowstatusResponse.setResultCode(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.ResultCode"));
		getLinkeLinktSelectableworkflowstatusResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.ResultMessage"));
		getLinkeLinktSelectableworkflowstatusResponse.setErrorCode(_ctx.longValue("GetLinkeLinktSelectableworkflowstatusResponse.ErrorCode"));
		getLinkeLinktSelectableworkflowstatusResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.ErrorMessage"));
		getLinkeLinktSelectableworkflowstatusResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktSelectableworkflowstatusResponse.ResponseStatusCode"));
		getLinkeLinktSelectableworkflowstatusResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktSelectableworkflowstatusResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktSelectableworkflowstatusResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].Region"));
			dataItem.setStage(_ctx.longValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].Stage"));
			dataItem.setStageName(_ctx.stringValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].StageName"));
			dataItem.setUpdatedAt(_ctx.longValue("GetLinkeLinktSelectableworkflowstatusResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		getLinkeLinktSelectableworkflowstatusResponse.setData(data);
	 
	 	return getLinkeLinktSelectableworkflowstatusResponse;
	}
}