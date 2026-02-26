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

import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTaskResponse;
import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTaskResponse.A;
import com.aliyuncs.umeng_finplus.model.v20220913.ListComputeTaskResponse.A.B;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComputeTaskResponseUnmarshaller {

	public static ListComputeTaskResponse unmarshall(ListComputeTaskResponse listComputeTaskResponse, UnmarshallerContext _ctx) {
		
		listComputeTaskResponse.setRequestId(_ctx.stringValue("ListComputeTaskResponse.RequestId"));
		listComputeTaskResponse.setMsg(_ctx.stringValue("ListComputeTaskResponse.Msg"));
		listComputeTaskResponse.setCode(_ctx.stringValue("ListComputeTaskResponse.Code"));
		listComputeTaskResponse.setSuccess(_ctx.booleanValue("ListComputeTaskResponse.Success"));

		List<A> data = new ArrayList<A>();
		for (int i = 0; i < _ctx.lengthValue("ListComputeTaskResponse.Data.Length"); i++) {
			A a = new A();
			a.setAppId(_ctx.longValue("ListComputeTaskResponse.Data["+ i +"].appId"));
			a.setBcId(_ctx.longValue("ListComputeTaskResponse.Data["+ i +"].bcId"));
			a.setComputeOssFileTitle(_ctx.stringValue("ListComputeTaskResponse.Data["+ i +"].computeOssFileTitle"));
			a.setDatasetIds(_ctx.stringValue("ListComputeTaskResponse.Data["+ i +"].datasetIds"));
			a.setFileNum(_ctx.longValue("ListComputeTaskResponse.Data["+ i +"].fileNum"));
			a.setName(_ctx.stringValue("ListComputeTaskResponse.Data["+ i +"].name"));
			a.setStatus(_ctx.stringValue("ListComputeTaskResponse.Data["+ i +"].status"));
			a.setRemarks(_ctx.stringValue("ListComputeTaskResponse.Data["+ i +"].remarks"));
			a.setExtInfo(_ctx.stringValue("ListComputeTaskResponse.Data["+ i +"].extInfo"));

			List<B> taskResultList = new ArrayList<B>();
			for (int j = 0; j < _ctx.lengthValue("ListComputeTaskResponse.Data["+ i +"].taskResultList.Length"); j++) {
				B b = new B();
				b.setBcId(_ctx.longValue("ListComputeTaskResponse.Data["+ i +"].taskResultList["+ j +"].bcId"));
				b.setCode(_ctx.integerValue("ListComputeTaskResponse.Data["+ i +"].taskResultList["+ j +"].code"));
				b.setLineNum(_ctx.longValue("ListComputeTaskResponse.Data["+ i +"].taskResultList["+ j +"].lineNum"));

				taskResultList.add(b);
			}
			a.setTaskResultList(taskResultList);

			data.add(a);
		}
		listComputeTaskResponse.setData(data);
	 
	 	return listComputeTaskResponse;
	}
}