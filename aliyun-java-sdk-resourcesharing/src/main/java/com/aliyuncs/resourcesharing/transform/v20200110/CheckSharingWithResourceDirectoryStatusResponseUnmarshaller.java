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

package com.aliyuncs.resourcesharing.transform.v20200110;

import com.aliyuncs.resourcesharing.model.v20200110.CheckSharingWithResourceDirectoryStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckSharingWithResourceDirectoryStatusResponseUnmarshaller {

	public static CheckSharingWithResourceDirectoryStatusResponse unmarshall(CheckSharingWithResourceDirectoryStatusResponse checkSharingWithResourceDirectoryStatusResponse, UnmarshallerContext _ctx) {
		
		checkSharingWithResourceDirectoryStatusResponse.setRequestId(_ctx.stringValue("CheckSharingWithResourceDirectoryStatusResponse.RequestId"));
		checkSharingWithResourceDirectoryStatusResponse.setEnableSharingWithRd(_ctx.booleanValue("CheckSharingWithResourceDirectoryStatusResponse.EnableSharingWithRd"));
	 
	 	return checkSharingWithResourceDirectoryStatusResponse;
	}
}