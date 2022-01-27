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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetRequestDiagnosisPageResponse;
import com.aliyuncs.das.model.v20200116.GetRequestDiagnosisPageResponse.Data;
import com.aliyuncs.das.model.v20200116.GetRequestDiagnosisPageResponse.Data.T;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRequestDiagnosisPageResponseUnmarshaller {

	public static GetRequestDiagnosisPageResponse unmarshall(GetRequestDiagnosisPageResponse getRequestDiagnosisPageResponse, UnmarshallerContext _ctx) {
		
		getRequestDiagnosisPageResponse.setRequestId(_ctx.stringValue("GetRequestDiagnosisPageResponse.RequestId"));
		getRequestDiagnosisPageResponse.setMessage(_ctx.stringValue("GetRequestDiagnosisPageResponse.Message"));
		getRequestDiagnosisPageResponse.setCode(_ctx.stringValue("GetRequestDiagnosisPageResponse.Code"));
		getRequestDiagnosisPageResponse.setSuccess(_ctx.stringValue("GetRequestDiagnosisPageResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("GetRequestDiagnosisPageResponse.Data.pageNo"));
		data.setPageSize(_ctx.longValue("GetRequestDiagnosisPageResponse.Data.pageSize"));
		data.setTotal(_ctx.longValue("GetRequestDiagnosisPageResponse.Data.total"));
		data.setExtra(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.extra"));

		List<T> list = new ArrayList<T>();
		for (int i = 0; i < _ctx.lengthValue("GetRequestDiagnosisPageResponse.Data.list.Length"); i++) {
			T t = new T();
			t.setMessageId(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].messageId"));
			t.setUuid(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].uuid"));
			t.setAccountId(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].accountId"));
			t.setSqlId(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].sqlId"));
			t.setEngine(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].engine"));
			t.setDbSchema(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].dbSchema"));
			t.setParam(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].param"));
			t.setState(_ctx.integerValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].state"));
			t.setResult(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].result"));
			t.setGmtCreate(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].gmtCreate"));
			t.setGmtModified(_ctx.stringValue("GetRequestDiagnosisPageResponse.Data.list["+ i +"].gmtModified"));

			list.add(t);
		}
		data.setList(list);
		getRequestDiagnosisPageResponse.setData(data);
	 
	 	return getRequestDiagnosisPageResponse;
	}
}