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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryAllSwimmingLaneGroupResponse;
import com.aliyuncs.mse.model.v20190531.QueryAllSwimmingLaneGroupResponse.SwimmingLaneGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllSwimmingLaneGroupResponseUnmarshaller {

	public static QueryAllSwimmingLaneGroupResponse unmarshall(QueryAllSwimmingLaneGroupResponse queryAllSwimmingLaneGroupResponse, UnmarshallerContext _ctx) {
		
		queryAllSwimmingLaneGroupResponse.setRequestId(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.RequestId"));
		queryAllSwimmingLaneGroupResponse.setSuccess(_ctx.booleanValue("QueryAllSwimmingLaneGroupResponse.Success"));
		queryAllSwimmingLaneGroupResponse.setCode(_ctx.integerValue("QueryAllSwimmingLaneGroupResponse.Code"));
		queryAllSwimmingLaneGroupResponse.setErrorCode(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.ErrorCode"));
		queryAllSwimmingLaneGroupResponse.setHttpStatusCode(_ctx.integerValue("QueryAllSwimmingLaneGroupResponse.HttpStatusCode"));
		queryAllSwimmingLaneGroupResponse.setMessage(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Message"));
		queryAllSwimmingLaneGroupResponse.setDynamicMessage(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.DynamicMessage"));

		List<SwimmingLaneGroup> data = new ArrayList<SwimmingLaneGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllSwimmingLaneGroupResponse.Data.Length"); i++) {
			SwimmingLaneGroup swimmingLaneGroup = new SwimmingLaneGroup();
			swimmingLaneGroup.setName(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Name"));
			swimmingLaneGroup.setName1(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].name"));
			swimmingLaneGroup.setDbGrayEnable(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].dbGrayEnable"));
			swimmingLaneGroup.setDbGrayEnable2(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].DbGrayEnable"));
			swimmingLaneGroup.setSource(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].source"));
			swimmingLaneGroup.setSource3(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Source"));
			swimmingLaneGroup.setUserId(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].userId"));
			swimmingLaneGroup.setUserId4(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].UserId"));
			swimmingLaneGroup.setMessageQueueFilterSide(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].MessageQueueFilterSide"));
			swimmingLaneGroup.setMessageQueueFilterSide5(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].messageQueueFilterSide"));
			swimmingLaneGroup.setAppIds(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].appIds"));
			swimmingLaneGroup.setAppIds6(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].AppIds"));
			swimmingLaneGroup.setEnable(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].enable"));
			swimmingLaneGroup.setEnable7(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Enable"));
			swimmingLaneGroup.setNamespace(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Namespace"));
			swimmingLaneGroup.setNamespace8(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].namespace"));
			swimmingLaneGroup.setRecordCanaryDetail(_ctx.booleanValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].RecordCanaryDetail"));
			swimmingLaneGroup.setId(_ctx.longValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].id"));
			swimmingLaneGroup.setId9(_ctx.longValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Id"));
			swimmingLaneGroup.setEntryApp(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].entryApp"));
			swimmingLaneGroup.setEntryApp10(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].EntryApp"));
			swimmingLaneGroup.setRegion(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].region"));
			swimmingLaneGroup.setRegion11(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Region"));
			swimmingLaneGroup.setMessageQueueGrayEnable(_ctx.booleanValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].MessageQueueGrayEnable"));
			swimmingLaneGroup.setMessageQueueGrayEnable12(_ctx.booleanValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].messageQueueGrayEnable"));
			swimmingLaneGroup.setStatus(_ctx.integerValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].status"));
			swimmingLaneGroup.setStatus13(_ctx.integerValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].Status"));

			List<String> applicationList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].applicationList.Length"); j++) {
				applicationList.add(_ctx.stringValue("QueryAllSwimmingLaneGroupResponse.Data["+ i +"].applicationList["+ j +"]"));
			}
			swimmingLaneGroup.setApplicationList(applicationList);

			data.add(swimmingLaneGroup);
		}
		queryAllSwimmingLaneGroupResponse.setData(data);
	 
	 	return queryAllSwimmingLaneGroupResponse;
	}
}