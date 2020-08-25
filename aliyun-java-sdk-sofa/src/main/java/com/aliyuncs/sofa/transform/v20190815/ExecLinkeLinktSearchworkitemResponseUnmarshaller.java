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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchworkitemResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchworkitemResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktSearchworkitemResponseUnmarshaller {

	public static ExecLinkeLinktSearchworkitemResponse unmarshall(ExecLinkeLinktSearchworkitemResponse execLinkeLinktSearchworkitemResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktSearchworkitemResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktSearchworkitemResponse.RequestId"));
		execLinkeLinktSearchworkitemResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktSearchworkitemResponse.ResultCode"));
		execLinkeLinktSearchworkitemResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktSearchworkitemResponse.ResultMessage"));
		execLinkeLinktSearchworkitemResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktSearchworkitemResponse.ErrorCode"));
		execLinkeLinktSearchworkitemResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktSearchworkitemResponse.ErrorMessage"));
		execLinkeLinktSearchworkitemResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktSearchworkitemResponse.ResponseStatusCode"));
		execLinkeLinktSearchworkitemResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktSearchworkitemResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ExecLinkeLinktSearchworkitemResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ExecLinkeLinktSearchworkitemResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("ExecLinkeLinktSearchworkitemResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("ExecLinkeLinktSearchworkitemResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktSearchworkitemResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("ExecLinkeLinktSearchworkitemResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		execLinkeLinktSearchworkitemResponse.setData(data);
	 
	 	return execLinkeLinktSearchworkitemResponse;
	}
}