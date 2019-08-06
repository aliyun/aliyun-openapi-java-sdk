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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.PutRestorePreCheckResponse;
import com.aliyuncs.drds.model.v20190123.PutRestorePreCheckResponse.PrecheckBackupResult;
import com.aliyuncs.drds.model.v20190123.PutRestorePreCheckResponse.PrecheckBackupResult.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutRestorePreCheckResponseUnmarshaller {

	public static PutRestorePreCheckResponse unmarshall(PutRestorePreCheckResponse putRestorePreCheckResponse, UnmarshallerContext _ctx) {
		
		putRestorePreCheckResponse.setRequestId(_ctx.stringValue("PutRestorePreCheckResponse.RequestId"));
		putRestorePreCheckResponse.setSuccess(_ctx.booleanValue("PutRestorePreCheckResponse.Success"));

		PrecheckBackupResult precheckBackupResult = new PrecheckBackupResult();
		precheckBackupResult.setResult(_ctx.booleanValue("PutRestorePreCheckResponse.PrecheckBackupResult.Result"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PutRestorePreCheckResponse.PrecheckBackupResult.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setItemId(_ctx.longValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].ItemId"));
			listItem.setCheckItemName(_ctx.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckItemName"));
			listItem.setCheckItemContent(_ctx.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckItemContent"));
			listItem.setCheckResult(_ctx.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckResult"));
			listItem.setCheckFailReason(_ctx.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckFailReason"));
			listItem.setResult(_ctx.booleanValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].Result"));

			list.add(listItem);
		}
		precheckBackupResult.setList(list);
		putRestorePreCheckResponse.setPrecheckBackupResult(precheckBackupResult);
	 
	 	return putRestorePreCheckResponse;
	}
}