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

package com.aliyuncs.umeng_finplus.transform.v20220913;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.umeng_finplus.model.v20220913.ListDataSet2Response;
import com.aliyuncs.umeng_finplus.model.v20220913.ListDataSet2Response.Data;
import com.aliyuncs.umeng_finplus.model.v20220913.ListDataSet2Response.Data.A;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSet2ResponseUnmarshaller {

	public static ListDataSet2Response unmarshall(ListDataSet2Response listDataSet2Response, UnmarshallerContext _ctx) {
		
		listDataSet2Response.setRequestId(_ctx.stringValue("ListDataSet2Response.RequestId"));
		listDataSet2Response.setMsg(_ctx.stringValue("ListDataSet2Response.Msg"));
		listDataSet2Response.setCode(_ctx.stringValue("ListDataSet2Response.Code"));
		listDataSet2Response.setSuccess(_ctx.booleanValue("ListDataSet2Response.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("ListDataSet2Response.Data.totalNum"));

		List<A> data1 = new ArrayList<A>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSet2Response.Data.data.Length"); i++) {
			A a = new A();
			a.setName(_ctx.stringValue("ListDataSet2Response.Data.data["+ i +"].name"));
			a.setLineNum(_ctx.longValue("ListDataSet2Response.Data.data["+ i +"].lineNum"));
			a.setStatus(_ctx.stringValue("ListDataSet2Response.Data.data["+ i +"].status"));
			a.setType(_ctx.stringValue("ListDataSet2Response.Data.data["+ i +"].type"));
			a.setDatasetId(_ctx.longValue("ListDataSet2Response.Data.data["+ i +"].datasetId"));
			a.setCreateTime(_ctx.stringValue("ListDataSet2Response.Data.data["+ i +"].createTime"));

			data1.add(a);
		}
		data.setData(data1);
		listDataSet2Response.setData(data);
	 
	 	return listDataSet2Response;
	}
}