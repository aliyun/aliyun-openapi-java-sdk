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

package com.aliyuncs.dfs.transform.v20180620;

import com.aliyuncs.dfs.model.v20180620.CreateMountPointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMountPointResponseUnmarshaller {

	public static CreateMountPointResponse unmarshall(CreateMountPointResponse createMountPointResponse, UnmarshallerContext _ctx) {
		
		createMountPointResponse.setRequestId(_ctx.stringValue("CreateMountPointResponse.RequestId"));
		createMountPointResponse.setMountPointId(_ctx.stringValue("CreateMountPointResponse.MountPointId"));
	 
	 	return createMountPointResponse;
	}
}