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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.CreateIndexResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIndexResponseUnmarshaller {

	public static CreateIndexResponse unmarshall(CreateIndexResponse createIndexResponse, UnmarshallerContext _ctx) {
		
		createIndexResponse.setRequestId(_ctx.stringValue("CreateIndexResponse.RequestId"));
		createIndexResponse.setMessage(_ctx.stringValue("CreateIndexResponse.Message"));
		createIndexResponse.setStatus(_ctx.stringValue("CreateIndexResponse.Status"));
		createIndexResponse.setJobId(_ctx.stringValue("CreateIndexResponse.JobId"));
	 
	 	return createIndexResponse;
	}
}