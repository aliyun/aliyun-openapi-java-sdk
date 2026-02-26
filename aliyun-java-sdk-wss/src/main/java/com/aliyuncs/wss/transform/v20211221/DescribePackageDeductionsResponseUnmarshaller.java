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

package com.aliyuncs.wss.transform.v20211221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wss.model.v20211221.DescribePackageDeductionsResponse;
import com.aliyuncs.wss.model.v20211221.DescribePackageDeductionsResponse.Deduction;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePackageDeductionsResponseUnmarshaller {

	public static DescribePackageDeductionsResponse unmarshall(DescribePackageDeductionsResponse describePackageDeductionsResponse, UnmarshallerContext _ctx) {
		
		describePackageDeductionsResponse.setRequestId(_ctx.stringValue("DescribePackageDeductionsResponse.RequestId"));
		describePackageDeductionsResponse.setPageNum(_ctx.integerValue("DescribePackageDeductionsResponse.PageNum"));
		describePackageDeductionsResponse.setPageSize(_ctx.integerValue("DescribePackageDeductionsResponse.PageSize"));
		describePackageDeductionsResponse.setTotalCount(_ctx.longValue("DescribePackageDeductionsResponse.TotalCount"));
		describePackageDeductionsResponse.setTotalUsedTime(_ctx.longValue("DescribePackageDeductionsResponse.TotalUsedTime"));
		describePackageDeductionsResponse.setTotalUsedCoreTime(_ctx.floatValue("DescribePackageDeductionsResponse.TotalUsedCoreTime"));

		List<Deduction> deductions = new ArrayList<Deduction>();
		for (int i = 0; i < _ctx.lengthValue("DescribePackageDeductionsResponse.Deductions.Length"); i++) {
			Deduction deduction = new Deduction();
			deduction.setDesktopName(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].DesktopName"));
			deduction.setDesktopId(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].DesktopId"));
			deduction.setRegionId(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].RegionId"));
			deduction.setDesktopType(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].DesktopType"));
			deduction.setOsType(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].OsType"));
			deduction.setStaTime(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].StaTime"));
			deduction.setEndTime(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].EndTime"));
			deduction.setResourceType(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].ResourceType"));
			deduction.setUsedTime(_ctx.longValue("DescribePackageDeductionsResponse.Deductions["+ i +"].UsedTime"));
			deduction.setUsedCoreTime(_ctx.floatValue("DescribePackageDeductionsResponse.Deductions["+ i +"].UsedCoreTime"));
			deduction.setInstanceState(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].InstanceState"));
			deduction.setMemory(_ctx.longValue("DescribePackageDeductionsResponse.Deductions["+ i +"].Memory"));
			deduction.setCpu(_ctx.integerValue("DescribePackageDeductionsResponse.Deductions["+ i +"].Cpu"));
			deduction.setGpu(_ctx.stringValue("DescribePackageDeductionsResponse.Deductions["+ i +"].Gpu"));

			deductions.add(deduction);
		}
		describePackageDeductionsResponse.setDeductions(deductions);
	 
	 	return describePackageDeductionsResponse;
	}
}