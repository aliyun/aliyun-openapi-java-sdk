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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import com.aliyuncs.paifeaturestore.model.v20230621.DeleteDatasourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDatasourceResponseUnmarshaller {

	public static DeleteDatasourceResponse unmarshall(DeleteDatasourceResponse deleteDatasourceResponse, UnmarshallerContext _ctx) {
		
		deleteDatasourceResponse.setRequestId(_ctx.stringValue("DeleteDatasourceResponse.RequestId"));
	 
	 	return deleteDatasourceResponse;
	}
}