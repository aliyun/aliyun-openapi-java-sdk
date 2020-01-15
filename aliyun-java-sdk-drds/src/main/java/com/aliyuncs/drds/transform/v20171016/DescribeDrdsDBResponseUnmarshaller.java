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

package com.aliyuncs.drds.transform.v20171016;

import com.aliyuncs.drds.model.v20171016.DescribeDrdsDBResponse;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsDBResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDBResponseUnmarshaller {

	public static DescribeDrdsDBResponse unmarshall(DescribeDrdsDBResponse describeDrdsDBResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDBResponse.setRequestId(_ctx.stringValue("DescribeDrdsDBResponse.RequestId"));
		describeDrdsDBResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDBResponse.Success"));

		Data data = new Data();
		data.setDbName(_ctx.stringValue("DescribeDrdsDBResponse.Data.DbName"));
		data.setStatus(_ctx.integerValue("DescribeDrdsDBResponse.Data.Status"));
		data.setCreateTime(_ctx.stringValue("DescribeDrdsDBResponse.Data.CreateTime"));
		data.setMsg(_ctx.stringValue("DescribeDrdsDBResponse.Data.Msg"));
		data.setMode(_ctx.stringValue("DescribeDrdsDBResponse.Data.Mode"));
		describeDrdsDBResponse.setData(data);
	 
	 	return describeDrdsDBResponse;
	}
}