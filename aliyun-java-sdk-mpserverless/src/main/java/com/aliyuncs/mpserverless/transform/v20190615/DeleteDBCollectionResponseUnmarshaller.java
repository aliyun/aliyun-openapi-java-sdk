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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.DeleteDBCollectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDBCollectionResponseUnmarshaller {

	public static DeleteDBCollectionResponse unmarshall(DeleteDBCollectionResponse deleteDBCollectionResponse, UnmarshallerContext _ctx) {
		
		deleteDBCollectionResponse.setRequestId(_ctx.stringValue("DeleteDBCollectionResponse.RequestId"));
		deleteDBCollectionResponse.setHttpStatusCode(_ctx.stringValue("DeleteDBCollectionResponse.HttpStatusCode"));
		deleteDBCollectionResponse.setSuccess(_ctx.booleanValue("DeleteDBCollectionResponse.Success"));
		deleteDBCollectionResponse.setCode(_ctx.stringValue("DeleteDBCollectionResponse.Code"));
		deleteDBCollectionResponse.setMessage(_ctx.stringValue("DeleteDBCollectionResponse.Message"));
		deleteDBCollectionResponse.setResult(_ctx.stringValue("DeleteDBCollectionResponse.Result"));
		deleteDBCollectionResponse.setAffectedDocs(_ctx.integerValue("DeleteDBCollectionResponse.AffectedDocs"));
	 
	 	return deleteDBCollectionResponse;
	}
}