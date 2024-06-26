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

package com.aliyuncs.domain_intl.transform.v20171218;

import com.aliyuncs.domain_intl.model.v20171218.SaveSingleTaskForUpdateProhibitionLockResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveSingleTaskForUpdateProhibitionLockResponseUnmarshaller {

	public static SaveSingleTaskForUpdateProhibitionLockResponse unmarshall(SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLockResponse, UnmarshallerContext _ctx) {
		
		saveSingleTaskForUpdateProhibitionLockResponse.setRequestId(_ctx.stringValue("SaveSingleTaskForUpdateProhibitionLockResponse.RequestId"));
		saveSingleTaskForUpdateProhibitionLockResponse.setTaskNo(_ctx.stringValue("SaveSingleTaskForUpdateProhibitionLockResponse.TaskNo"));
	 
	 	return saveSingleTaskForUpdateProhibitionLockResponse;
	}
}