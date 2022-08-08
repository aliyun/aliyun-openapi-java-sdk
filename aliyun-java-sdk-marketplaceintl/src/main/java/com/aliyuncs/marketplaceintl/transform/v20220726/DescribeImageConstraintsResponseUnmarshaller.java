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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageConstraintsResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageConstraintsResponse.Data;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageConstraintsResponse.Data.Bandwidth;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageConstraintsResponse.Data.CpuMemoryRangeItem;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageConstraintsResponse.Data.DataDisk;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageConstraintsResponse.Data.SystemDisk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageConstraintsResponseUnmarshaller {

	public static DescribeImageConstraintsResponse unmarshall(DescribeImageConstraintsResponse describeImageConstraintsResponse, UnmarshallerContext _ctx) {
		
		describeImageConstraintsResponse.setRequestId(_ctx.stringValue("DescribeImageConstraintsResponse.RequestId"));
		describeImageConstraintsResponse.setErrorCode(_ctx.stringValue("DescribeImageConstraintsResponse.ErrorCode"));
		describeImageConstraintsResponse.setCode(_ctx.integerValue("DescribeImageConstraintsResponse.Code"));
		describeImageConstraintsResponse.setMsg(_ctx.stringValue("DescribeImageConstraintsResponse.Msg"));
		describeImageConstraintsResponse.setSuccess(_ctx.booleanValue("DescribeImageConstraintsResponse.Success"));

		Data data = new Data();
		data.setTrackId(_ctx.stringValue("DescribeImageConstraintsResponse.Data.TrackId"));

		Bandwidth bandwidth = new Bandwidth();
		bandwidth.setMin(_ctx.integerValue("DescribeImageConstraintsResponse.Data.Bandwidth.Min"));
		bandwidth.setMax(_ctx.integerValue("DescribeImageConstraintsResponse.Data.Bandwidth.Max"));
		bandwidth.setStep(_ctx.integerValue("DescribeImageConstraintsResponse.Data.Bandwidth.Step"));
		bandwidth.setUnit(_ctx.stringValue("DescribeImageConstraintsResponse.Data.Bandwidth.Unit"));
		data.setBandwidth(bandwidth);

		SystemDisk systemDisk = new SystemDisk();
		systemDisk.setMin(_ctx.integerValue("DescribeImageConstraintsResponse.Data.SystemDisk.Min"));
		systemDisk.setMax(_ctx.integerValue("DescribeImageConstraintsResponse.Data.SystemDisk.Max"));
		systemDisk.setStep(_ctx.integerValue("DescribeImageConstraintsResponse.Data.SystemDisk.Step"));
		systemDisk.setUnit(_ctx.stringValue("DescribeImageConstraintsResponse.Data.SystemDisk.Unit"));
		data.setSystemDisk(systemDisk);

		DataDisk dataDisk = new DataDisk();
		dataDisk.setMin(_ctx.integerValue("DescribeImageConstraintsResponse.Data.DataDisk.Min"));
		dataDisk.setMax(_ctx.integerValue("DescribeImageConstraintsResponse.Data.DataDisk.Max"));
		dataDisk.setStep(_ctx.integerValue("DescribeImageConstraintsResponse.Data.DataDisk.Step"));
		dataDisk.setUnit(_ctx.stringValue("DescribeImageConstraintsResponse.Data.DataDisk.Unit"));
		data.setDataDisk(dataDisk);

		List<CpuMemoryRangeItem> cpuMemoryRange = new ArrayList<CpuMemoryRangeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageConstraintsResponse.Data.CpuMemoryRange.Length"); i++) {
			CpuMemoryRangeItem cpuMemoryRangeItem = new CpuMemoryRangeItem();
			cpuMemoryRangeItem.setCpuCoreCount(_ctx.integerValue("DescribeImageConstraintsResponse.Data.CpuMemoryRange["+ i +"].CpuCoreCount"));

			List<Float> memorySizeList = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageConstraintsResponse.Data.CpuMemoryRange["+ i +"].MemorySizeList.Length"); j++) {
				memorySizeList.add(_ctx.floatValue("DescribeImageConstraintsResponse.Data.CpuMemoryRange["+ i +"].MemorySizeList["+ j +"]"));
			}
			cpuMemoryRangeItem.setMemorySizeList(memorySizeList);

			cpuMemoryRange.add(cpuMemoryRangeItem);
		}
		data.setCpuMemoryRange(cpuMemoryRange);
		describeImageConstraintsResponse.setData(data);
	 
	 	return describeImageConstraintsResponse;
	}
}