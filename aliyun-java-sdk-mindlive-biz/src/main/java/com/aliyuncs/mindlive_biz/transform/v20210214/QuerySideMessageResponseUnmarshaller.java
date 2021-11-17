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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.QuerySideMessageResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QuerySideMessageResponse.Data;
import com.aliyuncs.mindlive_biz.model.v20210214.QuerySideMessageResponse.Data.SideMessageDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySideMessageResponseUnmarshaller {

	public static QuerySideMessageResponse unmarshall(QuerySideMessageResponse querySideMessageResponse, UnmarshallerContext _ctx) {
		
		querySideMessageResponse.setRequestId(_ctx.stringValue("QuerySideMessageResponse.RequestId"));
		querySideMessageResponse.setErrorMessage(_ctx.stringValue("QuerySideMessageResponse.ErrorMessage"));
		querySideMessageResponse.setSuccess(_ctx.booleanValue("QuerySideMessageResponse.Success"));
		querySideMessageResponse.setErrorCode(_ctx.stringValue("QuerySideMessageResponse.ErrorCode"));

		Data data = new Data();
		data.setEndTime(_ctx.longValue("QuerySideMessageResponse.Data.EndTime"));
		data.setStartTime(_ctx.longValue("QuerySideMessageResponse.Data.StartTime"));

		List<SideMessageDTO> messages = new ArrayList<SideMessageDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySideMessageResponse.Data.Messages.Length"); i++) {
			SideMessageDTO sideMessageDTO = new SideMessageDTO();
			sideMessageDTO.setUuid(_ctx.stringValue("QuerySideMessageResponse.Data.Messages["+ i +"].Uuid"));
			sideMessageDTO.setTimeStamp(_ctx.longValue("QuerySideMessageResponse.Data.Messages["+ i +"].TimeStamp"));
			sideMessageDTO.setSuccess(_ctx.booleanValue("QuerySideMessageResponse.Data.Messages["+ i +"].Success"));
			sideMessageDTO.setContent(_ctx.stringValue("QuerySideMessageResponse.Data.Messages["+ i +"].Content"));

			messages.add(sideMessageDTO);
		}
		data.setMessages(messages);
		querySideMessageResponse.setData(data);
	 
	 	return querySideMessageResponse;
	}
}