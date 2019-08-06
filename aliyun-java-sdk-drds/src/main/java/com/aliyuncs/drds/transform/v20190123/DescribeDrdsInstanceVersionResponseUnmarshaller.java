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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceVersionResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceVersionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceVersionResponseUnmarshaller {

	public static DescribeDrdsInstanceVersionResponse unmarshall(DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersionResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstanceVersionResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstanceVersionResponse.RequestId"));
		describeDrdsInstanceVersionResponse.setSuccess(_ctx.booleanValue("DescribeDrdsInstanceVersionResponse.Success"));

		Data data = new Data();
		data.setInstanceVersion(_ctx.stringValue("DescribeDrdsInstanceVersionResponse.Data.InstanceVersion"));
		data.setNewestVersion(_ctx.stringValue("DescribeDrdsInstanceVersionResponse.Data.NewestVersion"));
		describeDrdsInstanceVersionResponse.setData(data);
	 
	 	return describeDrdsInstanceVersionResponse;
	}
}