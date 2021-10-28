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

import com.aliyuncs.ens.model.v20171110.CreateDiskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDiskResponseUnmarshaller {

	public static CreateDiskResponse unmarshall(CreateDiskResponse createDiskResponse, UnmarshallerContext _ctx) {
		
		createDiskResponse.setRequestId(_ctx.stringValue("CreateDiskResponse.RequestId"));
		createDiskResponse.setOrderId(_ctx.stringValue("CreateDiskResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateDiskResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("CreateDiskResponse.InstanceIds["+ i +"]"));
		}
		createDiskResponse.setInstanceIds(instanceIds);
	 
	 	return createDiskResponse;
	}
}