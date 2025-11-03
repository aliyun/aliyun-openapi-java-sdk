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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.CreatePlaybookResponse;
import com.aliyuncs.sophonsoar.model.v20220728.CreatePlaybookResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePlaybookResponseUnmarshaller {

	public static CreatePlaybookResponse unmarshall(CreatePlaybookResponse createPlaybookResponse, UnmarshallerContext _ctx) {
		
		createPlaybookResponse.setRequestId(_ctx.stringValue("CreatePlaybookResponse.RequestId"));

		Data data = new Data();
		data.setPlaybookUuid(_ctx.stringValue("CreatePlaybookResponse.Data.PlaybookUuid"));
		createPlaybookResponse.setData(data);
	 
	 	return createPlaybookResponse;
	}
}