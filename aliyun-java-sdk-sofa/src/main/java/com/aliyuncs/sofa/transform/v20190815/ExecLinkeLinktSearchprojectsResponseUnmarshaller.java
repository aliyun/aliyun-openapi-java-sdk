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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchprojectsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktSearchprojectsResponseUnmarshaller {

	public static ExecLinkeLinktSearchprojectsResponse unmarshall(ExecLinkeLinktSearchprojectsResponse execLinkeLinktSearchprojectsResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktSearchprojectsResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktSearchprojectsResponse.RequestId"));
		execLinkeLinktSearchprojectsResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktSearchprojectsResponse.ResultCode"));
		execLinkeLinktSearchprojectsResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktSearchprojectsResponse.ResultMessage"));
		execLinkeLinktSearchprojectsResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktSearchprojectsResponse.ErrorCode"));
		execLinkeLinktSearchprojectsResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktSearchprojectsResponse.ErrorMessage"));
		execLinkeLinktSearchprojectsResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktSearchprojectsResponse.ResponseStatusCode"));
		execLinkeLinktSearchprojectsResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktSearchprojectsResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ExecLinkeLinktSearchprojectsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ExecLinkeLinktSearchprojectsResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("ExecLinkeLinktSearchprojectsResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("ExecLinkeLinktSearchprojectsResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktSearchprojectsResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("ExecLinkeLinktSearchprojectsResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		execLinkeLinktSearchprojectsResponse.setData(data);
	 
	 	return execLinkeLinktSearchprojectsResponse;
	}
}