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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeStorageInstanceSubDbInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeStorageInstanceSubDbInfoResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeStorageInstanceSubDbInfoResponse.Data.SubDb;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageInstanceSubDbInfoResponseUnmarshaller {

	public static DescribeStorageInstanceSubDbInfoResponse unmarshall(DescribeStorageInstanceSubDbInfoResponse describeStorageInstanceSubDbInfoResponse, UnmarshallerContext _ctx) {
		
		describeStorageInstanceSubDbInfoResponse.setRequestId(_ctx.stringValue("DescribeStorageInstanceSubDbInfoResponse.RequestId"));
		describeStorageInstanceSubDbInfoResponse.setSuccess(_ctx.booleanValue("DescribeStorageInstanceSubDbInfoResponse.Success"));

		Data data = new Data();
		data.setRdsInstanceId(_ctx.stringValue("DescribeStorageInstanceSubDbInfoResponse.Data.RdsInstanceId"));
		data.setUse(_ctx.longValue("DescribeStorageInstanceSubDbInfoResponse.Data.Use"));
		data.setCapacity(_ctx.longValue("DescribeStorageInstanceSubDbInfoResponse.Data.Capacity"));
		data.setWarningLevel(_ctx.integerValue("DescribeStorageInstanceSubDbInfoResponse.Data.WarningLevel"));
		data.setTipsType(_ctx.integerValue("DescribeStorageInstanceSubDbInfoResponse.Data.TipsType"));

		List<SubDb> subDbList = new ArrayList<SubDb>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageInstanceSubDbInfoResponse.Data.SubDbList.Length"); i++) {
			SubDb subDb = new SubDb();
			subDb.setSubDbName(_ctx.stringValue("DescribeStorageInstanceSubDbInfoResponse.Data.SubDbList["+ i +"].SubDbName"));
			subDb.setUse(_ctx.longValue("DescribeStorageInstanceSubDbInfoResponse.Data.SubDbList["+ i +"].Use"));
			subDb.setWarningLevel(_ctx.integerValue("DescribeStorageInstanceSubDbInfoResponse.Data.SubDbList["+ i +"].WarningLevel"));

			subDbList.add(subDb);
		}
		data.setSubDbList(subDbList);
		describeStorageInstanceSubDbInfoResponse.setData(data);
	 
	 	return describeStorageInstanceSubDbInfoResponse;
	}
}