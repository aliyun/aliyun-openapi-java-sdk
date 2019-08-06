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

import com.aliyuncs.drds.model.v20190123.DescribeHotDbListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeHotDbListResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeHotDbListResponse.Data.InstanceDb;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHotDbListResponseUnmarshaller {

	public static DescribeHotDbListResponse unmarshall(DescribeHotDbListResponse describeHotDbListResponse, UnmarshallerContext _ctx) {
		
		describeHotDbListResponse.setRequestId(_ctx.stringValue("DescribeHotDbListResponse.RequestId"));
		describeHotDbListResponse.setSuccess(_ctx.booleanValue("DescribeHotDbListResponse.Success"));
		describeHotDbListResponse.setMsg(_ctx.stringValue("DescribeHotDbListResponse.Msg"));

		Data data = new Data();
		data.setRandomCode(_ctx.stringValue("DescribeHotDbListResponse.Data.RandomCode"));

		List<InstanceDb> list = new ArrayList<InstanceDb>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHotDbListResponse.Data.List.Length"); i++) {
			InstanceDb instanceDb = new InstanceDb();
			instanceDb.setInstanceName(_ctx.stringValue("DescribeHotDbListResponse.Data.List["+ i +"].InstanceName"));

			List<String> hotDbList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHotDbListResponse.Data.List["+ i +"].HotDbList.Length"); j++) {
				hotDbList.add(_ctx.stringValue("DescribeHotDbListResponse.Data.List["+ i +"].HotDbList["+ j +"]"));
			}
			instanceDb.setHotDbList(hotDbList);

			list.add(instanceDb);
		}
		data.setList(list);
		describeHotDbListResponse.setData(data);
	 
	 	return describeHotDbListResponse;
	}
}