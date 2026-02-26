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

import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTaskResponse;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTaskResponse.Data;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTaskResponse.Data.A;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectComputeTaskResponse.Data.B;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectComputeTaskResponseUnmarshaller {

	public static SelectComputeTaskResponse unmarshall(SelectComputeTaskResponse selectComputeTaskResponse, UnmarshallerContext _ctx) {
		
		selectComputeTaskResponse.setRequestId(_ctx.stringValue("SelectComputeTaskResponse.RequestId"));
		selectComputeTaskResponse.setMsg(_ctx.stringValue("SelectComputeTaskResponse.Msg"));
		selectComputeTaskResponse.setCode(_ctx.stringValue("SelectComputeTaskResponse.Code"));
		selectComputeTaskResponse.setSuccess(_ctx.booleanValue("SelectComputeTaskResponse.Success"));

		Data data = new Data();
		data.setAppId(_ctx.longValue("SelectComputeTaskResponse.Data.appId"));
		data.setBcId(_ctx.longValue("SelectComputeTaskResponse.Data.bcId"));
		data.setComputeOssFileTitle(_ctx.stringValue("SelectComputeTaskResponse.Data.computeOssFileTitle"));
		data.setDatasetIds(_ctx.stringValue("SelectComputeTaskResponse.Data.datasetIds"));
		data.setFileNum(_ctx.longValue("SelectComputeTaskResponse.Data.fileNum"));
		data.setName(_ctx.stringValue("SelectComputeTaskResponse.Data.name"));
		data.setStatus(_ctx.stringValue("SelectComputeTaskResponse.Data.status"));
		data.setRemarks(_ctx.stringValue("SelectComputeTaskResponse.Data.remarks"));
		data.setExtInfo(_ctx.stringValue("SelectComputeTaskResponse.Data.extInfo"));

		List<A> taskResultList = new ArrayList<A>();
		for (int i = 0; i < _ctx.lengthValue("SelectComputeTaskResponse.Data.taskResultList.Length"); i++) {
			A a = new A();
			a.setBcId(_ctx.longValue("SelectComputeTaskResponse.Data.taskResultList["+ i +"].bcId"));
			a.setCode(_ctx.integerValue("SelectComputeTaskResponse.Data.taskResultList["+ i +"].code"));
			a.setLineNum(_ctx.longValue("SelectComputeTaskResponse.Data.taskResultList["+ i +"].lineNum"));

			taskResultList.add(a);
		}
		data.setTaskResultList(taskResultList);

		List<B> exportOssFileList = new ArrayList<B>();
		for (int i = 0; i < _ctx.lengthValue("SelectComputeTaskResponse.Data.exportOssFileList.Length"); i++) {
			B b = new B();
			b.setDownLoadUrl(_ctx.stringValue("SelectComputeTaskResponse.Data.exportOssFileList["+ i +"].downLoadUrl"));
			b.setPassword(_ctx.stringValue("SelectComputeTaskResponse.Data.exportOssFileList["+ i +"].password"));

			exportOssFileList.add(b);
		}
		data.setExportOssFileList(exportOssFileList);
		selectComputeTaskResponse.setData(data);
	 
	 	return selectComputeTaskResponse;
	}
}