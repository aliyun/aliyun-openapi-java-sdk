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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DoQuickFieldResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DoQuickFieldResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoQuickFieldResponseUnmarshaller {

	public static DoQuickFieldResponse unmarshall(DoQuickFieldResponse doQuickFieldResponse, UnmarshallerContext _ctx) {
		
		doQuickFieldResponse.setRequestId(_ctx.stringValue("DoQuickFieldResponse.RequestId"));
		doQuickFieldResponse.setSuccess(_ctx.booleanValue("DoQuickFieldResponse.Success"));
		doQuickFieldResponse.setCode(_ctx.integerValue("DoQuickFieldResponse.Code"));
		doQuickFieldResponse.setMessage(_ctx.stringValue("DoQuickFieldResponse.Message"));
		doQuickFieldResponse.setErrCode(_ctx.stringValue("DoQuickFieldResponse.ErrCode"));
		doQuickFieldResponse.setDyCode(_ctx.stringValue("DoQuickFieldResponse.DyCode"));
		doQuickFieldResponse.setDyMessage(_ctx.stringValue("DoQuickFieldResponse.DyMessage"));

		Data data = new Data();
		data.setQueryMode(_ctx.integerValue("DoQuickFieldResponse.Data.QueryMode"));
		data.setLimited(_ctx.longValue("DoQuickFieldResponse.Data.Limited"));
		data.setCount(_ctx.integerValue("DoQuickFieldResponse.Data.Count"));
		data.setHasSQL(_ctx.booleanValue("DoQuickFieldResponse.Data.HasSQL"));
		data.setWhereQuery(_ctx.stringValue("DoQuickFieldResponse.Data.WhereQuery"));
		data.setPQuery(_ctx.stringValue("DoQuickFieldResponse.Data.PQuery"));
		data.setProcessedRows(_ctx.longValue("DoQuickFieldResponse.Data.ProcessedRows"));
		data.setCompleteOrNot(_ctx.booleanValue("DoQuickFieldResponse.Data.CompleteOrNot"));
		data.setAggQueryd(_ctx.stringValue("DoQuickFieldResponse.Data.AggQueryd"));

		List<String> keys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DoQuickFieldResponse.Data.Keys.Length"); i++) {
			keys.add(_ctx.stringValue("DoQuickFieldResponse.Data.Keys["+ i +"]"));
		}
		data.setKeys(keys);

		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DoQuickFieldResponse.Data.Logs.Length"); i++) {
			logs.add(_ctx.stringValue("DoQuickFieldResponse.Data.Logs["+ i +"]"));
		}
		data.setLogs(logs);
		doQuickFieldResponse.setData(data);
	 
	 	return doQuickFieldResponse;
	}
}