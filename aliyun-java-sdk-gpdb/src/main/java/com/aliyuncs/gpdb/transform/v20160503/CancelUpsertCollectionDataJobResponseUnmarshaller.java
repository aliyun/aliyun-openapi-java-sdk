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

import com.aliyuncs.gpdb.model.v20160503.CancelUpsertCollectionDataJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelUpsertCollectionDataJobResponseUnmarshaller {

	public static CancelUpsertCollectionDataJobResponse unmarshall(CancelUpsertCollectionDataJobResponse cancelUpsertCollectionDataJobResponse, UnmarshallerContext _ctx) {
		
		cancelUpsertCollectionDataJobResponse.setRequestId(_ctx.stringValue("CancelUpsertCollectionDataJobResponse.RequestId"));
		cancelUpsertCollectionDataJobResponse.setMessage(_ctx.stringValue("CancelUpsertCollectionDataJobResponse.Message"));
		cancelUpsertCollectionDataJobResponse.setStatus(_ctx.stringValue("CancelUpsertCollectionDataJobResponse.Status"));
	 
	 	return cancelUpsertCollectionDataJobResponse;
	}
}