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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.CreateBackupResponse;
import com.aliyuncs.polardbx.model.v20200202.CreateBackupResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupResponseUnmarshaller {

	public static CreateBackupResponse unmarshall(CreateBackupResponse createBackupResponse, UnmarshallerContext _ctx) {
		
		createBackupResponse.setRequestId(_ctx.stringValue("CreateBackupResponse.RequestId"));
		createBackupResponse.setMessage(_ctx.stringValue("CreateBackupResponse.Message"));
		createBackupResponse.setSuccess(_ctx.booleanValue("CreateBackupResponse.Success"));

		List<Account> data = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("CreateBackupResponse.Data.Length"); i++) {
			Account account = new Account();
			account.setBackupSetId(_ctx.longValue("CreateBackupResponse.Data["+ i +"].BackupSetId"));

			data.add(account);
		}
		createBackupResponse.setData(data);
	 
	 	return createBackupResponse;
	}
}