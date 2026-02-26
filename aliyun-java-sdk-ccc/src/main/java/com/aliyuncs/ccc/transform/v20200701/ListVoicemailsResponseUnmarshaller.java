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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListVoicemailsResponse;
import com.aliyuncs.ccc.model.v20200701.ListVoicemailsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListVoicemailsResponse.Data.CdrVoicemail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVoicemailsResponseUnmarshaller {

	public static ListVoicemailsResponse unmarshall(ListVoicemailsResponse listVoicemailsResponse, UnmarshallerContext _ctx) {
		
		listVoicemailsResponse.setRequestId(_ctx.stringValue("ListVoicemailsResponse.RequestId"));
		listVoicemailsResponse.setCode(_ctx.stringValue("ListVoicemailsResponse.Code"));
		listVoicemailsResponse.setHttpStatusCode(_ctx.integerValue("ListVoicemailsResponse.HttpStatusCode"));
		listVoicemailsResponse.setMessage(_ctx.stringValue("ListVoicemailsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListVoicemailsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListVoicemailsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListVoicemailsResponse.Data.TotalCount"));

		List<CdrVoicemail> list = new ArrayList<CdrVoicemail>();
		for (int i = 0; i < _ctx.lengthValue("ListVoicemailsResponse.Data.List.Length"); i++) {
			CdrVoicemail cdrVoicemail = new CdrVoicemail();
			cdrVoicemail.setCdrStartTime(_ctx.longValue("ListVoicemailsResponse.Data.List["+ i +"].CdrStartTime"));
			cdrVoicemail.setCaller(_ctx.stringValue("ListVoicemailsResponse.Data.List["+ i +"].Caller"));
			cdrVoicemail.setContactId(_ctx.stringValue("ListVoicemailsResponse.Data.List["+ i +"].ContactId"));
			cdrVoicemail.setRecordingDuration(_ctx.longValue("ListVoicemailsResponse.Data.List["+ i +"].RecordingDuration"));
			cdrVoicemail.setInstanceId(_ctx.stringValue("ListVoicemailsResponse.Data.List["+ i +"].InstanceId"));
			cdrVoicemail.setName(_ctx.stringValue("ListVoicemailsResponse.Data.List["+ i +"].Name"));
			cdrVoicemail.setCallee(_ctx.stringValue("ListVoicemailsResponse.Data.List["+ i +"].Callee"));
			cdrVoicemail.setStartTime(_ctx.stringValue("ListVoicemailsResponse.Data.List["+ i +"].StartTime"));
			cdrVoicemail.setDuration(_ctx.longValue("ListVoicemailsResponse.Data.List["+ i +"].Duration"));

			list.add(cdrVoicemail);
		}
		data.setList(list);
		listVoicemailsResponse.setData(data);
	 
	 	return listVoicemailsResponse;
	}
}