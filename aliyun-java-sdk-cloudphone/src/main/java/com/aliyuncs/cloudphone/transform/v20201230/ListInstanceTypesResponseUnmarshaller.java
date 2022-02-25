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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.ListInstanceTypesResponse;
import com.aliyuncs.cloudphone.model.v20201230.ListInstanceTypesResponse.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceTypesResponseUnmarshaller {

	public static ListInstanceTypesResponse unmarshall(ListInstanceTypesResponse listInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		listInstanceTypesResponse.setRequestId(_ctx.stringValue("ListInstanceTypesResponse.RequestId"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setNameEn(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].NameEn"));
			instanceType.setDefaultResolution(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].DefaultResolution"));
			instanceType.setInstanceType(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].InstanceType"));
			instanceType.setName(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].Name"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));
			instanceType.setCpuCoreCount(_ctx.integerValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setMemorySize(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));

			List<String> resolutions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].Resolutions.Length"); j++) {
				resolutions.add(_ctx.stringValue("ListInstanceTypesResponse.InstanceTypes["+ i +"].Resolutions["+ j +"]"));
			}
			instanceType.setResolutions(resolutions);

			instanceTypes.add(instanceType);
		}
		listInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return listInstanceTypesResponse;
	}
}