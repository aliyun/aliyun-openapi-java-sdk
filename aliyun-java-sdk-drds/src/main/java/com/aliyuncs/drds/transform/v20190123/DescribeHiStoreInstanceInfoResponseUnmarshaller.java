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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeHiStoreInstanceInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeHiStoreInstanceInfoResponse.HiStoreInstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHiStoreInstanceInfoResponseUnmarshaller {

	public static DescribeHiStoreInstanceInfoResponse unmarshall(DescribeHiStoreInstanceInfoResponse describeHiStoreInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		describeHiStoreInstanceInfoResponse.setRequestId(_ctx.stringValue("DescribeHiStoreInstanceInfoResponse.RequestId"));
		describeHiStoreInstanceInfoResponse.setSuccess(_ctx.booleanValue("DescribeHiStoreInstanceInfoResponse.Success"));

		HiStoreInstanceInfo hiStoreInstanceInfo = new HiStoreInstanceInfo();
		hiStoreInstanceInfo.setHistoreInstanceId(_ctx.stringValue("DescribeHiStoreInstanceInfoResponse.HiStoreInstanceInfo.HistoreInstanceId"));
		hiStoreInstanceInfo.setGmtCreate(_ctx.longValue("DescribeHiStoreInstanceInfoResponse.HiStoreInstanceInfo.GmtCreate"));
		hiStoreInstanceInfo.setRpmVersion(_ctx.stringValue("DescribeHiStoreInstanceInfoResponse.HiStoreInstanceInfo.RpmVersion"));
		hiStoreInstanceInfo.setDiskSize(_ctx.integerValue("DescribeHiStoreInstanceInfoResponse.HiStoreInstanceInfo.DiskSize"));
		hiStoreInstanceInfo.setMachineSpec(_ctx.stringValue("DescribeHiStoreInstanceInfoResponse.HiStoreInstanceInfo.MachineSpec"));
		describeHiStoreInstanceInfoResponse.setHiStoreInstanceInfo(hiStoreInstanceInfo);
	 
	 	return describeHiStoreInstanceInfoResponse;
	}
}