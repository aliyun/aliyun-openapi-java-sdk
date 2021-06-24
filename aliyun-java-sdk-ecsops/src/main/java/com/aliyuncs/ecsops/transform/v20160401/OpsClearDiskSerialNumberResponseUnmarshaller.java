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

import com.aliyuncs.ecsops.model.v20160401.OpsClearDiskSerialNumberResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsClearDiskSerialNumberResponse.FailedDisk;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsClearDiskSerialNumberResponseUnmarshaller {

	public static OpsClearDiskSerialNumberResponse unmarshall(OpsClearDiskSerialNumberResponse opsClearDiskSerialNumberResponse, UnmarshallerContext _ctx) {
		
		opsClearDiskSerialNumberResponse.setRequestId(_ctx.stringValue("OpsClearDiskSerialNumberResponse.RequestId"));
		opsClearDiskSerialNumberResponse.setTotalCount(_ctx.integerValue("OpsClearDiskSerialNumberResponse.TotalCount"));

		List<FailedDisk> failedDiskList = new ArrayList<FailedDisk>();
		for (int i = 0; i < _ctx.lengthValue("OpsClearDiskSerialNumberResponse.FailedDiskList.Length"); i++) {
			FailedDisk failedDisk = new FailedDisk();
			failedDisk.setCode(_ctx.stringValue("OpsClearDiskSerialNumberResponse.FailedDiskList["+ i +"].Code"));
			failedDisk.setMessage(_ctx.stringValue("OpsClearDiskSerialNumberResponse.FailedDiskList["+ i +"].Message"));
			failedDisk.setDiskId(_ctx.stringValue("OpsClearDiskSerialNumberResponse.FailedDiskList["+ i +"].DiskId"));

			failedDiskList.add(failedDisk);
		}
		opsClearDiskSerialNumberResponse.setFailedDiskList(failedDiskList);
	 
	 	return opsClearDiskSerialNumberResponse;
	}
}