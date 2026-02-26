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

import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTask2Response;
import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTask2Response.Data;
import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTask2Response.Data.A;
import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTask2Response.Data.A.B;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComputeTask2ResponseUnmarshaller {

	public static ListComputeTask2Response unmarshall(ListComputeTask2Response listComputeTask2Response, UnmarshallerContext _ctx) {
		
		listComputeTask2Response.setRequestId(_ctx.stringValue("ListComputeTask2Response.RequestId"));
		listComputeTask2Response.setMsg(_ctx.stringValue("ListComputeTask2Response.Msg"));
		listComputeTask2Response.setCode(_ctx.stringValue("ListComputeTask2Response.Code"));
		listComputeTask2Response.setSuccess(_ctx.booleanValue("ListComputeTask2Response.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("ListComputeTask2Response.Data.totalNum"));

		List<A> data1 = new ArrayList<A>();
		for (int i = 0; i < _ctx.lengthValue("ListComputeTask2Response.Data.data.Length"); i++) {
			A a = new A();
			a.setAppId(_ctx.longValue("ListComputeTask2Response.Data.data["+ i +"].appId"));
			a.setBcId(_ctx.longValue("ListComputeTask2Response.Data.data["+ i +"].bcId"));
			a.setComputeOssFileTitle(_ctx.stringValue("ListComputeTask2Response.Data.data["+ i +"].computeOssFileTitle"));
			a.setDatasetIds(_ctx.stringValue("ListComputeTask2Response.Data.data["+ i +"].datasetIds"));
			a.setFileNum(_ctx.longValue("ListComputeTask2Response.Data.data["+ i +"].fileNum"));
			a.setName(_ctx.stringValue("ListComputeTask2Response.Data.data["+ i +"].name"));
			a.setStatus(_ctx.stringValue("ListComputeTask2Response.Data.data["+ i +"].status"));
			a.setRemarks(_ctx.stringValue("ListComputeTask2Response.Data.data["+ i +"].remarks"));
			a.setExtInfo(_ctx.stringValue("ListComputeTask2Response.Data.data["+ i +"].extInfo"));

			List<B> taskResultList = new ArrayList<B>();
			for (int j = 0; j < _ctx.lengthValue("ListComputeTask2Response.Data.data["+ i +"].taskResultList.Length"); j++) {
				B b = new B();
				b.setBcId(_ctx.longValue("ListComputeTask2Response.Data.data["+ i +"].taskResultList["+ j +"].bcId"));
				b.setCode(_ctx.integerValue("ListComputeTask2Response.Data.data["+ i +"].taskResultList["+ j +"].code"));
				b.setLineNum(_ctx.longValue("ListComputeTask2Response.Data.data["+ i +"].taskResultList["+ j +"].lineNum"));

				taskResultList.add(b);
			}
			a.setTaskResultList(taskResultList);

			data1.add(a);
		}
		data.setData(data1);
		listComputeTask2Response.setData(data);
	 
	 	return listComputeTask2Response;
	}
}