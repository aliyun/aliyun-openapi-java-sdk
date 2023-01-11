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

import com.aliyuncs.umeng_finplus.model.v20220913.ListDataSetResponse;
import com.aliyuncs.umeng_finplus.model.v20220913.ListDataSetResponse.A;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSetResponseUnmarshaller {

	public static ListDataSetResponse unmarshall(ListDataSetResponse listDataSetResponse, UnmarshallerContext _ctx) {
		
		listDataSetResponse.setRequestId(_ctx.stringValue("ListDataSetResponse.RequestId"));
		listDataSetResponse.setMsg(_ctx.stringValue("ListDataSetResponse.Msg"));
		listDataSetResponse.setCode(_ctx.stringValue("ListDataSetResponse.Code"));
		listDataSetResponse.setSuccess(_ctx.booleanValue("ListDataSetResponse.Success"));

		List<A> data = new ArrayList<A>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSetResponse.Data.Length"); i++) {
			A a = new A();
			a.setName(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].name"));
			a.setLineNum(_ctx.longValue("ListDataSetResponse.Data["+ i +"].lineNum"));
			a.setStatus(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].status"));
			a.setType(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].type"));
			a.setDatasetId(_ctx.longValue("ListDataSetResponse.Data["+ i +"].datasetId"));
			a.setCreateTime(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].createTime"));

			data.add(a);
		}
		listDataSetResponse.setData(data);
	 
	 	return listDataSetResponse;
	}
}