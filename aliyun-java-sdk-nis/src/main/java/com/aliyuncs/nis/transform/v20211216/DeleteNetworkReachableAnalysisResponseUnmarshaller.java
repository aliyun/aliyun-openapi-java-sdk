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

package com.aliyuncs.nis.transform.v20211216;

import com.aliyuncs.nis.model.v20211216.DeleteNetworkReachableAnalysisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNetworkReachableAnalysisResponseUnmarshaller {

	public static DeleteNetworkReachableAnalysisResponse unmarshall(DeleteNetworkReachableAnalysisResponse deleteNetworkReachableAnalysisResponse, UnmarshallerContext _ctx) {
		
		deleteNetworkReachableAnalysisResponse.setRequestId(_ctx.stringValue("DeleteNetworkReachableAnalysisResponse.RequestId"));
		deleteNetworkReachableAnalysisResponse.setData(_ctx.booleanValue("DeleteNetworkReachableAnalysisResponse.Data"));
	 
	 	return deleteNetworkReachableAnalysisResponse;
	}
}