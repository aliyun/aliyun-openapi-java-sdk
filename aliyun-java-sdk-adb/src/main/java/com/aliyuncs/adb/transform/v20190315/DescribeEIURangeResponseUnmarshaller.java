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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeEIURangeResponse;
import com.aliyuncs.adb.model.v20190315.DescribeEIURangeResponse.EIUInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEIURangeResponseUnmarshaller {

	public static DescribeEIURangeResponse unmarshall(DescribeEIURangeResponse describeEIURangeResponse, UnmarshallerContext _ctx) {
		
		describeEIURangeResponse.setRequestId(_ctx.stringValue("DescribeEIURangeResponse.RequestId"));

		EIUInfo eIUInfo = new EIUInfo();
		eIUInfo.setDefaultValue(_ctx.stringValue("DescribeEIURangeResponse.EIUInfo.DefaultValue"));
		eIUInfo.setMinValue(_ctx.stringValue("DescribeEIURangeResponse.EIUInfo.MinValue"));
		eIUInfo.setMaxValue(_ctx.stringValue("DescribeEIURangeResponse.EIUInfo.MaxValue"));
		eIUInfo.setStep(_ctx.stringValue("DescribeEIURangeResponse.EIUInfo.Step"));

		List<Long> eIURange = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEIURangeResponse.EIUInfo.EIURange.Length"); i++) {
			eIURange.add(_ctx.longValue("DescribeEIURangeResponse.EIUInfo.EIURange["+ i +"]"));
		}
		eIUInfo.setEIURange(eIURange);

		List<String> storageResourceRange = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEIURangeResponse.EIUInfo.StorageResourceRange.Length"); i++) {
			storageResourceRange.add(_ctx.stringValue("DescribeEIURangeResponse.EIUInfo.StorageResourceRange["+ i +"]"));
		}
		eIUInfo.setStorageResourceRange(storageResourceRange);
		describeEIURangeResponse.setEIUInfo(eIUInfo);
	 
	 	return describeEIURangeResponse;
	}
}