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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.CreateFileSystemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFileSystemResponseUnmarshaller {

	public static CreateFileSystemResponse unmarshall(CreateFileSystemResponse createFileSystemResponse, UnmarshallerContext _ctx) {
		
		createFileSystemResponse.setRequestId(_ctx.stringValue("CreateFileSystemResponse.RequestId"));
		createFileSystemResponse.setBizStatusCode(_ctx.stringValue("CreateFileSystemResponse.BizStatusCode"));

		List<String> allocationId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateFileSystemResponse.AllocationId.Length"); i++) {
			allocationId.add(_ctx.stringValue("CreateFileSystemResponse.AllocationId["+ i +"]"));
		}
		createFileSystemResponse.setAllocationId(allocationId);

		List<String> unAllocationId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateFileSystemResponse.UnAllocationId.Length"); i++) {
			unAllocationId.add(_ctx.stringValue("CreateFileSystemResponse.UnAllocationId["+ i +"]"));
		}
		createFileSystemResponse.setUnAllocationId(unAllocationId);
	 
	 	return createFileSystemResponse;
	}
}