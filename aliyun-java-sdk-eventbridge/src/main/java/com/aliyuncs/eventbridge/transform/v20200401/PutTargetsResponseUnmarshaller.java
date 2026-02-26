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

import com.aliyuncs.eventbridge.model.v20200401.PutTargetsResponse;
import com.aliyuncs.eventbridge.model.v20200401.PutTargetsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.PutTargetsResponse.Data.ErrorEntriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutTargetsResponseUnmarshaller {

	public static PutTargetsResponse unmarshall(PutTargetsResponse putTargetsResponse, UnmarshallerContext _ctx) {
		
		putTargetsResponse.setRequestId(_ctx.stringValue("PutTargetsResponse.RequestId"));
		putTargetsResponse.setMessage(_ctx.stringValue("PutTargetsResponse.Message"));
		putTargetsResponse.setCode(_ctx.stringValue("PutTargetsResponse.Code"));
		putTargetsResponse.setSuccess(_ctx.booleanValue("PutTargetsResponse.Success"));

		Data data = new Data();
		data.setErrorEntriesCount(_ctx.integerValue("PutTargetsResponse.Data.ErrorEntriesCount"));

		List<ErrorEntriesItem> errorEntries = new ArrayList<ErrorEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("PutTargetsResponse.Data.ErrorEntries.Length"); i++) {
			ErrorEntriesItem errorEntriesItem = new ErrorEntriesItem();
			errorEntriesItem.setErrorMessage(_ctx.stringValue("PutTargetsResponse.Data.ErrorEntries["+ i +"].ErrorMessage"));
			errorEntriesItem.setErrorCode(_ctx.stringValue("PutTargetsResponse.Data.ErrorEntries["+ i +"].ErrorCode"));
			errorEntriesItem.setEntryId(_ctx.stringValue("PutTargetsResponse.Data.ErrorEntries["+ i +"].EntryId"));

			errorEntries.add(errorEntriesItem);
		}
		data.setErrorEntries(errorEntries);
		putTargetsResponse.setData(data);
	 
	 	return putTargetsResponse;
	}
}