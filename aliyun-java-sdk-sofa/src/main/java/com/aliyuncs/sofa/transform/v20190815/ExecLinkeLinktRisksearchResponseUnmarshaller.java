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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktRisksearchResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktRisksearchResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktRisksearchResponseUnmarshaller {

	public static ExecLinkeLinktRisksearchResponse unmarshall(ExecLinkeLinktRisksearchResponse execLinkeLinktRisksearchResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktRisksearchResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktRisksearchResponse.RequestId"));
		execLinkeLinktRisksearchResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktRisksearchResponse.ResultCode"));
		execLinkeLinktRisksearchResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktRisksearchResponse.ResultMessage"));
		execLinkeLinktRisksearchResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktRisksearchResponse.ErrorCode"));
		execLinkeLinktRisksearchResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktRisksearchResponse.ErrorMessage"));
		execLinkeLinktRisksearchResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktRisksearchResponse.ResponseStatusCode"));
		execLinkeLinktRisksearchResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktRisksearchResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ExecLinkeLinktRisksearchResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ExecLinkeLinktRisksearchResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("ExecLinkeLinktRisksearchResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("ExecLinkeLinktRisksearchResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktRisksearchResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("ExecLinkeLinktRisksearchResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		execLinkeLinktRisksearchResponse.setData(data);
	 
	 	return execLinkeLinktRisksearchResponse;
	}
}