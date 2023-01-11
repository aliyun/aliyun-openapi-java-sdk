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

import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTask2Response;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTask2Response.Data;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTask2Response.Data.A;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTask2Response.Data.B;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectComputeTask2ResponseUnmarshaller {

	public static SelectComputeTask2Response unmarshall(SelectComputeTask2Response selectComputeTask2Response, UnmarshallerContext _ctx) {
		
		selectComputeTask2Response.setRequestId(_ctx.stringValue("SelectComputeTask2Response.RequestId"));
		selectComputeTask2Response.setMsg(_ctx.stringValue("SelectComputeTask2Response.Msg"));
		selectComputeTask2Response.setCode(_ctx.stringValue("SelectComputeTask2Response.Code"));
		selectComputeTask2Response.setSuccess(_ctx.booleanValue("SelectComputeTask2Response.Success"));

		Data data = new Data();
		data.setAppId(_ctx.longValue("SelectComputeTask2Response.Data.appId"));
		data.setBcId(_ctx.longValue("SelectComputeTask2Response.Data.bcId"));
		data.setComputeOssFileTitle(_ctx.stringValue("SelectComputeTask2Response.Data.computeOssFileTitle"));
		data.setDatasetIds(_ctx.stringValue("SelectComputeTask2Response.Data.datasetIds"));
		data.setFileNum(_ctx.longValue("SelectComputeTask2Response.Data.fileNum"));
		data.setName(_ctx.stringValue("SelectComputeTask2Response.Data.name"));
		data.setStatus(_ctx.stringValue("SelectComputeTask2Response.Data.status"));
		data.setRemarks(_ctx.stringValue("SelectComputeTask2Response.Data.remarks"));
		data.setExtInfo(_ctx.stringValue("SelectComputeTask2Response.Data.extInfo"));
		data.setHint(_ctx.stringValue("SelectComputeTask2Response.Data.hint"));

		List<A> taskResultList = new ArrayList<A>();
		for (int i = 0; i < _ctx.lengthValue("SelectComputeTask2Response.Data.taskResultList.Length"); i++) {
			A a = new A();
			a.setBcId(_ctx.longValue("SelectComputeTask2Response.Data.taskResultList["+ i +"].bcId"));
			a.setCode(_ctx.integerValue("SelectComputeTask2Response.Data.taskResultList["+ i +"].code"));
			a.setLineNum(_ctx.longValue("SelectComputeTask2Response.Data.taskResultList["+ i +"].lineNum"));

			taskResultList.add(a);
		}
		data.setTaskResultList(taskResultList);

		List<B> exportOssFileList = new ArrayList<B>();
		for (int i = 0; i < _ctx.lengthValue("SelectComputeTask2Response.Data.exportOssFileList.Length"); i++) {
			B b = new B();
			b.setDownLoadUrl(_ctx.stringValue("SelectComputeTask2Response.Data.exportOssFileList["+ i +"].downLoadUrl"));
			b.setPassword(_ctx.stringValue("SelectComputeTask2Response.Data.exportOssFileList["+ i +"].password"));

			exportOssFileList.add(b);
		}
		data.setExportOssFileList(exportOssFileList);
		selectComputeTask2Response.setData(data);
	 
	 	return selectComputeTask2Response;
	}
}