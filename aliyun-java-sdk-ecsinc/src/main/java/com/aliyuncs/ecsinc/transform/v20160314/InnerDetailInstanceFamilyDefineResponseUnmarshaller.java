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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerDetailInstanceFamilyDefineResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefine;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDetailInstanceFamilyDefineResponseUnmarshaller {

	public static InnerDetailInstanceFamilyDefineResponse unmarshall(InnerDetailInstanceFamilyDefineResponse innerDetailInstanceFamilyDefineResponse, UnmarshallerContext context) {
		
		innerDetailInstanceFamilyDefineResponse.setRequestId(context.stringValue("InnerDetailInstanceFamilyDefineResponse.RequestId"));

		List<InstanceFamilyDefine> instanceFamilyDefines = new ArrayList<InstanceFamilyDefine>();
		for (int i = 0; i < context.lengthValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines.Length"); i++) {
			InstanceFamilyDefine instanceFamilyDefine = new InstanceFamilyDefine();
			instanceFamilyDefine.setInstanceTypeFamily(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].InstanceTypeFamily"));
			instanceFamilyDefine.setCpuType(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].CpuType"));
			instanceFamilyDefine.setMachineType(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].MachineType"));
			instanceFamilyDefine.setCpuFrequency(context.floatValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].CpuFrequency"));
			instanceFamilyDefine.setCpuTurboFrequency(context.floatValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].CpuTurboFrequency"));
			instanceFamilyDefine.setMemType(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].MemType"));
			instanceFamilyDefine.setSysDiskType(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].SysDiskType"));
			instanceFamilyDefine.setDataDiskType(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].DataDiskType"));
			instanceFamilyDefine.setAdditionalDeviceType(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].AdditionalDeviceType"));
			instanceFamilyDefine.setOtherTechnology(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].OtherTechnology"));
			instanceFamilyDefine.setVcpuMemRate(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].VcpuMemRate"));
			instanceFamilyDefine.setDescription(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].Description"));
			instanceFamilyDefine.setBenefitDesc(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].BenefitDesc"));
			instanceFamilyDefine.setFitForDesc(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].FitForDesc"));
			instanceFamilyDefine.setMaxPps(context.longValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].MaxPps"));
			instanceFamilyDefine.setMaxBps(context.longValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].MaxBps"));
			instanceFamilyDefine.setSupportIoOptimized(context.stringValue("InnerDetailInstanceFamilyDefineResponse.InstanceFamilyDefines["+ i +"].SupportIoOptimized"));

			instanceFamilyDefines.add(instanceFamilyDefine);
		}
		innerDetailInstanceFamilyDefineResponse.setInstanceFamilyDefines(instanceFamilyDefines);
	 
	 	return innerDetailInstanceFamilyDefineResponse;
	}
}