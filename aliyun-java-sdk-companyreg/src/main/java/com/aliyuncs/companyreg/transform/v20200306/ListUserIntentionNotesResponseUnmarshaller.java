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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.ListUserIntentionNotesResponse;
import com.aliyuncs.companyreg.model.v20200306.ListUserIntentionNotesResponse.OpateLogs;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserIntentionNotesResponseUnmarshaller {

	public static ListUserIntentionNotesResponse unmarshall(ListUserIntentionNotesResponse listUserIntentionNotesResponse, UnmarshallerContext _ctx) {
		
		listUserIntentionNotesResponse.setRequestId(_ctx.stringValue("ListUserIntentionNotesResponse.RequestId"));
		listUserIntentionNotesResponse.setPageNum(_ctx.integerValue("ListUserIntentionNotesResponse.PageNum"));
		listUserIntentionNotesResponse.setPageSize(_ctx.integerValue("ListUserIntentionNotesResponse.PageSize"));
		listUserIntentionNotesResponse.setSuccess(_ctx.booleanValue("ListUserIntentionNotesResponse.Success"));
		listUserIntentionNotesResponse.setTotalItemNum(_ctx.integerValue("ListUserIntentionNotesResponse.TotalItemNum"));
		listUserIntentionNotesResponse.setTotalPageNum(_ctx.integerValue("ListUserIntentionNotesResponse.TotalPageNum"));

		List<OpateLogs> data = new ArrayList<OpateLogs>();
		for (int i = 0; i < _ctx.lengthValue("ListUserIntentionNotesResponse.Data.Length"); i++) {
			OpateLogs opateLogs = new OpateLogs();
			opateLogs.setCreateTime(_ctx.stringValue("ListUserIntentionNotesResponse.Data["+ i +"].CreateTime"));
			opateLogs.setNote(_ctx.stringValue("ListUserIntentionNotesResponse.Data["+ i +"].Note"));

			data.add(opateLogs);
		}
		listUserIntentionNotesResponse.setData(data);
	 
	 	return listUserIntentionNotesResponse;
	}
}