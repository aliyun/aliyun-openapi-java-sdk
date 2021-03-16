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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcPerformanceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcPerformanceResponse.NcPerInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcPerformanceResponse.NcPerInfo.CpuException;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcPerformanceResponse.NcPerInfo.DiskException;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcPerformanceResponse.NcPerInfo.NetworkException;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryNcPerformanceResponseUnmarshaller {

	public static OpsQueryNcPerformanceResponse unmarshall(OpsQueryNcPerformanceResponse opsQueryNcPerformanceResponse, UnmarshallerContext _ctx) {
		

		NcPerInfo ncPerInfo = new NcPerInfo();

		List<CpuException> cpuExceptions = new ArrayList<CpuException>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions.Length"); i++) {
			CpuException cpuException = new CpuException();
			cpuException.setUnit(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].Unit"));
			cpuException.setSlsKey(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].SlsKey"));
			cpuException.setIsPrimary(_ctx.booleanValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].IsPrimary"));
			cpuException.setLevel(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].Level"));
			cpuException.setName(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].Name"));
			cpuException.setDescription(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].Description"));
			cpuException.setExceptionDesc(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].ExceptionDesc"));
			cpuException.setCategory(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].Category"));
			cpuException.setPerfValue(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.CpuExceptions["+ i +"].PerfValue"));

			cpuExceptions.add(cpuException);
		}
		ncPerInfo.setCpuExceptions(cpuExceptions);

		List<DiskException> diskExceptions = new ArrayList<DiskException>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions.Length"); i++) {
			DiskException diskException = new DiskException();
			diskException.setUnit(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].Unit"));
			diskException.setSlsKey(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].SlsKey"));
			diskException.setIsPrimary(_ctx.booleanValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].IsPrimary"));
			diskException.setLevel(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].Level"));
			diskException.setName(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].Name"));
			diskException.setDescription(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].Description"));
			diskException.setExceptionDesc(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].ExceptionDesc"));
			diskException.setCategory(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].Category"));
			diskException.setPerfValue(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.DiskExceptions["+ i +"].PerfValue"));

			diskExceptions.add(diskException);
		}
		ncPerInfo.setDiskExceptions(diskExceptions);

		List<NetworkException> networkExceptions = new ArrayList<NetworkException>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions.Length"); i++) {
			NetworkException networkException = new NetworkException();
			networkException.setUnit(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].Unit"));
			networkException.setSlsKey(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].SlsKey"));
			networkException.setIsPrimary(_ctx.booleanValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].IsPrimary"));
			networkException.setLevel(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].Level"));
			networkException.setName(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].Name"));
			networkException.setDescription(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].Description"));
			networkException.setExceptionDesc(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].ExceptionDesc"));
			networkException.setCategory(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].Category"));
			networkException.setPerfValue(_ctx.stringValue("OpsQueryNcPerformanceResponse.NcPerInfo.NetworkExceptions["+ i +"].PerfValue"));

			networkExceptions.add(networkException);
		}
		ncPerInfo.setNetworkExceptions(networkExceptions);
		opsQueryNcPerformanceResponse.setNcPerInfo(ncPerInfo);
	 
	 	return opsQueryNcPerformanceResponse;
	}
}