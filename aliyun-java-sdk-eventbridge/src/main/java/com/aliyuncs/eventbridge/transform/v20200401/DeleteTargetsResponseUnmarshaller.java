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

import com.aliyuncs.eventbridge.model.v20200401.DeleteTargetsResponse;
import com.aliyuncs.eventbridge.model.v20200401.DeleteTargetsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.DeleteTargetsResponse.Data.ErrorEntriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTargetsResponseUnmarshaller {

	public static DeleteTargetsResponse unmarshall(DeleteTargetsResponse deleteTargetsResponse, UnmarshallerContext _ctx) {
		
		deleteTargetsResponse.setRequestId(_ctx.stringValue("DeleteTargetsResponse.RequestId"));
		deleteTargetsResponse.setMessage(_ctx.stringValue("DeleteTargetsResponse.Message"));
		deleteTargetsResponse.setCode(_ctx.stringValue("DeleteTargetsResponse.Code"));
		deleteTargetsResponse.setSuccess(_ctx.booleanValue("DeleteTargetsResponse.Success"));

		Data data = new Data();
		data.setErrorEntriesCount(_ctx.integerValue("DeleteTargetsResponse.Data.ErrorEntriesCount"));

		List<ErrorEntriesItem> errorEntries = new ArrayList<ErrorEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteTargetsResponse.Data.ErrorEntries.Length"); i++) {
			ErrorEntriesItem errorEntriesItem = new ErrorEntriesItem();
			errorEntriesItem.setErrorMessage(_ctx.stringValue("DeleteTargetsResponse.Data.ErrorEntries["+ i +"].ErrorMessage"));
			errorEntriesItem.setErrorCode(_ctx.stringValue("DeleteTargetsResponse.Data.ErrorEntries["+ i +"].ErrorCode"));
			errorEntriesItem.setEntryId(_ctx.stringValue("DeleteTargetsResponse.Data.ErrorEntries["+ i +"].EntryId"));

			errorEntries.add(errorEntriesItem);
		}
		data.setErrorEntries(errorEntries);
		deleteTargetsResponse.setData(data);
	 
	 	return deleteTargetsResponse;
	}
}