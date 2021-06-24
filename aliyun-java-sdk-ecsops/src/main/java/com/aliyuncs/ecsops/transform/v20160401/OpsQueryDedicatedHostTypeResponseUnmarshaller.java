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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDedicatedHostTypeResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDedicatedHostTypeResponse.DedicatedHostType;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDedicatedHostTypeResponseUnmarshaller {

	public static OpsQueryDedicatedHostTypeResponse unmarshall(OpsQueryDedicatedHostTypeResponse opsQueryDedicatedHostTypeResponse, UnmarshallerContext _ctx) {
		
		opsQueryDedicatedHostTypeResponse.setRequestId(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.RequestId"));

		List<DedicatedHostType> dedicatedHostTypes = new ArrayList<DedicatedHostType>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes.Length"); i++) {
			DedicatedHostType dedicatedHostType = new DedicatedHostType();
			dedicatedHostType.setStatus(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Status"));
			dedicatedHostType.setDataDiskCategory(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].DataDiskCategory"));
			dedicatedHostType.setCores(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Cores"));
			dedicatedHostType.setDiskSize(_ctx.longValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].DiskSize"));
			dedicatedHostType.setHostType(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].HostType"));
			dedicatedHostType.setMem(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Mem"));
			dedicatedHostType.setPhysicalGpus(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].PhysicalGpus"));
			dedicatedHostType.setDiskNum(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].DiskNum"));
			dedicatedHostType.setFlag(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Flag"));
			dedicatedHostType.setPhysicalCores(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].PhysicalCores"));
			dedicatedHostType.setSupportInstanceTypeFamily(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypeFamily"));
			dedicatedHostType.setMaxInstanceCount(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].MaxInstanceCount"));
			dedicatedHostType.setVgpus(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Vgpus"));
			dedicatedHostType.setGpuSpec(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].GpuSpec"));
			dedicatedHostType.setSockets(_ctx.integerValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Sockets"));
			dedicatedHostType.setGeneration(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].Generation"));

			List<String> supportInstanceTypesList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypesList.Length"); j++) {
				supportInstanceTypesList.add(_ctx.stringValue("OpsQueryDedicatedHostTypeResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypesList["+ j +"]"));
			}
			dedicatedHostType.setSupportInstanceTypesList(supportInstanceTypesList);

			dedicatedHostTypes.add(dedicatedHostType);
		}
		opsQueryDedicatedHostTypeResponse.setDedicatedHostTypes(dedicatedHostTypes);
	 
	 	return opsQueryDedicatedHostTypeResponse;
	}
}