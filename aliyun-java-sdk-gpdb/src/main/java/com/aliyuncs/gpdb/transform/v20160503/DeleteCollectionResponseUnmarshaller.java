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

import com.aliyuncs.gpdb.model.v20160503.DeleteCollectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCollectionResponseUnmarshaller {

	public static DeleteCollectionResponse unmarshall(DeleteCollectionResponse deleteCollectionResponse, UnmarshallerContext _ctx) {
		
		deleteCollectionResponse.setRequestId(_ctx.stringValue("DeleteCollectionResponse.RequestId"));
		deleteCollectionResponse.setMessage(_ctx.stringValue("DeleteCollectionResponse.Message"));
		deleteCollectionResponse.setStatus(_ctx.stringValue("DeleteCollectionResponse.Status"));
	 
	 	return deleteCollectionResponse;
	}
}