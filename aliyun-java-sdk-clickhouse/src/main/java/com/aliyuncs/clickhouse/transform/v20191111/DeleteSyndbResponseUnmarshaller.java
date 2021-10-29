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

package com.aliyuncs.clickhouse.transform.v20191111;

import com.aliyuncs.clickhouse.model.v20191111.DeleteSyndbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSyndbResponseUnmarshaller {

	public static DeleteSyndbResponse unmarshall(DeleteSyndbResponse deleteSyndbResponse, UnmarshallerContext _ctx) {
		
		deleteSyndbResponse.setRequestId(_ctx.stringValue("DeleteSyndbResponse.RequestId"));
		deleteSyndbResponse.setStatus(_ctx.booleanValue("DeleteSyndbResponse.Status"));
		deleteSyndbResponse.setErrorMsg(_ctx.stringValue("DeleteSyndbResponse.ErrorMsg"));
		deleteSyndbResponse.setErrorCode(_ctx.longValue("DeleteSyndbResponse.ErrorCode"));
	 
	 	return deleteSyndbResponse;
	}
}