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

import com.aliyuncs.mse.model.v20190531.CreateOrUpdateSwimmingLaneGroupResponse;
import com.aliyuncs.mse.model.v20190531.CreateOrUpdateSwimmingLaneGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateSwimmingLaneGroupResponseUnmarshaller {

	public static CreateOrUpdateSwimmingLaneGroupResponse unmarshall(CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroupResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateSwimmingLaneGroupResponse.setRequestId(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.RequestId"));
		createOrUpdateSwimmingLaneGroupResponse.setSuccess(_ctx.booleanValue("CreateOrUpdateSwimmingLaneGroupResponse.Success"));
		createOrUpdateSwimmingLaneGroupResponse.setCode(_ctx.integerValue("CreateOrUpdateSwimmingLaneGroupResponse.Code"));
		createOrUpdateSwimmingLaneGroupResponse.setErrorCode(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.ErrorCode"));
		createOrUpdateSwimmingLaneGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateOrUpdateSwimmingLaneGroupResponse.HttpStatusCode"));
		createOrUpdateSwimmingLaneGroupResponse.setMessage(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Message"));
		createOrUpdateSwimmingLaneGroupResponse.setDynamicMessage(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.DynamicMessage"));

		Data data = new Data();
		data.setName(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Name"));
		data.setName1(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.name"));
		data.setDbGrayEnable(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.dbGrayEnable"));
		data.setDbGrayEnable2(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.DbGrayEnable"));
		data.setSource(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.source"));
		data.setSource3(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Source"));
		data.setUserId(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.userId"));
		data.setUserId4(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.UserId"));
		data.setMessageQueueFilterSide(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.MessageQueueFilterSide"));
		data.setMessageQueueFilterSide5(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.messageQueueFilterSide"));
		data.setAppIds(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.appIds"));
		data.setAppIds6(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.AppIds"));
		data.setEnable(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.enable"));
		data.setEnable7(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Enable"));
		data.setNamespace(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Namespace"));
		data.setNamespace8(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.namespace"));
		data.setRecordCanaryDetail(_ctx.booleanValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.RecordCanaryDetail"));
		data.setId(_ctx.longValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.id"));
		data.setId9(_ctx.longValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Id"));
		data.setEntryApp(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.entryApp"));
		data.setEntryApp10(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.EntryApp"));
		data.setRegion(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.region"));
		data.setRegion11(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Region"));
		data.setMessageQueueGrayEnable(_ctx.booleanValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.MessageQueueGrayEnable"));
		data.setMessageQueueGrayEnable12(_ctx.booleanValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.messageQueueGrayEnable"));
		data.setStatus(_ctx.integerValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.status"));
		data.setStatus13(_ctx.integerValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.Status"));

		List<String> applicationList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.applicationList.Length"); i++) {
			applicationList.add(_ctx.stringValue("CreateOrUpdateSwimmingLaneGroupResponse.Data.applicationList["+ i +"]"));
		}
		data.setApplicationList(applicationList);
		createOrUpdateSwimmingLaneGroupResponse.setData(data);
	 
	 	return createOrUpdateSwimmingLaneGroupResponse;
	}
}