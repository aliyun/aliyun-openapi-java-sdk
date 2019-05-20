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

package com.aliyuncs.yundun_ds.transform.v20190103;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeDepartTotalCountResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDepartTotalCountResponse.DepartCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDepartTotalCountResponseUnmarshaller {

	public static DescribeDepartTotalCountResponse unmarshall(DescribeDepartTotalCountResponse describeDepartTotalCountResponse, UnmarshallerContext context) {
		
		describeDepartTotalCountResponse.setRequestId(context.stringValue("DescribeDepartTotalCountResponse.RequestId"));

		DepartCount departCount = new DepartCount();
		departCount.setDepartCount(context.longValue("DescribeDepartTotalCountResponse.DepartCount.DepartCount"));
		departCount.setCount(context.longValue("DescribeDepartTotalCountResponse.DepartCount.Count"));
		departCount.setUserCount(context.longValue("DescribeDepartTotalCountResponse.DepartCount.UserCount"));
		departCount.setDtCount(context.longValue("DescribeDepartTotalCountResponse.DepartCount.DtCount"));
		departCount.setSubCount(context.longValue("DescribeDepartTotalCountResponse.DepartCount.SubCount"));
		departCount.setSensitiveCount(context.longValue("DescribeDepartTotalCountResponse.DepartCount.SensitiveCount"));
		describeDepartTotalCountResponse.setDepartCount(departCount);
	 
	 	return describeDepartTotalCountResponse;
	}
}