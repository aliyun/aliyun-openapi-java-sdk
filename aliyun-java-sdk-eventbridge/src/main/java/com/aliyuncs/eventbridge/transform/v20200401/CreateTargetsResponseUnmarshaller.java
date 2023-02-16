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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.CreateTargetsResponse;
import com.aliyuncs.eventbridge.model.v20200401.CreateTargetsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.CreateTargetsResponse.Data.ErrorEntriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTargetsResponseUnmarshaller {

	public static CreateTargetsResponse unmarshall(CreateTargetsResponse createTargetsResponse, UnmarshallerContext _ctx) {
		
		createTargetsResponse.setRequestId(_ctx.stringValue("CreateTargetsResponse.RequestId"));
		createTargetsResponse.setMessage(_ctx.stringValue("CreateTargetsResponse.Message"));
		createTargetsResponse.setCode(_ctx.stringValue("CreateTargetsResponse.Code"));
		createTargetsResponse.setSuccess(_ctx.booleanValue("CreateTargetsResponse.Success"));

		Data data = new Data();
		data.setErrorEntriesCount(_ctx.integerValue("CreateTargetsResponse.Data.ErrorEntriesCount"));

		List<ErrorEntriesItem> errorEntries = new ArrayList<ErrorEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateTargetsResponse.Data.ErrorEntries.Length"); i++) {
			ErrorEntriesItem errorEntriesItem = new ErrorEntriesItem();
			errorEntriesItem.setErrorMessage(_ctx.stringValue("CreateTargetsResponse.Data.ErrorEntries["+ i +"].ErrorMessage"));
			errorEntriesItem.setErrorCode(_ctx.stringValue("CreateTargetsResponse.Data.ErrorEntries["+ i +"].ErrorCode"));
			errorEntriesItem.setEntryId(_ctx.stringValue("CreateTargetsResponse.Data.ErrorEntries["+ i +"].EntryId"));

			errorEntries.add(errorEntriesItem);
		}
		data.setErrorEntries(errorEntries);
		createTargetsResponse.setData(data);
	 
	 	return createTargetsResponse;
	}
}