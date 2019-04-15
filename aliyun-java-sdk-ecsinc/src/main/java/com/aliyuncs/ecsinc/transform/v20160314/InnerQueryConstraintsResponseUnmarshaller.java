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

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.Cpu;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.DataDisk;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.EniQuantity;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.GpuAmount;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.InstanceTypeFamily;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.Mem;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.SysDisk;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.TcpPortRange;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryConstraintsResponse.ImageConstraintsModel.UdpPortRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryConstraintsResponseUnmarshaller {

	public static InnerQueryConstraintsResponse unmarshall(InnerQueryConstraintsResponse innerQueryConstraintsResponse, UnmarshallerContext context) {
		
		innerQueryConstraintsResponse.setRequestId(context.stringValue("InnerQueryConstraintsResponse.RequestId"));
		innerQueryConstraintsResponse.setSuccess(context.booleanValue("InnerQueryConstraintsResponse.Success"));
		innerQueryConstraintsResponse.setCode(context.stringValue("InnerQueryConstraintsResponse.Code"));
		innerQueryConstraintsResponse.setMessage(context.stringValue("InnerQueryConstraintsResponse.Message"));
		innerQueryConstraintsResponse.setEntityType(context.stringValue("InnerQueryConstraintsResponse.EntityType"));
		innerQueryConstraintsResponse.setEntityKey(context.stringValue("InnerQueryConstraintsResponse.EntityKey"));

		ImageConstraintsModel imageConstraintsModel = new ImageConstraintsModel();
		imageConstraintsModel.setImageId(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.ImageId"));
		imageConstraintsModel.setSupportIoOptimized(context.booleanValue("InnerQueryConstraintsResponse.ImageConstraintsModel.SupportIoOptimized"));
		imageConstraintsModel.setNetworkType(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.NetworkType"));

		Cpu cpu = new Cpu();
		cpu.setMinValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.Cpu.MinValue"));
		cpu.setMaxValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.Cpu.MaxValue"));
		imageConstraintsModel.setCpu(cpu);

		Mem mem = new Mem();
		mem.setMinValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.Mem.MinValue"));
		mem.setMaxValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.Mem.MaxValue"));
		imageConstraintsModel.setMem(mem);

		SysDisk sysDisk = new SysDisk();
		sysDisk.setMinValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.SysDisk.MinValue"));
		sysDisk.setMaxValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.SysDisk.MaxValue"));
		imageConstraintsModel.setSysDisk(sysDisk);

		DataDisk dataDisk = new DataDisk();
		dataDisk.setMinValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.DataDisk.MinValue"));
		dataDisk.setMaxValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.DataDisk.MaxValue"));
		imageConstraintsModel.setDataDisk(dataDisk);

		InstanceTypeFamily instanceTypeFamily = new InstanceTypeFamily();

		List<String> includeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryConstraintsResponse.ImageConstraintsModel.InstanceTypeFamily.IncludeList.Length"); i++) {
			includeList.add(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.InstanceTypeFamily.IncludeList["+ i +"]"));
		}
		instanceTypeFamily.setIncludeList(includeList);

		List<String> excludeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryConstraintsResponse.ImageConstraintsModel.InstanceTypeFamily.ExcludeList.Length"); i++) {
			excludeList.add(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.InstanceTypeFamily.ExcludeList["+ i +"]"));
		}
		instanceTypeFamily.setExcludeList(excludeList);
		imageConstraintsModel.setInstanceTypeFamily(instanceTypeFamily);

		GpuAmount gpuAmount = new GpuAmount();
		gpuAmount.setMinValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.GpuAmount.MinValue"));
		gpuAmount.setMaxValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.GpuAmount.MaxValue"));
		imageConstraintsModel.setGpuAmount(gpuAmount);

		EniQuantity eniQuantity = new EniQuantity();
		eniQuantity.setMinValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.EniQuantity.MinValue"));
		eniQuantity.setMaxValue(context.longValue("InnerQueryConstraintsResponse.ImageConstraintsModel.EniQuantity.MaxValue"));
		imageConstraintsModel.setEniQuantity(eniQuantity);

		TcpPortRange tcpPortRange = new TcpPortRange();

		List<String> includeList1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryConstraintsResponse.ImageConstraintsModel.TcpPortRange.IncludeList.Length"); i++) {
			includeList1.add(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.TcpPortRange.IncludeList["+ i +"]"));
		}
		tcpPortRange.setIncludeList1(includeList1);

		List<String> excludeList2 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryConstraintsResponse.ImageConstraintsModel.TcpPortRange.ExcludeList.Length"); i++) {
			excludeList2.add(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.TcpPortRange.ExcludeList["+ i +"]"));
		}
		tcpPortRange.setExcludeList2(excludeList2);
		imageConstraintsModel.setTcpPortRange(tcpPortRange);

		UdpPortRange udpPortRange = new UdpPortRange();

		List<String> includeList3 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryConstraintsResponse.ImageConstraintsModel.UdpPortRange.IncludeList.Length"); i++) {
			includeList3.add(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.UdpPortRange.IncludeList["+ i +"]"));
		}
		udpPortRange.setIncludeList3(includeList3);

		List<String> excludeList4 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryConstraintsResponse.ImageConstraintsModel.UdpPortRange.ExcludeList.Length"); i++) {
			excludeList4.add(context.stringValue("InnerQueryConstraintsResponse.ImageConstraintsModel.UdpPortRange.ExcludeList["+ i +"]"));
		}
		udpPortRange.setExcludeList4(excludeList4);
		imageConstraintsModel.setUdpPortRange(udpPortRange);
		innerQueryConstraintsResponse.setImageConstraintsModel(imageConstraintsModel);
	 
	 	return innerQueryConstraintsResponse;
	}
}