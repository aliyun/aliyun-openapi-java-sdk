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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.UpdateLibraryInstallTaskStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLibraryInstallTaskStatusResponseUnmarshaller {

	public static UpdateLibraryInstallTaskStatusResponse unmarshall(UpdateLibraryInstallTaskStatusResponse updateLibraryInstallTaskStatusResponse, UnmarshallerContext _ctx) {
		
		updateLibraryInstallTaskStatusResponse.setRequestId(_ctx.stringValue("UpdateLibraryInstallTaskStatusResponse.RequestId"));
		updateLibraryInstallTaskStatusResponse.setData(_ctx.booleanValue("UpdateLibraryInstallTaskStatusResponse.Data"));
	 
	 	return updateLibraryInstallTaskStatusResponse;
	}
}