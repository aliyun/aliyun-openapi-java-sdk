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

	public static PutRestorePreCheckResponse unmarshall(PutRestorePreCheckResponse putRestorePreCheckResponse, UnmarshallerContext context) {
		
		putRestorePreCheckResponse.setRequestId(context.stringValue("PutRestorePreCheckResponse.RequestId"));
		putRestorePreCheckResponse.setSuccess(context.booleanValue("PutRestorePreCheckResponse.Success"));

		PrecheckBackupResult precheckBackupResult = new PrecheckBackupResult();
		precheckBackupResult.setResult(context.booleanValue("PutRestorePreCheckResponse.PrecheckBackupResult.Result"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("PutRestorePreCheckResponse.PrecheckBackupResult.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setItemId(context.longValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].ItemId"));
			listItem.setCheckItemName(context.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckItemName"));
			listItem.setCheckItemContent(context.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckItemContent"));
			listItem.setCheckResult(context.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckResult"));
			listItem.setCheckFailReason(context.stringValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].CheckFailReason"));
			listItem.setResult(context.booleanValue("PutRestorePreCheckResponse.PrecheckBackupResult.List["+ i +"].Result"));

			list.add(listItem);
		}
		precheckBackupResult.setList(list);
		putRestorePreCheckResponse.setPrecheckBackupResult(precheckBackupResult);
	 
	 	return putRestorePreCheckResponse;
	}
}