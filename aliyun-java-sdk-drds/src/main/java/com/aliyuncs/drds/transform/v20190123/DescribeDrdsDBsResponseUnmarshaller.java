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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDBsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDBsResponse.Db;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDBsResponseUnmarshaller {

	public static DescribeDrdsDBsResponse unmarshall(DescribeDrdsDBsResponse describeDrdsDBsResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDBsResponse.setRequestId(_ctx.stringValue("DescribeDrdsDBsResponse.RequestId"));
		describeDrdsDBsResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDBsResponse.Success"));
		describeDrdsDBsResponse.setPageNumber(_ctx.stringValue("DescribeDrdsDBsResponse.PageNumber"));
		describeDrdsDBsResponse.setPageSize(_ctx.stringValue("DescribeDrdsDBsResponse.PageSize"));
		describeDrdsDBsResponse.setTotal(_ctx.stringValue("DescribeDrdsDBsResponse.Total"));

		List<Db> data = new ArrayList<Db>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDBsResponse.Data.Length"); i++) {
			Db db = new Db();
			db.setDbName(_ctx.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].DbName"));
			db.setStatus(_ctx.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].Status"));
			db.setCreateTime(_ctx.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].CreateTime"));
			db.setMode(_ctx.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].Mode"));
			db.setSchema(_ctx.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].Schema"));
			db.setDbInstType(_ctx.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].DbInstType"));

			data.add(db);
		}
		describeDrdsDBsResponse.setData(data);
	 
	 	return describeDrdsDBsResponse;
	}
}