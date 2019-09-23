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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeTempInstanceResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeTempInstanceResponse.TempInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTempInstanceResponseUnmarshaller {

	public static DescribeTempInstanceResponse unmarshall(DescribeTempInstanceResponse describeTempInstanceResponse, UnmarshallerContext _ctx) {
		
		describeTempInstanceResponse.setRequestId(_ctx.stringValue("DescribeTempInstanceResponse.RequestId"));

		List<TempInstance> tempInstances = new ArrayList<TempInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTempInstanceResponse.TempInstances.Length"); i++) {
			TempInstance tempInstance = new TempInstance();
			tempInstance.setInstanceId(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].InstanceId"));
			tempInstance.setTempInstanceId(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].TempInstanceId"));
			tempInstance.setSnapshotId(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].SnapshotId"));
			tempInstance.setCreateTime(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].CreateTime"));
			tempInstance.setDomain(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].Domain"));
			tempInstance.setStatus(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].Status"));
			tempInstance.setMemory(_ctx.longValue("DescribeTempInstanceResponse.TempInstances["+ i +"].Memory"));
			tempInstance.setExpireTime(_ctx.stringValue("DescribeTempInstanceResponse.TempInstances["+ i +"].ExpireTime"));

			tempInstances.add(tempInstance);
		}
		describeTempInstanceResponse.setTempInstances(tempInstances);
	 
	 	return describeTempInstanceResponse;
	}
}