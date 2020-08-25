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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchtagResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchtagResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktSearchtagResponseUnmarshaller {

	public static ExecLinkeLinktSearchtagResponse unmarshall(ExecLinkeLinktSearchtagResponse execLinkeLinktSearchtagResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktSearchtagResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.RequestId"));
		execLinkeLinktSearchtagResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.ResultCode"));
		execLinkeLinktSearchtagResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.ResultMessage"));
		execLinkeLinktSearchtagResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktSearchtagResponse.ErrorCode"));
		execLinkeLinktSearchtagResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.ErrorMessage"));
		execLinkeLinktSearchtagResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktSearchtagResponse.ResponseStatusCode"));
		execLinkeLinktSearchtagResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktSearchtagResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktSearchtagResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setColor(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].Color"));
			dataItem.setContent(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].Content"));
			dataItem.setCreatedAt(_ctx.longValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].Id"));
			dataItem.setProjectSign(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].Region"));
			dataItem.setUpdatedAt(_ctx.longValue("ExecLinkeLinktSearchtagResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		execLinkeLinktSearchtagResponse.setData(data);
	 
	 	return execLinkeLinktSearchtagResponse;
	}
}